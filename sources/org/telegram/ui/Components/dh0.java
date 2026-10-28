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
public final class dh0 implements uf.a {
    public static final qw0 f27442n0 = new qw0(new rd0(7), new rd0(8));
    public static final qw0 f27443o0 = new qw0(new rd0(9), new rd0(10));
    public static final dh0 f27444p0 = new dh0();
    public boolean E;
    public ValueAnimator F;
    public li.e3 G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.j M;
    public o1.j N;
    public Float O;
    public boolean P;
    public rp0 R;
    public int S;
    public int T;
    public dv U;
    public PhotoViewer V;
    public sf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27446a0;
    public WindowManager f27447b;
    public di.h3 f27448b0;
    public WindowManager.LayoutParams f27449c;
    public boolean f27450c0;
    public org.telegram.ui.e d;
    public boolean f27451d0;
    public ch0 e;
    public View f27453f;
    public boolean f27454f0;
    public ch0 h;
    public boolean f27457i0;
    public View f27459k0;
    public TextureView f27460l0;
    public boolean m0;
    public boolean f27461n;
    public ng0 f27462r;
    public ScaleGestureDetector f27463s;
    public jg.i v;
    public boolean f27464w;
    public boolean f27465x;
    public View f27466y;
    public float f27445a = 1.4f;
    public float J = 1.0f;
    public final k81 Q = new k81(false);
    public final yg0 f27452e0 = new yg0(this, 1);
    public float[] f27455g0 = new float[2];
    public final yg0 f27456h0 = new yg0(this, 2);
    public final yg0 f27458j0 = new yg0(this, 3);

    public static void j(boolean z10) {
        f27444p0.k(z10, false);
    }

    public static il0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        dh0 dh0Var = f27444p0;
        if (dh0Var.P && !z10) {
            obj.f29381a = dh0Var.K;
            obj.f29382b = dh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f29383c = dh0Var.H;
            obj.d = dh0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) dh0Var.n().f17209b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) dh0Var.n().f17209b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) dh0Var.n().f17209b).getFloat("scale_factor", 1.0f);
        obj.f29383c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29383c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f29381a = dp;
        } else {
            obj.f29381a = (AndroidUtilities.displaySize.x - obj.f29383c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29382b = a8.ee.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f29382b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static sf.d p() {
        dh0 dh0Var = f27444p0;
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
        dh0 dh0Var = f27444p0;
        k81 k81Var = dh0Var.Q;
        k81Var.e(false);
        k81Var.d(!z10);
        k81Var.f(true);
        di.h3 h3Var = dh0Var.f27448b0;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        ch0 ch0Var = dh0Var.h;
        if (ch0Var != null) {
            ch0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        dh0 dh0Var = f27444p0;
        dh0Var.V = photoViewer;
        t81 t81Var = photoViewer.F2;
        sf.d dVar = dh0Var.W;
        if (dVar != null) {
            dVar.c();
            dh0Var.W = null;
        }
        if (t81Var != null && vf.b.a(photoViewer.f35849y) == 1) {
            sf.c cVar = new sf.c(photoViewer.f35849y, dh0Var);
            cVar.f48158c = "photo-viewer-pip-" + t81Var.f32884a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f48162j = dh0Var.d;
            cVar.f48163k = dh0Var.f27459k0;
            int i10 = dh0Var.S;
            int i11 = dh0Var.T;
            cVar.h = i10;
            cVar.f48161i = i11;
            cVar.f48160g = t81Var.d;
            cVar.f48159f = true;
            dh0Var.W = cVar.a();
        }
        dh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ng0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dh0.x(boolean, android.app.Activity, org.telegram.ui.Components.ng0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(a8.fg fgVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = fgVar;
        }
        this.f27447b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(a8.fg fgVar) {
        t81 t81Var;
        sf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f27449c;
            int width = ((Rect) this.W.h.f16246a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27449c;
            int height = ((Rect) this.W.h.f16246a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27447b.addView(this.d, this.f27449c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            t81Var = photoViewer.F2;
        } else {
            t81Var = null;
        }
        if (t81Var == null) {
            return;
        }
        photoViewer.Q8 = fgVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27460l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27460l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f35833w3) != null && textureView.isAvailable()) {
            return this.V.f35833w3.getBitmap();
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
        this.f27460l0 = textureView;
        textureView.setVisibility(4);
        this.f27460l0.setOpaque(false);
        this.f27460l0.setSurfaceTextureListener(new v50(this, 1));
        return this.f27460l0;
    }

    public final void i() {
        org.telegram.ui.zs0 zs0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (zs0Var = photoViewer.f35656c4) == null) {
            return;
        }
        zs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27450c0) {
            return;
        }
        this.f27450c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27457i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27458j0);
            this.f27457i0 = false;
        }
        o1.j jVar = this.M;
        if (jVar != null) {
            jVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ds.f27530f);
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
        ng0 ng0Var = this.f27462r;
        if (ng0Var != null) {
            return ng0Var.getCurrentPosition();
        }
        t81 t81Var = this.V.F2;
        if (t81Var == null) {
            return 0L;
        }
        return t81Var.n();
    }

    public final long m() {
        ng0 ng0Var = this.f27462r;
        if (ng0Var != null) {
            return ng0Var.getVideoDuration();
        }
        t81 t81Var = this.V.F2;
        if (t81Var == null) {
            return 0L;
        }
        return t81Var.p();
    }

    public final li.e3 n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new li.e3(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f27445a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            k81 k81Var = this.Q;
            k81Var.f29900q = f7;
            k81Var.a();
        }
        return this.O.floatValue();
    }

    public final int r() {
        float q5 = q();
        return (int) (s(q5) * q5);
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
                this.f27447b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27448b0 = null;
        this.f27453f = null;
        this.V = null;
        sf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f27462r = null;
        this.U = null;
        this.f27466y = null;
        this.f27464w = false;
        this.P = false;
        this.f27450c0 = false;
        this.f27454f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27456h0);
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
        duration.setInterpolator(ds.f27530f);
        this.F.addUpdateListener(new f80(this, 4));
        this.F.addListener(new ah0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            ng0 ng0Var = this.f27462r;
            if (ng0Var != null) {
                y3 = ng0Var.G;
            } else {
                t81 t81Var = photoViewer.F2;
                if (t81Var != null) {
                    y3 = t81Var.y();
                } else {
                    return;
                }
            }
            yg0 yg0Var = this.f27452e0;
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
