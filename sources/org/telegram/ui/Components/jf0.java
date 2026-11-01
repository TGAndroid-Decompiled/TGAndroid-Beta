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
    public static final pu0 f27398n0 = new pu0(new au(12), new au(13));
    public static final pu0 f27399o0 = new pu0(new au(14), new au(15));
    public static final jf0 f27400p0 = new jf0();
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
    public sn0 R;
    public int S;
    public int T;
    public hu U;
    public PhotoViewer V;
    public jf.f W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27402a0;
    public WindowManager f27403b;
    public ih.c f27404b0;
    public WindowManager.LayoutParams f27405c;
    public boolean f27406c0;
    public jf.g d;
    public boolean f27407d0;
    public if0 e;
    public View f27409f;
    public boolean f27410f0;
    public if0 h;
    public boolean f27413i0;
    public View f27415k0;
    public TextureView f27416l0;
    public boolean m0;
    public boolean f27417n;
    public ve0 f27418r;
    public ScaleGestureDetector f27419s;
    public m2.t f27420w;
    public boolean f27421x;
    public boolean f27422y;
    public float f27401a = 1.4f;
    public float J = 1.0f;
    public final n61 Q = new n61(false);
    public final cf0 f27408e0 = new cf0(this, 1);
    public float[] f27411g0 = new float[2];
    public final cf0 f27412h0 = new cf0(this, 2);
    public final cf0 f27414j0 = new cf0(this, 3);

    public static void b(boolean z10) {
        f27400p0.d(z10, false);
    }

    public static pj0 j(boolean z10, float f7) {
        float L;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        jf0 jf0Var = f27400p0;
        if (jf0Var.P && !z10) {
            obj.f29439a = jf0Var.K;
            obj.f29440b = jf0Var.L + org.telegram.messenger.i0.f16166m;
            obj.f29441c = jf0Var.H;
            obj.d = jf0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) jf0Var.h().f10701a).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) jf0Var.h().f10701a).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) jf0Var.h().f10701a).getFloat("scale_factor", 1.0f);
        obj.f29441c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29441c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = org.telegram.messenger.i0.f16172q.x;
            if (f15 >= f16 / 2.0f) {
                L = (f16 - f14) - org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            obj.f29439a = L;
        } else {
            obj.f29439a = (org.telegram.messenger.i0.f16172q.x - obj.f29441c) - org.telegram.messenger.i0.L(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29440b = w7.u.a(f12, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.f16172q.y - org.telegram.messenger.i0.L(16.0f)) - obj.d) + org.telegram.messenger.i0.f16166m;
            return obj;
        }
        obj.f29440b = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.f16166m;
        return obj;
    }

    public static jf.f k() {
        jf0 jf0Var = f27400p0;
        if (jf0Var != null) {
            return jf0Var.W;
        }
        return null;
    }

    public static int s(float f7) {
        float min;
        float f10;
        if (f7 >= 1.0f) {
            Point point = org.telegram.messenger.i0.f16172q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.f16172q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public static void v(boolean z10) {
        jf0 jf0Var = f27400p0;
        n61 n61Var = jf0Var.Q;
        n61Var.e(false);
        n61Var.d(!z10);
        n61Var.f(true);
        ih.c cVar = jf0Var.f27404b0;
        if (cVar != null) {
            cVar.invalidate();
        }
        if0 if0Var = jf0Var.h;
        if (if0Var != null) {
            if0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        jf0 jf0Var = f27400p0;
        jf0Var.V = photoViewer;
        v61 v61Var = photoViewer.F2;
        jf.f fVar = jf0Var.W;
        if (fVar != null) {
            fVar.c();
            jf0Var.W = null;
        }
        if (v61Var != null && mf.b.a(photoViewer.D) == 1) {
            jf.e eVar = new jf.e(photoViewer.D, jf0Var);
            eVar.f9855c = "photo-viewer-pip-" + v61Var.f31198a;
            eVar.e = 1;
            eVar.d = org.telegram.messenger.i0.L(10.0f);
            eVar.f9859j = jf0Var.d;
            eVar.f9860k = jf0Var.f27415k0;
            int i10 = jf0Var.S;
            int i11 = jf0Var.T;
            eVar.h = i10;
            eVar.f9858i = i11;
            eVar.f9857g = v61Var.d;
            eVar.f9856f = true;
            jf0Var.W = eVar.a();
        }
        jf0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ve0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jf0.x(boolean, android.app.Activity, org.telegram.ui.Components.ve0, android.view.View, int, int, boolean):boolean");
    }

    public final void a() {
        org.telegram.ui.pq0 pq0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (pq0Var = photoViewer.f33463c4) == null) {
            return;
        }
        pq0Var.cancelRewind();
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = oVar;
        }
        this.f27403b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f27406c0) {
            return;
        }
        this.f27406c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27413i0) {
            org.telegram.messenger.i0.r(this.f27414j0);
            this.f27413i0 = false;
        }
        o1.j jVar = this.M;
        if (jVar != null) {
            jVar.d();
            this.N.d();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f26523f);
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
        ve0 ve0Var = this.f27418r;
        if (ve0Var != null) {
            return ve0Var.getCurrentPosition();
        }
        v61 v61Var = this.V.F2;
        if (v61Var == null) {
            return 0L;
        }
        return v61Var.S();
    }

    public final long f() {
        ve0 ve0Var = this.f27418r;
        if (ve0Var != null) {
            return ve0Var.getVideoDuration();
        }
        v61 v61Var = this.V.F2;
        if (v61Var == null) {
            return 0L;
        }
        return v61Var.U();
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        v61 v61Var;
        jf.f fVar = this.W;
        if (fVar != null && fVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f27405c;
            int width = ((Rect) this.W.h.f10753a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27405c;
            int height = ((Rect) this.W.h.f10753a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27403b.addView(this.d, this.f27405c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            v61Var = photoViewer.F2;
        } else {
            v61Var = null;
        }
        if (v61Var == null) {
            return;
        }
        photoViewer.Q8 = oVar;
    }

    public final k2.m0 h() {
        if (this.G == null) {
            Point point = org.telegram.messenger.i0.f16172q;
            int i10 = point.x;
            int i11 = point.y;
            ?? obj = new Object();
            obj.f10701a = org.telegram.messenger.w0.f18945b.getSharedPreferences(a1.g.j(i10, i11, "pip_layout_", "_"), 0);
            this.G = obj;
        }
        return this.G;
    }

    @Override
    public final Bitmap i() {
        TextureView textureView = this.f27416l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27416l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap m() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33640w3) != null && textureView.isAvailable()) {
            return this.V.f33640w3.getBitmap();
        }
        return null;
    }

    public final float n() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = org.telegram.messenger.i0.f16172q;
            this.f27401a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            n61 n61Var = this.Q;
            n61Var.f28693q = f7;
            n61Var.a();
        }
        return this.O.floatValue();
    }

    public final int p() {
        float n10 = n();
        return (int) (s(n10) * n10);
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
        this.f27416l0 = textureView;
        textureView.setVisibility(4);
        this.f27416l0.setOpaque(false);
        this.f27416l0.setSurfaceTextureListener(new li.e(this, 3));
        return this.f27416l0;
    }

    public final int t() {
        return s(n());
    }

    public final void u() {
        try {
            jf.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.f27403b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27404b0 = null;
        this.f27409f = null;
        this.V = null;
        jf.f fVar = this.W;
        if (fVar != null) {
            fVar.c();
            this.W = null;
        }
        this.f27418r = null;
        this.U = null;
        this.D = null;
        this.f27421x = false;
        this.P = false;
        this.f27406c0 = false;
        this.f27410f0 = false;
        a();
        org.telegram.messenger.i0.r(this.f27412h0);
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
        duration.setInterpolator(gr.f26523f);
        this.F.addUpdateListener(new r60(this, 3));
        this.F.addListener(new ef0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean d02;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            ve0 ve0Var = this.f27418r;
            if (ve0Var != null) {
                d02 = ve0Var.G;
            } else {
                v61 v61Var = photoViewer.F2;
                if (v61Var != null) {
                    d02 = v61Var.d0();
                } else {
                    return;
                }
            }
            cf0 cf0Var = this.f27408e0;
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
    public final void o(Canvas canvas) {
    }
}
