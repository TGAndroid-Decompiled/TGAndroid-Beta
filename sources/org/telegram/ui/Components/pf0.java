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
public final class pf0 implements ze.a {
    public static final pu0 f31620j0 = new pu0(new g2(27), new g2(28));
    public static final pu0 f31621k0 = new pu0(new g2(29), new if0(0));
    public static final pf0 f31622l0 = new pf0();
    public boolean A;
    public ValueAnimator B;
    public n5.e0 C;
    public int D;
    public int E;
    public float G;
    public float H;
    public o1.j I;
    public o1.j J;
    public Float K;
    public boolean L;
    public tn0 N;
    public int O;
    public int P;
    public gu Q;
    public PhotoViewer R;
    public xe.d S;
    public ImageView T;
    public boolean U;
    public float V;
    public float W;
    public ih.b3 X;
    public boolean Y;
    public boolean Z;
    public WindowManager f31625b;
    public boolean f31626b0;
    public WindowManager.LayoutParams f31627c;
    public org.telegram.ui.f d;
    public of0 f31630e;
    public boolean f31631e0;
    public View f31632f;
    public View f31634g0;
    public of0 h;
    public TextureView f31635h0;
    public boolean f31636i0;
    public boolean f31637n;
    public ze0 f31638r;
    public ScaleGestureDetector f31639s;
    public n5.e0 v;
    public boolean f31640w;
    public boolean f31641x;
    public View f31642y;
    public float f31623a = 1.4f;
    public float F = 1.0f;
    public final a61 M = new a61(false);
    public final jf0 f31624a0 = new jf0(this, 1);
    public float[] f31628c0 = new float[2];
    public final jf0 f31629d0 = new jf0(this, 2);
    public final jf0 f31633f0 = new jf0(this, 3);

    public static void j(boolean z10) {
        f31622l0.k(z10, false);
    }

    public static wj0 o(float f10, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f11 = 1.0f / f10;
        pf0 pf0Var = f31622l0;
        if (pf0Var.L && !z10) {
            obj.f34233a = pf0Var.G;
            obj.f34234b = pf0Var.H + AndroidUtilities.statusBarHeight;
            obj.f34235c = pf0Var.D;
            obj.d = pf0Var.E;
            return obj;
        }
        float f12 = ((SharedPreferences) pf0Var.n().f18488b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) pf0Var.n().f18488b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) pf0Var.n().f18488b).getFloat("scale_factor", 1.0f);
        obj.f34235c = s(f11) * f14;
        obj.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = obj.f34235c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            if (f16 >= f17 / 2.0f) {
                dp = (f17 - f15) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f34233a = dp;
        } else {
            obj.f34233a = (AndroidUtilities.displaySize.x - obj.f34235c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            obj.f34234b = g7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f34234b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static xe.d p() {
        pf0 pf0Var = f31622l0;
        if (pf0Var != null) {
            return pf0Var.S;
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

    public static void v(boolean z10) {
        pf0 pf0Var = f31622l0;
        a61 a61Var = pf0Var.M;
        a61Var.e(false);
        a61Var.d(!z10);
        a61Var.f(true);
        ih.b3 b3Var = pf0Var.X;
        if (b3Var != null) {
            b3Var.invalidate();
        }
        of0 of0Var = pf0Var.h;
        if (of0Var != null) {
            of0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        pf0 pf0Var = f31622l0;
        pf0Var.R = photoViewer;
        k61 k61Var = photoViewer.B2;
        xe.d dVar = pf0Var.S;
        if (dVar != null) {
            dVar.c();
            pf0Var.S = null;
        }
        if (k61Var != null && af.d.a(photoViewer.f35797y) == 1) {
            xe.c cVar = new xe.c(photoViewer.f35797y, pf0Var);
            cVar.f49135c = "photo-viewer-pip-" + k61Var.f29998a;
            cVar.f49136e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f49140j = pf0Var.d;
            cVar.f49141k = pf0Var.f31634g0;
            int i9 = pf0Var.O;
            int i10 = pf0Var.P;
            cVar.h = i9;
            cVar.f49139i = i10;
            cVar.f49138g = k61Var.d;
            cVar.f49137f = true;
            pf0Var.S = cVar.a();
        }
        pf0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.ze0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pf0.x(boolean, android.app.Activity, org.telegram.ui.Components.ze0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final Bitmap a() {
        TextureView textureView = this.f31635h0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f31635h0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView;
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && (textureView = photoViewer.f35746s3) != null && textureView.isAvailable()) {
            return this.R.f35746s3.getBitmap();
        }
        return null;
    }

    @Override
    public final void e(af.f fVar) {
        k61 k61Var;
        xe.d dVar = this.S;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f31627c;
            int width = this.S.h.f153a.width();
            this.D = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f31627c;
            int height = this.S.h.f153a.height();
            this.E = height;
            layoutParams2.height = height;
        }
        this.f31625b.addView(this.d, this.f31627c);
        this.f31636i0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null) {
            k61Var = photoViewer.B2;
        } else {
            k61Var = null;
        }
        if (k61Var == null) {
            return;
        }
        photoViewer.L8 = fVar;
    }

    @Override
    public final boolean f() {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(af.f fVar) {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.B2 != null) {
            photoViewer.L8 = fVar;
        }
        this.f31625b.removeView(this.d);
        this.f31636i0 = true;
        this.d.invalidate();
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.f31635h0 = textureView;
        textureView.setVisibility(4);
        this.f31635h0.setOpaque(false);
        this.f31635h0.setSurfaceTextureListener(new dh.i(this, 2));
        return this.f31635h0;
    }

    public final void i() {
        org.telegram.ui.hs0 hs0Var;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (hs0Var = photoViewer.Y3) == null) {
            return;
        }
        hs0Var.cancelRewind();
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
        if (this.f31631e0) {
            AndroidUtilities.cancelRunOnUIThread(this.f31633f0);
            this.f31631e0 = false;
        }
        o1.j jVar = this.I;
        if (jVar != null) {
            jVar.c();
            this.J.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f28844f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new lf0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new jf0(this, 0), 100L);
        }
    }

    public final long l() {
        ze0 ze0Var = this.f31638r;
        if (ze0Var != null) {
            return ze0Var.getCurrentPosition();
        }
        k61 k61Var = this.R.B2;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.o();
    }

    public final long m() {
        ze0 ze0Var = this.f31638r;
        if (ze0Var != null) {
            return ze0Var.getVideoDuration();
        }
        k61 k61Var = this.R.B2;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.q();
    }

    public final n5.e0 n() {
        if (this.C == null) {
            Point point = AndroidUtilities.displaySize;
            this.C = new n5.e0(point.x, point.y);
        }
        return this.C;
    }

    public final float q() {
        float f10;
        if (this.K == null) {
            this.K = Float.valueOf(this.P / this.O);
            Point point = AndroidUtilities.displaySize;
            this.f31623a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.K.floatValue() < 1.0f) {
                f10 = 0.6f;
            } else {
                f10 = 0.45f;
            }
            a61 a61Var = this.M;
            a61Var.f26709q = f10;
            a61Var.a();
        }
        return this.K.floatValue();
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
            org.telegram.ui.f fVar = this.d;
            if (fVar != null && fVar.getParent() != null) {
                this.f31625b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.X = null;
        this.f31632f = null;
        this.R = null;
        xe.d dVar = this.S;
        if (dVar != null) {
            dVar.c();
            this.S = null;
        }
        this.f31638r = null;
        this.Q = null;
        this.f31642y = null;
        this.f31640w = false;
        this.L = false;
        this.Y = false;
        this.f31626b0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f31629d0);
    }

    public final void y(boolean z10) {
        float f10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.B = duration;
        duration.setInterpolator(gr.f28844f);
        this.B.addUpdateListener(new q60(this, 3));
        this.B.addListener(new lf0(this, 0));
        this.B.start();
    }

    public final void z() {
        boolean z10;
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && this.T != null) {
            ze0 ze0Var = this.f31638r;
            if (ze0Var != null) {
                z10 = ze0Var.C;
            } else {
                k61 k61Var = photoViewer.B2;
                if (k61Var != null) {
                    z10 = k61Var.z();
                } else {
                    return;
                }
            }
            jf0 jf0Var = this.f31624a0;
            AndroidUtilities.cancelRunOnUIThread(jf0Var);
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
            AndroidUtilities.runOnUIThread(jf0Var, 500L);
        }
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void d(Canvas canvas) {
    }
}
