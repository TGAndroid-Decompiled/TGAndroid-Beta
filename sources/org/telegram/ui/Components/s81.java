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
public final class s81 extends ViewGroup implements u61, AudioManager.OnAudioFocusChangeListener {
    public static final Pattern f32554h0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f32555i0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f32556j0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f32557k0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f32558l0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f32559n0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f32560o0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f32561p0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f32562q0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f32563r0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f32564s0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f32565t0 = Pattern.compile("var\\s");
    public static final Pattern f32566u0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f32567v0 = Pattern.compile("[()]");
    public static final Pattern f32568w0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
    public String A;
    public String B;
    public String C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public final Paint M;
    public AsyncTask N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final RadialProgressView T;
    public final ImageView U;
    public final ImageView V;
    public final ImageView W;
    public final x61 f32569a;
    public AnimatorSet f32570a0;
    public final l81 f32571b;
    public final o81 f32572b0;
    public final tf0 f32573c;
    public int f32574c0;
    public final TextureView d;
    public int f32575d0;
    public final ImageView f32576e;
    public final k81 f32577e0;
    public final ViewGroup f32578f;
    public final gh.h f32579f0;
    public final k81 f32580g0;
    public Bitmap h;
    public TextureView f32581n;
    public int f32582r;
    public boolean f32583s;
    public final p81 v;
    public boolean f32584w;
    public String f32585x;
    public String f32586y;

    public s81(Context context, boolean z10, p81 p81Var) {
        super(context);
        this.E = true;
        Paint paint = new Paint();
        this.M = paint;
        this.f32577e0 = new k81(this, 0);
        this.f32579f0 = new gh.h(this, 4);
        this.f32580g0 = new k81(this, 1);
        setWillNotDraw(false);
        this.v = p81Var;
        paint.setColor(-16777216);
        tf0 tf0Var = new tf0(this, context, 1);
        this.f32573c = tf0Var;
        addView(tf0Var, i7.f6.e(-1, -1, 17));
        l81 l81Var = new l81(context, context);
        this.f32571b = l81Var;
        final i81 i81Var = new i81(this);
        l81Var.addJavascriptInterface(new Object(i81Var) {
            public final i81 f26598a;

            {
                this.f26598a = i81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                s81 s81Var = (s81) this.f26598a.f29349a;
                AsyncTask asyncTask = s81Var.N;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = s81Var.N;
                    if (asyncTask2 instanceof r81) {
                        r81 r81Var = (r81) asyncTask2;
                        String[] strArr = r81Var.f32244c;
                        String str2 = strArr[0];
                        String str3 = r81Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        r81Var.f32243b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = l81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = p81Var.g();
        this.f32578f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            tf0Var.addView(textureView, i7.f6.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f32576e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        x61 x61Var = new x61();
        this.f32569a = x61Var;
        x61Var.F = this;
        x61Var.W(textureView);
        o81 o81Var = new o81(this, context);
        this.f32572b0 = o81Var;
        if (g10 != null) {
            g10.addView(o81Var);
        } else {
            addView(o81Var, i7.f6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.T = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, i7.f6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.U = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        o81Var.addView(imageView2, i7.f6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final s81 f29618b;

            {
                this.f29618b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s81 s81Var = this.f29618b;
                        if (s81Var.f32584w && !s81Var.O && !s81Var.S && s81Var.I) {
                            s81Var.P = !s81Var.P;
                            s81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        s81 s81Var2 = this.f29618b;
                        x61 x61Var2 = s81Var2.f32569a;
                        if (s81Var2.f32584w && s81Var2.f32585x != null) {
                            if (x61Var2.d == null) {
                                s81Var2.i();
                            }
                            if (x61Var2.z()) {
                                x61Var2.C();
                            } else {
                                s81Var2.R = false;
                                x61Var2.D();
                            }
                            s81Var2.n();
                            return;
                        }
                        return;
                    default:
                        s81 s81Var3 = this.f29618b;
                        ViewGroup viewGroup = s81Var3.f32578f;
                        boolean z11 = s81Var3.E;
                        p81 p81Var2 = s81Var3.v;
                        o81 o81Var2 = s81Var3.f32572b0;
                        tf0 tf0Var2 = s81Var3.f32573c;
                        TextureView textureView2 = s81Var3.d;
                        if (textureView2 != null && p81Var2.h() && !s81Var3.O && !s81Var3.S && s81Var3.I) {
                            s81Var3.S = true;
                            if (!s81Var3.Q) {
                                s81Var3.P = false;
                                p81Var2.i(true, s81Var3.f32580g0, tf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) tf0Var2.getParent();
                            if (viewGroup2 != s81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(tf0Var2);
                                }
                                s81Var3.addView(tf0Var2, 0, i7.f6.e(-1, -1, 17));
                                tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = s81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                s81Var3.h = null;
                            }
                            s81Var3.O = true;
                            s81Var3.Q = false;
                            s81Var3.n();
                            s81Var3.o();
                            s81Var3.k();
                            s81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                tf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) o81Var2.getParent();
                            if (viewGroup3 != s81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(o81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(o81Var2);
                                } else {
                                    s81Var3.addView(o81Var2, 1);
                                }
                            }
                            o81Var2.d(false, false);
                            p81Var2.i(false, null, tf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.V = imageView3;
        imageView3.setScaleType(scaleType);
        o81Var.addView(imageView3, i7.f6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final s81 f29618b;

            {
                this.f29618b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s81 s81Var = this.f29618b;
                        if (s81Var.f32584w && !s81Var.O && !s81Var.S && s81Var.I) {
                            s81Var.P = !s81Var.P;
                            s81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        s81 s81Var2 = this.f29618b;
                        x61 x61Var2 = s81Var2.f32569a;
                        if (s81Var2.f32584w && s81Var2.f32585x != null) {
                            if (x61Var2.d == null) {
                                s81Var2.i();
                            }
                            if (x61Var2.z()) {
                                x61Var2.C();
                            } else {
                                s81Var2.R = false;
                                x61Var2.D();
                            }
                            s81Var2.n();
                            return;
                        }
                        return;
                    default:
                        s81 s81Var3 = this.f29618b;
                        ViewGroup viewGroup = s81Var3.f32578f;
                        boolean z11 = s81Var3.E;
                        p81 p81Var2 = s81Var3.v;
                        o81 o81Var2 = s81Var3.f32572b0;
                        tf0 tf0Var2 = s81Var3.f32573c;
                        TextureView textureView2 = s81Var3.d;
                        if (textureView2 != null && p81Var2.h() && !s81Var3.O && !s81Var3.S && s81Var3.I) {
                            s81Var3.S = true;
                            if (!s81Var3.Q) {
                                s81Var3.P = false;
                                p81Var2.i(true, s81Var3.f32580g0, tf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) tf0Var2.getParent();
                            if (viewGroup2 != s81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(tf0Var2);
                                }
                                s81Var3.addView(tf0Var2, 0, i7.f6.e(-1, -1, 17));
                                tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = s81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                s81Var3.h = null;
                            }
                            s81Var3.O = true;
                            s81Var3.Q = false;
                            s81Var3.n();
                            s81Var3.o();
                            s81Var3.k();
                            s81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                tf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) o81Var2.getParent();
                            if (viewGroup3 != s81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(o81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(o81Var2);
                                } else {
                                    s81Var3.addView(o81Var2, 1);
                                }
                            }
                            o81Var2.d(false, false);
                            p81Var2.i(false, null, tf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.W = imageView4;
            imageView4.setScaleType(scaleType);
            o81Var.addView(imageView4, i7.f6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final s81 f29618b;

                {
                    this.f29618b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            s81 s81Var = this.f29618b;
                            if (s81Var.f32584w && !s81Var.O && !s81Var.S && s81Var.I) {
                                s81Var.P = !s81Var.P;
                                s81Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            s81 s81Var2 = this.f29618b;
                            x61 x61Var2 = s81Var2.f32569a;
                            if (s81Var2.f32584w && s81Var2.f32585x != null) {
                                if (x61Var2.d == null) {
                                    s81Var2.i();
                                }
                                if (x61Var2.z()) {
                                    x61Var2.C();
                                } else {
                                    s81Var2.R = false;
                                    x61Var2.D();
                                }
                                s81Var2.n();
                                return;
                            }
                            return;
                        default:
                            s81 s81Var3 = this.f29618b;
                            ViewGroup viewGroup = s81Var3.f32578f;
                            boolean z11 = s81Var3.E;
                            p81 p81Var2 = s81Var3.v;
                            o81 o81Var2 = s81Var3.f32572b0;
                            tf0 tf0Var2 = s81Var3.f32573c;
                            TextureView textureView2 = s81Var3.d;
                            if (textureView2 != null && p81Var2.h() && !s81Var3.O && !s81Var3.S && s81Var3.I) {
                                s81Var3.S = true;
                                if (!s81Var3.Q) {
                                    s81Var3.P = false;
                                    p81Var2.i(true, s81Var3.f32580g0, tf0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) tf0Var2.getParent();
                                if (viewGroup2 != s81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(tf0Var2);
                                    }
                                    s81Var3.addView(tf0Var2, 0, i7.f6.e(-1, -1, 17));
                                    tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = s81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    s81Var3.h = null;
                                }
                                s81Var3.O = true;
                                s81Var3.Q = false;
                                s81Var3.n();
                                s81Var3.o();
                                s81Var3.k();
                                s81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    tf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) o81Var2.getParent();
                                if (viewGroup3 != s81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(o81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(o81Var2);
                                    } else {
                                        s81Var3.addView(o81Var2, 1);
                                    }
                                }
                                o81Var2.d(false, false);
                                p81Var2.i(false, null, tf0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s81.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s81.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f32556j0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f32554h0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f32572b0;
    }

    private View getProgressView() {
        return this.T;
    }

    public final void b() {
        this.f32569a.I();
        AsyncTask asyncTask = this.N;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.N = null;
        }
        this.f32571b.stopLoading();
    }

    public final boolean f() {
        if (!this.Q && !this.S) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s81.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f32573c;
    }

    public View getControlsView() {
        return this.f32572b0;
    }

    public ImageView getTextureImageView() {
        return this.f32576e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.C;
    }

    public final void h() {
        o81 o81Var = this.f32572b0;
        if (o81Var.getParent() != this) {
            o81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f32585x;
        if (str != null) {
            String str2 = this.A;
            x61 x61Var = this.f32569a;
            if (str2 != null) {
                x61Var.H(Uri.parse(str), this.f32586y, Uri.parse(this.A), this.B);
            } else {
                x61Var.E(Uri.parse(str), this.f32586y);
            }
            x61Var.Q(this.f32583s);
            long q6 = x61Var.q();
            o81 o81Var = this.f32572b0;
            if (q6 != -9223372036854775807L) {
                o81Var.b((int) (x61Var.q() / 1000));
            } else {
                o81Var.b(0);
            }
            k();
            o();
            m();
            o81Var.invalidate();
            int i10 = this.K;
            if (i10 != -1) {
                x61Var.M(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f9 = 0.0f;
        RadialProgressView radialProgressView = this.T;
        if (z11) {
            AnimatorSet animatorSet = this.f32570a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32570a0 = animatorSet2;
            if (z10) {
                f9 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f9));
            this.f32570a0.setDuration(150L);
            this.f32570a0.addListener(new p11(this, 8));
            this.f32570a0.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        radialProgressView.setAlpha(f9);
    }

    public final void k() {
        j3.k0 k0Var = this.f32569a.d;
        ImageView imageView = this.U;
        if (k0Var != null && !this.Q) {
            imageView.setVisibility(0);
            if (!this.P) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(i7.f6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(i7.f6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f32578f;
        tf0 tf0Var = this.f32573c;
        if (viewGroup2 == null) {
            this.O = true;
            if (!this.P) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    tf0Var.addView(textureView);
                }
            }
            boolean z11 = this.P;
            o81 o81Var = this.f32572b0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) o81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(o81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) o81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(o81Var);
                    } else {
                        addView(o81Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f32572b0, this.P, tf0Var.getAspectRatio(), tf0Var.getVideoRotation(), z10);
            this.f32581n = a2;
            a2.setVisibility(4);
            if (this.P && this.f32581n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = o81.E;
            o81Var.a();
            return;
        }
        if (this.P) {
            ViewGroup viewGroup5 = (ViewGroup) tf0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(tf0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) tf0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(tf0Var);
                }
                addView(tf0Var, 0);
            }
        }
        this.v.a(this.f32572b0, this.P, tf0Var.getAspectRatio(), tf0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.W;
        if (imageView == null) {
            return;
        }
        if (this.Q) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f32569a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.Q) {
            imageView.setLayoutParams(i7.f6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(i7.f6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        o81 o81Var = this.f32572b0;
        int i13 = o81.E;
        o81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f32577e0);
        if (!this.f32569a.z()) {
            if (this.R) {
                ImageView imageView = this.V;
                if (this.Q) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.V;
            if (this.Q) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.V;
        if (this.Q) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f32577e0, 500L);
        if (!this.F) {
            this.F = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new i8(this, i10, 14));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.M);
    }

    @Override
    public final void onError(x61 x61Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        tf0 tf0Var = this.f32573c;
        int measuredWidth = (i14 - tf0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - tf0Var.getMeasuredHeight()) / 2;
        tf0Var.layout(measuredWidth, dp, tf0Var.getMeasuredWidth() + measuredWidth, tf0Var.getMeasuredHeight() + dp);
        o81 o81Var = this.f32572b0;
        if (o81Var.getParent() == this) {
            o81Var.layout(0, 0, o81Var.getMeasuredWidth(), o81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.T;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        o81Var.f31283a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f32573c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        o81 o81Var = this.f32572b0;
        if (o81Var.getParent() == this) {
            o81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.T.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        o81 o81Var = this.f32572b0;
        x61 x61Var = this.f32569a;
        if (i10 != 2) {
            if (x61Var.q() != -9223372036854775807L) {
                o81Var.b((int) (x61Var.q() / 1000));
            } else {
                o81Var.b(0);
            }
        }
        p81 p81Var = this.v;
        if (i10 != 4 && i10 != 1 && x61Var.z()) {
            p81Var.e(this, true);
        } else {
            p81Var.e(this, false);
        }
        if (x61Var.z() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.R = true;
            x61Var.C();
            x61Var.M(0L, false);
            n();
            o81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.O) {
            this.O = false;
            if (this.P || this.Q) {
                if (this.Q) {
                    this.f32582r = 1;
                }
                this.f32581n.setSurfaceTexture(surfaceTexture);
                this.f32581n.setSurfaceTextureListener(this.f32579f0);
                this.f32581n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f32582r == 2) {
            ImageView imageView = this.f32576e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.S = false;
            int i10 = this.f32574c0;
            int i11 = this.f32575d0;
            this.f32573c.getVideoRotation();
            this.v.f(this.f32572b0, false, i10, i11, this.E);
            this.f32582r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        float f10;
        tf0 tf0Var = this.f32573c;
        if (tf0Var != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f9;
            this.f32574c0 = (int) f11;
            this.f32575d0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            tf0Var.a(f10, i12);
            if (this.P) {
                this.v.c(f10, i12);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.I = true;
        this.H = System.currentTimeMillis();
        this.f32572b0.invalidate();
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
