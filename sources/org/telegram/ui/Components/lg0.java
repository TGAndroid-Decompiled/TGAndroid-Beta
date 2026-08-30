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
public final class lg0 implements ef.a {
    public static final iv0 f26656k0 = new iv0(new k2(26), new k2(27));
    public static final iv0 f26657l0 = new iv0(new k2(28), new k2(29));
    public static final lg0 m0 = new lg0();
    public boolean B;
    public ValueAnimator C;
    public com.google.firebase.messaging.t D;
    public int E;
    public int F;
    public float H;
    public float I;
    public o1.j J;
    public o1.j K;
    public Float L;
    public boolean M;
    public oo0 O;
    public int P;
    public int Q;
    public pu R;
    public PhotoViewer S;
    public cf.f T;
    public ImageView U;
    public boolean V;
    public float W;
    public float X;
    public nh.a3 Y;
    public boolean Z;
    public boolean f26659a0;
    public WindowManager f26660b;
    public WindowManager.LayoutParams f26662c;
    public boolean f26663c0;
    public org.telegram.ui.g d;
    public kg0 e;
    public View f26666f;
    public boolean f26667f0;
    public kg0 h;
    public View f26669h0;
    public TextureView f26670i0;
    public boolean f26671j0;
    public boolean f26672n;
    public vf0 f26673r;
    public ScaleGestureDetector f26674s;
    public ja.c v;
    public boolean f26675w;
    public boolean f26676x;
    public View f26677y;
    public float f26658a = 1.4f;
    public float G = 1.0f;
    public final y61 N = new y61(false);
    public final eg0 f26661b0 = new eg0(this, 1);
    public float[] f26664d0 = new float[2];
    public final eg0 f26665e0 = new eg0(this, 2);
    public final eg0 f26668g0 = new eg0(this, 3);

    public static void j(boolean z4) {
        m0.k(z4, false);
    }

    public static sk0 o(float f10, boolean z4) {
        float dp;
        ?? obj = new Object();
        float f11 = 1.0f / f10;
        lg0 lg0Var = m0;
        if (lg0Var.M && !z4) {
            obj.f28722a = lg0Var.H;
            obj.f28723b = lg0Var.I + AndroidUtilities.statusBarHeight;
            obj.f28724c = lg0Var.E;
            obj.d = lg0Var.F;
            return obj;
        }
        float f12 = lg0Var.n().f4033a.getFloat("x", -1.0f);
        float f13 = lg0Var.n().f4033a.getFloat("y", -1.0f);
        float f14 = lg0Var.n().f4033a.getFloat("scale_factor", 1.0f);
        obj.f28724c = s(f11) * f14;
        obj.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = obj.f28724c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            if (f16 >= f17 / 2.0f) {
                dp = (f17 - f15) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f28722a = dp;
        } else {
            obj.f28722a = (AndroidUtilities.displaySize.x - obj.f28724c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            obj.f28723b = k7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f28723b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static cf.f p() {
        lg0 lg0Var = m0;
        if (lg0Var != null) {
            return lg0Var.T;
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
        lg0 lg0Var = m0;
        y61 y61Var = lg0Var.N;
        y61Var.e(false);
        y61Var.d(!z4);
        y61Var.f(true);
        nh.a3 a3Var = lg0Var.Y;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        kg0 kg0Var = lg0Var.h;
        if (kg0Var != null) {
            kg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        lg0 lg0Var = m0;
        lg0Var.S = photoViewer;
        i71 i71Var = photoViewer.C2;
        cf.f fVar = lg0Var.T;
        if (fVar != null) {
            fVar.c();
            lg0Var.T = null;
        }
        if (i71Var != null && ff.d.a(photoViewer.f31913y) == 1) {
            cf.e eVar = new cf.e(photoViewer.f31913y, lg0Var);
            eVar.f2287c = "photo-viewer-pip-" + i71Var.f25601a;
            eVar.e = 1;
            eVar.d = AndroidUtilities.dp(10.0f);
            eVar.f2291j = lg0Var.d;
            eVar.f2292k = lg0Var.f26669h0;
            int i10 = lg0Var.P;
            int i11 = lg0Var.Q;
            eVar.h = i10;
            eVar.f2290i = i11;
            eVar.f2289g = i71Var.d;
            eVar.f2288f = true;
            lg0Var.T = eVar.a();
        }
        lg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.vf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg0.x(boolean, android.app.Activity, org.telegram.ui.Components.vf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(c2.p pVar) {
        i71 i71Var;
        cf.f fVar = this.T;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f26662c;
            int width = this.T.h.f6114a.width();
            this.E = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f26662c;
            int height = this.T.h.f6114a.height();
            this.F = height;
            layoutParams2.height = height;
        }
        this.f26660b.addView(this.d, this.f26662c);
        this.f26671j0 = false;
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
        TextureView textureView = this.f26670i0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f26670i0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && (textureView = photoViewer.f31870t3) != null && textureView.isAvailable()) {
            return this.S.f31870t3.getBitmap();
        }
        return null;
    }

    @Override
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && photoViewer.C2 != null) {
            photoViewer.M8 = pVar;
        }
        this.f26660b.removeView(this.d);
        this.f26671j0 = true;
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
        this.f26670i0 = textureView;
        textureView.setVisibility(4);
        this.f26670i0.setOpaque(false);
        this.f26670i0.setSurfaceTextureListener(new ih.h(this, 2));
        return this.f26670i0;
    }

    public final void i() {
        org.telegram.ui.ps0 ps0Var;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || (ps0Var = photoViewer.Z3) == null) {
            return;
        }
        ps0Var.cancelRewind();
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
        if (this.f26667f0) {
            AndroidUtilities.cancelRunOnUIThread(this.f26668g0);
            this.f26667f0 = false;
        }
        o1.j jVar = this.J;
        if (jVar != null) {
            jVar.c();
            this.K.c();
        }
        if (!z4 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(nr.f27346f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new gg0(this, 1));
            animatorSet.start();
        } else if (z10) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new eg0(this, 0), 100L);
        }
    }

    public final long l() {
        vf0 vf0Var = this.f26673r;
        if (vf0Var != null) {
            return vf0Var.getCurrentPosition();
        }
        i71 i71Var = this.S.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.n();
    }

    public final long m() {
        vf0 vf0Var = this.f26673r;
        if (vf0Var != null) {
            return vf0Var.getVideoDuration();
        }
        i71 i71Var = this.S.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.p();
    }

    public final com.google.firebase.messaging.t n() {
        if (this.D == null) {
            Point point = AndroidUtilities.displaySize;
            this.D = new com.google.firebase.messaging.t(point.x, point.y);
        }
        return this.D;
    }

    public final float q() {
        float f10;
        if (this.L == null) {
            this.L = Float.valueOf(this.Q / this.P);
            Point point = AndroidUtilities.displaySize;
            this.f26658a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.L.floatValue() < 1.0f) {
                f10 = 0.6f;
            } else {
                f10 = 0.45f;
            }
            y61 y61Var = this.N;
            y61Var.f30906q = f10;
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
                this.f26660b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.Y = null;
        this.f26666f = null;
        this.S = null;
        cf.f fVar = this.T;
        if (fVar != null) {
            fVar.c();
            this.T = null;
        }
        this.f26673r = null;
        this.R = null;
        this.f26677y = null;
        this.f26675w = false;
        this.M = false;
        this.Z = false;
        this.f26663c0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f26665e0);
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
        duration.setInterpolator(nr.f27346f);
        this.C.addUpdateListener(new i70(this, 3));
        this.C.addListener(new gg0(this, 0));
        this.C.start();
    }

    public final void z() {
        boolean y10;
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && this.U != null) {
            vf0 vf0Var = this.f26673r;
            if (vf0Var != null) {
                y10 = vf0Var.D;
            } else {
                i71 i71Var = photoViewer.C2;
                if (i71Var != null) {
                    y10 = i71Var.y();
                } else {
                    return;
                }
            }
            eg0 eg0Var = this.f26661b0;
            AndroidUtilities.cancelRunOnUIThread(eg0Var);
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
            AndroidUtilities.runOnUIThread(eg0Var, 500L);
        }
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
