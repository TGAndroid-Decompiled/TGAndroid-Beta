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
public final class da1 extends ViewGroup implements f81, AudioManager.OnAudioFocusChangeListener {
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
    public final i81 f24046a;
    public final RadialProgressView f24047a0;
    public final w91 f24048b;
    public final ImageView f24049b0;
    public final yg0 f24050c;
    public final ImageView f24051c0;
    public final TextureView d;
    public final ImageView f24052d0;
    public final ImageView e;
    public AnimatorSet f24053e0;
    public final ViewGroup f24054f;
    public final z91 f24055f0;
    public int f24056g0;
    public Bitmap h;
    public int f24057h0;
    public final v91 f24058i0;
    public final x50 f24059j0;
    public final v91 f24060k0;
    public TextureView f24061n;
    public int f24062r;
    public boolean f24063s;
    public final aa1 v;
    public boolean f24064w;
    public String f24065x;
    public String f24066y;
    public static final Pattern f24032l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f24033n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f24034o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f24035p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f24036q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f24037r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f24038s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f24039t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f24040u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f24041v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f24042w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f24043x0 = Pattern.compile("var\\s");
    public static final Pattern f24044y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f24045z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public da1(Context context, boolean z10, aa1 aa1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f24058i0 = new v91(this, 0);
        this.f24059j0 = new x50(this, 3);
        this.f24060k0 = new v91(this, 1);
        setWillNotDraw(false);
        this.v = aa1Var;
        paint.setColor(-16777216);
        yg0 yg0Var = new yg0(this, context, 1);
        this.f24050c = yg0Var;
        addView(yg0Var, w7.z5.e(-1, -1, 17));
        w91 w91Var = new w91(context, context);
        this.f24048b = w91Var;
        final n81 n81Var = new n81(this);
        w91Var.addJavascriptInterface(new Object(n81Var) {
            public final n81 f23062a;

            {
                this.f23062a = n81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                da1 da1Var = (da1) this.f23062a.f27317a;
                AsyncTask asyncTask = da1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = da1Var.R;
                    if (asyncTask2 instanceof ca1) {
                        ca1 ca1Var = (ca1) asyncTask2;
                        String[] strArr = ca1Var.f23664c;
                        String str2 = strArr[0];
                        String str3 = ca1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        ca1Var.f23663b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = w91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = aa1Var.g();
        this.f24054f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            yg0Var.addView(textureView, w7.z5.e(-1, -1, 17));
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
        i81 i81Var = new i81();
        this.f24046a = i81Var;
        i81Var.J = this;
        i81Var.V(textureView);
        z91 z91Var = new z91(this, context);
        this.f24055f0 = z91Var;
        if (g10 != null) {
            g10.addView(z91Var);
        } else {
            addView(z91Var, w7.z5.d(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f24047a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f24049b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        z91Var.addView(imageView2, w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final da1 f29297b;

            {
                this.f29297b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        da1 da1Var = this.f29297b;
                        if (da1Var.f24064w && !da1Var.S && !da1Var.W && da1Var.M) {
                            da1Var.T = !da1Var.T;
                            da1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        da1 da1Var2 = this.f29297b;
                        i81 i81Var2 = da1Var2.f24046a;
                        if (da1Var2.f24064w && da1Var2.f24065x != null) {
                            if (i81Var2.d == null) {
                                da1Var2.i();
                            }
                            if (i81Var2.y()) {
                                i81Var2.B();
                            } else {
                                da1Var2.V = false;
                                i81Var2.C();
                            }
                            da1Var2.n();
                            return;
                        }
                        return;
                    default:
                        da1 da1Var3 = this.f29297b;
                        ViewGroup viewGroup = da1Var3.f24054f;
                        boolean z11 = da1Var3.I;
                        aa1 aa1Var2 = da1Var3.v;
                        z91 z91Var2 = da1Var3.f24055f0;
                        yg0 yg0Var2 = da1Var3.f24050c;
                        TextureView textureView2 = da1Var3.d;
                        if (textureView2 != null && aa1Var2.h() && !da1Var3.S && !da1Var3.W && da1Var3.M) {
                            da1Var3.W = true;
                            if (!da1Var3.U) {
                                da1Var3.T = false;
                                aa1Var2.i(true, da1Var3.f24060k0, yg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) yg0Var2.getParent();
                            if (viewGroup2 != da1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(yg0Var2);
                                }
                                da1Var3.addView(yg0Var2, 0, w7.z5.e(-1, -1, 17));
                                yg0Var2.measure(View.MeasureSpec.makeMeasureSpec(da1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(da1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = da1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                da1Var3.h = null;
                            }
                            da1Var3.S = true;
                            da1Var3.U = false;
                            da1Var3.n();
                            da1Var3.o();
                            da1Var3.k();
                            da1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                yg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) z91Var2.getParent();
                            if (viewGroup3 != da1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(z91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(z91Var2);
                                } else {
                                    da1Var3.addView(z91Var2, 1);
                                }
                            }
                            z91Var2.d(false, false);
                            aa1Var2.i(false, null, yg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f24051c0 = imageView3;
        imageView3.setScaleType(scaleType);
        z91Var.addView(imageView3, w7.z5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final da1 f29297b;

            {
                this.f29297b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        da1 da1Var = this.f29297b;
                        if (da1Var.f24064w && !da1Var.S && !da1Var.W && da1Var.M) {
                            da1Var.T = !da1Var.T;
                            da1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        da1 da1Var2 = this.f29297b;
                        i81 i81Var2 = da1Var2.f24046a;
                        if (da1Var2.f24064w && da1Var2.f24065x != null) {
                            if (i81Var2.d == null) {
                                da1Var2.i();
                            }
                            if (i81Var2.y()) {
                                i81Var2.B();
                            } else {
                                da1Var2.V = false;
                                i81Var2.C();
                            }
                            da1Var2.n();
                            return;
                        }
                        return;
                    default:
                        da1 da1Var3 = this.f29297b;
                        ViewGroup viewGroup = da1Var3.f24054f;
                        boolean z11 = da1Var3.I;
                        aa1 aa1Var2 = da1Var3.v;
                        z91 z91Var2 = da1Var3.f24055f0;
                        yg0 yg0Var2 = da1Var3.f24050c;
                        TextureView textureView2 = da1Var3.d;
                        if (textureView2 != null && aa1Var2.h() && !da1Var3.S && !da1Var3.W && da1Var3.M) {
                            da1Var3.W = true;
                            if (!da1Var3.U) {
                                da1Var3.T = false;
                                aa1Var2.i(true, da1Var3.f24060k0, yg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) yg0Var2.getParent();
                            if (viewGroup2 != da1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(yg0Var2);
                                }
                                da1Var3.addView(yg0Var2, 0, w7.z5.e(-1, -1, 17));
                                yg0Var2.measure(View.MeasureSpec.makeMeasureSpec(da1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(da1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = da1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                da1Var3.h = null;
                            }
                            da1Var3.S = true;
                            da1Var3.U = false;
                            da1Var3.n();
                            da1Var3.o();
                            da1Var3.k();
                            da1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                yg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) z91Var2.getParent();
                            if (viewGroup3 != da1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(z91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(z91Var2);
                                } else {
                                    da1Var3.addView(z91Var2, 1);
                                }
                            }
                            z91Var2.d(false, false);
                            aa1Var2.i(false, null, yg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f24052d0 = imageView4;
            imageView4.setScaleType(scaleType);
            z91Var.addView(imageView4, w7.z5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final da1 f29297b;

                {
                    this.f29297b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            da1 da1Var = this.f29297b;
                            if (da1Var.f24064w && !da1Var.S && !da1Var.W && da1Var.M) {
                                da1Var.T = !da1Var.T;
                                da1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            da1 da1Var2 = this.f29297b;
                            i81 i81Var2 = da1Var2.f24046a;
                            if (da1Var2.f24064w && da1Var2.f24065x != null) {
                                if (i81Var2.d == null) {
                                    da1Var2.i();
                                }
                                if (i81Var2.y()) {
                                    i81Var2.B();
                                } else {
                                    da1Var2.V = false;
                                    i81Var2.C();
                                }
                                da1Var2.n();
                                return;
                            }
                            return;
                        default:
                            da1 da1Var3 = this.f29297b;
                            ViewGroup viewGroup = da1Var3.f24054f;
                            boolean z11 = da1Var3.I;
                            aa1 aa1Var2 = da1Var3.v;
                            z91 z91Var2 = da1Var3.f24055f0;
                            yg0 yg0Var2 = da1Var3.f24050c;
                            TextureView textureView2 = da1Var3.d;
                            if (textureView2 != null && aa1Var2.h() && !da1Var3.S && !da1Var3.W && da1Var3.M) {
                                da1Var3.W = true;
                                if (!da1Var3.U) {
                                    da1Var3.T = false;
                                    aa1Var2.i(true, da1Var3.f24060k0, yg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) yg0Var2.getParent();
                                if (viewGroup2 != da1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(yg0Var2);
                                    }
                                    da1Var3.addView(yg0Var2, 0, w7.z5.e(-1, -1, 17));
                                    yg0Var2.measure(View.MeasureSpec.makeMeasureSpec(da1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(da1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = da1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    da1Var3.h = null;
                                }
                                da1Var3.S = true;
                                da1Var3.U = false;
                                da1Var3.n();
                                da1Var3.o();
                                da1Var3.k();
                                da1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    yg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) z91Var2.getParent();
                                if (viewGroup3 != da1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(z91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(z91Var2);
                                    } else {
                                        da1Var3.addView(z91Var2, 1);
                                    }
                                }
                                z91Var2.d(false, false);
                                aa1Var2.i(false, null, yg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f24033n0.matcher(str);
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
        Matcher matcher = f24032l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f24055f0;
    }

    private View getProgressView() {
        return this.f24047a0;
    }

    public final void b() {
        this.f24046a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f24048b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f24050c;
    }

    public View getControlsView() {
        return this.f24055f0;
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
        z91 z91Var = this.f24055f0;
        if (z91Var.getParent() != this) {
            z91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f24065x;
        if (str != null) {
            String str2 = this.E;
            i81 i81Var = this.f24046a;
            if (str2 != null) {
                i81Var.G(Uri.parse(str), this.f24066y, Uri.parse(this.E), this.F);
            } else {
                i81Var.D(Uri.parse(str), this.f24066y);
            }
            i81Var.P(this.f24063s);
            int i10 = (i81Var.p() > (-9223372036854775807L) ? 1 : (i81Var.p() == (-9223372036854775807L) ? 0 : -1));
            z91 z91Var = this.f24055f0;
            if (i10 != 0) {
                z91Var.b((int) (i81Var.p() / 1000));
            } else {
                z91Var.b(0);
            }
            k();
            o();
            m();
            z91Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                i81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f24047a0;
        if (z11) {
            AnimatorSet animatorSet = this.f24053e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24053e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f24053e0.setDuration(150L);
            this.f24053e0.addListener(new v61(this, 4));
            this.f24053e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.h0 h0Var = this.f24046a.d;
        ImageView imageView = this.f24049b0;
        if (h0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 1.0f, 56, 85));
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
        ViewGroup viewGroup2 = this.f24054f;
        yg0 yg0Var = this.f24050c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    yg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            z91 z91Var = this.f24055f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) z91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(z91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) z91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(z91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(z91Var);
                    } else {
                        addView(z91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f24055f0, this.T, yg0Var.getAspectRatio(), yg0Var.getVideoRotation(), z10);
            this.f24061n = a2;
            a2.setVisibility(4);
            if (this.T && this.f24061n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = z91.I;
            z91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) yg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(yg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) yg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(yg0Var);
                }
                addView(yg0Var, 0);
            }
        }
        this.v.a(this.f24055f0, this.T, yg0Var.getAspectRatio(), yg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f24052d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f24046a.d != null) {
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
        z91 z91Var = this.f24055f0;
        int i13 = z91.I;
        z91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f24058i0);
        if (!this.f24046a.y()) {
            if (this.V) {
                ImageView imageView = this.f24051c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f24051c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f24051c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f24058i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new o8(this, i10, 14));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(i81 i81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        yg0 yg0Var = this.f24050c;
        int measuredWidth = (i14 - yg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - yg0Var.getMeasuredHeight()) / 2;
        yg0Var.layout(measuredWidth, dp, yg0Var.getMeasuredWidth() + measuredWidth, yg0Var.getMeasuredHeight() + dp);
        z91 z91Var = this.f24055f0;
        if (z91Var.getParent() == this) {
            z91Var.layout(0, 0, z91Var.getMeasuredWidth(), z91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f24047a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        z91Var.f31520a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f24050c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        z91 z91Var = this.f24055f0;
        if (z91Var.getParent() == this) {
            z91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f24047a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        z91 z91Var = this.f24055f0;
        i81 i81Var = this.f24046a;
        if (i10 != 2) {
            if (i81Var.p() != -9223372036854775807L) {
                z91Var.b((int) (i81Var.p() / 1000));
            } else {
                z91Var.b(0);
            }
        }
        aa1 aa1Var = this.v;
        if (i10 != 4 && i10 != 1 && i81Var.y()) {
            aa1Var.e(this, true);
        } else {
            aa1Var.e(this, false);
        }
        if (i81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            i81Var.B();
            i81Var.L(0L, false);
            n();
            z91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f24062r = 1;
                }
                this.f24061n.setSurfaceTexture(surfaceTexture);
                this.f24061n.setSurfaceTextureListener(this.f24059j0);
                this.f24061n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f24062r == 2) {
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
            int i10 = this.f24056g0;
            int i11 = this.f24057h0;
            this.f24050c.getVideoRotation();
            this.v.f(this.f24055f0, false, i10, i11, this.I);
            this.f24062r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        yg0 yg0Var = this.f24050c;
        if (yg0Var != null) {
            float f11 = i10 * f7;
            this.f24056g0 = (int) f11;
            this.f24057h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            yg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f24055f0.invalidate();
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
