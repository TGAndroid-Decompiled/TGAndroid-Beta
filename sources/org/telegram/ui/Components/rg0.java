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
public final class rg0 implements rf.a {
    public static final fw0 f30464n0 = new fw0(new ru(12), new ru(13));
    public static final fw0 f30465o0 = new fw0(new ru(14), new ru(15));
    public static final rg0 f30466p0 = new rg0();
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
    public ep0 R;
    public int S;
    public int T;
    public zu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f30468a0;
    public WindowManager f30469b;
    public ai.n4 f30470b0;
    public WindowManager.LayoutParams f30471c;
    public boolean f30472c0;
    public org.telegram.ui.f d;
    public boolean f30473d0;
    public qg0 f30474e;
    public View f30476f;
    public boolean f30477f0;
    public qg0 h;
    public boolean f30480i0;
    public View f30482k0;
    public TextureView f30483l0;
    public boolean m0;
    public boolean f30484n;
    public dg0 f30485r;
    public ScaleGestureDetector f30486s;
    public ii.n4 v;
    public boolean f30487w;
    public boolean f30488x;
    public View f30489y;
    public float f30467a = 1.4f;
    public float J = 1.0f;
    public final w71 Q = new w71(false);
    public final mg0 f30475e0 = new mg0(this, 1);
    public float[] f30478g0 = new float[2];
    public final mg0 f30479h0 = new mg0(this, 2);
    public final mg0 f30481j0 = new mg0(this, 3);

    public static void j(boolean z10) {
        f30466p0.k(z10, false);
    }

    public static uk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        rg0 rg0Var = f30466p0;
        if (rg0Var.P && !z10) {
            obj.f31448a = rg0Var.K;
            obj.f31449b = rg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f31450c = rg0Var.H;
            obj.d = rg0Var.I;
            return obj;
        }
        float f11 = rg0Var.n().f7928a.getFloat("x", -1.0f);
        float f12 = rg0Var.n().f7928a.getFloat("y", -1.0f);
        float f13 = rg0Var.n().f7928a.getFloat("scale_factor", 1.0f);
        obj.f31450c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f31450c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f31448a = dp;
        } else {
            obj.f31448a = (AndroidUtilities.displaySize.x - obj.f31450c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f31449b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f31449b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        rg0 rg0Var = f30466p0;
        if (rg0Var != null) {
            return rg0Var.W;
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
        rg0 rg0Var = f30466p0;
        w71 w71Var = rg0Var.Q;
        w71Var.e(false);
        w71Var.d(!z10);
        w71Var.f(true);
        ai.n4 n4Var = rg0Var.f30470b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        qg0 qg0Var = rg0Var.h;
        if (qg0Var != null) {
            qg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        rg0 rg0Var = f30466p0;
        rg0Var.V = photoViewer;
        e81 e81Var = photoViewer.F2;
        pf.e eVar = rg0Var.W;
        if (eVar != null) {
            eVar.c();
            rg0Var.W = null;
        }
        if (e81Var != null && sf.c.a(photoViewer.f34092y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f34092y, rg0Var);
            dVar.f44415c = "photo-viewer-pip-" + e81Var.f26048a;
            dVar.f44416e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f44420j = rg0Var.d;
            dVar.f44421k = rg0Var.f30482k0;
            int i10 = rg0Var.S;
            int i11 = rg0Var.T;
            dVar.h = i10;
            dVar.f44419i = i11;
            dVar.f44418g = e81Var.d;
            dVar.f44417f = true;
            rg0Var.W = dVar.a();
        }
        rg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.dg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg0.x(boolean, android.app.Activity, org.telegram.ui.Components.dg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f30469b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        e81 e81Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f30471c;
            int width = this.W.h.f46793a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f30471c;
            int height = this.W.h.f46793a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f30469b.addView(this.d, this.f30471c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            e81Var = photoViewer.F2;
        } else {
            e81Var = null;
        }
        if (e81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f30483l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f30483l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f34076w3) != null && textureView.isAvailable()) {
            return this.V.f34076w3.getBitmap();
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
        this.f30483l0 = textureView;
        textureView.setVisibility(4);
        this.f30483l0.setOpaque(false);
        this.f30483l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f30483l0;
    }

    public final void i() {
        org.telegram.ui.ft0 ft0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ft0Var = photoViewer.f33899c4) == null) {
            return;
        }
        ft0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f30472c0) {
            return;
        }
        this.f30472c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f30480i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f30481j0);
            this.f30480i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(tr.f31215f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new og0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new mg0(this, 0), 100L);
        }
    }

    public final long l() {
        dg0 dg0Var = this.f30485r;
        if (dg0Var != null) {
            return dg0Var.getCurrentPosition();
        }
        e81 e81Var = this.V.F2;
        if (e81Var == null) {
            return 0L;
        }
        return e81Var.n();
    }

    public final long m() {
        dg0 dg0Var = this.f30485r;
        if (dg0Var != null) {
            return dg0Var.getVideoDuration();
        }
        e81 e81Var = this.V.F2;
        if (e81Var == null) {
            return 0L;
        }
        return e81Var.p();
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
            this.f30467a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            w71 w71Var = this.Q;
            w71Var.f32555q = f7;
            w71Var.a();
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
                this.f30469b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f30470b0 = null;
        this.f30476f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f30485r = null;
        this.U = null;
        this.f30489y = null;
        this.f30487w = false;
        this.P = false;
        this.f30472c0 = false;
        this.f30477f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f30479h0);
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
        duration.setInterpolator(tr.f31215f);
        this.F.addUpdateListener(new v70(this, 3));
        this.F.addListener(new og0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            dg0 dg0Var = this.f30485r;
            if (dg0Var != null) {
                y3 = dg0Var.G;
            } else {
                e81 e81Var = photoViewer.F2;
                if (e81Var != null) {
                    y3 = e81Var.y();
                } else {
                    return;
                }
            }
            mg0 mg0Var = this.f30475e0;
            AndroidUtilities.cancelRunOnUIThread(mg0Var);
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
            AndroidUtilities.runOnUIThread(mg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
