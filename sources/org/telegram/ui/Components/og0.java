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
    public static final tv0 f27040n0 = new tv0(new fa0(10), new fa0(11));
    public static final tv0 f27041o0 = new tv0(new fa0(12), new fa0(13));
    public static final og0 f27042p0 = new og0();
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
    public wu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27044a0;
    public WindowManager f27045b;
    public ai.n4 f27046b0;
    public WindowManager.LayoutParams f27047c;
    public boolean f27048c0;
    public org.telegram.ui.f d;
    public boolean f27049d0;
    public ng0 e;
    public View f27051f;
    public boolean f27052f0;
    public ng0 h;
    public boolean f27055i0;
    public View f27057k0;
    public TextureView f27058l0;
    public boolean m0;
    public boolean f27059n;
    public ag0 f27060r;
    public ScaleGestureDetector f27061s;
    public ka.c v;
    public boolean f27062w;
    public boolean f27063x;
    public View f27064y;
    public float f27043a = 1.4f;
    public float J = 1.0f;
    public final k71 Q = new k71(false);
    public final jg0 f27050e0 = new jg0(this, 1);
    public float[] f27053g0 = new float[2];
    public final jg0 f27054h0 = new jg0(this, 2);
    public final jg0 f27056j0 = new jg0(this, 3);

    public static void j(boolean z10) {
        f27042p0.k(z10, false);
    }

    public static sk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        og0 og0Var = f27042p0;
        if (og0Var.P && !z10) {
            obj.f28258a = og0Var.K;
            obj.f28259b = og0Var.L + AndroidUtilities.statusBarHeight;
            obj.f28260c = og0Var.H;
            obj.d = og0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) og0Var.n().f13369b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) og0Var.n().f13369b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) og0Var.n().f13369b).getFloat("scale_factor", 1.0f);
        obj.f28260c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f28260c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f28258a = dp;
        } else {
            obj.f28258a = (AndroidUtilities.displaySize.x - obj.f28260c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f28259b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f28259b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        og0 og0Var = f27042p0;
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
        og0 og0Var = f27042p0;
        k71 k71Var = og0Var.Q;
        k71Var.e(false);
        k71Var.d(!z10);
        k71Var.f(true);
        ai.n4 n4Var = og0Var.f27046b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        ng0 ng0Var = og0Var.h;
        if (ng0Var != null) {
            ng0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        og0 og0Var = f27042p0;
        og0Var.V = photoViewer;
        s71 s71Var = photoViewer.F2;
        pf.e eVar = og0Var.W;
        if (eVar != null) {
            eVar.c();
            og0Var.W = null;
        }
        if (s71Var != null && sf.c.a(photoViewer.f31387y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31387y, og0Var);
            dVar.f41038c = "photo-viewer-pip-" + s71Var.f28174a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f41042j = og0Var.d;
            dVar.f41043k = og0Var.f27057k0;
            int i10 = og0Var.S;
            int i11 = og0Var.T;
            dVar.h = i10;
            dVar.f41041i = i11;
            dVar.f41040g = s71Var.d;
            dVar.f41039f = true;
            og0Var.W = dVar.a();
        }
        og0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ag0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.x(boolean, android.app.Activity, org.telegram.ui.Components.ag0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27045b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        s71 s71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27047c;
            int width = this.W.h.f43178a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27047c;
            int height = this.W.h.f43178a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27045b.addView(this.d, this.f27047c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            s71Var = photoViewer.F2;
        } else {
            s71Var = null;
        }
        if (s71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27058l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27058l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31371w3) != null && textureView.isAvailable()) {
            return this.V.f31371w3.getBitmap();
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
        this.f27058l0 = textureView;
        textureView.setVisibility(4);
        this.f27058l0.setOpaque(false);
        this.f27058l0.setSurfaceTextureListener(new ki.c(this, 2));
        return this.f27058l0;
    }

    public final void i() {
        org.telegram.ui.ct0 ct0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ct0Var = photoViewer.f31195c4) == null) {
            return;
        }
        ct0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27048c0) {
            return;
        }
        this.f27048c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27055i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27056j0);
            this.f27055i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(rr.f28022f);
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
        ag0 ag0Var = this.f27060r;
        if (ag0Var != null) {
            return ag0Var.getCurrentPosition();
        }
        s71 s71Var = this.V.F2;
        if (s71Var == null) {
            return 0L;
        }
        return s71Var.n();
    }

    public final long m() {
        ag0 ag0Var = this.f27060r;
        if (ag0Var != null) {
            return ag0Var.getVideoDuration();
        }
        s71 s71Var = this.V.F2;
        if (s71Var == null) {
            return 0L;
        }
        return s71Var.p();
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
            this.f27043a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            k71 k71Var = this.Q;
            k71Var.f25673q = f7;
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
                this.f27045b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27046b0 = null;
        this.f27051f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f27060r = null;
        this.U = null;
        this.f27064y = null;
        this.f27062w = false;
        this.P = false;
        this.f27048c0 = false;
        this.f27052f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27054h0);
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
        duration.setInterpolator(rr.f28022f);
        this.F.addUpdateListener(new s70(this, 3));
        this.F.addListener(new lg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            ag0 ag0Var = this.f27060r;
            if (ag0Var != null) {
                y3 = ag0Var.G;
            } else {
                s71 s71Var = photoViewer.F2;
                if (s71Var != null) {
                    y3 = s71Var.y();
                } else {
                    return;
                }
            }
            jg0 jg0Var = this.f27050e0;
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
