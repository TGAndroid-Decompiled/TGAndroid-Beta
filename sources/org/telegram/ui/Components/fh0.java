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
public final class fh0 implements tf.a {
    public static final hw0 f24731n0 = new hw0(new n2(25), new n2(26));
    public static final hw0 f24732o0 = new hw0(new n2(27), new n2(28));
    public static final fh0 f24733p0 = new fh0();
    public boolean E;
    public ValueAnimator F;
    public m.h G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public lp0 R;
    public int S;
    public int T;
    public hv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f24735a0;
    public WindowManager f24736b;
    public bi.d4 f24737b0;
    public WindowManager.LayoutParams f24738c;
    public boolean f24739c0;
    public org.telegram.ui.f d;
    public boolean f24740d0;
    public eh0 e;
    public View f24742f;
    public boolean f24743f0;
    public eh0 h;
    public boolean f24746i0;
    public View f24748k0;
    public TextureView f24749l0;
    public boolean m0;
    public boolean f24750n;
    public rg0 f24751r;
    public ScaleGestureDetector f24752s;
    public ji.w4 v;
    public boolean f24753w;
    public boolean f24754x;
    public View f24755y;
    public float f24734a = 1.4f;
    public float J = 1.0f;
    public final a81 Q = new a81(false);
    public final ah0 f24741e0 = new ah0(this, 1);
    public float[] f24744g0 = new float[2];
    public final ah0 f24745h0 = new ah0(this, 2);
    public final ah0 f24747j0 = new ah0(this, 3);

    public static void j(boolean z10) {
        f24733p0.k(z10, false);
    }

    public static il0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        fh0 fh0Var = f24733p0;
        if (fh0Var.P && !z10) {
            obj.f25653a = fh0Var.K;
            obj.f25654b = fh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f25655c = fh0Var.H;
            obj.d = fh0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) fh0Var.n().f14848b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) fh0Var.n().f14848b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) fh0Var.n().f14848b).getFloat("scale_factor", 1.0f);
        obj.f25655c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f25655c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f25653a = dp;
        } else {
            obj.f25653a = (AndroidUtilities.displaySize.x - obj.f25655c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f25654b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f25654b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static rf.d p() {
        fh0 fh0Var = f24733p0;
        if (fh0Var != null) {
            return fh0Var.W;
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
        fh0 fh0Var = f24733p0;
        a81 a81Var = fh0Var.Q;
        a81Var.e(false);
        a81Var.d(!z10);
        a81Var.f(true);
        bi.d4 d4Var = fh0Var.f24737b0;
        if (d4Var != null) {
            d4Var.invalidate();
        }
        eh0 eh0Var = fh0Var.h;
        if (eh0Var != null) {
            eh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        fh0 fh0Var = f24733p0;
        fh0Var.V = photoViewer;
        i81 i81Var = photoViewer.F2;
        rf.d dVar = fh0Var.W;
        if (dVar != null) {
            dVar.c();
            fh0Var.W = null;
        }
        if (i81Var != null && uf.b.a(photoViewer.f32107y) == 1) {
            rf.c cVar = new rf.c(photoViewer.f32107y, fh0Var);
            cVar.f43925c = "photo-viewer-pip-" + i81Var.f25583a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f43929j = fh0Var.d;
            cVar.f43930k = fh0Var.f24748k0;
            int i10 = fh0Var.S;
            int i11 = fh0Var.T;
            cVar.h = i10;
            cVar.f43928i = i11;
            cVar.f43927g = i81Var.d;
            cVar.f43926f = true;
            fh0Var.W = cVar.a();
        }
        fh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.rg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fh0.x(boolean, android.app.Activity, org.telegram.ui.Components.rg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f24736b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        i81 i81Var;
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f24738c;
            int width = ((Rect) this.W.h.f13955a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f24738c;
            int height = ((Rect) this.W.h.f13955a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f24736b.addView(this.d, this.f24738c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            i81Var = photoViewer.F2;
        } else {
            i81Var = null;
        }
        if (i81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f24749l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f24749l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f32091w3) != null && textureView.isAvailable()) {
            return this.V.f32091w3.getBitmap();
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
        this.f24749l0 = textureView;
        textureView.setVisibility(4);
        this.f24749l0.setOpaque(false);
        this.f24749l0.setSurfaceTextureListener(new x50(this, 1));
        return this.f24749l0;
    }

    public final void i() {
        org.telegram.ui.qt0 qt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (qt0Var = photoViewer.f31914c4) == null) {
            return;
        }
        qt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f24739c0) {
            return;
        }
        this.f24739c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f24746i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f24747j0);
            this.f24746i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(es.f24465f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ch0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new ah0(this, 0), 100L);
        }
    }

    public final long l() {
        rg0 rg0Var = this.f24751r;
        if (rg0Var != null) {
            return rg0Var.getCurrentPosition();
        }
        i81 i81Var = this.V.F2;
        if (i81Var == null) {
            return 0L;
        }
        return i81Var.n();
    }

    public final long m() {
        rg0 rg0Var = this.f24751r;
        if (rg0Var != null) {
            return rg0Var.getVideoDuration();
        }
        i81 i81Var = this.V.F2;
        if (i81Var == null) {
            return 0L;
        }
        return i81Var.p();
    }

    public final m.h n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new m.h(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f24734a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            a81 a81Var = this.Q;
            a81Var.f23169q = f7;
            a81Var.a();
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
                this.f24736b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f24737b0 = null;
        this.f24742f = null;
        this.V = null;
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f24751r = null;
        this.U = null;
        this.f24755y = null;
        this.f24753w = false;
        this.P = false;
        this.f24739c0 = false;
        this.f24743f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f24745h0);
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
        duration.setInterpolator(es.f24465f);
        this.F.addUpdateListener(new f80(this, 4));
        this.F.addListener(new ch0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            rg0 rg0Var = this.f24751r;
            if (rg0Var != null) {
                y3 = rg0Var.G;
            } else {
                i81 i81Var = photoViewer.F2;
                if (i81Var != null) {
                    y3 = i81Var.y();
                } else {
                    return;
                }
            }
            ah0 ah0Var = this.f24741e0;
            AndroidUtilities.cancelRunOnUIThread(ah0Var);
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
            AndroidUtilities.runOnUIThread(ah0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
