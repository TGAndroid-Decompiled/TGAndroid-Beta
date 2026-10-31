package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
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
public final class jf0 implements lf.a {
    public static final ou0 f27343n0 = new ou0(new au(12), new au(13));
    public static final ou0 f27344o0 = new ou0(new au(14), new au(15));
    public static final jf0 f27345p0 = new jf0();
    public View D;
    public boolean E;
    public ValueAnimator F;
    public k2.m0 G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.j M;
    public o1.j N;
    public Float O;
    public boolean P;
    public rn0 R;
    public int S;
    public int T;
    public hu U;
    public PhotoViewer V;
    public jf.f W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27347a0;
    public WindowManager f27348b;
    public ih.c f27349b0;
    public WindowManager.LayoutParams f27350c;
    public boolean f27351c0;
    public jf.g d;
    public boolean f27352d0;
    public if0 e;
    public View f27354f;
    public boolean f27355f0;
    public if0 h;
    public boolean f27358i0;
    public View f27360k0;
    public TextureView f27361l0;
    public boolean m0;
    public boolean f27362n;
    public ve0 f27363r;
    public ScaleGestureDetector f27364s;
    public m2.t f27365w;
    public boolean f27366x;
    public boolean f27367y;
    public float f27346a = 1.4f;
    public float J = 1.0f;
    public final m61 Q = new m61(false);
    public final cf0 f27353e0 = new cf0(this, 1);
    public float[] f27356g0 = new float[2];
    public final cf0 f27357h0 = new cf0(this, 2);
    public final cf0 f27359j0 = new cf0(this, 3);

    public static void b(boolean z10) {
        f27345p0.d(z10, false);
    }

    public static oj0 j(boolean z10, float f7) {
        float L;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        jf0 jf0Var = f27345p0;
        if (jf0Var.P && !z10) {
            obj.f29084a = jf0Var.K;
            obj.f29085b = jf0Var.L + org.telegram.messenger.i0.f16020m;
            obj.f29086c = jf0Var.H;
            obj.d = jf0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) jf0Var.h().f10700a).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) jf0Var.h().f10700a).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) jf0Var.h().f10700a).getFloat("scale_factor", 1.0f);
        obj.f29086c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29086c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = org.telegram.messenger.i0.f16026q.x;
            if (f15 >= f16 / 2.0f) {
                L = (f16 - f14) - org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            obj.f29084a = L;
        } else {
            obj.f29084a = (org.telegram.messenger.i0.f16026q.x - obj.f29086c) - org.telegram.messenger.i0.L(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29085b = w7.u.a(f12, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.f16026q.y - org.telegram.messenger.i0.L(16.0f)) - obj.d) + org.telegram.messenger.i0.f16020m;
            return obj;
        }
        obj.f29085b = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.f16020m;
        return obj;
    }

    public static jf.f k() {
        jf0 jf0Var = f27345p0;
        if (jf0Var != null) {
            return jf0Var.W;
        }
        return null;
    }

    public static int s(float f7) {
        float min;
        float f10;
        if (f7 >= 1.0f) {
            Point point = org.telegram.messenger.i0.f16026q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.f16026q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public static void v(boolean z10) {
        jf0 jf0Var = f27345p0;
        m61 m61Var = jf0Var.Q;
        m61Var.e(false);
        m61Var.d(!z10);
        m61Var.f(true);
        ih.c cVar = jf0Var.f27349b0;
        if (cVar != null) {
            cVar.invalidate();
        }
        if0 if0Var = jf0Var.h;
        if (if0Var != null) {
            if0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        jf0 jf0Var = f27345p0;
        jf0Var.V = photoViewer;
        u61 u61Var = photoViewer.F2;
        jf.f fVar = jf0Var.W;
        if (fVar != null) {
            fVar.c();
            jf0Var.W = null;
        }
        if (u61Var != null && mf.b.a(photoViewer.D) == 1) {
            jf.e eVar = new jf.e(photoViewer.D, jf0Var);
            eVar.f9854c = "photo-viewer-pip-" + u61Var.f30833a;
            eVar.e = 1;
            eVar.d = org.telegram.messenger.i0.L(10.0f);
            eVar.f9858j = jf0Var.d;
            eVar.f9859k = jf0Var.f27360k0;
            int i10 = jf0Var.S;
            int i11 = jf0Var.T;
            eVar.h = i10;
            eVar.f9857i = i11;
            eVar.f9856g = u61Var.d;
            eVar.f9855f = true;
            jf0Var.W = eVar.a();
        }
        jf0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ve0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jf0.x(boolean, android.app.Activity, org.telegram.ui.Components.ve0, android.view.View, int, int, boolean):boolean");
    }

    public final void a() {
        org.telegram.ui.rq0 rq0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (rq0Var = photoViewer.f33456c4) == null) {
            return;
        }
        rq0Var.cancelRewind();
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = oVar;
        }
        this.f27348b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f27351c0) {
            return;
        }
        this.f27351c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27358i0) {
            org.telegram.messenger.i0.r(this.f27359j0);
            this.f27358i0 = false;
        }
        o1.j jVar = this.M;
        if (jVar != null) {
            jVar.d();
            this.N.d();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f26495f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ef0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            org.telegram.messenger.i0.h3(new cf0(this, 0), 100L);
        }
    }

    public final long e() {
        ve0 ve0Var = this.f27363r;
        if (ve0Var != null) {
            return ve0Var.getCurrentPosition();
        }
        u61 u61Var = this.V.F2;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.S();
    }

    public final long f() {
        ve0 ve0Var = this.f27363r;
        if (ve0Var != null) {
            return ve0Var.getVideoDuration();
        }
        u61 u61Var = this.V.F2;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.U();
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        u61 u61Var;
        jf.f fVar = this.W;
        if (fVar != null && fVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f27350c;
            int width = ((Rect) this.W.h.f10752a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27350c;
            int height = ((Rect) this.W.h.f10752a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27348b.addView(this.d, this.f27350c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            u61Var = photoViewer.F2;
        } else {
            u61Var = null;
        }
        if (u61Var == null) {
            return;
        }
        photoViewer.Q8 = oVar;
    }

    public final k2.m0 h() {
        if (this.G == null) {
            Point point = org.telegram.messenger.i0.f16026q;
            int i10 = point.x;
            int i11 = point.y;
            ?? obj = new Object();
            obj.f10700a = org.telegram.messenger.w0.f19025b.getSharedPreferences(a1.g.j(i10, i11, "pip_layout_", "_"), 0);
            this.G = obj;
        }
        return this.G;
    }

    @Override
    public final Bitmap i() {
        TextureView textureView = this.f27361l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27361l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap m() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33633w3) != null && textureView.isAvailable()) {
            return this.V.f33633w3.getBitmap();
        }
        return null;
    }

    public final float o() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = org.telegram.messenger.i0.f16026q;
            this.f27346a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            m61 m61Var = this.Q;
            m61Var.f28327q = f7;
            m61Var.a();
        }
        return this.O.floatValue();
    }

    public final int p() {
        float o10 = o();
        return (int) (s(o10) * o10);
    }

    @Override
    public final boolean q() {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.q()) {
            return true;
        }
        return false;
    }

    @Override
    public final View r() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.f27361l0 = textureView;
        textureView.setVisibility(4);
        this.f27361l0.setOpaque(false);
        this.f27361l0.setSurfaceTextureListener(new li.e(this, 3));
        return this.f27361l0;
    }

    public final int t() {
        return s(o());
    }

    public final void u() {
        try {
            jf.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.f27348b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27349b0 = null;
        this.f27354f = null;
        this.V = null;
        jf.f fVar = this.W;
        if (fVar != null) {
            fVar.c();
            this.W = null;
        }
        this.f27363r = null;
        this.U = null;
        this.D = null;
        this.f27366x = false;
        this.P = false;
        this.f27351c0 = false;
        this.f27355f0 = false;
        a();
        org.telegram.messenger.i0.r(this.f27357h0);
    }

    public final void y(boolean z10) {
        float f7;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(200L);
        this.F = duration;
        duration.setInterpolator(gr.f26495f);
        this.F.addUpdateListener(new r60(this, 3));
        this.F.addListener(new ef0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean d02;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            ve0 ve0Var = this.f27363r;
            if (ve0Var != null) {
                d02 = ve0Var.G;
            } else {
                u61 u61Var = photoViewer.F2;
                if (u61Var != null) {
                    d02 = u61Var.d0();
                } else {
                    return;
                }
            }
            cf0 cf0Var = this.f27353e0;
            org.telegram.messenger.i0.r(cf0Var);
            if (!d02) {
                if (this.Y) {
                    this.X.setImageResource(2131232543);
                    return;
                } else {
                    this.X.setImageResource(2131232542);
                    return;
                }
            }
            this.X.setImageResource(2131232541);
            org.telegram.messenger.i0.h3(cf0Var, 500L);
        }
    }

    @Override
    public final void l(Canvas canvas) {
    }

    @Override
    public final void n(Canvas canvas) {
    }
}
