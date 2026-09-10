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
public final class og0 implements rf.a {
    public static final sv0 f25779n0 = new sv0(new q2(23), new q2(24));
    public static final sv0 f25780o0 = new sv0(new q2(25), new q2(26));
    public static final og0 f25781p0 = new og0();
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
    public to0 R;
    public int S;
    public int T;
    public zu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f25783a0;
    public WindowManager f25784b;
    public org.telegram.ui.u7 f25785b0;
    public WindowManager.LayoutParams f25786c;
    public boolean f25787c0;
    public org.telegram.ui.f d;
    public boolean f25788d0;
    public ng0 e;
    public View f25790f;
    public boolean f25791f0;
    public ng0 h;
    public boolean f25794i0;
    public View f25796k0;
    public TextureView f25797l0;
    public boolean m0;
    public boolean f25798n;
    public zf0 f25799r;
    public ScaleGestureDetector f25800s;
    public l2.g v;
    public boolean f25801w;
    public boolean f25802x;
    public View f25803y;
    public float f25782a = 1.4f;
    public float J = 1.0f;
    public final j71 Q = new j71(false);
    public final ig0 f25789e0 = new ig0(this, 1);
    public float[] f25792g0 = new float[2];
    public final ig0 f25793h0 = new ig0(this, 2);
    public final ig0 f25795j0 = new ig0(this, 3);

    public static void j(boolean z10) {
        f25781p0.k(z10, false);
    }

    public static rk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        og0 og0Var = f25781p0;
        if (og0Var.P && !z10) {
            obj.f26681a = og0Var.K;
            obj.f26682b = og0Var.L + AndroidUtilities.statusBarHeight;
            obj.f26683c = og0Var.H;
            obj.d = og0Var.I;
            return obj;
        }
        float f11 = og0Var.n().f6123a.getFloat("x", -1.0f);
        float f12 = og0Var.n().f6123a.getFloat("y", -1.0f);
        float f13 = og0Var.n().f6123a.getFloat("scale_factor", 1.0f);
        obj.f26683c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f26683c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f26681a = dp;
        } else {
            obj.f26681a = (AndroidUtilities.displaySize.x - obj.f26683c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f26682b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f26682b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        og0 og0Var = f25781p0;
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
        og0 og0Var = f25781p0;
        j71 j71Var = og0Var.Q;
        j71Var.e(false);
        j71Var.d(!z10);
        j71Var.f(true);
        org.telegram.ui.u7 u7Var = og0Var.f25785b0;
        if (u7Var != null) {
            u7Var.invalidate();
        }
        ng0 ng0Var = og0Var.h;
        if (ng0Var != null) {
            ng0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        og0 og0Var = f25781p0;
        og0Var.V = photoViewer;
        t71 t71Var = photoViewer.F2;
        pf.e eVar = og0Var.W;
        if (eVar != null) {
            eVar.c();
            og0Var.W = null;
        }
        if (t71Var != null && sf.c.a(photoViewer.f30227y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f30227y, og0Var);
            dVar.f39911c = "photo-viewer-pip-" + t71Var.f27361a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f39915j = og0Var.d;
            dVar.f39916k = og0Var.f25796k0;
            int i10 = og0Var.S;
            int i11 = og0Var.T;
            dVar.h = i10;
            dVar.f39914i = i11;
            dVar.f39913g = t71Var.d;
            dVar.f39912f = true;
            og0Var.W = dVar.a();
        }
        og0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.zf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.x(boolean, android.app.Activity, org.telegram.ui.Components.zf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.P8 = pVar;
        }
        this.f25784b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        t71 t71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f25786c;
            int width = this.W.h.f41839a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f25786c;
            int height = this.W.h.f41839a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f25784b.addView(this.d, this.f25786c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            t71Var = photoViewer.F2;
        } else {
            t71Var = null;
        }
        if (t71Var == null) {
            return;
        }
        photoViewer.P8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f25797l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f25797l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f30211w3) != null && textureView.isAvailable()) {
            return this.V.f30211w3.getBitmap();
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
        this.f25797l0 = textureView;
        textureView.setVisibility(4);
        this.f25797l0.setOpaque(false);
        this.f25797l0.setSurfaceTextureListener(new t50(this, 1));
        return this.f25797l0;
    }

    public final void i() {
        org.telegram.ui.jt0 jt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (jt0Var = photoViewer.f30035c4) == null) {
            return;
        }
        jt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f25787c0) {
            return;
        }
        this.f25787c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f25794i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f25795j0);
            this.f25794i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(wr.f28819f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new kg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new ig0(this, 0), 100L);
        }
    }

    public final long l() {
        zf0 zf0Var = this.f25799r;
        if (zf0Var != null) {
            return zf0Var.getCurrentPosition();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.n();
    }

    public final long m() {
        zf0 zf0Var = this.f25799r;
        if (zf0Var != null) {
            return zf0Var.getVideoDuration();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
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
            this.f25782a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            j71 j71Var = this.Q;
            j71Var.f24275q = f7;
            j71Var.a();
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
                this.f25784b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f25785b0 = null;
        this.f25790f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f25799r = null;
        this.U = null;
        this.f25803y = null;
        this.f25801w = false;
        this.P = false;
        this.f25787c0 = false;
        this.f25791f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f25793h0);
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
        duration.setInterpolator(wr.f28819f);
        this.F.addUpdateListener(new q70(this, 3));
        this.F.addListener(new kg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            zf0 zf0Var = this.f25799r;
            if (zf0Var != null) {
                y3 = zf0Var.G;
            } else {
                t71 t71Var = photoViewer.F2;
                if (t71Var != null) {
                    y3 = t71Var.y();
                } else {
                    return;
                }
            }
            ig0 ig0Var = this.f25789e0;
            AndroidUtilities.cancelRunOnUIThread(ig0Var);
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
            AndroidUtilities.runOnUIThread(ig0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
