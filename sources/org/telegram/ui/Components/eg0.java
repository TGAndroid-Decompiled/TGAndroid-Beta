package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
public final class eg0 implements rf.a {
    public static final iv0 f23659n0 = new iv0(new xc0(8), new xc0(9));
    public static final iv0 f23660o0 = new iv0(new xc0(10), new xc0(11));
    public static final eg0 f23661p0 = new eg0();
    public boolean E;
    public ValueAnimator F;
    public com.google.firebase.messaging.v G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public ko0 R;
    public int S;
    public int T;
    public wu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f23663a0;
    public WindowManager f23664b;
    public ai.n4 f23665b0;
    public WindowManager.LayoutParams f23666c;
    public boolean f23667c0;
    public org.telegram.ui.f d;
    public boolean f23668d0;
    public dg0 e;
    public View f23670f;
    public boolean f23671f0;
    public dg0 h;
    public boolean f23674i0;
    public View f23676k0;
    public TextureView f23677l0;
    public boolean m0;
    public boolean f23678n;
    public qf0 f23679r;
    public ScaleGestureDetector f23680s;
    public org.telegram.ui.Cells.ja v;
    public boolean f23681w;
    public boolean f23682x;
    public View f23683y;
    public float f23662a = 1.4f;
    public float J = 1.0f;
    public final v61 Q = new v61(false);
    public final zf0 f23669e0 = new zf0(this, 1);
    public float[] f23672g0 = new float[2];
    public final zf0 f23673h0 = new zf0(this, 2);
    public final zf0 f23675j0 = new zf0(this, 3);

    public static void j(boolean z10) {
        f23661p0.k(z10, false);
    }

    public static ik0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        eg0 eg0Var = f23661p0;
        if (eg0Var.P && !z10) {
            obj.f24988a = eg0Var.K;
            obj.f24989b = eg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f24990c = eg0Var.H;
            obj.d = eg0Var.I;
            return obj;
        }
        float f11 = eg0Var.n().f7340a.getFloat("x", -1.0f);
        float f12 = eg0Var.n().f7340a.getFloat("y", -1.0f);
        float f13 = eg0Var.n().f7340a.getFloat("scale_factor", 1.0f);
        obj.f24990c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f24990c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f24988a = dp;
        } else {
            obj.f24988a = (AndroidUtilities.displaySize.x - obj.f24990c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f24989b = w7.p.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f24989b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        eg0 eg0Var = f23661p0;
        if (eg0Var != null) {
            return eg0Var.W;
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
        eg0 eg0Var = f23661p0;
        v61 v61Var = eg0Var.Q;
        v61Var.e(false);
        v61Var.d(!z10);
        v61Var.f(true);
        ai.n4 n4Var = eg0Var.f23665b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        dg0 dg0Var = eg0Var.h;
        if (dg0Var != null) {
            dg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        eg0 eg0Var = f23661p0;
        eg0Var.V = photoViewer;
        f71 f71Var = photoViewer.F2;
        pf.e eVar = eg0Var.W;
        if (eVar != null) {
            eVar.c();
            eg0Var.W = null;
        }
        if (f71Var != null && sf.c.a(photoViewer.f31086y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31086y, eg0Var);
            dVar.f40736c = "photo-viewer-pip-" + f71Var.f23881a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f40740j = eg0Var.d;
            dVar.f40741k = eg0Var.f23676k0;
            int i10 = eg0Var.S;
            int i11 = eg0Var.T;
            dVar.h = i10;
            dVar.f40739i = i11;
            dVar.f40738g = f71Var.d;
            dVar.f40737f = true;
            eg0Var.W = dVar.a();
        }
        eg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.qf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eg0.x(boolean, android.app.Activity, org.telegram.ui.Components.qf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f23664b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        f71 f71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f23666c;
            int width = this.W.h.f42856a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f23666c;
            int height = this.W.h.f42856a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f23664b.addView(this.d, this.f23666c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            f71Var = photoViewer.F2;
        } else {
            f71Var = null;
        }
        if (f71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f23677l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f23677l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31070w3) != null && textureView.isAvailable()) {
            return this.V.f31070w3.getBitmap();
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
        this.f23677l0 = textureView;
        textureView.setVisibility(4);
        this.f23677l0.setOpaque(false);
        this.f23677l0.setSurfaceTextureListener(new k50(this, 1));
        return this.f23677l0;
    }

    public final void i() {
        org.telegram.ui.dt0 dt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (dt0Var = photoViewer.f30894c4) == null) {
            return;
        }
        dt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f23667c0) {
            return;
        }
        this.f23667c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f23674i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f23675j0);
            this.f23674i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(rr.f27701f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new bg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new zf0(this, 0), 100L);
        }
    }

    public final long l() {
        qf0 qf0Var = this.f23679r;
        if (qf0Var != null) {
            return qf0Var.getCurrentPosition();
        }
        f71 f71Var = this.V.F2;
        if (f71Var == null) {
            return 0L;
        }
        return f71Var.n();
    }

    public final long m() {
        qf0 qf0Var = this.f23679r;
        if (qf0Var != null) {
            return qf0Var.getVideoDuration();
        }
        f71 f71Var = this.V.F2;
        if (f71Var == null) {
            return 0L;
        }
        return f71Var.p();
    }

    public final com.google.firebase.messaging.v n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new com.google.firebase.messaging.v(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f23662a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            v61 v61Var = this.Q;
            v61Var.f28684q = f7;
            v61Var.a();
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
                this.f23664b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f23665b0 = null;
        this.f23670f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f23679r = null;
        this.U = null;
        this.f23683y = null;
        this.f23681w = false;
        this.P = false;
        this.f23667c0 = false;
        this.f23671f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f23673h0);
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
        duration.setInterpolator(rr.f27701f);
        this.F.addUpdateListener(new i70(this, 3));
        this.F.addListener(new bg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            qf0 qf0Var = this.f23679r;
            if (qf0Var != null) {
                y3 = qf0Var.G;
            } else {
                f71 f71Var = photoViewer.F2;
                if (f71Var != null) {
                    y3 = f71Var.y();
                } else {
                    return;
                }
            }
            zf0 zf0Var = this.f23669e0;
            AndroidUtilities.cancelRunOnUIThread(zf0Var);
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
            AndroidUtilities.runOnUIThread(zf0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
