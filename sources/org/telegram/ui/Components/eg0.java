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
public final class eg0 implements sf.a {
    public static final hv0 f25700n0 = new hv0(new p2(22), new p2(23));
    public static final hv0 f25701o0 = new hv0(new p2(24), new p2(25));
    public static final eg0 f25702p0 = new eg0();
    public boolean E;
    public ValueAnimator F;
    public mg.n G;
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
    public tu U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f25704a0;
    public WindowManager f25705b;
    public bi.a4 f25706b0;
    public WindowManager.LayoutParams f25707c;
    public boolean f25708c0;
    public org.telegram.ui.f d;
    public boolean f25709d0;
    public dg0 f25710e;
    public View f25712f;
    public boolean f25713f0;
    public dg0 h;
    public boolean f25716i0;
    public View f25718k0;
    public TextureView f25719l0;
    public boolean m0;
    public boolean f25720n;
    public qf0 f25721r;
    public ScaleGestureDetector f25722s;
    public mg.n v;
    public boolean f25723w;
    public boolean f25724x;
    public View f25725y;
    public float f25703a = 1.4f;
    public float J = 1.0f;
    public final w61 Q = new w61(false);
    public final zf0 f25711e0 = new zf0(this, 1);
    public float[] f25714g0 = new float[2];
    public final zf0 f25715h0 = new zf0(this, 2);
    public final zf0 f25717j0 = new zf0(this, 3);

    public static void j(boolean z10) {
        f25702p0.k(z10, false);
    }

    public static hk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        eg0 eg0Var = f25702p0;
        if (eg0Var.P && !z10) {
            obj.f26770a = eg0Var.K;
            obj.f26771b = eg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f26772c = eg0Var.H;
            obj.d = eg0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) eg0Var.n().f16319b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) eg0Var.n().f16319b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) eg0Var.n().f16319b).getFloat("scale_factor", 1.0f);
        obj.f26772c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f26772c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f26770a = dp;
        } else {
            obj.f26770a = (AndroidUtilities.displaySize.x - obj.f26772c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f26771b = w7.p.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f26771b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static qf.e p() {
        eg0 eg0Var = f25702p0;
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
        eg0 eg0Var = f25702p0;
        w61 w61Var = eg0Var.Q;
        w61Var.e(false);
        w61Var.d(!z10);
        w61Var.f(true);
        bi.a4 a4Var = eg0Var.f25706b0;
        if (a4Var != null) {
            a4Var.invalidate();
        }
        dg0 dg0Var = eg0Var.h;
        if (dg0Var != null) {
            dg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        eg0 eg0Var = f25702p0;
        eg0Var.V = photoViewer;
        g71 g71Var = photoViewer.F2;
        qf.e eVar = eg0Var.W;
        if (eVar != null) {
            eVar.c();
            eg0Var.W = null;
        }
        if (g71Var != null && tf.c.a(photoViewer.f33754y) == 1) {
            qf.d dVar = new qf.d(photoViewer.f33754y, eg0Var);
            dVar.f44372c = "photo-viewer-pip-" + g71Var.f26325a;
            dVar.f44373e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f44377j = eg0Var.d;
            dVar.f44378k = eg0Var.f25718k0;
            int i10 = eg0Var.S;
            int i11 = eg0Var.T;
            dVar.h = i10;
            dVar.f44376i = i11;
            dVar.f44375g = g71Var.d;
            dVar.f44374f = true;
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
            photoViewer.P8 = pVar;
        }
        this.f25705b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        g71 g71Var;
        qf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f25707c;
            int width = this.W.h.f46513a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f25707c;
            int height = this.W.h.f46513a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f25705b.addView(this.d, this.f25707c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            g71Var = photoViewer.F2;
        } else {
            g71Var = null;
        }
        if (g71Var == null) {
            return;
        }
        photoViewer.P8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f25719l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f25719l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33738w3) != null && textureView.isAvailable()) {
            return this.V.f33738w3.getBitmap();
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
        this.f25719l0 = textureView;
        textureView.setVisibility(4);
        this.f25719l0.setOpaque(false);
        this.f25719l0.setSurfaceTextureListener(new j50(this, 1));
        return this.f25719l0;
    }

    public final void i() {
        org.telegram.ui.jt0 jt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (jt0Var = photoViewer.f33561c4) == null) {
            return;
        }
        jt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f25708c0) {
            return;
        }
        this.f25708c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f25716i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f25717j0);
            this.f25716i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(pr.f29493f);
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
        qf0 qf0Var = this.f25721r;
        if (qf0Var != null) {
            return qf0Var.getCurrentPosition();
        }
        g71 g71Var = this.V.F2;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.n();
    }

    public final long m() {
        qf0 qf0Var = this.f25721r;
        if (qf0Var != null) {
            return qf0Var.getVideoDuration();
        }
        g71 g71Var = this.V.F2;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.p();
    }

    public final mg.n n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new mg.n(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f25703a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            w61 w61Var = this.Q;
            w61Var.f32211q = f7;
            w61Var.a();
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
                this.f25705b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f25706b0 = null;
        this.f25712f = null;
        this.V = null;
        qf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f25721r = null;
        this.U = null;
        this.f25725y = null;
        this.f25723w = false;
        this.P = false;
        this.f25708c0 = false;
        this.f25713f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f25715h0);
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
        duration.setInterpolator(pr.f29493f);
        this.F.addUpdateListener(new h70(this, 3));
        this.F.addListener(new bg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            qf0 qf0Var = this.f25721r;
            if (qf0Var != null) {
                y3 = qf0Var.G;
            } else {
                g71 g71Var = photoViewer.F2;
                if (g71Var != null) {
                    y3 = g71Var.y();
                } else {
                    return;
                }
            }
            zf0 zf0Var = this.f25711e0;
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
