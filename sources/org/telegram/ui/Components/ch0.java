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
public final class ch0 implements tf.a {
    public static final gw0 f25311n0 = new gw0(new sd0(4), new sd0(5));
    public static final gw0 f25312o0 = new gw0(new sd0(6), new sd0(7));
    public static final ch0 f25313p0 = new ch0();
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
    public kp0 R;
    public int S;
    public int T;
    public av U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f25315a0;
    public WindowManager f25316b;
    public ci.h3 f25317b0;
    public WindowManager.LayoutParams f25318c;
    public boolean f25319c0;
    public org.telegram.ui.e d;
    public boolean f25320d0;
    public bh0 e;
    public View f25322f;
    public boolean f25323f0;
    public bh0 h;
    public boolean f25326i0;
    public View f25328k0;
    public TextureView f25329l0;
    public boolean m0;
    public boolean f25330n;
    public og0 f25331r;
    public ScaleGestureDetector f25332s;
    public le.b v;
    public boolean f25333w;
    public boolean f25334x;
    public View f25335y;
    public float f25314a = 1.4f;
    public float J = 1.0f;
    public final a81 Q = new a81(false);
    public final xg0 f25321e0 = new xg0(this, 1);
    public float[] f25324g0 = new float[2];
    public final xg0 f25325h0 = new xg0(this, 2);
    public final xg0 f25327j0 = new xg0(this, 3);

    public static void j(boolean z10) {
        f25313p0.k(z10, false);
    }

    public static hl0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        ch0 ch0Var = f25313p0;
        if (ch0Var.P && !z10) {
            obj.f27075a = ch0Var.K;
            obj.f27076b = ch0Var.L + AndroidUtilities.statusBarHeight;
            obj.f27077c = ch0Var.H;
            obj.d = ch0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) ch0Var.n().f14874b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) ch0Var.n().f14874b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) ch0Var.n().f14874b).getFloat("scale_factor", 1.0f);
        obj.f27077c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f27077c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f27075a = dp;
        } else {
            obj.f27075a = (AndroidUtilities.displaySize.x - obj.f27077c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f27076b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f27076b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static rf.d p() {
        ch0 ch0Var = f25313p0;
        if (ch0Var != null) {
            return ch0Var.W;
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
        ch0 ch0Var = f25313p0;
        a81 a81Var = ch0Var.Q;
        a81Var.e(false);
        a81Var.d(!z10);
        a81Var.f(true);
        ci.h3 h3Var = ch0Var.f25317b0;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        bh0 bh0Var = ch0Var.h;
        if (bh0Var != null) {
            bh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ch0 ch0Var = f25313p0;
        ch0Var.V = photoViewer;
        j81 j81Var = photoViewer.F2;
        rf.d dVar = ch0Var.W;
        if (dVar != null) {
            dVar.c();
            ch0Var.W = null;
        }
        if (j81Var != null && uf.b.a(photoViewer.f33761y) == 1) {
            rf.c cVar = new rf.c(photoViewer.f33761y, ch0Var);
            cVar.f45678c = "photo-viewer-pip-" + j81Var.f27625a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f45682j = ch0Var.d;
            cVar.f45683k = ch0Var.f25328k0;
            int i10 = ch0Var.S;
            int i11 = ch0Var.T;
            cVar.h = i10;
            cVar.f45681i = i11;
            cVar.f45680g = j81Var.d;
            cVar.f45679f = true;
            ch0Var.W = cVar.a();
        }
        ch0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.og0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.x(boolean, android.app.Activity, org.telegram.ui.Components.og0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f25316b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        j81 j81Var;
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f25318c;
            int width = ((Rect) this.W.h.f14802a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f25318c;
            int height = ((Rect) this.W.h.f14802a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f25316b.addView(this.d, this.f25318c);
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
        TextureView textureView = this.f25329l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f25329l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f33745w3) != null && textureView.isAvailable()) {
            return this.V.f33745w3.getBitmap();
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
        this.f25329l0 = textureView;
        textureView.setVisibility(4);
        this.f25329l0.setOpaque(false);
        this.f25329l0.setSurfaceTextureListener(new r50(this, 1));
        return this.f25329l0;
    }

    public final void i() {
        org.telegram.ui.ss0 ss0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ss0Var = photoViewer.f33568c4) == null) {
            return;
        }
        ss0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f25319c0) {
            return;
        }
        this.f25319c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f25326i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f25327j0);
            this.f25326i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(zr.f33337f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new zg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new xg0(this, 0), 100L);
        }
    }

    public final long l() {
        og0 og0Var = this.f25331r;
        if (og0Var != null) {
            return og0Var.getCurrentPosition();
        }
        j81 j81Var = this.V.F2;
        if (j81Var == null) {
            return 0L;
        }
        return j81Var.n();
    }

    public final long m() {
        og0 og0Var = this.f25331r;
        if (og0Var != null) {
            return og0Var.getVideoDuration();
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
            this.f25314a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            a81 a81Var = this.Q;
            a81Var.f24668q = f7;
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
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
                this.f25316b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f25317b0 = null;
        this.f25322f = null;
        this.V = null;
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f25331r = null;
        this.U = null;
        this.f25335y = null;
        this.f25333w = false;
        this.P = false;
        this.f25319c0 = false;
        this.f25323f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f25325h0);
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
        duration.setInterpolator(zr.f33337f);
        this.F.addUpdateListener(new b80(this, 4));
        this.F.addListener(new zg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            og0 og0Var = this.f25331r;
            if (og0Var != null) {
                y3 = og0Var.G;
            } else {
                j81 j81Var = photoViewer.F2;
                if (j81Var != null) {
                    y3 = j81Var.y();
                } else {
                    return;
                }
            }
            xg0 xg0Var = this.f25321e0;
            AndroidUtilities.cancelRunOnUIThread(xg0Var);
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
            AndroidUtilities.runOnUIThread(xg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
