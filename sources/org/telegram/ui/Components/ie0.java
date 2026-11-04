package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;
public final class ie0 implements wf.a {
    public static final kt0 f34681o0 = new kt0(new a3(26), new a3(27));
    public static final kt0 f34682p0 = new kt0(new a3(28), new a3(29));
    public static final ie0 f34683q0 = new ie0();
    public View E;
    public boolean F;
    public ValueAnimator G;
    public he0 H;
    public int I;
    public int J;
    public float L;
    public float M;
    public q1.g N;
    public q1.g O;
    public Float P;
    public boolean Q;
    public tm0 S;
    public int T;
    public int U;
    public ut V;
    public PhotoViewer W;
    public uf.d X;
    public ImageView Y;
    public boolean Z;
    public float f34685a0;
    public WindowManager f34686b;
    public float f34687b0;
    public WindowManager.LayoutParams f34688c;
    public ei.e3 f34689c0;
    public org.telegram.ui.e d;
    public boolean f34690d0;
    public ge0 f34691e;
    public boolean f34692e0;
    public View f34693f;
    public boolean f34695g0;
    public ge0 h;
    public boolean f34698j0;
    public View f34700l0;
    public TextureView m0;
    public boolean f34701n;
    public boolean f34702n0;
    public ud0 f34703r;
    public ScaleGestureDetector f34704s;
    public y00 f34705w;
    public boolean f34706x;
    public boolean f34707y;
    public float f34684a = 1.4f;
    public float K = 1.0f;
    public final d51 R = new d51(false);
    public final be0 f34694f0 = new be0(this, 1);
    public float[] f34696h0 = new float[2];
    public final be0 f34697i0 = new be0(this, 2);
    public final be0 f34699k0 = new be0(this, 3);

    public static void b(boolean z10) {
        f34683q0.d(z10, false);
    }

    public static ni0 j(boolean z10, float f10) {
        float L;
        ?? obj = new Object();
        float f11 = 1.0f / f10;
        ie0 ie0Var = f34683q0;
        if (ie0Var.Q && !z10) {
            obj.f36563a = ie0Var.L;
            obj.f36564b = ie0Var.M + org.telegram.messenger.g0.f22602m;
            obj.f36565c = ie0Var.I;
            obj.d = ie0Var.J;
            return obj;
        }
        float f12 = ie0Var.h().f34373a.getFloat("x", -1.0f);
        float f13 = ie0Var.h().f34373a.getFloat("y", -1.0f);
        float f14 = ie0Var.h().f34373a.getFloat("scale_factor", 1.0f);
        obj.f36565c = s(f11) * f14;
        obj.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = obj.f36565c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = org.telegram.messenger.g0.f22608q.x;
            if (f16 >= f17 / 2.0f) {
                L = (f17 - f15) - org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f);
            }
            obj.f36563a = L;
        } else {
            obj.f36563a = (org.telegram.messenger.g0.f22608q.x - obj.f36565c) - org.telegram.messenger.g0.L(16.0f);
        }
        if (f13 != -1.0f) {
            obj.f36564b = b8.be.a(f13, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.f22608q.y - org.telegram.messenger.g0.L(16.0f)) - obj.d) + org.telegram.messenger.g0.f22602m;
            return obj;
        }
        obj.f36564b = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f22602m;
        return obj;
    }

    public static uf.d k() {
        ie0 ie0Var = f34683q0;
        if (ie0Var != null) {
            return ie0Var.X;
        }
        return null;
    }

    public static int s(float f10) {
        float min;
        float f11;
        if (f10 >= 1.0f) {
            Point point = org.telegram.messenger.g0.f22608q;
            min = Math.min(point.x, point.y);
            f11 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.g0.f22608q;
            min = Math.min(point2.x, point2.y);
            f11 = 0.6f;
        }
        return (int) (min * f11);
    }

    public static void v(boolean z10) {
        ie0 ie0Var = f34683q0;
        d51 d51Var = ie0Var.R;
        d51Var.e(false);
        d51Var.d(!z10);
        d51Var.f(true);
        ei.e3 e3Var = ie0Var.f34689c0;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        ge0 ge0Var = ie0Var.h;
        if (ge0Var != null) {
            ge0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ie0 ie0Var = f34683q0;
        ie0Var.W = photoViewer;
        m51 m51Var = photoViewer.G2;
        uf.d dVar = ie0Var.X;
        if (dVar != null) {
            dVar.c();
            ie0Var.X = null;
        }
        if (m51Var != null && xf.b.a(photoViewer.E) == 1) {
            uf.c cVar = new uf.c(photoViewer.E, ie0Var);
            cVar.f55840c = "photo-viewer-pip-" + m51Var.f36002a;
            cVar.f55841e = 1;
            cVar.d = org.telegram.messenger.g0.L(10.0f);
            cVar.f55845j = ie0Var.d;
            cVar.f55846k = ie0Var.f34700l0;
            int i3 = ie0Var.T;
            int i10 = ie0Var.U;
            cVar.h = i3;
            cVar.f55844i = i10;
            cVar.f55843g = m51Var.d;
            cVar.f55842f = true;
            ie0Var.X = cVar.a();
        }
        ie0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ud0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ie0.x(boolean, android.app.Activity, org.telegram.ui.Components.ud0, android.view.View, int, int, boolean):boolean");
    }

    public final void a() {
        org.telegram.ui.yo0 yo0Var;
        PhotoViewer photoViewer = this.W;
        if (photoViewer == null || (yo0Var = photoViewer.f41404d4) == null) {
            return;
        }
        yo0Var.cancelRewind();
    }

    @Override
    public final void c(b8.cg cgVar) {
        PhotoViewer photoViewer = this.W;
        if (photoViewer != null && photoViewer.G2 != null) {
            photoViewer.R8 = cgVar;
        }
        this.f34686b.removeView(this.d);
        this.f34702n0 = true;
        this.d.invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f34690d0) {
            return;
        }
        this.f34690d0 = true;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f34698j0) {
            org.telegram.messenger.g0.r(this.f34699k0);
            this.f34698j0 = false;
        }
        q1.g gVar = this.N;
        if (gVar != null) {
            gVar.d();
            this.O.d();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f40452f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new de0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            org.telegram.messenger.g0.i3(new be0(this, 0), 100L);
        }
    }

    public final long e() {
        ud0 ud0Var = this.f34703r;
        if (ud0Var != null) {
            return ud0Var.getCurrentPosition();
        }
        m51 m51Var = this.W.G2;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.S();
    }

    public final long f() {
        ud0 ud0Var = this.f34703r;
        if (ud0Var != null) {
            return ud0Var.getVideoDuration();
        }
        m51 m51Var = this.W.G2;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.U();
    }

    @Override
    public final Bitmap g() {
        TextureView textureView = this.m0;
        if (textureView != null && textureView.isAvailable()) {
            return this.m0.getBitmap();
        }
        return null;
    }

    public final he0 h() {
        if (this.H == null) {
            Point point = org.telegram.messenger.g0.f22608q;
            this.H = new he0(point.x, point.y);
        }
        return this.H;
    }

    @Override
    public final Bitmap l() {
        TextureView textureView;
        PhotoViewer photoViewer = this.W;
        if (photoViewer != null && (textureView = photoViewer.f41581x3) != null && textureView.isAvailable()) {
            return this.W.f41581x3.getBitmap();
        }
        return null;
    }

    public final float n() {
        float f10;
        if (this.P == null) {
            this.P = Float.valueOf(this.U / this.T);
            Point point = org.telegram.messenger.g0.f22608q;
            this.f34684a = (Math.min(point.x, point.y) - org.telegram.messenger.g0.L(32.0f)) / t();
            if (this.P.floatValue() < 1.0f) {
                f10 = 0.6f;
            } else {
                f10 = 0.45f;
            }
            d51 d51Var = this.R;
            d51Var.f32951q = f10;
            d51Var.a();
        }
        return this.P.floatValue();
    }

    @Override
    public final boolean o() {
        PhotoViewer photoViewer = this.W;
        if (photoViewer != null && photoViewer.o()) {
            return true;
        }
        return false;
    }

    public final int p() {
        float n4 = n();
        return (int) (s(n4) * n4);
    }

    @Override
    public final View q() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.m0 = textureView;
        textureView.setVisibility(4);
        this.m0.setOpaque(false);
        this.m0.setSurfaceTextureListener(new s30(this, 1));
        return this.m0;
    }

    @Override
    public final void r(b8.cg cgVar) {
        m51 m51Var;
        uf.d dVar = this.X;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f34688c;
            int width = ((Rect) this.X.h.f18942a).width();
            this.I = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f34688c;
            int height = ((Rect) this.X.h.f18942a).height();
            this.J = height;
            layoutParams2.height = height;
        }
        this.f34686b.addView(this.d, this.f34688c);
        this.f34702n0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.W;
        if (photoViewer != null) {
            m51Var = photoViewer.G2;
        } else {
            m51Var = null;
        }
        if (m51Var == null) {
            return;
        }
        photoViewer.R8 = cgVar;
    }

    public final int t() {
        return s(n());
    }

    public final void u() {
        try {
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
                this.f34686b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f34689c0 = null;
        this.f34693f = null;
        this.W = null;
        uf.d dVar = this.X;
        if (dVar != null) {
            dVar.c();
            this.X = null;
        }
        this.f34703r = null;
        this.V = null;
        this.E = null;
        this.f34706x = false;
        this.Q = false;
        this.f34690d0 = false;
        this.f34695g0 = false;
        a();
        org.telegram.messenger.g0.r(this.f34697i0);
    }

    public final void y(boolean z10) {
        float f10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.G = duration;
        duration.setInterpolator(xq.f40452f);
        this.G.addUpdateListener(new y50(this, 3));
        this.G.addListener(new de0(this, 0));
        this.G.start();
    }

    public final void z() {
        boolean d02;
        PhotoViewer photoViewer = this.W;
        if (photoViewer != null && this.Y != null) {
            ud0 ud0Var = this.f34703r;
            if (ud0Var != null) {
                d02 = ud0Var.H;
            } else {
                m51 m51Var = photoViewer.G2;
                if (m51Var != null) {
                    d02 = m51Var.d0();
                } else {
                    return;
                }
            }
            be0 be0Var = this.f34694f0;
            org.telegram.messenger.g0.r(be0Var);
            if (!d02) {
                if (this.Z) {
                    this.Y.setImageResource(2131232544);
                    return;
                } else {
                    this.Y.setImageResource(2131232543);
                    return;
                }
            }
            this.Y.setImageResource(2131232542);
            org.telegram.messenger.g0.i3(be0Var, 500L);
        }
    }

    @Override
    public final void i(Canvas canvas) {
    }

    @Override
    public final void m(Canvas canvas) {
    }
}
