package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class zg0 implements tf.a {
    public static final dw0 f32927n0 = new dw0(new k2(28), new k2(29));
    public static final dw0 f32928o0 = new dw0(new tg0(0), new tg0(1));
    public static final zg0 f32929p0 = new zg0();
    public boolean E;
    public ValueAnimator F;
    public k2.w0 G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public gp0 R;
    public int S;
    public int T;
    public cv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f32931a0;
    public WindowManager f32932b;
    public ci.i3 f32933b0;
    public WindowManager.LayoutParams f32934c;
    public boolean f32935c0;
    public org.telegram.ui.f d;
    public boolean f32936d0;
    public yg0 e;
    public View f32938f;
    public boolean f32939f0;
    public yg0 h;
    public boolean f32942i0;
    public View f32944k0;
    public TextureView f32945l0;
    public boolean m0;
    public boolean f32946n;
    public kg0 f32947r;
    public ScaleGestureDetector f32948s;
    public le.b v;
    public boolean f32949w;
    public boolean f32950x;
    public View f32951y;
    public float f32930a = 1.4f;
    public float J = 1.0f;
    public final s71 Q = new s71(false);
    public final ug0 f32937e0 = new ug0(this, 1);
    public float[] f32940g0 = new float[2];
    public final ug0 f32941h0 = new ug0(this, 2);
    public final ug0 f32943j0 = new ug0(this, 3);

    public static void j(boolean z10) {
        f32929p0.k(z10, false);
    }

    public static el0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        zg0 zg0Var = f32929p0;
        if (zg0Var.P && !z10) {
            obj.f25947a = zg0Var.K;
            obj.f25948b = zg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f25949c = zg0Var.H;
            obj.d = zg0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) zg0Var.n().f14832b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) zg0Var.n().f14832b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) zg0Var.n().f14832b).getFloat("scale_factor", 1.0f);
        obj.f25949c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f25949c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f25947a = dp;
        } else {
            obj.f25947a = (AndroidUtilities.displaySize.x - obj.f25949c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f25948b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f25948b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static rf.d p() {
        zg0 zg0Var = f32929p0;
        if (zg0Var != null) {
            return zg0Var.W;
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
        zg0 zg0Var = f32929p0;
        s71 s71Var = zg0Var.Q;
        s71Var.e(false);
        s71Var.d(!z10);
        s71Var.f(true);
        ci.i3 i3Var = zg0Var.f32933b0;
        if (i3Var != null) {
            i3Var.invalidate();
        }
        yg0 yg0Var = zg0Var.h;
        if (yg0Var != null) {
            yg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        zg0 zg0Var = f32929p0;
        zg0Var.V = photoViewer;
        b81 b81Var = photoViewer.F2;
        rf.d dVar = zg0Var.W;
        if (dVar != null) {
            dVar.c();
            zg0Var.W = null;
        }
        if (b81Var != null && uf.b.a(photoViewer.f33451y) == 1) {
            rf.c cVar = new rf.c(photoViewer.f33451y, zg0Var);
            cVar.f45253c = "photo-viewer-pip-" + b81Var.f24834a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f45257j = zg0Var.d;
            cVar.f45258k = zg0Var.f32944k0;
            int i10 = zg0Var.S;
            int i11 = zg0Var.T;
            cVar.h = i10;
            cVar.f45256i = i11;
            cVar.f45255g = b81Var.d;
            cVar.f45254f = true;
            zg0Var.W = cVar.a();
        }
        zg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.kg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg0.x(boolean, android.app.Activity, org.telegram.ui.Components.kg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f32932b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        b81 b81Var;
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f32934c;
            int width = ((Rect) this.W.h.f14766a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f32934c;
            int height = ((Rect) this.W.h.f14766a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f32932b.addView(this.d, this.f32934c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            b81Var = photoViewer.F2;
        } else {
            b81Var = null;
        }
        if (b81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f32945l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f32945l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33435w3) != null && textureView.isAvailable()) {
            return this.V.f33435w3.getBitmap();
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
        this.f32945l0 = textureView;
        textureView.setVisibility(4);
        this.f32945l0.setOpaque(false);
        this.f32945l0.setSurfaceTextureListener(new t50(this, 1));
        return this.f32945l0;
    }

    public final void i() {
        org.telegram.ui.qs0 qs0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (qs0Var = photoViewer.f33258c4) == null) {
            return;
        }
        qs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f32935c0) {
            return;
        }
        this.f32935c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f32942i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f32943j0);
            this.f32942i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(bs.f25014f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new wg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new ug0(this, 0), 100L);
        }
    }

    public final long l() {
        kg0 kg0Var = this.f32947r;
        if (kg0Var != null) {
            return kg0Var.getCurrentPosition();
        }
        b81 b81Var = this.V.F2;
        if (b81Var == null) {
            return 0L;
        }
        return b81Var.n();
    }

    public final long m() {
        kg0 kg0Var = this.f32947r;
        if (kg0Var != null) {
            return kg0Var.getVideoDuration();
        }
        b81 b81Var = this.V.F2;
        if (b81Var == null) {
            return 0L;
        }
        return b81Var.p();
    }

    public final k2.w0 n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new k2.w0(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f32930a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            s71 s71Var = this.Q;
            s71Var.f30209q = f7;
            s71Var.a();
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
                this.f32932b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f32933b0 = null;
        this.f32938f = null;
        this.V = null;
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f32947r = null;
        this.U = null;
        this.f32951y = null;
        this.f32949w = false;
        this.P = false;
        this.f32935c0 = false;
        this.f32939f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f32941h0);
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
        duration.setInterpolator(bs.f25014f);
        this.F.addUpdateListener(new b80(this, 4));
        this.F.addListener(new wg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            kg0 kg0Var = this.f32947r;
            if (kg0Var != null) {
                y3 = kg0Var.G;
            } else {
                b81 b81Var = photoViewer.F2;
                if (b81Var != null) {
                    y3 = b81Var.y();
                } else {
                    return;
                }
            }
            ug0 ug0Var = this.f32937e0;
            AndroidUtilities.cancelRunOnUIThread(ug0Var);
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
            AndroidUtilities.runOnUIThread(ug0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
