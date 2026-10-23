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
public final class dh0 implements tf.a {
    public static final hw0 f25629n0 = new hw0(new ud0(4), new ud0(5));
    public static final hw0 f25630o0 = new hw0(new ud0(6), new ud0(7));
    public static final dh0 f25631p0 = new dh0();
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
    public lp0 R;
    public int S;
    public int T;
    public cv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f25633a0;
    public WindowManager f25634b;
    public ci.h3 f25635b0;
    public WindowManager.LayoutParams f25636c;
    public boolean f25637c0;
    public org.telegram.ui.e d;
    public boolean f25638d0;
    public ch0 e;
    public View f25640f;
    public boolean f25641f0;
    public ch0 h;
    public boolean f25644i0;
    public View f25646k0;
    public TextureView f25647l0;
    public boolean m0;
    public boolean f25648n;
    public pg0 f25649r;
    public ScaleGestureDetector f25650s;
    public le.b v;
    public boolean f25651w;
    public boolean f25652x;
    public View f25653y;
    public float f25632a = 1.4f;
    public float J = 1.0f;
    public final b81 Q = new b81(false);
    public final yg0 f25639e0 = new yg0(this, 1);
    public float[] f25642g0 = new float[2];
    public final yg0 f25643h0 = new yg0(this, 2);
    public final yg0 f25645j0 = new yg0(this, 3);

    public static void j(boolean z10) {
        f25631p0.k(z10, false);
    }

    public static il0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        dh0 dh0Var = f25631p0;
        if (dh0Var.P && !z10) {
            obj.f27364a = dh0Var.K;
            obj.f27365b = dh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f27366c = dh0Var.H;
            obj.d = dh0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) dh0Var.n().f14874b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) dh0Var.n().f14874b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) dh0Var.n().f14874b).getFloat("scale_factor", 1.0f);
        obj.f27366c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f27366c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f27364a = dp;
        } else {
            obj.f27364a = (AndroidUtilities.displaySize.x - obj.f27366c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f27365b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f27365b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static rf.d p() {
        dh0 dh0Var = f25631p0;
        if (dh0Var != null) {
            return dh0Var.W;
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
        dh0 dh0Var = f25631p0;
        b81 b81Var = dh0Var.Q;
        b81Var.e(false);
        b81Var.d(!z10);
        b81Var.f(true);
        ci.h3 h3Var = dh0Var.f25635b0;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        ch0 ch0Var = dh0Var.h;
        if (ch0Var != null) {
            ch0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        dh0 dh0Var = f25631p0;
        dh0Var.V = photoViewer;
        j81 j81Var = photoViewer.F2;
        rf.d dVar = dh0Var.W;
        if (dVar != null) {
            dVar.c();
            dh0Var.W = null;
        }
        if (j81Var != null && uf.b.a(photoViewer.f33759y) == 1) {
            rf.c cVar = new rf.c(photoViewer.f33759y, dh0Var);
            cVar.f45679c = "photo-viewer-pip-" + j81Var.f27590a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f45683j = dh0Var.d;
            cVar.f45684k = dh0Var.f25646k0;
            int i10 = dh0Var.S;
            int i11 = dh0Var.T;
            cVar.h = i10;
            cVar.f45682i = i11;
            cVar.f45681g = j81Var.d;
            cVar.f45680f = true;
            dh0Var.W = cVar.a();
        }
        dh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.pg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dh0.x(boolean, android.app.Activity, org.telegram.ui.Components.pg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f25634b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        j81 j81Var;
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f25636c;
            int width = ((Rect) this.W.h.f14802a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f25636c;
            int height = ((Rect) this.W.h.f14802a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f25634b.addView(this.d, this.f25636c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            j81Var = photoViewer.F2;
        } else {
            j81Var = null;
        }
        if (j81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f25647l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f25647l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33743w3) != null && textureView.isAvailable()) {
            return this.V.f33743w3.getBitmap();
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
        this.f25647l0 = textureView;
        textureView.setVisibility(4);
        this.f25647l0.setOpaque(false);
        this.f25647l0.setSurfaceTextureListener(new t50(this, 1));
        return this.f25647l0;
    }

    public final void i() {
        org.telegram.ui.ts0 ts0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ts0Var = photoViewer.f33566c4) == null) {
            return;
        }
        ts0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f25637c0) {
            return;
        }
        this.f25637c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f25644i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f25645j0);
            this.f25644i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(bs.f25133f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ah0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new yg0(this, 0), 100L);
        }
    }

    public final long l() {
        pg0 pg0Var = this.f25649r;
        if (pg0Var != null) {
            return pg0Var.getCurrentPosition();
        }
        j81 j81Var = this.V.F2;
        if (j81Var == null) {
            return 0L;
        }
        return j81Var.n();
    }

    public final long m() {
        pg0 pg0Var = this.f25649r;
        if (pg0Var != null) {
            return pg0Var.getVideoDuration();
        }
        j81 j81Var = this.V.F2;
        if (j81Var == null) {
            return 0L;
        }
        return j81Var.p();
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
            this.f25632a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            b81 b81Var = this.Q;
            b81Var.f24995q = f7;
            b81Var.a();
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
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
                this.f25634b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f25635b0 = null;
        this.f25640f = null;
        this.V = null;
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f25649r = null;
        this.U = null;
        this.f25653y = null;
        this.f25651w = false;
        this.P = false;
        this.f25637c0 = false;
        this.f25641f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f25643h0);
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
        duration.setInterpolator(bs.f25133f);
        this.F.addUpdateListener(new d80(this, 4));
        this.F.addListener(new ah0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            pg0 pg0Var = this.f25649r;
            if (pg0Var != null) {
                y3 = pg0Var.G;
            } else {
                j81 j81Var = photoViewer.F2;
                if (j81Var != null) {
                    y3 = j81Var.y();
                } else {
                    return;
                }
            }
            yg0 yg0Var = this.f25639e0;
            AndroidUtilities.cancelRunOnUIThread(yg0Var);
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
            AndroidUtilities.runOnUIThread(yg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
