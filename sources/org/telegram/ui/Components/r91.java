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
public final class r91 extends ViewGroup implements s71, AudioManager.OnAudioFocusChangeListener {
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
    public final v71 f27905a;
    public final RadialProgressView f27906a0;
    public final k91 f27907b;
    public final ImageView f27908b0;
    public final kg0 f27909c;
    public final ImageView f27910c0;
    public final TextureView d;
    public final ImageView f27911d0;
    public final ImageView e;
    public AnimatorSet f27912e0;
    public final ViewGroup f27913f;
    public final n91 f27914f0;
    public int f27915g0;
    public Bitmap h;
    public int f27916h0;
    public final j91 f27917i0;
    public final ki.d f27918j0;
    public final j91 f27919k0;
    public TextureView f27920n;
    public int f27921r;
    public boolean f27922s;
    public final o91 v;
    public boolean f27923w;
    public String f27924x;
    public String f27925y;
    public static final Pattern f27891l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f27892n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f27893o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f27894p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f27895q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f27896r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f27897s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f27898t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f27899u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f27900v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27901w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27902x0 = Pattern.compile("var\\s");
    public static final Pattern f27903y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f27904z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public r91(Context context, boolean z10, o91 o91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f27917i0 = new j91(this, 0);
        this.f27918j0 = new ki.d(this, 4);
        this.f27919k0 = new j91(this, 1);
        setWillNotDraw(false);
        this.v = o91Var;
        paint.setColor(-16777216);
        kg0 kg0Var = new kg0(this, context, 1);
        this.f27909c = kg0Var;
        addView(kg0Var, w7.y5.e(-1, -1, 17));
        k91 k91Var = new k91(context, context);
        this.f27907b = k91Var;
        final h91 h91Var = new h91(this);
        k91Var.addJavascriptInterface(new Object(h91Var) {
            public final h91 f22487a;

            {
                this.f22487a = h91Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                r91 r91Var = (r91) this.f22487a.f24794a;
                AsyncTask asyncTask = r91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = r91Var.R;
                    if (asyncTask2 instanceof q91) {
                        q91 q91Var = (q91) asyncTask2;
                        String[] strArr = q91Var.f27607c;
                        String str2 = strArr[0];
                        String str3 = q91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        q91Var.f27606b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = k91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = o91Var.g();
        this.f27913f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            kg0Var.addView(textureView, w7.y5.e(-1, -1, 17));
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
        v71 v71Var = new v71();
        this.f27905a = v71Var;
        v71Var.J = this;
        v71Var.V(textureView);
        n91 n91Var = new n91(this, context);
        this.f27914f0 = n91Var;
        if (g10 != null) {
            g10.addView(n91Var);
        } else {
            addView(n91Var, w7.y5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27906a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.y5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f27908b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        n91Var.addView(imageView2, w7.y5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final r91 f25050b;

            {
                this.f25050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r91 r91Var = this.f25050b;
                        if (r91Var.f27923w && !r91Var.S && !r91Var.W && r91Var.M) {
                            r91Var.T = !r91Var.T;
                            r91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        r91 r91Var2 = this.f25050b;
                        v71 v71Var2 = r91Var2.f27905a;
                        if (r91Var2.f27923w && r91Var2.f27924x != null) {
                            if (v71Var2.d == null) {
                                r91Var2.i();
                            }
                            if (v71Var2.y()) {
                                v71Var2.B();
                            } else {
                                r91Var2.V = false;
                                v71Var2.C();
                            }
                            r91Var2.n();
                            return;
                        }
                        return;
                    default:
                        r91 r91Var3 = this.f25050b;
                        ViewGroup viewGroup = r91Var3.f27913f;
                        boolean z11 = r91Var3.I;
                        o91 o91Var2 = r91Var3.v;
                        n91 n91Var2 = r91Var3.f27914f0;
                        kg0 kg0Var2 = r91Var3.f27909c;
                        TextureView textureView2 = r91Var3.d;
                        if (textureView2 != null && o91Var2.h() && !r91Var3.S && !r91Var3.W && r91Var3.M) {
                            r91Var3.W = true;
                            if (!r91Var3.U) {
                                r91Var3.T = false;
                                o91Var2.i(true, r91Var3.f27919k0, kg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                            if (viewGroup2 != r91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(kg0Var2);
                                }
                                r91Var3.addView(kg0Var2, 0, w7.y5.e(-1, -1, 17));
                                kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(r91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = r91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                r91Var3.h = null;
                            }
                            r91Var3.S = true;
                            r91Var3.U = false;
                            r91Var3.n();
                            r91Var3.o();
                            r91Var3.k();
                            r91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                kg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) n91Var2.getParent();
                            if (viewGroup3 != r91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(n91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(n91Var2);
                                } else {
                                    r91Var3.addView(n91Var2, 1);
                                }
                            }
                            n91Var2.d(false, false);
                            o91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f27910c0 = imageView3;
        imageView3.setScaleType(scaleType);
        n91Var.addView(imageView3, w7.y5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final r91 f25050b;

            {
                this.f25050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r91 r91Var = this.f25050b;
                        if (r91Var.f27923w && !r91Var.S && !r91Var.W && r91Var.M) {
                            r91Var.T = !r91Var.T;
                            r91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        r91 r91Var2 = this.f25050b;
                        v71 v71Var2 = r91Var2.f27905a;
                        if (r91Var2.f27923w && r91Var2.f27924x != null) {
                            if (v71Var2.d == null) {
                                r91Var2.i();
                            }
                            if (v71Var2.y()) {
                                v71Var2.B();
                            } else {
                                r91Var2.V = false;
                                v71Var2.C();
                            }
                            r91Var2.n();
                            return;
                        }
                        return;
                    default:
                        r91 r91Var3 = this.f25050b;
                        ViewGroup viewGroup = r91Var3.f27913f;
                        boolean z11 = r91Var3.I;
                        o91 o91Var2 = r91Var3.v;
                        n91 n91Var2 = r91Var3.f27914f0;
                        kg0 kg0Var2 = r91Var3.f27909c;
                        TextureView textureView2 = r91Var3.d;
                        if (textureView2 != null && o91Var2.h() && !r91Var3.S && !r91Var3.W && r91Var3.M) {
                            r91Var3.W = true;
                            if (!r91Var3.U) {
                                r91Var3.T = false;
                                o91Var2.i(true, r91Var3.f27919k0, kg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                            if (viewGroup2 != r91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(kg0Var2);
                                }
                                r91Var3.addView(kg0Var2, 0, w7.y5.e(-1, -1, 17));
                                kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(r91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = r91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                r91Var3.h = null;
                            }
                            r91Var3.S = true;
                            r91Var3.U = false;
                            r91Var3.n();
                            r91Var3.o();
                            r91Var3.k();
                            r91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                kg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) n91Var2.getParent();
                            if (viewGroup3 != r91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(n91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(n91Var2);
                                } else {
                                    r91Var3.addView(n91Var2, 1);
                                }
                            }
                            n91Var2.d(false, false);
                            o91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f27911d0 = imageView4;
            imageView4.setScaleType(scaleType);
            n91Var.addView(imageView4, w7.y5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final r91 f25050b;

                {
                    this.f25050b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            r91 r91Var = this.f25050b;
                            if (r91Var.f27923w && !r91Var.S && !r91Var.W && r91Var.M) {
                                r91Var.T = !r91Var.T;
                                r91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            r91 r91Var2 = this.f25050b;
                            v71 v71Var2 = r91Var2.f27905a;
                            if (r91Var2.f27923w && r91Var2.f27924x != null) {
                                if (v71Var2.d == null) {
                                    r91Var2.i();
                                }
                                if (v71Var2.y()) {
                                    v71Var2.B();
                                } else {
                                    r91Var2.V = false;
                                    v71Var2.C();
                                }
                                r91Var2.n();
                                return;
                            }
                            return;
                        default:
                            r91 r91Var3 = this.f25050b;
                            ViewGroup viewGroup = r91Var3.f27913f;
                            boolean z11 = r91Var3.I;
                            o91 o91Var2 = r91Var3.v;
                            n91 n91Var2 = r91Var3.f27914f0;
                            kg0 kg0Var2 = r91Var3.f27909c;
                            TextureView textureView2 = r91Var3.d;
                            if (textureView2 != null && o91Var2.h() && !r91Var3.S && !r91Var3.W && r91Var3.M) {
                                r91Var3.W = true;
                                if (!r91Var3.U) {
                                    r91Var3.T = false;
                                    o91Var2.i(true, r91Var3.f27919k0, kg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                                if (viewGroup2 != r91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(kg0Var2);
                                    }
                                    r91Var3.addView(kg0Var2, 0, w7.y5.e(-1, -1, 17));
                                    kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(r91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = r91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    r91Var3.h = null;
                                }
                                r91Var3.S = true;
                                r91Var3.U = false;
                                r91Var3.n();
                                r91Var3.o();
                                r91Var3.k();
                                r91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    kg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) n91Var2.getParent();
                                if (viewGroup3 != r91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(n91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(n91Var2);
                                    } else {
                                        r91Var3.addView(n91Var2, 1);
                                    }
                                }
                                n91Var2.d(false, false);
                                o91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f27892n0.matcher(str);
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
        Matcher matcher = f27891l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f27914f0;
    }

    private View getProgressView() {
        return this.f27906a0;
    }

    public final void b() {
        this.f27905a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f27907b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f27909c;
    }

    public View getControlsView() {
        return this.f27914f0;
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
        n91 n91Var = this.f27914f0;
        if (n91Var.getParent() != this) {
            n91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f27924x;
        if (str != null) {
            String str2 = this.E;
            v71 v71Var = this.f27905a;
            if (str2 != null) {
                v71Var.G(Uri.parse(str), this.f27925y, Uri.parse(this.E), this.F);
            } else {
                v71Var.D(Uri.parse(str), this.f27925y);
            }
            v71Var.P(this.f27922s);
            long p5 = v71Var.p();
            n91 n91Var = this.f27914f0;
            if (p5 != -9223372036854775807L) {
                n91Var.b((int) (v71Var.p() / 1000));
            } else {
                n91Var.b(0);
            }
            k();
            o();
            m();
            n91Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                v71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f27906a0;
        if (z11) {
            AnimatorSet animatorSet = this.f27912e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27912e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f27912e0.setDuration(150L);
            this.f27912e0.addListener(new s81(this, 1));
            this.f27912e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f27905a.d;
        ImageView imageView = this.f27908b0;
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
        ViewGroup viewGroup2 = this.f27913f;
        kg0 kg0Var = this.f27909c;
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
            n91 n91Var = this.f27914f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) n91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(n91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) n91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(n91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(n91Var);
                    } else {
                        addView(n91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f27914f0, this.T, kg0Var.getAspectRatio(), kg0Var.getVideoRotation(), z10);
            this.f27920n = a2;
            a2.setVisibility(4);
            if (this.T && this.f27920n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = n91.I;
            n91Var.a();
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
        this.v.a(this.f27914f0, this.T, kg0Var.getAspectRatio(), kg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f27911d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f27905a.d != null) {
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
        n91 n91Var = this.f27914f0;
        int i13 = n91.I;
        n91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f27917i0);
        if (!this.f27905a.y()) {
            if (this.V) {
                ImageView imageView = this.f27910c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f27910c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f27910c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f27917i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new md(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(v71 v71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        kg0 kg0Var = this.f27909c;
        int measuredWidth = (i14 - kg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - kg0Var.getMeasuredHeight()) / 2;
        kg0Var.layout(measuredWidth, dp, kg0Var.getMeasuredWidth() + measuredWidth, kg0Var.getMeasuredHeight() + dp);
        n91 n91Var = this.f27914f0;
        if (n91Var.getParent() == this) {
            n91Var.layout(0, 0, n91Var.getMeasuredWidth(), n91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f27906a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        n91Var.f26630a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f27909c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        n91 n91Var = this.f27914f0;
        if (n91Var.getParent() == this) {
            n91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f27906a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        n91 n91Var = this.f27914f0;
        v71 v71Var = this.f27905a;
        if (i10 != 2) {
            if (v71Var.p() != -9223372036854775807L) {
                n91Var.b((int) (v71Var.p() / 1000));
            } else {
                n91Var.b(0);
            }
        }
        o91 o91Var = this.v;
        if (i10 != 4 && i10 != 1 && v71Var.y()) {
            o91Var.e(this, true);
        } else {
            o91Var.e(this, false);
        }
        if (v71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            v71Var.B();
            v71Var.L(0L, false);
            n();
            n91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f27921r = 1;
                }
                this.f27920n.setSurfaceTexture(surfaceTexture);
                this.f27920n.setSurfaceTextureListener(this.f27918j0);
                this.f27920n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f27921r == 2) {
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
            int i10 = this.f27915g0;
            int i11 = this.f27916h0;
            this.f27909c.getVideoRotation();
            this.v.f(this.f27914f0, false, i10, i11, this.I);
            this.f27921r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        kg0 kg0Var = this.f27909c;
        if (kg0Var != null) {
            float f11 = i10 * f7;
            this.f27915g0 = (int) f11;
            this.f27916h0 = i11;
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
        this.f27914f0.invalidate();
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
