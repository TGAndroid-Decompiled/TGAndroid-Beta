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
public final class jh0 implements sf.a {
    public static final rw0 f27495n0 = new rw0(new je0(2), new je0(3));
    public static final rw0 f27496o0 = new rw0(new je0(4), new je0(5));
    public static final jh0 f27497p0 = new jh0();
    public boolean E;
    public ValueAnimator F;
    public n4.l G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public vp0 R;
    public int S;
    public int T;
    public ov U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27499a0;
    public WindowManager f27500b;
    public ai.o4 f27501b0;
    public WindowManager.LayoutParams f27502c;
    public boolean f27503c0;
    public org.telegram.ui.f d;
    public boolean f27504d0;
    public ih0 f27505e;
    public View f27507f;
    public boolean f27508f0;
    public ih0 h;
    public boolean f27511i0;
    public View f27513k0;
    public TextureView f27514l0;
    public boolean m0;
    public boolean f27515n;
    public vg0 f27516r;
    public ScaleGestureDetector f27517s;
    public l2.g v;
    public boolean f27518w;
    public boolean f27519x;
    public View f27520y;
    public float f27498a = 1.4f;
    public float J = 1.0f;
    public final h81 Q = new h81(false);
    public final eh0 f27506e0 = new eh0(this, 1);
    public float[] f27509g0 = new float[2];
    public final eh0 f27510h0 = new eh0(this, 2);
    public final eh0 f27512j0 = new eh0(this, 3);

    public static void j(boolean z10) {
        f27497p0.k(z10, false);
    }

    public static sl0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        jh0 jh0Var = f27497p0;
        if (jh0Var.P && !z10) {
            obj.f30589a = jh0Var.K;
            obj.f30590b = jh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f30591c = jh0Var.H;
            obj.d = jh0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) jh0Var.n().f16326a).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) jh0Var.n().f16326a).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) jh0Var.n().f16326a).getFloat("scale_factor", 1.0f);
        obj.f30591c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f30591c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f30589a = dp;
        } else {
            obj.f30589a = (AndroidUtilities.displaySize.x - obj.f30591c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f30590b = w7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f30590b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static qf.e p() {
        jh0 jh0Var = f27497p0;
        if (jh0Var != null) {
            return jh0Var.W;
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
        jh0 jh0Var = f27497p0;
        h81 h81Var = jh0Var.Q;
        h81Var.e(false);
        h81Var.d(!z10);
        h81Var.f(true);
        ai.o4 o4Var = jh0Var.f27501b0;
        if (o4Var != null) {
            o4Var.invalidate();
        }
        ih0 ih0Var = jh0Var.h;
        if (ih0Var != null) {
            ih0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        jh0 jh0Var = f27497p0;
        jh0Var.V = photoViewer;
        q81 q81Var = photoViewer.F2;
        qf.e eVar = jh0Var.W;
        if (eVar != null) {
            eVar.c();
            jh0Var.W = null;
        }
        if (q81Var != null && tf.c.a(photoViewer.f33921y) == 1) {
            qf.d dVar = new qf.d(photoViewer.f33921y, jh0Var);
            dVar.f46098c = "photo-viewer-pip-" + q81Var.f29756a;
            dVar.f46099e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f46103j = jh0Var.d;
            dVar.f46104k = jh0Var.f27513k0;
            int i10 = jh0Var.S;
            int i11 = jh0Var.T;
            dVar.h = i10;
            dVar.f46102i = i11;
            dVar.f46101g = q81Var.d;
            dVar.f46100f = true;
            jh0Var.W = dVar.a();
        }
        jh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.vg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jh0.x(boolean, android.app.Activity, org.telegram.ui.Components.vg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27500b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        q81 q81Var;
        qf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27502c;
            int width = this.W.h.f48497a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27502c;
            int height = this.W.h.f48497a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27500b.addView(this.d, this.f27502c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            q81Var = photoViewer.F2;
        } else {
            q81Var = null;
        }
        if (q81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27514l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27514l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33905w3) != null && textureView.isAvailable()) {
            return this.V.f33905w3.getBitmap();
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
        this.f27514l0 = textureView;
        textureView.setVisibility(4);
        this.f27514l0.setOpaque(false);
        this.f27514l0.setSurfaceTextureListener(new e60(this, 1));
        return this.f27514l0;
    }

    public final void i() {
        org.telegram.ui.mt0 mt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (mt0Var = photoViewer.f33728c4) == null) {
            return;
        }
        mt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27503c0) {
            return;
        }
        this.f27503c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27511i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27512j0);
            this.f27511i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(js.f27634f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new gh0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new eh0(this, 0), 100L);
        }
    }

    public final long l() {
        vg0 vg0Var = this.f27516r;
        if (vg0Var != null) {
            return vg0Var.getCurrentPosition();
        }
        q81 q81Var = this.V.F2;
        if (q81Var == null) {
            return 0L;
        }
        return q81Var.n();
    }

    public final long m() {
        vg0 vg0Var = this.f27516r;
        if (vg0Var != null) {
            return vg0Var.getVideoDuration();
        }
        q81 q81Var = this.V.F2;
        if (q81Var == null) {
            return 0L;
        }
        return q81Var.p();
    }

    public final n4.l n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new n4.l(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f27498a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            h81 h81Var = this.Q;
            h81Var.f26703q = f7;
            h81Var.a();
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
                this.f27500b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27501b0 = null;
        this.f27507f = null;
        this.V = null;
        qf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f27516r = null;
        this.U = null;
        this.f27520y = null;
        this.f27518w = false;
        this.P = false;
        this.f27503c0 = false;
        this.f27508f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27510h0);
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
        duration.setInterpolator(js.f27634f);
        this.F.addUpdateListener(new m80(this, 4));
        this.F.addListener(new gh0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            vg0 vg0Var = this.f27516r;
            if (vg0Var != null) {
                y3 = vg0Var.G;
            } else {
                q81 q81Var = photoViewer.F2;
                if (q81Var != null) {
                    y3 = q81Var.y();
                } else {
                    return;
                }
            }
            eh0 eh0Var = this.f27506e0;
            AndroidUtilities.cancelRunOnUIThread(eh0Var);
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
            AndroidUtilities.runOnUIThread(eh0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
