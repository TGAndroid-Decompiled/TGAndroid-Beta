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
public final class w91 extends ViewGroup implements z71, AudioManager.OnAudioFocusChangeListener {
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
    public final c81 f32017a;
    public final RadialProgressView f32018a0;
    public final p91 f32019b;
    public final ImageView f32020b0;
    public final sg0 f32021c;
    public final ImageView f32022c0;
    public final TextureView d;
    public final ImageView f32023d0;
    public final ImageView e;
    public AnimatorSet f32024e0;
    public final ViewGroup f32025f;
    public final s91 f32026f0;
    public int f32027g0;
    public Bitmap h;
    public int f32028h0;
    public final o91 f32029i0;
    public final t50 f32030j0;
    public final o91 f32031k0;
    public TextureView f32032n;
    public int f32033r;
    public boolean f32034s;
    public final t91 v;
    public boolean f32035w;
    public String f32036x;
    public String f32037y;
    public static final Pattern f32003l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f32004n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f32005o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f32006p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f32007q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f32008r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f32009s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f32010t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f32011u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f32012v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f32013w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f32014x0 = Pattern.compile("var\\s");
    public static final Pattern f32015y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f32016z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public w91(Context context, boolean z10, t91 t91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f32029i0 = new o91(this, 0);
        this.f32030j0 = new t50(this, 3);
        this.f32031k0 = new o91(this, 1);
        setWillNotDraw(false);
        this.v = t91Var;
        paint.setColor(-16777216);
        sg0 sg0Var = new sg0(this, context, 1);
        this.f32021c = sg0Var;
        addView(sg0Var, w7.z5.e(-1, -1, 17));
        p91 p91Var = new p91(context, context);
        this.f32019b = p91Var;
        final g81 g81Var = new g81(this);
        p91Var.addJavascriptInterface(new Object(g81Var) {
            public final g81 f24421a;

            {
                this.f24421a = g81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                w91 w91Var = (w91) this.f24421a.f26533a;
                AsyncTask asyncTask = w91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = w91Var.R;
                    if (asyncTask2 instanceof v91) {
                        v91 v91Var = (v91) asyncTask2;
                        String[] strArr = v91Var.f31208c;
                        String str2 = strArr[0];
                        String str3 = v91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        v91Var.f31207b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = p91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = t91Var.g();
        this.f32025f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            sg0Var.addView(textureView, w7.z5.e(-1, -1, 17));
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
        c81 c81Var = new c81();
        this.f32017a = c81Var;
        c81Var.J = this;
        c81Var.V(textureView);
        s91 s91Var = new s91(this, context);
        this.f32026f0 = s91Var;
        if (g10 != null) {
            g10.addView(s91Var);
        } else {
            addView(s91Var, w7.z5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32018a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f32020b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        s91Var.addView(imageView2, w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final w91 f28732b;

            {
                this.f28732b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w91 w91Var = this.f28732b;
                        if (w91Var.f32035w && !w91Var.S && !w91Var.W && w91Var.M) {
                            w91Var.T = !w91Var.T;
                            w91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        w91 w91Var2 = this.f28732b;
                        c81 c81Var2 = w91Var2.f32017a;
                        if (w91Var2.f32035w && w91Var2.f32036x != null) {
                            if (c81Var2.d == null) {
                                w91Var2.i();
                            }
                            if (c81Var2.y()) {
                                c81Var2.B();
                            } else {
                                w91Var2.V = false;
                                c81Var2.C();
                            }
                            w91Var2.n();
                            return;
                        }
                        return;
                    default:
                        w91 w91Var3 = this.f28732b;
                        ViewGroup viewGroup = w91Var3.f32025f;
                        boolean z11 = w91Var3.I;
                        t91 t91Var2 = w91Var3.v;
                        s91 s91Var2 = w91Var3.f32026f0;
                        sg0 sg0Var2 = w91Var3.f32021c;
                        TextureView textureView2 = w91Var3.d;
                        if (textureView2 != null && t91Var2.h() && !w91Var3.S && !w91Var3.W && w91Var3.M) {
                            w91Var3.W = true;
                            if (!w91Var3.U) {
                                w91Var3.T = false;
                                t91Var2.i(true, w91Var3.f32031k0, sg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) sg0Var2.getParent();
                            if (viewGroup2 != w91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(sg0Var2);
                                }
                                w91Var3.addView(sg0Var2, 0, w7.z5.e(-1, -1, 17));
                                sg0Var2.measure(View.MeasureSpec.makeMeasureSpec(w91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = w91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w91Var3.h = null;
                            }
                            w91Var3.S = true;
                            w91Var3.U = false;
                            w91Var3.n();
                            w91Var3.o();
                            w91Var3.k();
                            w91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                sg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) s91Var2.getParent();
                            if (viewGroup3 != w91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(s91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(s91Var2);
                                } else {
                                    w91Var3.addView(s91Var2, 1);
                                }
                            }
                            s91Var2.d(false, false);
                            t91Var2.i(false, null, sg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f32022c0 = imageView3;
        imageView3.setScaleType(scaleType);
        s91Var.addView(imageView3, w7.z5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final w91 f28732b;

            {
                this.f28732b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w91 w91Var = this.f28732b;
                        if (w91Var.f32035w && !w91Var.S && !w91Var.W && w91Var.M) {
                            w91Var.T = !w91Var.T;
                            w91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        w91 w91Var2 = this.f28732b;
                        c81 c81Var2 = w91Var2.f32017a;
                        if (w91Var2.f32035w && w91Var2.f32036x != null) {
                            if (c81Var2.d == null) {
                                w91Var2.i();
                            }
                            if (c81Var2.y()) {
                                c81Var2.B();
                            } else {
                                w91Var2.V = false;
                                c81Var2.C();
                            }
                            w91Var2.n();
                            return;
                        }
                        return;
                    default:
                        w91 w91Var3 = this.f28732b;
                        ViewGroup viewGroup = w91Var3.f32025f;
                        boolean z11 = w91Var3.I;
                        t91 t91Var2 = w91Var3.v;
                        s91 s91Var2 = w91Var3.f32026f0;
                        sg0 sg0Var2 = w91Var3.f32021c;
                        TextureView textureView2 = w91Var3.d;
                        if (textureView2 != null && t91Var2.h() && !w91Var3.S && !w91Var3.W && w91Var3.M) {
                            w91Var3.W = true;
                            if (!w91Var3.U) {
                                w91Var3.T = false;
                                t91Var2.i(true, w91Var3.f32031k0, sg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) sg0Var2.getParent();
                            if (viewGroup2 != w91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(sg0Var2);
                                }
                                w91Var3.addView(sg0Var2, 0, w7.z5.e(-1, -1, 17));
                                sg0Var2.measure(View.MeasureSpec.makeMeasureSpec(w91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = w91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w91Var3.h = null;
                            }
                            w91Var3.S = true;
                            w91Var3.U = false;
                            w91Var3.n();
                            w91Var3.o();
                            w91Var3.k();
                            w91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                sg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) s91Var2.getParent();
                            if (viewGroup3 != w91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(s91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(s91Var2);
                                } else {
                                    w91Var3.addView(s91Var2, 1);
                                }
                            }
                            s91Var2.d(false, false);
                            t91Var2.i(false, null, sg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f32023d0 = imageView4;
            imageView4.setScaleType(scaleType);
            s91Var.addView(imageView4, w7.z5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final w91 f28732b;

                {
                    this.f28732b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            w91 w91Var = this.f28732b;
                            if (w91Var.f32035w && !w91Var.S && !w91Var.W && w91Var.M) {
                                w91Var.T = !w91Var.T;
                                w91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            w91 w91Var2 = this.f28732b;
                            c81 c81Var2 = w91Var2.f32017a;
                            if (w91Var2.f32035w && w91Var2.f32036x != null) {
                                if (c81Var2.d == null) {
                                    w91Var2.i();
                                }
                                if (c81Var2.y()) {
                                    c81Var2.B();
                                } else {
                                    w91Var2.V = false;
                                    c81Var2.C();
                                }
                                w91Var2.n();
                                return;
                            }
                            return;
                        default:
                            w91 w91Var3 = this.f28732b;
                            ViewGroup viewGroup = w91Var3.f32025f;
                            boolean z11 = w91Var3.I;
                            t91 t91Var2 = w91Var3.v;
                            s91 s91Var2 = w91Var3.f32026f0;
                            sg0 sg0Var2 = w91Var3.f32021c;
                            TextureView textureView2 = w91Var3.d;
                            if (textureView2 != null && t91Var2.h() && !w91Var3.S && !w91Var3.W && w91Var3.M) {
                                w91Var3.W = true;
                                if (!w91Var3.U) {
                                    w91Var3.T = false;
                                    t91Var2.i(true, w91Var3.f32031k0, sg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) sg0Var2.getParent();
                                if (viewGroup2 != w91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(sg0Var2);
                                    }
                                    w91Var3.addView(sg0Var2, 0, w7.z5.e(-1, -1, 17));
                                    sg0Var2.measure(View.MeasureSpec.makeMeasureSpec(w91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = w91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    w91Var3.h = null;
                                }
                                w91Var3.S = true;
                                w91Var3.U = false;
                                w91Var3.n();
                                w91Var3.o();
                                w91Var3.k();
                                w91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    sg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) s91Var2.getParent();
                                if (viewGroup3 != w91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(s91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(s91Var2);
                                    } else {
                                        w91Var3.addView(s91Var2, 1);
                                    }
                                }
                                s91Var2.d(false, false);
                                t91Var2.i(false, null, sg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f32004n0.matcher(str);
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
        Matcher matcher = f32003l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f32026f0;
    }

    private View getProgressView() {
        return this.f32018a0;
    }

    public final void b() {
        this.f32017a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f32019b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f32021c;
    }

    public View getControlsView() {
        return this.f32026f0;
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
        s91 s91Var = this.f32026f0;
        if (s91Var.getParent() != this) {
            s91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f32036x;
        if (str != null) {
            String str2 = this.E;
            c81 c81Var = this.f32017a;
            if (str2 != null) {
                c81Var.G(Uri.parse(str), this.f32037y, Uri.parse(this.E), this.F);
            } else {
                c81Var.D(Uri.parse(str), this.f32037y);
            }
            c81Var.P(this.f32034s);
            int i10 = (c81Var.p() > (-9223372036854775807L) ? 1 : (c81Var.p() == (-9223372036854775807L) ? 0 : -1));
            s91 s91Var = this.f32026f0;
            if (i10 != 0) {
                s91Var.b((int) (c81Var.p() / 1000));
            } else {
                s91Var.b(0);
            }
            k();
            o();
            m();
            s91Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                c81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f32018a0;
        if (z11) {
            AnimatorSet animatorSet = this.f32024e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32024e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f32024e0.setDuration(150L);
            this.f32024e0.addListener(new p31(this, 6));
            this.f32024e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.i0 i0Var = this.f32017a.d;
        ImageView imageView = this.f32020b0;
        if (i0Var != null && !this.U) {
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
        ViewGroup viewGroup2 = this.f32025f;
        sg0 sg0Var = this.f32021c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    sg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            s91 s91Var = this.f32026f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) s91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(s91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) s91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(s91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(s91Var);
                    } else {
                        addView(s91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f32026f0, this.T, sg0Var.getAspectRatio(), sg0Var.getVideoRotation(), z10);
            this.f32032n = a2;
            a2.setVisibility(4);
            if (this.T && this.f32032n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = s91.I;
            s91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) sg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(sg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) sg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(sg0Var);
                }
                addView(sg0Var, 0);
            }
        }
        this.v.a(this.f32026f0, this.T, sg0Var.getAspectRatio(), sg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f32023d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f32017a.d != null) {
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
        s91 s91Var = this.f32026f0;
        int i13 = s91.I;
        s91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f32029i0);
        if (!this.f32017a.y()) {
            if (this.V) {
                ImageView imageView = this.f32022c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f32022c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f32022c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f32029i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new e2(this, i10, 15));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(c81 c81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        sg0 sg0Var = this.f32021c;
        int measuredWidth = (i14 - sg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - sg0Var.getMeasuredHeight()) / 2;
        sg0Var.layout(measuredWidth, dp, sg0Var.getMeasuredWidth() + measuredWidth, sg0Var.getMeasuredHeight() + dp);
        s91 s91Var = this.f32026f0;
        if (s91Var.getParent() == this) {
            s91Var.layout(0, 0, s91Var.getMeasuredWidth(), s91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f32018a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        s91Var.f30223a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f32021c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        s91 s91Var = this.f32026f0;
        if (s91Var.getParent() == this) {
            s91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f32018a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        s91 s91Var = this.f32026f0;
        c81 c81Var = this.f32017a;
        if (i10 != 2) {
            if (c81Var.p() != -9223372036854775807L) {
                s91Var.b((int) (c81Var.p() / 1000));
            } else {
                s91Var.b(0);
            }
        }
        t91 t91Var = this.v;
        if (i10 != 4 && i10 != 1 && c81Var.y()) {
            t91Var.e(this, true);
        } else {
            t91Var.e(this, false);
        }
        if (c81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            c81Var.B();
            c81Var.L(0L, false);
            n();
            s91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f32033r = 1;
                }
                this.f32032n.setSurfaceTexture(surfaceTexture);
                this.f32032n.setSurfaceTextureListener(this.f32030j0);
                this.f32032n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f32033r == 2) {
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
            int i10 = this.f32027g0;
            int i11 = this.f32028h0;
            this.f32021c.getVideoRotation();
            this.v.f(this.f32026f0, false, i10, i11, this.I);
            this.f32033r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        sg0 sg0Var = this.f32021c;
        if (sg0Var != null) {
            float f11 = i10 * f7;
            this.f32027g0 = (int) f11;
            this.f32028h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            sg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f32026f0.invalidate();
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
