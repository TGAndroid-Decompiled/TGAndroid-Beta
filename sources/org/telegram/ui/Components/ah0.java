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
public final class ah0 implements tf.a {
    public static final ew0 f24596n0 = new ew0(new k2(28), new k2(29));
    public static final ew0 f24597o0 = new ew0(new ug0(0), new ug0(1));
    public static final ah0 f24598p0 = new ah0();
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
    public hp0 R;
    public int S;
    public int T;
    public cv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f24600a0;
    public WindowManager f24601b;
    public ci.i3 f24602b0;
    public WindowManager.LayoutParams f24603c;
    public boolean f24604c0;
    public org.telegram.ui.f d;
    public boolean f24605d0;
    public zg0 e;
    public View f24607f;
    public boolean f24608f0;
    public zg0 h;
    public boolean f24611i0;
    public View f24613k0;
    public TextureView f24614l0;
    public boolean m0;
    public boolean f24615n;
    public lg0 f24616r;
    public ScaleGestureDetector f24617s;
    public le.b v;
    public boolean f24618w;
    public boolean f24619x;
    public View f24620y;
    public float f24599a = 1.4f;
    public float J = 1.0f;
    public final t71 Q = new t71(false);
    public final vg0 f24606e0 = new vg0(this, 1);
    public float[] f24609g0 = new float[2];
    public final vg0 f24610h0 = new vg0(this, 2);
    public final vg0 f24612j0 = new vg0(this, 3);

    public static void j(boolean z10) {
        f24598p0.k(z10, false);
    }

    public static fl0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        ah0 ah0Var = f24598p0;
        if (ah0Var.P && !z10) {
            obj.f26272a = ah0Var.K;
            obj.f26273b = ah0Var.L + AndroidUtilities.statusBarHeight;
            obj.f26274c = ah0Var.H;
            obj.d = ah0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) ah0Var.n().f14830b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) ah0Var.n().f14830b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) ah0Var.n().f14830b).getFloat("scale_factor", 1.0f);
        obj.f26274c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f26274c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f26272a = dp;
        } else {
            obj.f26272a = (AndroidUtilities.displaySize.x - obj.f26274c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f26273b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f26273b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static rf.d p() {
        ah0 ah0Var = f24598p0;
        if (ah0Var != null) {
            return ah0Var.W;
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
        ah0 ah0Var = f24598p0;
        t71 t71Var = ah0Var.Q;
        t71Var.e(false);
        t71Var.d(!z10);
        t71Var.f(true);
        ci.i3 i3Var = ah0Var.f24602b0;
        if (i3Var != null) {
            i3Var.invalidate();
        }
        zg0 zg0Var = ah0Var.h;
        if (zg0Var != null) {
            zg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ah0 ah0Var = f24598p0;
        ah0Var.V = photoViewer;
        c81 c81Var = photoViewer.F2;
        rf.d dVar = ah0Var.W;
        if (dVar != null) {
            dVar.c();
            ah0Var.W = null;
        }
        if (c81Var != null && uf.b.a(photoViewer.f33458y) == 1) {
            rf.c cVar = new rf.c(photoViewer.f33458y, ah0Var);
            cVar.f45263c = "photo-viewer-pip-" + c81Var.f25127a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f45267j = ah0Var.d;
            cVar.f45268k = ah0Var.f24613k0;
            int i10 = ah0Var.S;
            int i11 = ah0Var.T;
            cVar.h = i10;
            cVar.f45266i = i11;
            cVar.f45265g = c81Var.d;
            cVar.f45264f = true;
            ah0Var.W = cVar.a();
        }
        ah0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.lg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ah0.x(boolean, android.app.Activity, org.telegram.ui.Components.lg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f24601b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        c81 c81Var;
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f24603c;
            int width = ((Rect) this.W.h.f14764a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f24603c;
            int height = ((Rect) this.W.h.f14764a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f24601b.addView(this.d, this.f24603c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            c81Var = photoViewer.F2;
        } else {
            c81Var = null;
        }
        if (c81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f24614l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f24614l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33442w3) != null && textureView.isAvailable()) {
            return this.V.f33442w3.getBitmap();
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
        this.f24614l0 = textureView;
        textureView.setVisibility(4);
        this.f24614l0.setOpaque(false);
        this.f24614l0.setSurfaceTextureListener(new t50(this, 1));
        return this.f24614l0;
    }

    public final void i() {
        org.telegram.ui.qs0 qs0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (qs0Var = photoViewer.f33265c4) == null) {
            return;
        }
        qs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f24604c0) {
            return;
        }
        this.f24604c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f24611i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f24612j0);
            this.f24611i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(bs.f25021f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new xg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new vg0(this, 0), 100L);
        }
    }

    public final long l() {
        lg0 lg0Var = this.f24616r;
        if (lg0Var != null) {
            return lg0Var.getCurrentPosition();
        }
        c81 c81Var = this.V.F2;
        if (c81Var == null) {
            return 0L;
        }
        return c81Var.n();
    }

    public final long m() {
        lg0 lg0Var = this.f24616r;
        if (lg0Var != null) {
            return lg0Var.getVideoDuration();
        }
        c81 c81Var = this.V.F2;
        if (c81Var == null) {
            return 0L;
        }
        return c81Var.p();
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
            this.f24599a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            t71 t71Var = this.Q;
            t71Var.f30473q = f7;
            t71Var.a();
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
                this.f24601b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f24602b0 = null;
        this.f24607f = null;
        this.V = null;
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f24616r = null;
        this.U = null;
        this.f24620y = null;
        this.f24618w = false;
        this.P = false;
        this.f24604c0 = false;
        this.f24608f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f24610h0);
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
        duration.setInterpolator(bs.f25021f);
        this.F.addUpdateListener(new b80(this, 4));
        this.F.addListener(new xg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            lg0 lg0Var = this.f24616r;
            if (lg0Var != null) {
                y3 = lg0Var.G;
            } else {
                c81 c81Var = photoViewer.F2;
                if (c81Var != null) {
                    y3 = c81Var.y();
                } else {
                    return;
                }
            }
            vg0 vg0Var = this.f24606e0;
            AndroidUtilities.cancelRunOnUIThread(vg0Var);
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
            AndroidUtilities.runOnUIThread(vg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
