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
public final class gh0 implements sf.a {
    public static final lw0 f26698n0 = new lw0(new fe0(2), new fe0(3));
    public static final lw0 f26699o0 = new lw0(new fe0(4), new fe0(5));
    public static final gh0 f26700p0 = new gh0();
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
    public pp0 R;
    public int S;
    public int T;
    public lv U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f26702a0;
    public WindowManager f26703b;
    public ai.o4 f26704b0;
    public WindowManager.LayoutParams f26705c;
    public boolean f26706c0;
    public org.telegram.ui.f d;
    public boolean f26707d0;
    public fh0 f26708e;
    public View f26710f;
    public boolean f26711f0;
    public fh0 h;
    public boolean f26714i0;
    public View f26716k0;
    public TextureView f26717l0;
    public boolean m0;
    public boolean f26718n;
    public sg0 f26719r;
    public ScaleGestureDetector f26720s;
    public k2.g0 v;
    public boolean f26721w;
    public boolean f26722x;
    public View f26723y;
    public float f26701a = 1.4f;
    public float J = 1.0f;
    public final b81 Q = new b81(false);
    public final bh0 f26709e0 = new bh0(this, 1);
    public float[] f26712g0 = new float[2];
    public final bh0 f26713h0 = new bh0(this, 2);
    public final bh0 f26715j0 = new bh0(this, 3);

    public static void j(boolean z10) {
        f26700p0.k(z10, false);
    }

    public static ml0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        gh0 gh0Var = f26700p0;
        if (gh0Var.P && !z10) {
            obj.f28854a = gh0Var.K;
            obj.f28855b = gh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f28856c = gh0Var.H;
            obj.d = gh0Var.I;
            return obj;
        }
        float f11 = gh0Var.n().f7977a.getFloat("x", -1.0f);
        float f12 = gh0Var.n().f7977a.getFloat("y", -1.0f);
        float f13 = gh0Var.n().f7977a.getFloat("scale_factor", 1.0f);
        obj.f28856c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f28856c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f28854a = dp;
        } else {
            obj.f28854a = (AndroidUtilities.displaySize.x - obj.f28856c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f28855b = w7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f28855b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static qf.e p() {
        gh0 gh0Var = f26700p0;
        if (gh0Var != null) {
            return gh0Var.W;
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
        gh0 gh0Var = f26700p0;
        b81 b81Var = gh0Var.Q;
        b81Var.e(false);
        b81Var.d(!z10);
        b81Var.f(true);
        ai.o4 o4Var = gh0Var.f26704b0;
        if (o4Var != null) {
            o4Var.invalidate();
        }
        fh0 fh0Var = gh0Var.h;
        if (fh0Var != null) {
            fh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        gh0 gh0Var = f26700p0;
        gh0Var.V = photoViewer;
        k81 k81Var = photoViewer.F2;
        qf.e eVar = gh0Var.W;
        if (eVar != null) {
            eVar.c();
            gh0Var.W = null;
        }
        if (k81Var != null && tf.c.a(photoViewer.f34082y) == 1) {
            qf.d dVar = new qf.d(photoViewer.f34082y, gh0Var);
            dVar.f46151c = "photo-viewer-pip-" + k81Var.f27878a;
            dVar.f46152e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f46156j = gh0Var.d;
            dVar.f46157k = gh0Var.f26716k0;
            int i10 = gh0Var.S;
            int i11 = gh0Var.T;
            dVar.h = i10;
            dVar.f46155i = i11;
            dVar.f46154g = k81Var.d;
            dVar.f46153f = true;
            gh0Var.W = dVar.a();
        }
        gh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.sg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gh0.x(boolean, android.app.Activity, org.telegram.ui.Components.sg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f26703b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        k81 k81Var;
        qf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f26705c;
            int width = this.W.h.f48256a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f26705c;
            int height = this.W.h.f48256a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f26703b.addView(this.d, this.f26705c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            k81Var = photoViewer.F2;
        } else {
            k81Var = null;
        }
        if (k81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f26717l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f26717l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f34066w3) != null && textureView.isAvailable()) {
            return this.V.f34066w3.getBitmap();
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
        this.f26717l0 = textureView;
        textureView.setVisibility(4);
        this.f26717l0.setOpaque(false);
        this.f26717l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f26717l0;
    }

    public final void i() {
        org.telegram.ui.kt0 kt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (kt0Var = photoViewer.f33889c4) == null) {
            return;
        }
        kt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f26706c0) {
            return;
        }
        this.f26706c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f26714i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f26715j0);
            this.f26714i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(hs.f27118f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new dh0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new bh0(this, 0), 100L);
        }
    }

    public final long l() {
        sg0 sg0Var = this.f26719r;
        if (sg0Var != null) {
            return sg0Var.getCurrentPosition();
        }
        k81 k81Var = this.V.F2;
        if (k81Var == null) {
            return 0L;
        }
        return k81Var.n();
    }

    public final long m() {
        sg0 sg0Var = this.f26719r;
        if (sg0Var != null) {
            return sg0Var.getVideoDuration();
        }
        k81 k81Var = this.V.F2;
        if (k81Var == null) {
            return 0L;
        }
        return k81Var.p();
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
            this.f26701a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            b81 b81Var = this.Q;
            b81Var.f24946q = f7;
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
            org.telegram.ui.f fVar = this.d;
            if (fVar != null && fVar.getParent() != null) {
                this.f26703b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f26704b0 = null;
        this.f26710f = null;
        this.V = null;
        qf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f26719r = null;
        this.U = null;
        this.f26723y = null;
        this.f26721w = false;
        this.P = false;
        this.f26706c0 = false;
        this.f26711f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f26713h0);
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
        duration.setInterpolator(hs.f27118f);
        this.F.addUpdateListener(new j80(this, 4));
        this.F.addListener(new dh0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            sg0 sg0Var = this.f26719r;
            if (sg0Var != null) {
                y3 = sg0Var.G;
            } else {
                k81 k81Var = photoViewer.F2;
                if (k81Var != null) {
                    y3 = k81Var.y();
                } else {
                    return;
                }
            }
            bh0 bh0Var = this.f26709e0;
            AndroidUtilities.cancelRunOnUIThread(bh0Var);
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
            AndroidUtilities.runOnUIThread(bh0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
