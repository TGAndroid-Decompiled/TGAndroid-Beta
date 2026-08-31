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
public final class f91 extends ViewGroup implements h71, AudioManager.OnAudioFocusChangeListener {
    public static final Pattern f26797i0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f26798j0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f26799k0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f26800l0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern m0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f26801n0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f26802o0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f26803p0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f26804q0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f26805r0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f26806s0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f26807t0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f26808u0 = Pattern.compile("var\\s");
    public static final Pattern f26809v0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f26810w0 = Pattern.compile("[()]");
    public static final Pattern f26811x0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
    public String B;
    public String C;
    public String D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public float K;
    public int L;
    public boolean M;
    public final Paint N;
    public AsyncTask O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final RadialProgressView U;
    public final ImageView V;
    public final ImageView W;
    public final k71 f26812a;
    public final ImageView f26813a0;
    public final y81 f26814b;
    public AnimatorSet f26815b0;
    public final eg0 f26816c;
    public final b91 f26817c0;
    public final TextureView d;
    public int f26818d0;
    public final ImageView f26819e;
    public int f26820e0;
    public final ViewGroup f26821f;
    public final x81 f26822f0;
    public final jh.h f26823g0;
    public Bitmap h;
    public final x81 f26824h0;
    public TextureView f26825n;
    public int f26826r;
    public boolean f26827s;
    public final c91 v;
    public boolean f26828w;
    public String f26829x;
    public String f26830y;

    public f91(Context context, boolean z4, c91 c91Var) {
        super(context);
        this.F = true;
        Paint paint = new Paint();
        this.N = paint;
        this.f26822f0 = new x81(this, 0);
        this.f26823g0 = new jh.h(this, 4);
        this.f26824h0 = new x81(this, 1);
        setWillNotDraw(false);
        this.v = c91Var;
        paint.setColor(-16777216);
        eg0 eg0Var = new eg0(this, context, 1);
        this.f26816c = eg0Var;
        addView(eg0Var, k7.c6.e(-1, -1, 17));
        y81 y81Var = new y81(context, context);
        this.f26814b = y81Var;
        final v81 v81Var = new v81(this);
        y81Var.addJavascriptInterface(new Object(v81Var) {
            public final v81 f25087a;

            {
                this.f25087a = v81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                f91 f91Var = (f91) this.f25087a.f31853a;
                AsyncTask asyncTask = f91Var.O;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = f91Var.O;
                    if (asyncTask2 instanceof e91) {
                        e91 e91Var = (e91) asyncTask2;
                        String[] strArr = e91Var.f26489c;
                        String str2 = strArr[0];
                        String str3 = e91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        e91Var.f26488b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = y81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = c91Var.g();
        this.f26821f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            eg0Var.addView(textureView, k7.c6.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f26819e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        k71 k71Var = new k71();
        this.f26812a = k71Var;
        k71Var.G = this;
        k71Var.V(textureView);
        b91 b91Var = new b91(this, context);
        this.f26817c0 = b91Var;
        if (g10 != null) {
            g10.addView(b91Var);
        } else {
            addView(b91Var, k7.c6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.U = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, k7.c6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.V = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        b91Var.addView(imageView2, k7.c6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f91 f32683b;

            {
                this.f32683b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f91 f91Var = this.f32683b;
                        if (f91Var.f26828w && !f91Var.P && !f91Var.T && f91Var.J) {
                            f91Var.Q = !f91Var.Q;
                            f91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        f91 f91Var2 = this.f32683b;
                        k71 k71Var2 = f91Var2.f26812a;
                        if (f91Var2.f26828w && f91Var2.f26829x != null) {
                            if (k71Var2.d == null) {
                                f91Var2.i();
                            }
                            if (k71Var2.y()) {
                                k71Var2.B();
                            } else {
                                f91Var2.S = false;
                                k71Var2.C();
                            }
                            f91Var2.n();
                            return;
                        }
                        return;
                    default:
                        f91 f91Var3 = this.f32683b;
                        ViewGroup viewGroup = f91Var3.f26821f;
                        boolean z10 = f91Var3.F;
                        c91 c91Var2 = f91Var3.v;
                        b91 b91Var2 = f91Var3.f26817c0;
                        eg0 eg0Var2 = f91Var3.f26816c;
                        TextureView textureView2 = f91Var3.d;
                        if (textureView2 != null && c91Var2.h() && !f91Var3.P && !f91Var3.T && f91Var3.J) {
                            f91Var3.T = true;
                            if (!f91Var3.R) {
                                f91Var3.Q = false;
                                c91Var2.i(true, f91Var3.f26824h0, eg0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) eg0Var2.getParent();
                            if (viewGroup2 != f91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(eg0Var2);
                                }
                                f91Var3.addView(eg0Var2, 0, k7.c6.e(-1, -1, 17));
                                eg0Var2.measure(View.MeasureSpec.makeMeasureSpec(f91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(f91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = f91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                f91Var3.h = null;
                            }
                            f91Var3.P = true;
                            f91Var3.R = false;
                            f91Var3.n();
                            f91Var3.o();
                            f91Var3.k();
                            f91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                eg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) b91Var2.getParent();
                            if (viewGroup3 != f91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(b91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(b91Var2);
                                } else {
                                    f91Var3.addView(b91Var2, 1);
                                }
                            }
                            b91Var2.d(false, false);
                            c91Var2.i(false, null, eg0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.W = imageView3;
        imageView3.setScaleType(scaleType);
        b91Var.addView(imageView3, k7.c6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final f91 f32683b;

            {
                this.f32683b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f91 f91Var = this.f32683b;
                        if (f91Var.f26828w && !f91Var.P && !f91Var.T && f91Var.J) {
                            f91Var.Q = !f91Var.Q;
                            f91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        f91 f91Var2 = this.f32683b;
                        k71 k71Var2 = f91Var2.f26812a;
                        if (f91Var2.f26828w && f91Var2.f26829x != null) {
                            if (k71Var2.d == null) {
                                f91Var2.i();
                            }
                            if (k71Var2.y()) {
                                k71Var2.B();
                            } else {
                                f91Var2.S = false;
                                k71Var2.C();
                            }
                            f91Var2.n();
                            return;
                        }
                        return;
                    default:
                        f91 f91Var3 = this.f32683b;
                        ViewGroup viewGroup = f91Var3.f26821f;
                        boolean z10 = f91Var3.F;
                        c91 c91Var2 = f91Var3.v;
                        b91 b91Var2 = f91Var3.f26817c0;
                        eg0 eg0Var2 = f91Var3.f26816c;
                        TextureView textureView2 = f91Var3.d;
                        if (textureView2 != null && c91Var2.h() && !f91Var3.P && !f91Var3.T && f91Var3.J) {
                            f91Var3.T = true;
                            if (!f91Var3.R) {
                                f91Var3.Q = false;
                                c91Var2.i(true, f91Var3.f26824h0, eg0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) eg0Var2.getParent();
                            if (viewGroup2 != f91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(eg0Var2);
                                }
                                f91Var3.addView(eg0Var2, 0, k7.c6.e(-1, -1, 17));
                                eg0Var2.measure(View.MeasureSpec.makeMeasureSpec(f91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(f91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = f91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                f91Var3.h = null;
                            }
                            f91Var3.P = true;
                            f91Var3.R = false;
                            f91Var3.n();
                            f91Var3.o();
                            f91Var3.k();
                            f91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                eg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) b91Var2.getParent();
                            if (viewGroup3 != f91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(b91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(b91Var2);
                                } else {
                                    f91Var3.addView(b91Var2, 1);
                                }
                            }
                            b91Var2.d(false, false);
                            c91Var2.i(false, null, eg0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        if (z4) {
            ImageView imageView4 = new ImageView(context);
            this.f26813a0 = imageView4;
            imageView4.setScaleType(scaleType);
            b91Var.addView(imageView4, k7.c6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final f91 f32683b;

                {
                    this.f32683b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            f91 f91Var = this.f32683b;
                            if (f91Var.f26828w && !f91Var.P && !f91Var.T && f91Var.J) {
                                f91Var.Q = !f91Var.Q;
                                f91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            f91 f91Var2 = this.f32683b;
                            k71 k71Var2 = f91Var2.f26812a;
                            if (f91Var2.f26828w && f91Var2.f26829x != null) {
                                if (k71Var2.d == null) {
                                    f91Var2.i();
                                }
                                if (k71Var2.y()) {
                                    k71Var2.B();
                                } else {
                                    f91Var2.S = false;
                                    k71Var2.C();
                                }
                                f91Var2.n();
                                return;
                            }
                            return;
                        default:
                            f91 f91Var3 = this.f32683b;
                            ViewGroup viewGroup = f91Var3.f26821f;
                            boolean z10 = f91Var3.F;
                            c91 c91Var2 = f91Var3.v;
                            b91 b91Var2 = f91Var3.f26817c0;
                            eg0 eg0Var2 = f91Var3.f26816c;
                            TextureView textureView2 = f91Var3.d;
                            if (textureView2 != null && c91Var2.h() && !f91Var3.P && !f91Var3.T && f91Var3.J) {
                                f91Var3.T = true;
                                if (!f91Var3.R) {
                                    f91Var3.Q = false;
                                    c91Var2.i(true, f91Var3.f26824h0, eg0Var2.getAspectRatio(), z10);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) eg0Var2.getParent();
                                if (viewGroup2 != f91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(eg0Var2);
                                    }
                                    f91Var3.addView(eg0Var2, 0, k7.c6.e(-1, -1, 17));
                                    eg0Var2.measure(View.MeasureSpec.makeMeasureSpec(f91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(f91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = f91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    f91Var3.h = null;
                                }
                                f91Var3.P = true;
                                f91Var3.R = false;
                                f91Var3.n();
                                f91Var3.o();
                                f91Var3.k();
                                f91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    eg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) b91Var2.getParent();
                                if (viewGroup3 != f91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(b91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(b91Var2);
                                    } else {
                                        f91Var3.addView(b91Var2, 1);
                                    }
                                }
                                b91Var2.d(false, false);
                                c91Var2.i(false, null, eg0Var2.getAspectRatio(), z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f26799k0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f26797i0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f26817c0;
    }

    private View getProgressView() {
        return this.U;
    }

    public final void b() {
        this.f26812a.H();
        AsyncTask asyncTask = this.O;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        this.f26814b.stopLoading();
    }

    public final boolean f() {
        if (!this.R && !this.T) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f26816c;
    }

    public View getControlsView() {
        return this.f26817c0;
    }

    public ImageView getTextureImageView() {
        return this.f26819e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.D;
    }

    public final void h() {
        b91 b91Var = this.f26817c0;
        if (b91Var.getParent() != this) {
            b91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f26829x;
        if (str != null) {
            String str2 = this.B;
            k71 k71Var = this.f26812a;
            if (str2 != null) {
                k71Var.G(Uri.parse(str), this.f26830y, Uri.parse(this.B), this.C);
            } else {
                k71Var.D(Uri.parse(str), this.f26830y);
            }
            k71Var.P(this.f26827s);
            long p10 = k71Var.p();
            b91 b91Var = this.f26817c0;
            if (p10 != -9223372036854775807L) {
                b91Var.b((int) (k71Var.p() / 1000));
            } else {
                b91Var.b(0);
            }
            k();
            o();
            m();
            b91Var.invalidate();
            int i10 = this.L;
            if (i10 != -1) {
                k71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z4, boolean z10) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.U;
        if (z10) {
            AnimatorSet animatorSet = this.f26815b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26815b0 = animatorSet2;
            if (z4) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f26815b0.setDuration(150L);
            this.f26815b0.addListener(new pd0(this, 29));
            this.f26815b0.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        j3.f0 f0Var = this.f26812a.d;
        ImageView imageView = this.V;
        if (f0Var != null && !this.R) {
            imageView.setVisibility(0);
            if (!this.Q) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(k7.c6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(k7.c6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
            return;
        }
        imageView.setVisibility(8);
    }

    public final void l(boolean z4) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f26821f;
        eg0 eg0Var = this.f26816c;
        if (viewGroup2 == null) {
            this.P = true;
            if (!this.Q) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    eg0Var.addView(textureView);
                }
            }
            boolean z10 = this.Q;
            b91 b91Var = this.f26817c0;
            if (z10) {
                ViewGroup viewGroup3 = (ViewGroup) b91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(b91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) b91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(b91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(b91Var);
                    } else {
                        addView(b91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f26817c0, this.Q, eg0Var.getAspectRatio(), eg0Var.getVideoRotation(), z4);
            this.f26825n = a2;
            a2.setVisibility(4);
            if (this.Q && this.f26825n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = b91.F;
            b91Var.a();
            return;
        }
        if (this.Q) {
            ViewGroup viewGroup5 = (ViewGroup) eg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(eg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) eg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(eg0Var);
                }
                addView(eg0Var, 0);
            }
        }
        this.v.a(this.f26817c0, this.Q, eg0Var.getAspectRatio(), eg0Var.getVideoRotation(), z4);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f26813a0;
        if (imageView == null) {
            return;
        }
        if (this.R) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f26812a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.R) {
            imageView.setLayoutParams(k7.c6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(k7.c6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        b91 b91Var = this.f26817c0;
        int i13 = b91.F;
        b91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f26822f0);
        if (!this.f26812a.y()) {
            if (this.S) {
                ImageView imageView = this.W;
                if (this.R) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.W;
            if (this.R) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.W;
        if (this.R) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f26822f0, 500L);
        if (!this.G) {
            this.G = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new jm(this, i10, 11));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.N);
    }

    @Override
    public final void onError(k71 k71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        eg0 eg0Var = this.f26816c;
        int measuredWidth = (i14 - eg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - eg0Var.getMeasuredHeight()) / 2;
        eg0Var.layout(measuredWidth, dp, eg0Var.getMeasuredWidth() + measuredWidth, eg0Var.getMeasuredHeight() + dp);
        b91 b91Var = this.f26817c0;
        if (b91Var.getParent() == this) {
            b91Var.layout(0, 0, b91Var.getMeasuredWidth(), b91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.U;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        b91Var.f25529a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f26816c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        b91 b91Var = this.f26817c0;
        if (b91Var.getParent() == this) {
            b91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z4, int i10) {
        b91 b91Var = this.f26817c0;
        k71 k71Var = this.f26812a;
        if (i10 != 2) {
            if (k71Var.p() != -9223372036854775807L) {
                b91Var.b((int) (k71Var.p() / 1000));
            } else {
                b91Var.b(0);
            }
        }
        c91 c91Var = this.v;
        if (i10 != 4 && i10 != 1 && k71Var.y()) {
            c91Var.e(this, true);
        } else {
            c91Var.e(this, false);
        }
        if (k71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.S = true;
            k71Var.B();
            k71Var.L(0L, false);
            n();
            b91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.P) {
            this.P = false;
            if (this.Q || this.R) {
                if (this.R) {
                    this.f26826r = 1;
                }
                this.f26825n.setSurfaceTexture(surfaceTexture);
                this.f26825n.setSurfaceTextureListener(this.f26823g0);
                this.f26825n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f26826r == 2) {
            ImageView imageView = this.f26819e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.T = false;
            int i10 = this.f26818d0;
            int i11 = this.f26820e0;
            this.f26816c.getVideoRotation();
            this.v.f(this.f26817c0, false, i10, i11, this.F);
            this.f26826r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        float f11;
        eg0 eg0Var = this.f26816c;
        if (eg0Var != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f12 = i10 * f10;
            this.f26818d0 = (int) f12;
            this.f26820e0 = i11;
            if (i11 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i11;
            }
            eg0Var.a(f11, i12);
            if (this.Q) {
                this.v.c(f11, i12);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.J = true;
        this.I = System.currentTimeMillis();
        this.f26817c0.invalidate();
    }

    public final void o() {
    }

    @Override
    public final void onSeekFinished(k3.a aVar) {
    }

    @Override
    public final void onSeekStarted(k3.a aVar) {
    }
}
