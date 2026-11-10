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
public final class l71 extends ViewGroup implements q51, AudioManager.OnAudioFocusChangeListener {
    public String D;
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
    public final t51 f35580a;
    public final RadialProgressView f35581a0;
    public final e71 f35582b;
    public final ImageView f35583b0;
    public final fe0 f35584c;
    public final ImageView f35585c0;
    public final TextureView d;
    public final ImageView f35586d0;
    public final ImageView f35587e;
    public AnimatorSet f35588e0;
    public final ViewGroup f35589f;
    public final h71 f35590f0;
    public int f35591g0;
    public Bitmap h;
    public int f35592h0;
    public final d71 f35593i0;
    public final w30 f35594j0;
    public final d71 f35595k0;
    public TextureView f35596n;
    public int f35597r;
    public boolean f35598s;
    public final i71 f35599w;
    public boolean f35600x;
    public String f35601y;
    public static final Pattern f35566l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f35567n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f35568o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f35569p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f35570q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f35571r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f35572s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f35573t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f35574u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f35575v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f35576w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f35577x0 = Pattern.compile("var\\s");
    public static final Pattern f35578y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f35579z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public l71(Context context, boolean z9, i71 i71Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f35593i0 = new d71(this, 0);
        this.f35594j0 = new w30(this, 2);
        this.f35595k0 = new d71(this, 1);
        setWillNotDraw(false);
        this.f35599w = i71Var;
        paint.setColor(-16777216);
        fe0 fe0Var = new fe0(1, context, this);
        this.f35584c = fe0Var;
        addView(fe0Var, c8.ha.e(-1, -1, 17));
        e71 e71Var = new e71(context, context);
        this.f35582b = e71Var;
        final ax axVar = new ax(this, 28);
        e71Var.addJavascriptInterface(new Object(axVar) {
            public final ax f31629a;

            {
                this.f31629a = axVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                l71 l71Var = (l71) this.f31629a.f32025b;
                AsyncTask asyncTask = l71Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = l71Var.R;
                    if (asyncTask2 instanceof k71) {
                        k71 k71Var = (k71) asyncTask2;
                        String[] strArr = k71Var.f35237c;
                        String str2 = strArr[0];
                        String str3 = k71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        k71Var.f35236b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = e71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = i71Var.g();
        this.f35589f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            fe0Var.addView(textureView, c8.ha.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f35587e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        t51 t51Var = new t51();
        this.f35580a = t51Var;
        t51Var.J = this;
        t51Var.A0(textureView);
        h71 h71Var = new h71(this, context);
        this.f35590f0 = h71Var;
        if (g10 != null) {
            g10.addView(h71Var);
        } else {
            addView(h71Var, c8.ha.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35581a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.ha.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f35583b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        h71Var.addView(imageView2, c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final l71 f32488b;

            {
                this.f32488b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l71 l71Var = this.f32488b;
                        if (l71Var.f35600x && !l71Var.S && !l71Var.W && l71Var.M) {
                            l71Var.T = !l71Var.T;
                            l71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        l71 l71Var2 = this.f32488b;
                        t51 t51Var2 = l71Var2.f35580a;
                        if (l71Var2.f35600x && l71Var2.f35601y != null) {
                            if (t51Var2.d == null) {
                                l71Var2.i();
                            }
                            if (t51Var2.d0()) {
                                t51Var2.g0();
                            } else {
                                l71Var2.V = false;
                                t51Var2.h0();
                            }
                            l71Var2.n();
                            return;
                        }
                        return;
                    default:
                        l71 l71Var3 = this.f32488b;
                        ViewGroup viewGroup = l71Var3.f35589f;
                        boolean z10 = l71Var3.I;
                        i71 i71Var2 = l71Var3.f35599w;
                        h71 h71Var2 = l71Var3.f35590f0;
                        fe0 fe0Var2 = l71Var3.f35584c;
                        TextureView textureView2 = l71Var3.d;
                        if (textureView2 != null && i71Var2.h() && !l71Var3.S && !l71Var3.W && l71Var3.M) {
                            l71Var3.W = true;
                            if (!l71Var3.U) {
                                l71Var3.T = false;
                                i71Var2.i(true, l71Var3.f35595k0, fe0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) fe0Var2.getParent();
                            if (viewGroup2 != l71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(fe0Var2);
                                }
                                l71Var3.addView(fe0Var2, 0, c8.ha.e(-1, -1, 17));
                                fe0Var2.measure(View.MeasureSpec.makeMeasureSpec(l71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(l71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = l71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                l71Var3.h = null;
                            }
                            l71Var3.S = true;
                            l71Var3.U = false;
                            l71Var3.n();
                            l71Var3.o();
                            l71Var3.k();
                            l71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                fe0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) h71Var2.getParent();
                            if (viewGroup3 != l71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(h71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(h71Var2);
                                } else {
                                    l71Var3.addView(h71Var2, 1);
                                }
                            }
                            h71Var2.d(false, false);
                            i71Var2.i(false, null, fe0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f35585c0 = imageView3;
        imageView3.setScaleType(scaleType);
        h71Var.addView(imageView3, c8.ha.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final l71 f32488b;

            {
                this.f32488b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l71 l71Var = this.f32488b;
                        if (l71Var.f35600x && !l71Var.S && !l71Var.W && l71Var.M) {
                            l71Var.T = !l71Var.T;
                            l71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        l71 l71Var2 = this.f32488b;
                        t51 t51Var2 = l71Var2.f35580a;
                        if (l71Var2.f35600x && l71Var2.f35601y != null) {
                            if (t51Var2.d == null) {
                                l71Var2.i();
                            }
                            if (t51Var2.d0()) {
                                t51Var2.g0();
                            } else {
                                l71Var2.V = false;
                                t51Var2.h0();
                            }
                            l71Var2.n();
                            return;
                        }
                        return;
                    default:
                        l71 l71Var3 = this.f32488b;
                        ViewGroup viewGroup = l71Var3.f35589f;
                        boolean z10 = l71Var3.I;
                        i71 i71Var2 = l71Var3.f35599w;
                        h71 h71Var2 = l71Var3.f35590f0;
                        fe0 fe0Var2 = l71Var3.f35584c;
                        TextureView textureView2 = l71Var3.d;
                        if (textureView2 != null && i71Var2.h() && !l71Var3.S && !l71Var3.W && l71Var3.M) {
                            l71Var3.W = true;
                            if (!l71Var3.U) {
                                l71Var3.T = false;
                                i71Var2.i(true, l71Var3.f35595k0, fe0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) fe0Var2.getParent();
                            if (viewGroup2 != l71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(fe0Var2);
                                }
                                l71Var3.addView(fe0Var2, 0, c8.ha.e(-1, -1, 17));
                                fe0Var2.measure(View.MeasureSpec.makeMeasureSpec(l71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(l71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = l71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                l71Var3.h = null;
                            }
                            l71Var3.S = true;
                            l71Var3.U = false;
                            l71Var3.n();
                            l71Var3.o();
                            l71Var3.k();
                            l71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                fe0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) h71Var2.getParent();
                            if (viewGroup3 != l71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(h71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(h71Var2);
                                } else {
                                    l71Var3.addView(h71Var2, 1);
                                }
                            }
                            h71Var2.d(false, false);
                            i71Var2.i(false, null, fe0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        if (z9) {
            ImageView imageView4 = new ImageView(context);
            this.f35586d0 = imageView4;
            imageView4.setScaleType(scaleType);
            h71Var.addView(imageView4, c8.ha.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final l71 f32488b;

                {
                    this.f32488b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l71 l71Var = this.f32488b;
                            if (l71Var.f35600x && !l71Var.S && !l71Var.W && l71Var.M) {
                                l71Var.T = !l71Var.T;
                                l71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            l71 l71Var2 = this.f32488b;
                            t51 t51Var2 = l71Var2.f35580a;
                            if (l71Var2.f35600x && l71Var2.f35601y != null) {
                                if (t51Var2.d == null) {
                                    l71Var2.i();
                                }
                                if (t51Var2.d0()) {
                                    t51Var2.g0();
                                } else {
                                    l71Var2.V = false;
                                    t51Var2.h0();
                                }
                                l71Var2.n();
                                return;
                            }
                            return;
                        default:
                            l71 l71Var3 = this.f32488b;
                            ViewGroup viewGroup = l71Var3.f35589f;
                            boolean z10 = l71Var3.I;
                            i71 i71Var2 = l71Var3.f35599w;
                            h71 h71Var2 = l71Var3.f35590f0;
                            fe0 fe0Var2 = l71Var3.f35584c;
                            TextureView textureView2 = l71Var3.d;
                            if (textureView2 != null && i71Var2.h() && !l71Var3.S && !l71Var3.W && l71Var3.M) {
                                l71Var3.W = true;
                                if (!l71Var3.U) {
                                    l71Var3.T = false;
                                    i71Var2.i(true, l71Var3.f35595k0, fe0Var2.getAspectRatio(), z10);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) fe0Var2.getParent();
                                if (viewGroup2 != l71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(fe0Var2);
                                    }
                                    l71Var3.addView(fe0Var2, 0, c8.ha.e(-1, -1, 17));
                                    fe0Var2.measure(View.MeasureSpec.makeMeasureSpec(l71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(l71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = l71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    l71Var3.h = null;
                                }
                                l71Var3.S = true;
                                l71Var3.U = false;
                                l71Var3.n();
                                l71Var3.o();
                                l71Var3.k();
                                l71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    fe0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) h71Var2.getParent();
                                if (viewGroup3 != l71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(h71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(h71Var2);
                                    } else {
                                        l71Var3.addView(h71Var2, 1);
                                    }
                                }
                                h71Var2.d(false, false);
                                i71Var2.i(false, null, fe0Var2.getAspectRatio(), z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f35567n0.matcher(str);
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
        Matcher matcher = f35566l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f35590f0;
    }

    private View getProgressView() {
        return this.f35581a0;
    }

    public final void b() {
        this.f35580a.m0();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f35582b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f35584c;
    }

    public View getControlsView() {
        return this.f35590f0;
    }

    public ImageView getTextureImageView() {
        return this.f35587e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        h71 h71Var = this.f35590f0;
        if (h71Var.getParent() != this) {
            h71Var.setVisibility(8);
        }
        this.f35599w.d();
    }

    public final void i() {
        String str = this.f35601y;
        if (str != null) {
            String str2 = this.E;
            t51 t51Var = this.f35580a;
            if (str2 != null) {
                t51Var.l0(Uri.parse(str), this.D, Uri.parse(this.E), this.F);
            } else {
                t51Var.j0(Uri.parse(str), this.D);
            }
            t51Var.u0(this.f35598s);
            int i7 = (t51Var.U() > (-9223372036854775807L) ? 1 : (t51Var.U() == (-9223372036854775807L) ? 0 : -1));
            h71 h71Var = this.f35590f0;
            if (i7 != 0) {
                h71Var.b((int) (t51Var.U() / 1000));
            } else {
                h71Var.b(0);
            }
            k();
            o();
            m();
            h71Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                t51Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z9, boolean z10) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f35581a0;
        if (z10) {
            AnimatorSet animatorSet = this.f35588e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35588e0 = animatorSet2;
            if (z9) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f35588e0.setDuration(150L);
            this.f35588e0.addListener(new f11(this, 7));
            this.f35588e0.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.i0 i0Var = this.f35580a.d;
        ImageView imageView = this.f35583b0;
        if (i0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
            return;
        }
        imageView.setVisibility(8);
    }

    public final void l(boolean z9) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f35589f;
        fe0 fe0Var = this.f35584c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    fe0Var.addView(textureView);
                }
            }
            boolean z10 = this.T;
            h71 h71Var = this.f35590f0;
            if (z10) {
                ViewGroup viewGroup3 = (ViewGroup) h71Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(h71Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) h71Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(h71Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(h71Var);
                    } else {
                        addView(h71Var, 1);
                    }
                }
            }
            TextureView a10 = this.f35599w.a(this.f35590f0, this.T, fe0Var.getAspectRatio(), fe0Var.getVideoRotation(), z9);
            this.f35596n = a10;
            a10.setVisibility(4);
            if (this.T && this.f35596n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i7 = h71.I;
            h71Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) fe0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(fe0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) fe0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(fe0Var);
                }
                addView(fe0Var, 0);
            }
        }
        this.f35599w.a(this.f35590f0, this.T, fe0Var.getAspectRatio(), fe0Var.getVideoRotation(), z9);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f35586d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i7 = 2131231274;
        } else {
            i7 = 2131231451;
        }
        imageView.setImageResource(i7);
        if (this.f35580a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.U) {
            imageView.setLayoutParams(c8.ha.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.ha.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        h71 h71Var = this.f35590f0;
        int i12 = h71.I;
        h71Var.a();
        org.telegram.messenger.g0.r(this.f35593i0);
        if (!this.f35580a.d0()) {
            if (this.V) {
                ImageView imageView = this.f35585c0;
                if (this.U) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f35585c0;
            if (this.U) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f35585c0;
        if (this.U) {
            i7 = 2131231453;
        } else {
            i7 = 2131231452;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.i3(this.f35593i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) org.telegram.messenger.t0.f25570b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.h3(new q2(this, i7, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.Q);
    }

    @Override
    public final void onError(t51 t51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        fe0 fe0Var = this.f35584c;
        int measuredWidth = (i13 - fe0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - fe0Var.getMeasuredHeight()) / 2;
        fe0Var.layout(measuredWidth, L, fe0Var.getMeasuredWidth() + measuredWidth, fe0Var.getMeasuredHeight() + L);
        h71 h71Var = this.f35590f0;
        if (h71Var.getParent() == this) {
            h71Var.layout(0, 0, h71Var.getMeasuredWidth(), h71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f35581a0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        h71Var.f34234a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f35584c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        h71 h71Var = this.f35590f0;
        if (h71Var.getParent() == this) {
            h71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f35581a0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z9, int i7) {
        h71 h71Var = this.f35590f0;
        t51 t51Var = this.f35580a;
        if (i7 != 2) {
            if (t51Var.U() != -9223372036854775807L) {
                h71Var.b((int) (t51Var.U() / 1000));
            } else {
                h71Var.b(0);
            }
        }
        i71 i71Var = this.f35599w;
        if (i7 != 4 && i7 != 1 && t51Var.d0()) {
            i71Var.e(this, true);
        } else {
            i71Var.e(this, false);
        }
        if (t51Var.d0() && i7 != 4) {
            n();
        } else if (i7 == 4) {
            this.V = true;
            t51Var.g0();
            t51Var.q0(0L, false);
            n();
            h71Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f35597r = 1;
                }
                this.f35596n.setSurfaceTexture(surfaceTexture);
                this.f35596n.setSurfaceTextureListener(this.f35594j0);
                this.f35596n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f35597r == 2) {
            ImageView imageView = this.f35587e;
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
            int i7 = this.f35591g0;
            int i10 = this.f35592h0;
            this.f35584c.getVideoRotation();
            this.f35599w.f(this.f35590f0, false, i7, i10, this.I);
            this.f35597r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        fe0 fe0Var = this.f35584c;
        if (fe0Var != null) {
            float f12 = i7 * f10;
            this.f35591g0 = (int) f12;
            this.f35592h0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            fe0Var.a(f11, 0);
            if (this.T) {
                this.f35599w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f35590f0.invalidate();
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
