package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class og0 implements rf.a {
    public static final tv0 f26910n0 = new tv0(new i2(29), new ig0(0));
    public static final tv0 f26911o0 = new tv0(new ig0(1), new ig0(2));
    public static final og0 f26912p0 = new og0();
    public boolean E;
    public ValueAnimator F;
    public k2.u G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public xo0 R;
    public int S;
    public int T;
    public vu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f26914a0;
    public WindowManager f26915b;
    public ai.n4 f26916b0;
    public WindowManager.LayoutParams f26917c;
    public boolean f26918c0;
    public org.telegram.ui.f d;
    public boolean f26919d0;
    public ng0 e;
    public View f26921f;
    public boolean f26922f0;
    public ng0 h;
    public boolean f26925i0;
    public View f26927k0;
    public TextureView f26928l0;
    public boolean m0;
    public boolean f26929n;
    public yf0 f26930r;
    public ScaleGestureDetector f26931s;
    public ka.c v;
    public boolean f26932w;
    public boolean f26933x;
    public View f26934y;
    public float f26913a = 1.4f;
    public float J = 1.0f;
    public final k71 Q = new k71(false);
    public final jg0 f26920e0 = new jg0(this, 1);
    public float[] f26923g0 = new float[2];
    public final jg0 f26924h0 = new jg0(this, 2);
    public final jg0 f26926j0 = new jg0(this, 3);

    public static void j(boolean z10) {
        f26912p0.k(z10, false);
    }

    public static rk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        og0 og0Var = f26912p0;
        if (og0Var.P && !z10) {
            obj.f27913a = og0Var.K;
            obj.f27914b = og0Var.L + AndroidUtilities.statusBarHeight;
            obj.f27915c = og0Var.H;
            obj.d = og0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) og0Var.n().f13384b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) og0Var.n().f13384b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) og0Var.n().f13384b).getFloat("scale_factor", 1.0f);
        obj.f27915c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f27915c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f27913a = dp;
        } else {
            obj.f27913a = (AndroidUtilities.displaySize.x - obj.f27915c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f27914b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f27914b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        og0 og0Var = f26912p0;
        if (og0Var != null) {
            return og0Var.W;
        }
        return null;
    }

    public static int s(float f7) {
        float min;
        float f10;
        if (f7 >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public static void v(boolean z10) {
        og0 og0Var = f26912p0;
        k71 k71Var = og0Var.Q;
        k71Var.e(false);
        k71Var.d(!z10);
        k71Var.f(true);
        ai.n4 n4Var = og0Var.f26916b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        ng0 ng0Var = og0Var.h;
        if (ng0Var != null) {
            ng0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        og0 og0Var = f26912p0;
        og0Var.V = photoViewer;
        t71 t71Var = photoViewer.F2;
        pf.e eVar = og0Var.W;
        if (eVar != null) {
            eVar.c();
            og0Var.W = null;
        }
        if (t71Var != null && sf.c.a(photoViewer.f31399y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31399y, og0Var);
            dVar.f41081c = "photo-viewer-pip-" + t71Var.f28318a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f41085j = og0Var.d;
            dVar.f41086k = og0Var.f26927k0;
            int i10 = og0Var.S;
            int i11 = og0Var.T;
            dVar.h = i10;
            dVar.f41084i = i11;
            dVar.f41083g = t71Var.d;
            dVar.f41082f = true;
            og0Var.W = dVar.a();
        }
        og0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.yf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.x(boolean, android.app.Activity, org.telegram.ui.Components.yf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f26915b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        t71 t71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f26917c;
            int width = this.W.h.f43206a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f26917c;
            int height = this.W.h.f43206a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f26915b.addView(this.d, this.f26917c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            t71Var = photoViewer.F2;
        } else {
            t71Var = null;
        }
        if (t71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f26928l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f26928l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31383w3) != null && textureView.isAvailable()) {
            return this.V.f31383w3.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.f26928l0 = textureView;
        textureView.setVisibility(4);
        this.f26928l0.setOpaque(false);
        this.f26928l0.setSurfaceTextureListener(new ki.c(this, 2));
        return this.f26928l0;
    }

    public final void i() {
        org.telegram.ui.kt0 kt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (kt0Var = photoViewer.f31207c4) == null) {
            return;
        }
        kt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f26918c0) {
            return;
        }
        this.f26918c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f26925i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f26926j0);
            this.f26925i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(qr.f27642f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new lg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new jg0(this, 0), 100L);
        }
    }

    public final long l() {
        yf0 yf0Var = this.f26930r;
        if (yf0Var != null) {
            return yf0Var.getCurrentPosition();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.n();
    }

    public final long m() {
        yf0 yf0Var = this.f26930r;
        if (yf0Var != null) {
            return yf0Var.getVideoDuration();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
    }

    public final k2.u n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new k2.u(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f26913a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            k71 k71Var = this.Q;
            k71Var.f25701q = f7;
            k71Var.a();
        }
        return this.O.floatValue();
    }

    public final int r() {
        float q6 = q();
        return (int) (s(q6) * q6);
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.f fVar = this.d;
            if (fVar != null && fVar.getParent() != null) {
                this.f26915b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f26916b0 = null;
        this.f26921f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f26930r = null;
        this.U = null;
        this.f26934y = null;
        this.f26932w = false;
        this.P = false;
        this.f26918c0 = false;
        this.f26922f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f26924h0);
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
        duration.setInterpolator(qr.f27642f);
        this.F.addUpdateListener(new p70(this, 3));
        this.F.addListener(new lg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            yf0 yf0Var = this.f26930r;
            if (yf0Var != null) {
                y3 = yf0Var.G;
            } else {
                t71 t71Var = photoViewer.F2;
                if (t71Var != null) {
                    y3 = t71Var.y();
                } else {
                    return;
                }
            }
            jg0 jg0Var = this.f26920e0;
            AndroidUtilities.cancelRunOnUIThread(jg0Var);
            if (!y3) {
                if (this.Y) {
                    this.X.setImageResource(R.drawable.pip_replay_large);
                    return;
                } else {
                    this.X.setImageResource(R.drawable.pip_play_large);
                    return;
                }
            }
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(jg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
