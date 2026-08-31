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
public final class ng0 implements ef.a {
    public static final jv0 f29483k0 = new jv0(new k2(26), new k2(27));
    public static final jv0 f29484l0 = new jv0(new k2(28), new k2(29));
    public static final ng0 m0 = new ng0();
    public boolean B;
    public ValueAnimator C;
    public ai D;
    public int E;
    public int F;
    public float H;
    public float I;
    public o1.j J;
    public o1.j K;
    public Float L;
    public boolean M;
    public po0 O;
    public int P;
    public int Q;
    public ru R;
    public PhotoViewer S;
    public cf.f T;
    public ImageView U;
    public boolean V;
    public float W;
    public float X;
    public oh.b3 Y;
    public boolean Z;
    public boolean f29486a0;
    public WindowManager f29487b;
    public WindowManager.LayoutParams f29489c;
    public boolean f29490c0;
    public org.telegram.ui.g d;
    public mg0 f29492e;
    public View f29494f;
    public boolean f29495f0;
    public mg0 h;
    public View f29497h0;
    public TextureView f29498i0;
    public boolean f29499j0;
    public boolean f29500n;
    public xf0 f29501r;
    public ScaleGestureDetector f29502s;
    public ai v;
    public boolean f29503w;
    public boolean f29504x;
    public View f29505y;
    public float f29485a = 1.4f;
    public float G = 1.0f;
    public final a71 N = new a71(false);
    public final gg0 f29488b0 = new gg0(this, 1);
    public float[] f29491d0 = new float[2];
    public final gg0 f29493e0 = new gg0(this, 2);
    public final gg0 f29496g0 = new gg0(this, 3);

    public static void j(boolean z4) {
        m0.k(z4, false);
    }

    public static tk0 o(float f10, boolean z4) {
        float dp;
        ?? obj = new Object();
        float f11 = 1.0f / f10;
        ng0 ng0Var = m0;
        if (ng0Var.M && !z4) {
            obj.f31355a = ng0Var.H;
            obj.f31356b = ng0Var.I + AndroidUtilities.statusBarHeight;
            obj.f31357c = ng0Var.E;
            obj.d = ng0Var.F;
            return obj;
        }
        float f12 = ((SharedPreferences) ng0Var.n().f25265b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) ng0Var.n().f25265b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) ng0Var.n().f25265b).getFloat("scale_factor", 1.0f);
        obj.f31357c = s(f11) * f14;
        obj.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = obj.f31357c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            if (f16 >= f17 / 2.0f) {
                dp = (f17 - f15) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f31355a = dp;
        } else {
            obj.f31355a = (AndroidUtilities.displaySize.x - obj.f31357c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            obj.f31356b = k7.o.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f31356b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static cf.f p() {
        ng0 ng0Var = m0;
        if (ng0Var != null) {
            return ng0Var.T;
        }
        return null;
    }

    public static int s(float f10) {
        float min;
        float f11;
        if (f10 >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f11 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f11 = 0.6f;
        }
        return (int) (min * f11);
    }

    public static void v(boolean z4) {
        ng0 ng0Var = m0;
        a71 a71Var = ng0Var.N;
        a71Var.e(false);
        a71Var.d(!z4);
        a71Var.f(true);
        oh.b3 b3Var = ng0Var.Y;
        if (b3Var != null) {
            b3Var.invalidate();
        }
        mg0 mg0Var = ng0Var.h;
        if (mg0Var != null) {
            mg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ng0 ng0Var = m0;
        ng0Var.S = photoViewer;
        k71 k71Var = photoViewer.C2;
        cf.f fVar = ng0Var.T;
        if (fVar != null) {
            fVar.c();
            ng0Var.T = null;
        }
        if (k71Var != null && ff.d.a(photoViewer.f34439y) == 1) {
            cf.e eVar = new cf.e(photoViewer.f34439y, ng0Var);
            eVar.f2482c = "photo-viewer-pip-" + k71Var.f28305a;
            eVar.f2483e = 1;
            eVar.d = AndroidUtilities.dp(10.0f);
            eVar.f2487j = ng0Var.d;
            eVar.f2488k = ng0Var.f29497h0;
            int i10 = ng0Var.P;
            int i11 = ng0Var.Q;
            eVar.h = i10;
            eVar.f2486i = i11;
            eVar.f2485g = k71Var.d;
            eVar.f2484f = true;
            ng0Var.T = eVar.a();
        }
        ng0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.xf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng0.x(boolean, android.app.Activity, org.telegram.ui.Components.xf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(c2.p pVar) {
        k71 k71Var;
        cf.f fVar = this.T;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f29489c;
            int width = this.T.h.f6233a.width();
            this.E = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f29489c;
            int height = this.T.h.f6233a.height();
            this.F = height;
            layoutParams2.height = height;
        }
        this.f29487b.addView(this.d, this.f29489c);
        this.f29499j0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null) {
            k71Var = photoViewer.C2;
        } else {
            k71Var = null;
        }
        if (k71Var == null) {
            return;
        }
        photoViewer.M8 = pVar;
    }

    @Override
    public final Bitmap b() {
        TextureView textureView = this.f29498i0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f29498i0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && (textureView = photoViewer.f34396t3) != null && textureView.isAvailable()) {
            return this.S.f34396t3.getBitmap();
        }
        return null;
    }

    @Override
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && photoViewer.C2 != null) {
            photoViewer.M8 = pVar;
        }
        this.f29487b.removeView(this.d);
        this.f29499j0 = true;
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && photoViewer.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.f29498i0 = textureView;
        textureView.setVisibility(4);
        this.f29498i0.setOpaque(false);
        this.f29498i0.setSurfaceTextureListener(new jh.h(this, 2));
        return this.f29498i0;
    }

    public final void i() {
        org.telegram.ui.rs0 rs0Var;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || (rs0Var = photoViewer.Z3) == null) {
            return;
        }
        rs0Var.cancelRewind();
    }

    public final void k(boolean z4, boolean z10) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f29495f0) {
            AndroidUtilities.cancelRunOnUIThread(this.f29496g0);
            this.f29495f0 = false;
        }
        o1.j jVar = this.J;
        if (jVar != null) {
            jVar.c();
            this.K.c();
        }
        if (!z4 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(pr.f30183f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ig0(this, 1));
            animatorSet.start();
        } else if (z10) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new gg0(this, 0), 100L);
        }
    }

    public final long l() {
        xf0 xf0Var = this.f29501r;
        if (xf0Var != null) {
            return xf0Var.getCurrentPosition();
        }
        k71 k71Var = this.S.C2;
        if (k71Var == null) {
            return 0L;
        }
        return k71Var.n();
    }

    public final long m() {
        xf0 xf0Var = this.f29501r;
        if (xf0Var != null) {
            return xf0Var.getVideoDuration();
        }
        k71 k71Var = this.S.C2;
        if (k71Var == null) {
            return 0L;
        }
        return k71Var.p();
    }

    public final ai n() {
        if (this.D == null) {
            Point point = AndroidUtilities.displaySize;
            this.D = new ai(point.x, point.y);
        }
        return this.D;
    }

    public final float q() {
        float f10;
        if (this.L == null) {
            this.L = Float.valueOf(this.Q / this.P);
            Point point = AndroidUtilities.displaySize;
            this.f29485a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.L.floatValue() < 1.0f) {
                f10 = 0.6f;
            } else {
                f10 = 0.45f;
            }
            a71 a71Var = this.N;
            a71Var.f25191q = f10;
            a71Var.a();
        }
        return this.L.floatValue();
    }

    public final int r() {
        float q10 = q();
        return (int) (s(q10) * q10);
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.f29487b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.Y = null;
        this.f29494f = null;
        this.S = null;
        cf.f fVar = this.T;
        if (fVar != null) {
            fVar.c();
            this.T = null;
        }
        this.f29501r = null;
        this.R = null;
        this.f29505y = null;
        this.f29503w = false;
        this.M = false;
        this.Z = false;
        this.f29490c0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f29493e0);
    }

    public final void y(boolean z4) {
        float f10;
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.C = duration;
        duration.setInterpolator(pr.f30183f);
        this.C.addUpdateListener(new k70(this, 3));
        this.C.addListener(new ig0(this, 0));
        this.C.start();
    }

    public final void z() {
        boolean y10;
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && this.U != null) {
            xf0 xf0Var = this.f29501r;
            if (xf0Var != null) {
                y10 = xf0Var.D;
            } else {
                k71 k71Var = photoViewer.C2;
                if (k71Var != null) {
                    y10 = k71Var.y();
                } else {
                    return;
                }
            }
            gg0 gg0Var = this.f29488b0;
            AndroidUtilities.cancelRunOnUIThread(gg0Var);
            if (!y10) {
                if (this.V) {
                    this.U.setImageResource(R.drawable.pip_replay_large);
                    return;
                } else {
                    this.U.setImageResource(R.drawable.pip_play_large);
                    return;
                }
            }
            this.U.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(gg0Var, 500L);
        }
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
