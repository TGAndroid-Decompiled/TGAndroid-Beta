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
public final class hh0 implements sf.a {
    public static final mw0 f27009n0 = new mw0(new ge0(2), new ge0(3));
    public static final mw0 f27010o0 = new mw0(new ge0(4), new ge0(5));
    public static final hh0 f27011p0 = new hh0();
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
    public qp0 R;
    public int S;
    public int T;
    public mv U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27013a0;
    public WindowManager f27014b;
    public ai.o4 f27015b0;
    public WindowManager.LayoutParams f27016c;
    public boolean f27017c0;
    public org.telegram.ui.f d;
    public boolean f27018d0;
    public gh0 f27019e;
    public View f27021f;
    public boolean f27022f0;
    public gh0 h;
    public boolean f27025i0;
    public View f27027k0;
    public TextureView f27028l0;
    public boolean m0;
    public boolean f27029n;
    public tg0 f27030r;
    public ScaleGestureDetector f27031s;
    public k2.g0 v;
    public boolean f27032w;
    public boolean f27033x;
    public View f27034y;
    public float f27012a = 1.4f;
    public float J = 1.0f;
    public final c81 Q = new c81(false);
    public final ch0 f27020e0 = new ch0(this, 1);
    public float[] f27023g0 = new float[2];
    public final ch0 f27024h0 = new ch0(this, 2);
    public final ch0 f27026j0 = new ch0(this, 3);

    public static void j(boolean z10) {
        f27011p0.k(z10, false);
    }

    public static nl0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        hh0 hh0Var = f27011p0;
        if (hh0Var.P && !z10) {
            obj.f29146a = hh0Var.K;
            obj.f29147b = hh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f29148c = hh0Var.H;
            obj.d = hh0Var.I;
            return obj;
        }
        float f11 = hh0Var.n().f7977a.getFloat("x", -1.0f);
        float f12 = hh0Var.n().f7977a.getFloat("y", -1.0f);
        float f13 = hh0Var.n().f7977a.getFloat("scale_factor", 1.0f);
        obj.f29148c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29148c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f29146a = dp;
        } else {
            obj.f29146a = (AndroidUtilities.displaySize.x - obj.f29148c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29147b = w7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f29147b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static qf.e p() {
        hh0 hh0Var = f27011p0;
        if (hh0Var != null) {
            return hh0Var.W;
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
        hh0 hh0Var = f27011p0;
        c81 c81Var = hh0Var.Q;
        c81Var.e(false);
        c81Var.d(!z10);
        c81Var.f(true);
        ai.o4 o4Var = hh0Var.f27015b0;
        if (o4Var != null) {
            o4Var.invalidate();
        }
        gh0 gh0Var = hh0Var.h;
        if (gh0Var != null) {
            gh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        hh0 hh0Var = f27011p0;
        hh0Var.V = photoViewer;
        l81 l81Var = photoViewer.F2;
        qf.e eVar = hh0Var.W;
        if (eVar != null) {
            eVar.c();
            hh0Var.W = null;
        }
        if (l81Var != null && tf.c.a(photoViewer.f34120y) == 1) {
            qf.d dVar = new qf.d(photoViewer.f34120y, hh0Var);
            dVar.f46197c = "photo-viewer-pip-" + l81Var.f28229a;
            dVar.f46198e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f46202j = hh0Var.d;
            dVar.f46203k = hh0Var.f27027k0;
            int i10 = hh0Var.S;
            int i11 = hh0Var.T;
            dVar.h = i10;
            dVar.f46201i = i11;
            dVar.f46200g = l81Var.d;
            dVar.f46199f = true;
            hh0Var.W = dVar.a();
        }
        hh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.tg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hh0.x(boolean, android.app.Activity, org.telegram.ui.Components.tg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27014b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        l81 l81Var;
        qf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27016c;
            int width = this.W.h.f48302a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27016c;
            int height = this.W.h.f48302a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27014b.addView(this.d, this.f27016c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            l81Var = photoViewer.F2;
        } else {
            l81Var = null;
        }
        if (l81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27028l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27028l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f34104w3) != null && textureView.isAvailable()) {
            return this.V.f34104w3.getBitmap();
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
        this.f27028l0 = textureView;
        textureView.setVisibility(4);
        this.f27028l0.setOpaque(false);
        this.f27028l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f27028l0;
    }

    public final void i() {
        org.telegram.ui.kt0 kt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (kt0Var = photoViewer.f33927c4) == null) {
            return;
        }
        kt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27017c0) {
            return;
        }
        this.f27017c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27025i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27026j0);
            this.f27025i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(is.f27443f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new eh0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new ch0(this, 0), 100L);
        }
    }

    public final long l() {
        tg0 tg0Var = this.f27030r;
        if (tg0Var != null) {
            return tg0Var.getCurrentPosition();
        }
        l81 l81Var = this.V.F2;
        if (l81Var == null) {
            return 0L;
        }
        return l81Var.n();
    }

    public final long m() {
        tg0 tg0Var = this.f27030r;
        if (tg0Var != null) {
            return tg0Var.getVideoDuration();
        }
        l81 l81Var = this.V.F2;
        if (l81Var == null) {
            return 0L;
        }
        return l81Var.p();
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
            this.f27012a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            c81 c81Var = this.Q;
            c81Var.f25238q = f7;
            c81Var.a();
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
                this.f27014b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27015b0 = null;
        this.f27021f = null;
        this.V = null;
        qf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f27030r = null;
        this.U = null;
        this.f27034y = null;
        this.f27032w = false;
        this.P = false;
        this.f27017c0 = false;
        this.f27022f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27024h0);
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
        duration.setInterpolator(is.f27443f);
        this.F.addUpdateListener(new k80(this, 4));
        this.F.addListener(new eh0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            tg0 tg0Var = this.f27030r;
            if (tg0Var != null) {
                y3 = tg0Var.G;
            } else {
                l81 l81Var = photoViewer.F2;
                if (l81Var != null) {
                    y3 = l81Var.y();
                } else {
                    return;
                }
            }
            ch0 ch0Var = this.f27020e0;
            AndroidUtilities.cancelRunOnUIThread(ch0Var);
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
            AndroidUtilities.runOnUIThread(ch0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
