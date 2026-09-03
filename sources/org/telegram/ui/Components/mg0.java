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
public final class mg0 implements df.a {
    public static final iv0 f27035k0 = new iv0(new k2(26), new k2(27));
    public static final iv0 f27036l0 = new iv0(new k2(28), new k2(29));
    public static final mg0 m0 = new mg0();
    public boolean B;
    public ValueAnimator C;
    public o2.i D;
    public int E;
    public int F;
    public float H;
    public float I;
    public o1.j J;
    public o1.j K;
    public Float L;
    public boolean M;
    public no0 O;
    public int P;
    public int Q;
    public ou R;
    public PhotoViewer S;
    public bf.f T;
    public ImageView U;
    public boolean V;
    public float W;
    public float X;
    public nh.a3 Y;
    public boolean Z;
    public boolean f27038a0;
    public WindowManager f27039b;
    public WindowManager.LayoutParams f27041c;
    public boolean f27042c0;
    public org.telegram.ui.g d;
    public lg0 e;
    public View f27045f;
    public boolean f27046f0;
    public lg0 h;
    public View f27048h0;
    public TextureView f27049i0;
    public boolean f27050j0;
    public boolean f27051n;
    public wf0 f27052r;
    public ScaleGestureDetector f27053s;
    public o2.i v;
    public boolean f27054w;
    public boolean f27055x;
    public View f27056y;
    public float f27037a = 1.4f;
    public float G = 1.0f;
    public final y61 N = new y61(false);
    public final fg0 f27040b0 = new fg0(this, 1);
    public float[] f27043d0 = new float[2];
    public final fg0 f27044e0 = new fg0(this, 2);
    public final fg0 f27047g0 = new fg0(this, 3);

    public static void j(boolean z4) {
        m0.k(z4, false);
    }

    public static rk0 o(float f10, boolean z4) {
        float dp;
        ?? obj = new Object();
        float f11 = 1.0f / f10;
        mg0 mg0Var = m0;
        if (mg0Var.M && !z4) {
            obj.f28483a = mg0Var.H;
            obj.f28484b = mg0Var.I + AndroidUtilities.statusBarHeight;
            obj.f28485c = mg0Var.E;
            obj.d = mg0Var.F;
            return obj;
        }
        float f12 = ((SharedPreferences) mg0Var.n().f16195b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) mg0Var.n().f16195b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) mg0Var.n().f16195b).getFloat("scale_factor", 1.0f);
        obj.f28485c = s(f11) * f14;
        obj.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = obj.f28485c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            if (f16 >= f17 / 2.0f) {
                dp = (f17 - f15) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f28483a = dp;
        } else {
            obj.f28483a = (AndroidUtilities.displaySize.x - obj.f28485c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            obj.f28484b = k7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f28484b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static bf.f p() {
        mg0 mg0Var = m0;
        if (mg0Var != null) {
            return mg0Var.T;
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
        mg0 mg0Var = m0;
        y61 y61Var = mg0Var.N;
        y61Var.e(false);
        y61Var.d(!z4);
        y61Var.f(true);
        nh.a3 a3Var = mg0Var.Y;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        lg0 lg0Var = mg0Var.h;
        if (lg0Var != null) {
            lg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        mg0 mg0Var = m0;
        mg0Var.S = photoViewer;
        i71 i71Var = photoViewer.C2;
        bf.f fVar = mg0Var.T;
        if (fVar != null) {
            fVar.c();
            mg0Var.T = null;
        }
        if (i71Var != null && ef.d.a(photoViewer.f31887y) == 1) {
            bf.e eVar = new bf.e(photoViewer.f31887y, mg0Var);
            eVar.f1809c = "photo-viewer-pip-" + i71Var.f25620a;
            eVar.e = 1;
            eVar.d = AndroidUtilities.dp(10.0f);
            eVar.f1813j = mg0Var.d;
            eVar.f1814k = mg0Var.f27048h0;
            int i10 = mg0Var.P;
            int i11 = mg0Var.Q;
            eVar.h = i10;
            eVar.f1812i = i11;
            eVar.f1811g = i71Var.d;
            eVar.f1810f = true;
            mg0Var.T = eVar.a();
        }
        mg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.wf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg0.x(boolean, android.app.Activity, org.telegram.ui.Components.wf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(c2.p pVar) {
        i71 i71Var;
        bf.f fVar = this.T;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27041c;
            int width = this.T.h.f5199a.width();
            this.E = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27041c;
            int height = this.T.h.f5199a.height();
            this.F = height;
            layoutParams2.height = height;
        }
        this.f27039b.addView(this.d, this.f27041c);
        this.f27050j0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null) {
            i71Var = photoViewer.C2;
        } else {
            i71Var = null;
        }
        if (i71Var == null) {
            return;
        }
        photoViewer.M8 = pVar;
    }

    @Override
    public final Bitmap b() {
        TextureView textureView = this.f27049i0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27049i0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && (textureView = photoViewer.f31844t3) != null && textureView.isAvailable()) {
            return this.S.f31844t3.getBitmap();
        }
        return null;
    }

    @Override
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && photoViewer.C2 != null) {
            photoViewer.M8 = pVar;
        }
        this.f27039b.removeView(this.d);
        this.f27050j0 = true;
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
        this.f27049i0 = textureView;
        textureView.setVisibility(4);
        this.f27049i0.setOpaque(false);
        this.f27049i0.setSurfaceTextureListener(new ih.h(this, 2));
        return this.f27049i0;
    }

    public final void i() {
        org.telegram.ui.ws0 ws0Var;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || (ws0Var = photoViewer.Z3) == null) {
            return;
        }
        ws0Var.cancelRewind();
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
        if (this.f27046f0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27047g0);
            this.f27046f0 = false;
        }
        o1.j jVar = this.J;
        if (jVar != null) {
            jVar.c();
            this.K.c();
        }
        if (!z4 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(mr.f27122f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new hg0(this, 1));
            animatorSet.start();
        } else if (z10) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new fg0(this, 0), 100L);
        }
    }

    public final long l() {
        wf0 wf0Var = this.f27052r;
        if (wf0Var != null) {
            return wf0Var.getCurrentPosition();
        }
        i71 i71Var = this.S.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.n();
    }

    public final long m() {
        wf0 wf0Var = this.f27052r;
        if (wf0Var != null) {
            return wf0Var.getVideoDuration();
        }
        i71 i71Var = this.S.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.p();
    }

    public final o2.i n() {
        if (this.D == null) {
            Point point = AndroidUtilities.displaySize;
            this.D = new o2.i(point.x, point.y);
        }
        return this.D;
    }

    public final float q() {
        float f10;
        if (this.L == null) {
            this.L = Float.valueOf(this.Q / this.P);
            Point point = AndroidUtilities.displaySize;
            this.f27037a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.L.floatValue() < 1.0f) {
                f10 = 0.6f;
            } else {
                f10 = 0.45f;
            }
            y61 y61Var = this.N;
            y61Var.f30928q = f10;
            y61Var.a();
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
                this.f27039b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.Y = null;
        this.f27045f = null;
        this.S = null;
        bf.f fVar = this.T;
        if (fVar != null) {
            fVar.c();
            this.T = null;
        }
        this.f27052r = null;
        this.R = null;
        this.f27056y = null;
        this.f27054w = false;
        this.M = false;
        this.Z = false;
        this.f27042c0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27044e0);
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
        duration.setInterpolator(mr.f27122f);
        this.C.addUpdateListener(new j70(this, 3));
        this.C.addListener(new hg0(this, 0));
        this.C.start();
    }

    public final void z() {
        boolean y10;
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && this.U != null) {
            wf0 wf0Var = this.f27052r;
            if (wf0Var != null) {
                y10 = wf0Var.D;
            } else {
                i71 i71Var = photoViewer.C2;
                if (i71Var != null) {
                    y10 = i71Var.y();
                } else {
                    return;
                }
            }
            fg0 fg0Var = this.f27040b0;
            AndroidUtilities.cancelRunOnUIThread(fg0Var);
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
            AndroidUtilities.runOnUIThread(fg0Var, 500L);
        }
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
