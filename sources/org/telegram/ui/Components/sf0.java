package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

public final class sf0 implements af.a {

    public static final su0 f32413j0 = new su0(new pc0(2), new pc0(3));

    public static final su0 f32414k0 = new su0(new pc0(4), new pc0(5));

    public static final sf0 f32415l0 = new sf0();
    public boolean A;
    public ValueAnimator B;
    public n1.d C;
    public int D;
    public int E;
    public float G;
    public float H;
    public o1.j I;
    public o1.j J;
    public Float K;
    public boolean L;
    public un0 N;
    public int O;
    public int P;
    public fu Q;
    public PhotoViewer R;
    public ye.d S;
    public ImageView T;
    public boolean U;
    public float V;
    public float W;
    public jh.a3 X;
    public boolean Y;
    public boolean Z;

    public WindowManager f32418b;

    public boolean f32419b0;

    public WindowManager.LayoutParams f32420c;
    public org.telegram.ui.f d;

    public rf0 f32423e;

    public boolean f32424e0;

    public View f32425f;

    public View f32427g0;
    public rf0 h;

    public TextureView f32428h0;

    public boolean f32429i0;

    public boolean f32430n;

    public df0 f32431r;

    public ScaleGestureDetector f32432s;
    public n1.d v;

    public boolean f32433w;

    public boolean f32434x;

    public View f32435y;

    public float f32416a = 1.4f;
    public float F = 1.0f;
    public final c61 M = new c61(false);

    public final mf0 f32417a0 = new mf0(this, 1);

    public float[] f32421c0 = new float[2];

    public final mf0 f32422d0 = new mf0(this, 2);

    public final mf0 f32426f0 = new mf0(this, 3);

    public static void j(boolean z10) {
        f32415l0.k(z10, false);
    }

    public static yj0 o(float f10, boolean z10) {
        yj0 yj0Var = new yj0();
        float f11 = 1.0f / f10;
        sf0 sf0Var = f32415l0;
        if (sf0Var.L && !z10) {
            yj0Var.f34911a = sf0Var.G;
            yj0Var.f34912b = sf0Var.H + AndroidUtilities.statusBarHeight;
            yj0Var.f34913c = sf0Var.D;
            yj0Var.d = sf0Var.E;
            return yj0Var;
        }
        float f12 = ((SharedPreferences) sf0Var.n().f18088b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) sf0Var.n().f18088b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) sf0Var.n().f18088b).getFloat("scale_factor", 1.0f);
        yj0Var.f34913c = s(f11) * f14;
        yj0Var.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = yj0Var.f34913c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            yj0Var.f34911a = f16 >= f17 / 2.0f ? (f17 - f15) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            yj0Var.f34911a = (AndroidUtilities.displaySize.x - yj0Var.f34913c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            yj0Var.f34912b = h7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - yj0Var.d) + AndroidUtilities.statusBarHeight;
            return yj0Var;
        }
        yj0Var.f34912b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return yj0Var;
    }

    public static ye.d p() {
        sf0 sf0Var = f32415l0;
        if (sf0Var != null) {
            return sf0Var.S;
        }
        return null;
    }

    public static int s(float f10) {
        float fMin;
        float f11;
        if (f10 >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f11 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            fMin = Math.min(point2.x, point2.y);
            f11 = 0.6f;
        }
        return (int) (fMin * f11);
    }

    public static void v(boolean z10) {
        sf0 sf0Var = f32415l0;
        c61 c61Var = sf0Var.M;
        c61Var.e(false);
        c61Var.d(!z10);
        c61Var.f(true);
        jh.a3 a3Var = sf0Var.X;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        rf0 rf0Var = sf0Var.h;
        if (rf0Var != null) {
            rf0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        sf0 sf0Var = f32415l0;
        sf0Var.R = photoViewer;
        m61 m61Var = photoViewer.B2;
        ye.d dVar = sf0Var.S;
        if (dVar != null) {
            dVar.c();
            sf0Var.S = null;
        }
        if (m61Var != null && bf.d.a(photoViewer.f35800y) == 1) {
            ye.c cVar = new ye.c(photoViewer.f35800y, sf0Var);
            cVar.f49851c = "photo-viewer-pip-" + m61Var.f30590a;
            cVar.f49852e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f49856j = sf0Var.d;
            cVar.f49857k = sf0Var.f32427g0;
            int i10 = sf0Var.O;
            int i11 = sf0Var.P;
            cVar.h = i10;
            cVar.f49855i = i11;
            cVar.f49854g = m61Var.d;
            cVar.f49853f = true;
            sf0Var.S = cVar.a();
        }
        sf0Var.z();
    }

    public static boolean x(boolean z10, Activity activity, df0 df0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        df0 df0Var2;
        final sf0 sf0Var = f32415l0;
        final int i12 = 1;
        final int i13 = 0;
        if (z10) {
            z12 = true;
        } else {
            sf0Var.getClass();
            if (bf.d.a(ApplicationLoader.applicationContext) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (sf0Var.L) {
            return false;
        }
        sf0Var.L = true;
        sf0Var.O = i10;
        sf0Var.P = i11;
        sf0Var.K = null;
        if (df0Var == null || !df0Var.f27746x) {
            sf0Var.f32431r = null;
        } else {
            sf0Var.f32431r = df0Var;
        }
        float f10 = ((SharedPreferences) sf0Var.n().f18088b).getFloat("x", -1.0f);
        float f11 = ((SharedPreferences) sf0Var.n().f18088b).getFloat("y", -1.0f);
        sf0Var.F = ((SharedPreferences) sf0Var.n().f18088b).getFloat("scale_factor", 1.0f);
        sf0Var.D = (int) (sf0Var.t() * sf0Var.F);
        sf0Var.E = (int) (sf0Var.r() * sf0Var.F);
        sf0Var.A = false;
        o1.j jVar = new o1.j(sf0Var, f32413j0);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.f19147u = kVar;
        jVar.a(new o1.f(sf0Var) {

            public final sf0 f30966b;

            {
                this.f30966b = sf0Var;
            }

            @Override
            public final void a(o1.h hVar, boolean z13, float f12, float f13) {
                switch (i13) {
                    case 0:
                        ((SharedPreferences) this.f30966b.n().f18088b).edit().putFloat("x", f12).apply();
                        break;
                    default:
                        ((SharedPreferences) this.f30966b.n().f18088b).edit().putFloat("y", f12).apply();
                        break;
                }
            }
        });
        sf0Var.I = jVar;
        o1.j jVar2 = new o1.j(sf0Var, f32414k0);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.f19147u = kVar2;
        jVar2.a(new o1.f(sf0Var) {

            public final sf0 f30966b;

            {
                this.f30966b = sf0Var;
            }

            @Override
            public final void a(o1.h hVar, boolean z13, float f12, float f13) {
                switch (i12) {
                    case 0:
                        ((SharedPreferences) this.f30966b.n().f18088b).edit().putFloat("x", f12).apply();
                        break;
                    default:
                        ((SharedPreferences) this.f30966b.n().f18088b).edit().putFloat("y", f12).apply();
                        break;
                }
            }
        });
        sf0Var.J = jVar2;
        Context context = z12 ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new pf0(sf0Var, i13));
        sf0Var.f32432s = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (Build.VERSION.SDK_INT >= 23) {
            sf0Var.f32432s.setStylusScaleEnabled(false);
        }
        sf0Var.v = new n1.d(context, new qf0(sf0Var, scaledTouchSlop));
        sf0Var.f32423e = new rf0(sf0Var, context, i13);
        org.telegram.ui.f fVar = new org.telegram.ui.f(sf0Var, context, i12);
        sf0Var.d = fVar;
        fVar.addView(sf0Var.f32423e, h7.z5.c(-1.0f, -1));
        rf0 rf0Var = sf0Var.f32423e;
        float fDp = AndroidUtilities.dp(10.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        rf0Var.setOutlineProvider(new gf.q0(0, fDp));
        sf0Var.f32423e.setClipToOutline(true);
        sf0Var.f32423e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23117gg, false));
        sf0Var.f32425f = view;
        if (view.getParent() != null) {
            ((ViewGroup) sf0Var.f32425f.getParent()).removeView(sf0Var.f32425f);
        }
        sf0Var.f32423e.addView(sf0Var.f32425f, h7.z5.c(-1.0f, -1));
        View view2 = new View(context);
        sf0Var.f32427g0 = view2;
        sf0Var.f32423e.addView(view2, h7.z5.c(-1.0f, -1));
        sf0Var.M.f27341n = new o0.b(sf0Var, 8);
        sf0Var.h = new rf0(sf0Var, context, i12);
        rf0 rf0Var2 = sf0Var.h;
        Objects.requireNonNull(rf0Var2);
        sf0Var.N = new un0(new mb0(rf0Var2, 11), true);
        sf0Var.h.setWillNotDraw(false);
        sf0Var.h.setAlpha(0.0f);
        View view3 = new View(context);
        view3.setBackgroundColor(1275068416);
        sf0Var.h.addView(view3, h7.z5.c(-1.0f, -1));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i14 = org.telegram.ui.ActionBar.g6.f23135hg;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(iW0, mode);
        int i15 = org.telegram.ui.ActionBar.g6.f23144i6;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new ag.l2(16));
        float f12 = 38;
        float f13 = 4;
        sf0Var.h.addView(imageView, h7.z5.d(38, f12, 5, 0.0f, f13, f13, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new jh.a2(6, sf0Var, z12));
        sf0Var.h.addView(imageView2, h7.z5.d(38, f12, 5, 0.0f, f13, 48, 0.0f));
        ImageView imageView3 = new ImageView(context);
        sf0Var.T = imageView3;
        imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode);
        sf0Var.T.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
        int i16 = 8;
        sf0Var.T.setOnClickListener(new l70(sf0Var, i16));
        View view4 = sf0Var.f32425f;
        boolean z13 = (view4 instanceof WebView) || (view4 instanceof df0);
        sf0Var.f32430n = z13;
        ImageView imageView4 = sf0Var.T;
        if (!z13 || ((df0Var2 = sf0Var.f32431r) != null && df0Var2.f27746x)) {
            i16 = 0;
        }
        imageView4.setVisibility(i16);
        sf0Var.h.addView(sf0Var.T, h7.z5.e(38, 38, 17));
        jh.a3 a3Var = new jh.a3(sf0Var, context);
        sf0Var.X = a3Var;
        sf0Var.h.addView(a3Var, h7.z5.c(-1.0f, -1));
        sf0Var.f32423e.addView(sf0Var.h, h7.z5.c(-1.0f, -1));
        sf0Var.f32418b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
        WindowManager.LayoutParams layoutParamsB = bf.d.b(context, z12);
        sf0Var.f32420c = layoutParamsB;
        int i17 = sf0Var.D;
        layoutParamsB.width = i17;
        layoutParamsB.height = sf0Var.E;
        if (f10 != -1.0f) {
            float f14 = (i17 / 2.0f) + f10;
            int i18 = AndroidUtilities.displaySize.x;
            float fDp2 = f14 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            sf0Var.G = fDp2;
            layoutParamsB.x = (int) fDp2;
        } else {
            float fDp3 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
            sf0Var.G = fDp3;
            layoutParamsB.x = (int) fDp3;
        }
        if (f11 != -1.0f) {
            WindowManager.LayoutParams layoutParams = sf0Var.f32420c;
            float fA = h7.n.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - sf0Var.E);
            sf0Var.H = fA;
            layoutParams.y = (int) fA;
        } else {
            WindowManager.LayoutParams layoutParams2 = sf0Var.f32420c;
            float fDp4 = AndroidUtilities.dp(16.0f);
            sf0Var.H = fDp4;
            layoutParams2.y = (int) fDp4;
        }
        WindowManager.LayoutParams layoutParams3 = sf0Var.f32420c;
        layoutParams3.dimAmount = 0.0f;
        layoutParams3.flags = 520;
        AndroidUtilities.setPreferredMaxRefreshRate(sf0Var.f32418b, sf0Var.d, layoutParams3);
        if (z11) {
            sf0Var.f32418b.addView(sf0Var.d, sf0Var.f32420c);
            return true;
        }
        sf0Var.d.setAlpha(0.0f);
        sf0Var.d.setScaleX(0.1f);
        sf0Var.d.setScaleY(0.1f);
        sf0Var.f32418b.addView(sf0Var.d, sf0Var.f32420c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f28122f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(sf0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(sf0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(sf0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
        animatorSet.start();
        return true;
    }

    @Override
    public final Bitmap a() {
        TextureView textureView = this.f32428h0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f32428h0.getBitmap();
    }

    @Override
    public final Bitmap c() {
        TextureView textureView;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (textureView = photoViewer.f35749s3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.R.f35749s3.getBitmap();
    }

    @Override
    public final void d(bf.e eVar) {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.B2 != null) {
            photoViewer.L8 = eVar;
        }
        this.f32418b.removeView(this.d);
        this.f32429i0 = true;
        this.d.invalidate();
    }

    @Override
    public final void f(bf.e eVar) {
        ye.d dVar = this.S;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f32420c;
            int iWidth = this.S.h.f2081a.width();
            this.D = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.f32420c;
            int iHeight = this.S.h.f2081a.height();
            this.E = iHeight;
            layoutParams2.height = iHeight;
        }
        this.f32418b.addView(this.d, this.f32420c);
        this.f32429i0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.R;
        if ((photoViewer != null ? photoViewer.B2 : null) == null) {
            return;
        }
        photoViewer.L8 = eVar;
    }

    @Override
    public final boolean g() {
        PhotoViewer photoViewer = this.R;
        return photoViewer != null && photoViewer.g();
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.f32428h0 = textureView;
        textureView.setVisibility(4);
        this.f32428h0.setOpaque(false);
        this.f32428h0.setSurfaceTextureListener(new eh.h(this, 2));
        return this.f32428h0;
    }

    public final void i() {
        org.telegram.ui.is0 is0Var;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (is0Var = photoViewer.Y3) == null) {
            return;
        }
        is0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (this.f32424e0) {
            AndroidUtilities.cancelRunOnUIThread(this.f32426f0);
            this.f32424e0 = false;
        }
        o1.j jVar = this.I;
        if (jVar != null) {
            jVar.c();
            this.J.c();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new mf0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f28122f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new of0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        df0 df0Var = this.f32431r;
        if (df0Var != null) {
            return df0Var.getCurrentPosition();
        }
        m61 m61Var = this.R.B2;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.o();
    }

    public final long m() {
        df0 df0Var = this.f32431r;
        if (df0Var != null) {
            return df0Var.getVideoDuration();
        }
        m61 m61Var = this.R.B2;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.q();
    }

    public final n1.d n() {
        if (this.C == null) {
            Point point = AndroidUtilities.displaySize;
            this.C = new n1.d(point.x, point.y);
        }
        return this.C;
    }

    public final float q() {
        if (this.K == null) {
            this.K = Float.valueOf(this.P / this.O);
            Point point = AndroidUtilities.displaySize;
            this.f32416a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f10 = this.K.floatValue() < 1.0f ? 0.6f : 0.45f;
            c61 c61Var = this.M;
            c61Var.f27344q = f10;
            c61Var.a();
        }
        return this.K.floatValue();
    }

    public final int r() {
        float fQ = q();
        return (int) (s(fQ) * fQ);
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.f fVar = this.d;
            if (fVar != null && fVar.getParent() != null) {
                this.f32418b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.X = null;
        this.f32425f = null;
        this.R = null;
        ye.d dVar = this.S;
        if (dVar != null) {
            dVar.c();
            this.S = null;
        }
        this.f32431r = null;
        this.Q = null;
        this.f32435y = null;
        this.f32433w = false;
        this.L = false;
        this.Y = false;
        this.f32419b0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f32422d0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.B = duration;
        duration.setInterpolator(er.f28122f);
        this.B.addUpdateListener(new v60(this, 3));
        this.B.addListener(new of0(this, 0));
        this.B.start();
    }

    public final void z() {
        boolean z10;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || this.T == null) {
            return;
        }
        df0 df0Var = this.f32431r;
        if (df0Var != null) {
            z10 = df0Var.C;
        } else {
            m61 m61Var = photoViewer.B2;
            if (m61Var == null) {
                return;
            } else {
                z10 = m61Var.z();
            }
        }
        mf0 mf0Var = this.f32417a0;
        AndroidUtilities.cancelRunOnUIThread(mf0Var);
        if (z10) {
            this.T.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(mf0Var, 500L);
        } else if (this.U) {
            this.T.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.T.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void e(Canvas canvas) {
    }
}
