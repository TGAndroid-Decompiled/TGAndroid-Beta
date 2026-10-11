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
public final class ih0 implements sf.a {
    public static final nw0 f27323n0 = new nw0(new ae0(4), new ae0(5));
    public static final nw0 f27324o0 = new nw0(new ae0(6), new ae0(7));
    public static final ih0 f27325p0 = new ih0();
    public boolean E;
    public ValueAnimator F;
    public com.google.firebase.messaging.u G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public rp0 R;
    public int S;
    public int T;
    public mv U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27327a0;
    public WindowManager f27328b;
    public ai.o4 f27329b0;
    public WindowManager.LayoutParams f27330c;
    public boolean f27331c0;
    public org.telegram.ui.f d;
    public boolean f27332d0;
    public hh0 f27333e;
    public View f27335f;
    public boolean f27336f0;
    public hh0 h;
    public boolean f27339i0;
    public View f27341k0;
    public TextureView f27342l0;
    public boolean m0;
    public boolean f27343n;
    public ug0 f27344r;
    public ScaleGestureDetector f27345s;
    public k2.g0 v;
    public boolean f27346w;
    public boolean f27347x;
    public View f27348y;
    public float f27326a = 1.4f;
    public float J = 1.0f;
    public final d81 Q = new d81(false);
    public final dh0 f27334e0 = new dh0(this, 1);
    public float[] f27337g0 = new float[2];
    public final dh0 f27338h0 = new dh0(this, 2);
    public final dh0 f27340j0 = new dh0(this, 3);

    public static void j(boolean z10) {
        f27325p0.k(z10, false);
    }

    public static ol0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        ih0 ih0Var = f27325p0;
        if (ih0Var.P && !z10) {
            obj.f29425a = ih0Var.K;
            obj.f29426b = ih0Var.L + AndroidUtilities.statusBarHeight;
            obj.f29427c = ih0Var.H;
            obj.d = ih0Var.I;
            return obj;
        }
        float f11 = ih0Var.n().f7976a.getFloat("x", -1.0f);
        float f12 = ih0Var.n().f7976a.getFloat("y", -1.0f);
        float f13 = ih0Var.n().f7976a.getFloat("scale_factor", 1.0f);
        obj.f29427c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29427c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f29425a = dp;
        } else {
            obj.f29425a = (AndroidUtilities.displaySize.x - obj.f29427c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29426b = w7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f29426b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static qf.e p() {
        ih0 ih0Var = f27325p0;
        if (ih0Var != null) {
            return ih0Var.W;
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
        ih0 ih0Var = f27325p0;
        d81 d81Var = ih0Var.Q;
        d81Var.e(false);
        d81Var.d(!z10);
        d81Var.f(true);
        ai.o4 o4Var = ih0Var.f27329b0;
        if (o4Var != null) {
            o4Var.invalidate();
        }
        hh0 hh0Var = ih0Var.h;
        if (hh0Var != null) {
            hh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ih0 ih0Var = f27325p0;
        ih0Var.V = photoViewer;
        m81 m81Var = photoViewer.F2;
        qf.e eVar = ih0Var.W;
        if (eVar != null) {
            eVar.c();
            ih0Var.W = null;
        }
        if (m81Var != null && tf.c.a(photoViewer.f34110y) == 1) {
            qf.d dVar = new qf.d(photoViewer.f34110y, ih0Var);
            dVar.f46231c = "photo-viewer-pip-" + m81Var.f28607a;
            dVar.f46232e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f46236j = ih0Var.d;
            dVar.f46237k = ih0Var.f27341k0;
            int i10 = ih0Var.S;
            int i11 = ih0Var.T;
            dVar.h = i10;
            dVar.f46235i = i11;
            dVar.f46234g = m81Var.d;
            dVar.f46233f = true;
            ih0Var.W = dVar.a();
        }
        ih0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ug0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ih0.x(boolean, android.app.Activity, org.telegram.ui.Components.ug0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27328b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        m81 m81Var;
        qf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27330c;
            int width = this.W.h.f48348a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27330c;
            int height = this.W.h.f48348a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27328b.addView(this.d, this.f27330c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            m81Var = photoViewer.F2;
        } else {
            m81Var = null;
        }
        if (m81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27342l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27342l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f34094w3) != null && textureView.isAvailable()) {
            return this.V.f34094w3.getBitmap();
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
        this.f27342l0 = textureView;
        textureView.setVisibility(4);
        this.f27342l0.setOpaque(false);
        this.f27342l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f27342l0;
    }

    public final void i() {
        org.telegram.ui.jt0 jt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (jt0Var = photoViewer.f33917c4) == null) {
            return;
        }
        jt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27331c0) {
            return;
        }
        this.f27331c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27339i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27340j0);
            this.f27339i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(is.f27451f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new fh0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new dh0(this, 0), 100L);
        }
    }

    public final long l() {
        ug0 ug0Var = this.f27344r;
        if (ug0Var != null) {
            return ug0Var.getCurrentPosition();
        }
        m81 m81Var = this.V.F2;
        if (m81Var == null) {
            return 0L;
        }
        return m81Var.n();
    }

    public final long m() {
        ug0 ug0Var = this.f27344r;
        if (ug0Var != null) {
            return ug0Var.getVideoDuration();
        }
        m81 m81Var = this.V.F2;
        if (m81Var == null) {
            return 0L;
        }
        return m81Var.p();
    }

    public final com.google.firebase.messaging.u n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new com.google.firebase.messaging.u(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f27326a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            d81 d81Var = this.Q;
            d81Var.f25491q = f7;
            d81Var.a();
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
                this.f27328b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27329b0 = null;
        this.f27335f = null;
        this.V = null;
        qf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f27344r = null;
        this.U = null;
        this.f27348y = null;
        this.f27346w = false;
        this.P = false;
        this.f27331c0 = false;
        this.f27336f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27338h0);
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
        duration.setInterpolator(is.f27451f);
        this.F.addUpdateListener(new k80(this, 4));
        this.F.addListener(new fh0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            ug0 ug0Var = this.f27344r;
            if (ug0Var != null) {
                y3 = ug0Var.G;
            } else {
                m81 m81Var = photoViewer.F2;
                if (m81Var != null) {
                    y3 = m81Var.y();
                } else {
                    return;
                }
            }
            dh0 dh0Var = this.f27334e0;
            AndroidUtilities.cancelRunOnUIThread(dh0Var);
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
            AndroidUtilities.runOnUIThread(dh0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
