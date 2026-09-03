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
public final class e91 extends ViewGroup implements f71, AudioManager.OnAudioFocusChangeListener {
    public static final Pattern f24515i0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f24516j0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f24517k0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f24518l0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern m0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f24519n0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f24520o0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f24521p0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f24522q0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f24523r0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f24524s0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f24525t0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f24526u0 = Pattern.compile("var\\s");
    public static final Pattern f24527v0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f24528w0 = Pattern.compile("[()]");
    public static final Pattern f24529x0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
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
    public final i71 f24530a;
    public final ImageView f24531a0;
    public final x81 f24532b;
    public AnimatorSet f24533b0;
    public final dg0 f24534c;
    public final a91 f24535c0;
    public final TextureView d;
    public int f24536d0;
    public final ImageView e;
    public int f24537e0;
    public final ViewGroup f24538f;
    public final w81 f24539f0;
    public final ih.h f24540g0;
    public Bitmap h;
    public final w81 f24541h0;
    public TextureView f24542n;
    public int f24543r;
    public boolean f24544s;
    public final b91 v;
    public boolean f24545w;
    public String f24546x;
    public String f24547y;

    public e91(Context context, boolean z4, b91 b91Var) {
        super(context);
        this.F = true;
        Paint paint = new Paint();
        this.N = paint;
        this.f24539f0 = new w81(this, 0);
        this.f24540g0 = new ih.h(this, 4);
        this.f24541h0 = new w81(this, 1);
        setWillNotDraw(false);
        this.v = b91Var;
        paint.setColor(-16777216);
        dg0 dg0Var = new dg0(this, context, 1);
        this.f24534c = dg0Var;
        addView(dg0Var, k7.b6.e(-1, -1, 17));
        x81 x81Var = new x81(context, context);
        this.f24532b = x81Var;
        final u81 u81Var = new u81(this);
        x81Var.addJavascriptInterface(new Object(u81Var) {
            public final u81 f23197a;

            {
                this.f23197a = u81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                e91 e91Var = (e91) this.f23197a.f29138a;
                AsyncTask asyncTask = e91Var.O;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = e91Var.O;
                    if (asyncTask2 instanceof d91) {
                        d91 d91Var = (d91) asyncTask2;
                        String[] strArr = d91Var.f24236c;
                        String str2 = strArr[0];
                        String str3 = d91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        d91Var.f24235b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = x81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = b91Var.g();
        this.f24538f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            dg0Var.addView(textureView, k7.b6.e(-1, -1, 17));
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
        i71 i71Var = new i71();
        this.f24530a = i71Var;
        i71Var.G = this;
        i71Var.V(textureView);
        a91 a91Var = new a91(this, context);
        this.f24535c0 = a91Var;
        if (g10 != null) {
            g10.addView(a91Var);
        } else {
            addView(a91Var, k7.b6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.U = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, k7.b6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.V = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        a91Var.addView(imageView2, k7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e91 f29409b;

            {
                this.f29409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e91 e91Var = this.f29409b;
                        if (e91Var.f24545w && !e91Var.P && !e91Var.T && e91Var.J) {
                            e91Var.Q = !e91Var.Q;
                            e91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        e91 e91Var2 = this.f29409b;
                        i71 i71Var2 = e91Var2.f24530a;
                        if (e91Var2.f24545w && e91Var2.f24546x != null) {
                            if (i71Var2.d == null) {
                                e91Var2.i();
                            }
                            if (i71Var2.y()) {
                                i71Var2.B();
                            } else {
                                e91Var2.S = false;
                                i71Var2.C();
                            }
                            e91Var2.n();
                            return;
                        }
                        return;
                    default:
                        e91 e91Var3 = this.f29409b;
                        ViewGroup viewGroup = e91Var3.f24538f;
                        boolean z10 = e91Var3.F;
                        b91 b91Var2 = e91Var3.v;
                        a91 a91Var2 = e91Var3.f24535c0;
                        dg0 dg0Var2 = e91Var3.f24534c;
                        TextureView textureView2 = e91Var3.d;
                        if (textureView2 != null && b91Var2.h() && !e91Var3.P && !e91Var3.T && e91Var3.J) {
                            e91Var3.T = true;
                            if (!e91Var3.R) {
                                e91Var3.Q = false;
                                b91Var2.i(true, e91Var3.f24541h0, dg0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) dg0Var2.getParent();
                            if (viewGroup2 != e91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(dg0Var2);
                                }
                                e91Var3.addView(dg0Var2, 0, k7.b6.e(-1, -1, 17));
                                dg0Var2.measure(View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = e91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                e91Var3.h = null;
                            }
                            e91Var3.P = true;
                            e91Var3.R = false;
                            e91Var3.n();
                            e91Var3.o();
                            e91Var3.k();
                            e91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                dg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) a91Var2.getParent();
                            if (viewGroup3 != e91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(a91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(a91Var2);
                                } else {
                                    e91Var3.addView(a91Var2, 1);
                                }
                            }
                            a91Var2.d(false, false);
                            b91Var2.i(false, null, dg0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.W = imageView3;
        imageView3.setScaleType(scaleType);
        a91Var.addView(imageView3, k7.b6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final e91 f29409b;

            {
                this.f29409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e91 e91Var = this.f29409b;
                        if (e91Var.f24545w && !e91Var.P && !e91Var.T && e91Var.J) {
                            e91Var.Q = !e91Var.Q;
                            e91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        e91 e91Var2 = this.f29409b;
                        i71 i71Var2 = e91Var2.f24530a;
                        if (e91Var2.f24545w && e91Var2.f24546x != null) {
                            if (i71Var2.d == null) {
                                e91Var2.i();
                            }
                            if (i71Var2.y()) {
                                i71Var2.B();
                            } else {
                                e91Var2.S = false;
                                i71Var2.C();
                            }
                            e91Var2.n();
                            return;
                        }
                        return;
                    default:
                        e91 e91Var3 = this.f29409b;
                        ViewGroup viewGroup = e91Var3.f24538f;
                        boolean z10 = e91Var3.F;
                        b91 b91Var2 = e91Var3.v;
                        a91 a91Var2 = e91Var3.f24535c0;
                        dg0 dg0Var2 = e91Var3.f24534c;
                        TextureView textureView2 = e91Var3.d;
                        if (textureView2 != null && b91Var2.h() && !e91Var3.P && !e91Var3.T && e91Var3.J) {
                            e91Var3.T = true;
                            if (!e91Var3.R) {
                                e91Var3.Q = false;
                                b91Var2.i(true, e91Var3.f24541h0, dg0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) dg0Var2.getParent();
                            if (viewGroup2 != e91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(dg0Var2);
                                }
                                e91Var3.addView(dg0Var2, 0, k7.b6.e(-1, -1, 17));
                                dg0Var2.measure(View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = e91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                e91Var3.h = null;
                            }
                            e91Var3.P = true;
                            e91Var3.R = false;
                            e91Var3.n();
                            e91Var3.o();
                            e91Var3.k();
                            e91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                dg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) a91Var2.getParent();
                            if (viewGroup3 != e91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(a91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(a91Var2);
                                } else {
                                    e91Var3.addView(a91Var2, 1);
                                }
                            }
                            a91Var2.d(false, false);
                            b91Var2.i(false, null, dg0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        if (z4) {
            ImageView imageView4 = new ImageView(context);
            this.f24531a0 = imageView4;
            imageView4.setScaleType(scaleType);
            a91Var.addView(imageView4, k7.b6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final e91 f29409b;

                {
                    this.f29409b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e91 e91Var = this.f29409b;
                            if (e91Var.f24545w && !e91Var.P && !e91Var.T && e91Var.J) {
                                e91Var.Q = !e91Var.Q;
                                e91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            e91 e91Var2 = this.f29409b;
                            i71 i71Var2 = e91Var2.f24530a;
                            if (e91Var2.f24545w && e91Var2.f24546x != null) {
                                if (i71Var2.d == null) {
                                    e91Var2.i();
                                }
                                if (i71Var2.y()) {
                                    i71Var2.B();
                                } else {
                                    e91Var2.S = false;
                                    i71Var2.C();
                                }
                                e91Var2.n();
                                return;
                            }
                            return;
                        default:
                            e91 e91Var3 = this.f29409b;
                            ViewGroup viewGroup = e91Var3.f24538f;
                            boolean z10 = e91Var3.F;
                            b91 b91Var2 = e91Var3.v;
                            a91 a91Var2 = e91Var3.f24535c0;
                            dg0 dg0Var2 = e91Var3.f24534c;
                            TextureView textureView2 = e91Var3.d;
                            if (textureView2 != null && b91Var2.h() && !e91Var3.P && !e91Var3.T && e91Var3.J) {
                                e91Var3.T = true;
                                if (!e91Var3.R) {
                                    e91Var3.Q = false;
                                    b91Var2.i(true, e91Var3.f24541h0, dg0Var2.getAspectRatio(), z10);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) dg0Var2.getParent();
                                if (viewGroup2 != e91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(dg0Var2);
                                    }
                                    e91Var3.addView(dg0Var2, 0, k7.b6.e(-1, -1, 17));
                                    dg0Var2.measure(View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = e91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    e91Var3.h = null;
                                }
                                e91Var3.P = true;
                                e91Var3.R = false;
                                e91Var3.n();
                                e91Var3.o();
                                e91Var3.k();
                                e91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    dg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) a91Var2.getParent();
                                if (viewGroup3 != e91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(a91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(a91Var2);
                                    } else {
                                        e91Var3.addView(a91Var2, 1);
                                    }
                                }
                                a91Var2.d(false, false);
                                b91Var2.i(false, null, dg0Var2.getAspectRatio(), z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f24517k0.matcher(str);
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
        Matcher matcher = f24515i0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f24535c0;
    }

    private View getProgressView() {
        return this.U;
    }

    public final void b() {
        this.f24530a.H();
        AsyncTask asyncTask = this.O;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        this.f24532b.stopLoading();
    }

    public final boolean f() {
        if (!this.R && !this.T) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f24534c;
    }

    public View getControlsView() {
        return this.f24535c0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.D;
    }

    public final void h() {
        a91 a91Var = this.f24535c0;
        if (a91Var.getParent() != this) {
            a91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f24546x;
        if (str != null) {
            String str2 = this.B;
            i71 i71Var = this.f24530a;
            if (str2 != null) {
                i71Var.G(Uri.parse(str), this.f24547y, Uri.parse(this.B), this.C);
            } else {
                i71Var.D(Uri.parse(str), this.f24547y);
            }
            i71Var.P(this.f24544s);
            long p10 = i71Var.p();
            a91 a91Var = this.f24535c0;
            if (p10 != -9223372036854775807L) {
                a91Var.b((int) (i71Var.p() / 1000));
            } else {
                a91Var.b(0);
            }
            k();
            o();
            m();
            a91Var.invalidate();
            int i10 = this.L;
            if (i10 != -1) {
                i71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z4, boolean z10) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.U;
        if (z10) {
            AnimatorSet animatorSet = this.f24533b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24533b0 = animatorSet2;
            if (z4) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f24533b0.setDuration(150L);
            this.f24533b0.addListener(new od0(this, 29));
            this.f24533b0.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        j3.f0 f0Var = this.f24530a.d;
        ImageView imageView = this.V;
        if (f0Var != null && !this.R) {
            imageView.setVisibility(0);
            if (!this.Q) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(k7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(k7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f24538f;
        dg0 dg0Var = this.f24534c;
        if (viewGroup2 == null) {
            this.P = true;
            if (!this.Q) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    dg0Var.addView(textureView);
                }
            }
            boolean z10 = this.Q;
            a91 a91Var = this.f24535c0;
            if (z10) {
                ViewGroup viewGroup3 = (ViewGroup) a91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(a91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) a91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(a91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(a91Var);
                    } else {
                        addView(a91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f24535c0, this.Q, dg0Var.getAspectRatio(), dg0Var.getVideoRotation(), z4);
            this.f24542n = a2;
            a2.setVisibility(4);
            if (this.Q && this.f24542n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = a91.F;
            a91Var.a();
            return;
        }
        if (this.Q) {
            ViewGroup viewGroup5 = (ViewGroup) dg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(dg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) dg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(dg0Var);
                }
                addView(dg0Var, 0);
            }
        }
        this.v.a(this.f24535c0, this.Q, dg0Var.getAspectRatio(), dg0Var.getVideoRotation(), z4);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f24531a0;
        if (imageView == null) {
            return;
        }
        if (this.R) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f24530a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.R) {
            imageView.setLayoutParams(k7.b6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(k7.b6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        a91 a91Var = this.f24535c0;
        int i13 = a91.F;
        a91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f24539f0);
        if (!this.f24530a.y()) {
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
        AndroidUtilities.runOnUIThread(this.f24539f0, 500L);
        if (!this.G) {
            this.G = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new dw(this, i10, 10));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.N);
    }

    @Override
    public final void onError(i71 i71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        dg0 dg0Var = this.f24534c;
        int measuredWidth = (i14 - dg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - dg0Var.getMeasuredHeight()) / 2;
        dg0Var.layout(measuredWidth, dp, dg0Var.getMeasuredWidth() + measuredWidth, dg0Var.getMeasuredHeight() + dp);
        a91 a91Var = this.f24535c0;
        if (a91Var.getParent() == this) {
            a91Var.layout(0, 0, a91Var.getMeasuredWidth(), a91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.U;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        a91Var.f23343a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f24534c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        a91 a91Var = this.f24535c0;
        if (a91Var.getParent() == this) {
            a91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z4, int i10) {
        a91 a91Var = this.f24535c0;
        i71 i71Var = this.f24530a;
        if (i10 != 2) {
            if (i71Var.p() != -9223372036854775807L) {
                a91Var.b((int) (i71Var.p() / 1000));
            } else {
                a91Var.b(0);
            }
        }
        b91 b91Var = this.v;
        if (i10 != 4 && i10 != 1 && i71Var.y()) {
            b91Var.e(this, true);
        } else {
            b91Var.e(this, false);
        }
        if (i71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.S = true;
            i71Var.B();
            i71Var.L(0L, false);
            n();
            a91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.P) {
            this.P = false;
            if (this.Q || this.R) {
                if (this.R) {
                    this.f24543r = 1;
                }
                this.f24542n.setSurfaceTexture(surfaceTexture);
                this.f24542n.setSurfaceTextureListener(this.f24540g0);
                this.f24542n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f24543r == 2) {
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
            this.T = false;
            int i10 = this.f24536d0;
            int i11 = this.f24537e0;
            this.f24534c.getVideoRotation();
            this.v.f(this.f24535c0, false, i10, i11, this.F);
            this.f24543r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        float f11;
        dg0 dg0Var = this.f24534c;
        if (dg0Var != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f12 = i10 * f10;
            this.f24536d0 = (int) f12;
            this.f24537e0 = i11;
            if (i11 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i11;
            }
            dg0Var.a(f11, i12);
            if (this.Q) {
                this.v.c(f11, i12);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.J = true;
        this.I = System.currentTimeMillis();
        this.f24535c0.invalidate();
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
