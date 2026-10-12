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
    public static final hw0 f25033n0 = new hw0(new l2(27), new l2(28));
    public static final hw0 f25034o0 = new hw0(new l2(29), new zg0(0));
    public static final fh0 f25035p0 = new fh0();
    public boolean E;
    public ValueAnimator F;
    public l2.f G;
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
    public float f25037a0;
    public WindowManager f25038b;
    public bi.d4 f25039b0;
    public WindowManager.LayoutParams f25040c;
    public boolean f25041c0;
    public org.telegram.ui.f d;
    public boolean f25042d0;
    public eh0 e;
    public View f25044f;
    public boolean f25045f0;
    public eh0 h;
    public boolean f25048i0;
    public View f25050k0;
    public TextureView f25051l0;
    public boolean m0;
    public boolean f25052n;
    public qg0 f25053r;
    public ScaleGestureDetector f25054s;
    public ji.h5 v;
    public boolean f25055w;
    public boolean f25056x;
    public View f25057y;
    public float f25036a = 1.4f;
    public float J = 1.0f;
    public final z71 Q = new z71(false);
    public final ah0 f25043e0 = new ah0(this, 1);
    public float[] f25046g0 = new float[2];
    public final ah0 f25047h0 = new ah0(this, 2);
    public final ah0 f25049j0 = new ah0(this, 3);

    public static void j(boolean z10) {
        f25035p0.k(z10, false);
    }

    public static il0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        fh0 fh0Var = f25035p0;
        if (fh0Var.P && !z10) {
            obj.f25990a = fh0Var.K;
            obj.f25991b = fh0Var.L + AndroidUtilities.statusBarHeight;
            obj.f25992c = fh0Var.H;
            obj.d = fh0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) fh0Var.n().f14503b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) fh0Var.n().f14503b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) fh0Var.n().f14503b).getFloat("scale_factor", 1.0f);
        obj.f25992c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f25992c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f25990a = dp;
        } else {
            obj.f25990a = (AndroidUtilities.displaySize.x - obj.f25992c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f25991b = w7.s.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f25991b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static rf.d p() {
        fh0 fh0Var = f25035p0;
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
        fh0 fh0Var = f25035p0;
        z71 z71Var = fh0Var.Q;
        z71Var.e(false);
        z71Var.d(!z10);
        z71Var.f(true);
        bi.d4 d4Var = fh0Var.f25039b0;
        if (d4Var != null) {
            d4Var.invalidate();
        }
        eh0 eh0Var = fh0Var.h;
        if (eh0Var != null) {
            eh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        fh0 fh0Var = f25035p0;
        fh0Var.V = photoViewer;
        h81 h81Var = photoViewer.F2;
        rf.d dVar = fh0Var.W;
        if (dVar != null) {
            dVar.c();
            fh0Var.W = null;
        }
        if (h81Var != null && uf.b.a(photoViewer.f32405y) == 1) {
            rf.c cVar = new rf.c(photoViewer.f32405y, fh0Var);
            cVar.f44166c = "photo-viewer-pip-" + h81Var.f25543a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f44170j = fh0Var.d;
            cVar.f44171k = fh0Var.f25050k0;
            int i10 = fh0Var.S;
            int i11 = fh0Var.T;
            cVar.h = i10;
            cVar.f44169i = i11;
            cVar.f44168g = h81Var.d;
            cVar.f44167f = true;
            fh0Var.W = cVar.a();
        }
        fh0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.qg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fh0.x(boolean, android.app.Activity, org.telegram.ui.Components.qg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f25038b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        h81 h81Var;
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f25040c;
            int width = ((Rect) this.W.h.f13952a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f25040c;
            int height = ((Rect) this.W.h.f13952a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f25038b.addView(this.d, this.f25040c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            h81Var = photoViewer.F2;
        } else {
            h81Var = null;
        }
        if (h81Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f25051l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f25051l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f32389w3) != null && textureView.isAvailable()) {
            return this.V.f32389w3.getBitmap();
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
        this.f25051l0 = textureView;
        textureView.setVisibility(4);
        this.f25051l0.setOpaque(false);
        this.f25051l0.setSurfaceTextureListener(new li.e(this, 2));
        return this.f25051l0;
    }

    public final void i() {
        org.telegram.ui.rt0 rt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (rt0Var = photoViewer.f32212c4) == null) {
            return;
        }
        rt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f25041c0) {
            return;
        }
        this.f25041c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f25048i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f25049j0);
            this.f25048i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(es.f24771f);
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
        qg0 qg0Var = this.f25053r;
        if (qg0Var != null) {
            return qg0Var.getCurrentPosition();
        }
        h81 h81Var = this.V.F2;
        if (h81Var == null) {
            return 0L;
        }
        return h81Var.n();
    }

    public final long m() {
        qg0 qg0Var = this.f25053r;
        if (qg0Var != null) {
            return qg0Var.getVideoDuration();
        }
        h81 h81Var = this.V.F2;
        if (h81Var == null) {
            return 0L;
        }
        return h81Var.p();
    }

    public final l2.f n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new l2.f(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f25036a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            z71 z71Var = this.Q;
            z71Var.f31804q = f7;
            z71Var.a();
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
                this.f25038b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f25039b0 = null;
        this.f25044f = null;
        this.V = null;
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f25053r = null;
        this.U = null;
        this.f25057y = null;
        this.f25055w = false;
        this.P = false;
        this.f25041c0 = false;
        this.f25045f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f25047h0);
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
        duration.setInterpolator(es.f24771f);
        this.F.addUpdateListener(new g80(this, 4));
        this.F.addListener(new ch0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            qg0 qg0Var = this.f25053r;
            if (qg0Var != null) {
                y3 = qg0Var.G;
            } else {
                h81 h81Var = photoViewer.F2;
                if (h81Var != null) {
                    y3 = h81Var.y();
                } else {
                    return;
                }
            }
            ah0 ah0Var = this.f25043e0;
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
