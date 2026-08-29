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
public final class bg0 implements cf.a {
    public static final av0 f27074j0 = new av0(new r2(21), new r2(22));
    public static final av0 f27075k0 = new av0(new r2(23), new r2(24));
    public static final bg0 f27076l0 = new bg0();
    public boolean A;
    public ValueAnimator B;
    public com.google.firebase.messaging.u C;
    public int D;
    public int E;
    public float G;
    public float H;
    public o1.k I;
    public o1.k J;
    public Float K;
    public boolean L;
    public eo0 N;
    public int O;
    public int P;
    public mu Q;
    public PhotoViewer R;
    public af.g S;
    public ImageView T;
    public boolean U;
    public float V;
    public float W;
    public lh.z2 X;
    public boolean Y;
    public boolean Z;
    public WindowManager f27079b;
    public boolean f27080b0;
    public WindowManager.LayoutParams f27081c;
    public org.telegram.ui.g d;
    public ag0 f27084e;
    public boolean f27085e0;
    public View f27086f;
    public View f27088g0;
    public ag0 h;
    public TextureView f27089h0;
    public boolean f27090i0;
    public boolean f27091n;
    public mf0 f27092r;
    public ScaleGestureDetector f27093s;
    public o4.g v;
    public boolean f27094w;
    public boolean f27095x;
    public View f27096y;
    public float f27077a = 1.4f;
    public float F = 1.0f;
    public final n61 M = new n61(false);
    public final vf0 f27078a0 = new vf0(this, 1);
    public float[] f27082c0 = new float[2];
    public final vf0 f27083d0 = new vf0(this, 2);
    public final vf0 f27087f0 = new vf0(this, 3);

    public static void j(boolean z10) {
        f27076l0.k(z10, false);
    }

    public static hk0 o(float f9, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f9;
        bg0 bg0Var = f27076l0;
        if (bg0Var.L && !z10) {
            obj.f29195a = bg0Var.G;
            obj.f29196b = bg0Var.H + AndroidUtilities.statusBarHeight;
            obj.f29197c = bg0Var.D;
            obj.d = bg0Var.E;
            return obj;
        }
        float f11 = bg0Var.n().f5191a.getFloat("x", -1.0f);
        float f12 = bg0Var.n().f5191a.getFloat("y", -1.0f);
        float f13 = bg0Var.n().f5191a.getFloat("scale_factor", 1.0f);
        obj.f29197c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29197c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f29195a = dp;
        } else {
            obj.f29195a = (AndroidUtilities.displaySize.x - obj.f29197c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29196b = i7.w.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f29196b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static af.g p() {
        bg0 bg0Var = f27076l0;
        if (bg0Var != null) {
            return bg0Var.S;
        }
        return null;
    }

    public static int s(float f9) {
        float min;
        float f10;
        if (f9 >= 1.0f) {
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
        bg0 bg0Var = f27076l0;
        n61 n61Var = bg0Var.M;
        n61Var.e(false);
        n61Var.d(!z10);
        n61Var.f(true);
        lh.z2 z2Var = bg0Var.X;
        if (z2Var != null) {
            z2Var.invalidate();
        }
        ag0 ag0Var = bg0Var.h;
        if (ag0Var != null) {
            ag0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        bg0 bg0Var = f27076l0;
        bg0Var.R = photoViewer;
        x61 x61Var = photoViewer.B2;
        af.g gVar = bg0Var.S;
        if (gVar != null) {
            gVar.c();
            bg0Var.S = null;
        }
        if (x61Var != null && df.d.a(photoViewer.f35864y) == 1) {
            af.f fVar = new af.f(photoViewer.f35864y, bg0Var);
            fVar.f388c = "photo-viewer-pip-" + x61Var.f34628a;
            fVar.f389e = 1;
            fVar.d = AndroidUtilities.dp(10.0f);
            fVar.f393j = bg0Var.d;
            fVar.f394k = bg0Var.f27088g0;
            int i10 = bg0Var.O;
            int i11 = bg0Var.P;
            fVar.h = i10;
            fVar.f392i = i11;
            fVar.f391g = x61Var.d;
            fVar.f390f = true;
            bg0Var.S = fVar.a();
        }
        bg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.mf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg0.x(boolean, android.app.Activity, org.telegram.ui.Components.mf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(c2.p pVar) {
        x61 x61Var;
        af.g gVar = this.S;
        if (gVar != null && gVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27081c;
            int width = this.S.h.f5546a.width();
            this.D = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27081c;
            int height = this.S.h.f5546a.height();
            this.E = height;
            layoutParams2.height = height;
        }
        this.f27079b.addView(this.d, this.f27081c);
        this.f27090i0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null) {
            x61Var = photoViewer.B2;
        } else {
            x61Var = null;
        }
        if (x61Var == null) {
            return;
        }
        photoViewer.L8 = pVar;
    }

    @Override
    public final Bitmap b() {
        TextureView textureView = this.f27089h0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27089h0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && (textureView = photoViewer.f35812s3) != null && textureView.isAvailable()) {
            return this.R.f35812s3.getBitmap();
        }
        return null;
    }

    @Override
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.B2 != null) {
            photoViewer.L8 = pVar;
        }
        this.f27079b.removeView(this.d);
        this.f27090i0 = true;
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.f27089h0 = textureView;
        textureView.setVisibility(4);
        this.f27089h0.setOpaque(false);
        this.f27089h0.setSurfaceTextureListener(new gh.h(this, 2));
        return this.f27089h0;
    }

    public final void i() {
        org.telegram.ui.gs0 gs0Var;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (gs0Var = photoViewer.Y3) == null) {
            return;
        }
        gs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27085e0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27087f0);
            this.f27085e0 = false;
        }
        o1.k kVar = this.I;
        if (kVar != null) {
            kVar.c();
            this.J.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(jr.f29800f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new xf0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new vf0(this, 0), 100L);
        }
    }

    public final long l() {
        mf0 mf0Var = this.f27092r;
        if (mf0Var != null) {
            return mf0Var.getCurrentPosition();
        }
        x61 x61Var = this.R.B2;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.o();
    }

    public final long m() {
        mf0 mf0Var = this.f27092r;
        if (mf0Var != null) {
            return mf0Var.getVideoDuration();
        }
        x61 x61Var = this.R.B2;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.q();
    }

    public final com.google.firebase.messaging.u n() {
        if (this.C == null) {
            Point point = AndroidUtilities.displaySize;
            this.C = new com.google.firebase.messaging.u(point.x, point.y);
        }
        return this.C;
    }

    public final float q() {
        float f9;
        if (this.K == null) {
            this.K = Float.valueOf(this.P / this.O);
            Point point = AndroidUtilities.displaySize;
            this.f27077a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.K.floatValue() < 1.0f) {
                f9 = 0.6f;
            } else {
                f9 = 0.45f;
            }
            n61 n61Var = this.M;
            n61Var.f30917q = f9;
            n61Var.a();
        }
        return this.K.floatValue();
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
            org.telegram.ui.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.f27079b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.X = null;
        this.f27086f = null;
        this.R = null;
        af.g gVar2 = this.S;
        if (gVar2 != null) {
            gVar2.c();
            this.S = null;
        }
        this.f27092r = null;
        this.Q = null;
        this.f27096y = null;
        this.f27094w = false;
        this.L = false;
        this.Y = false;
        this.f27080b0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27083d0);
    }

    public final void y(boolean z10) {
        float f9;
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f10).setDuration(200L);
        this.B = duration;
        duration.setInterpolator(jr.f29800f);
        this.B.addUpdateListener(new d70(this, 3));
        this.B.addListener(new xf0(this, 0));
        this.B.start();
    }

    public final void z() {
        boolean z10;
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && this.T != null) {
            mf0 mf0Var = this.f27092r;
            if (mf0Var != null) {
                z10 = mf0Var.C;
            } else {
                x61 x61Var = photoViewer.B2;
                if (x61Var != null) {
                    z10 = x61Var.z();
                } else {
                    return;
                }
            }
            vf0 vf0Var = this.f27078a0;
            AndroidUtilities.cancelRunOnUIThread(vf0Var);
            if (!z10) {
                if (this.U) {
                    this.T.setImageResource(R.drawable.pip_replay_large);
                    return;
                } else {
                    this.T.setImageResource(R.drawable.pip_play_large);
                    return;
                }
            }
            this.T.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(vf0Var, 500L);
        }
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
