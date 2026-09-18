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
public final class fg0 implements rf.a {
    public static final jv0 f23912n0 = new jv0(new l2(25), new l2(26));
    public static final jv0 f23913o0 = new jv0(new l2(27), new l2(28));
    public static final fg0 f23914p0 = new fg0();
    public boolean E;
    public ValueAnimator F;
    public com.google.firebase.messaging.v G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public lo0 R;
    public int S;
    public int T;
    public vu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f23916a0;
    public WindowManager f23917b;
    public ai.n4 f23918b0;
    public WindowManager.LayoutParams f23919c;
    public boolean f23920c0;
    public org.telegram.ui.f d;
    public boolean f23921d0;
    public eg0 e;
    public View f23923f;
    public boolean f23924f0;
    public eg0 h;
    public boolean f23927i0;
    public View f23929k0;
    public TextureView f23930l0;
    public boolean m0;
    public boolean f23931n;
    public qf0 f23932r;
    public ScaleGestureDetector f23933s;
    public org.telegram.ui.Cells.ia v;
    public boolean f23934w;
    public boolean f23935x;
    public View f23936y;
    public float f23915a = 1.4f;
    public float J = 1.0f;
    public final x61 Q = new x61(false);
    public final ag0 f23922e0 = new ag0(this, 1);
    public float[] f23925g0 = new float[2];
    public final ag0 f23926h0 = new ag0(this, 2);
    public final ag0 f23928j0 = new ag0(this, 3);

    public static void j(boolean z10) {
        f23914p0.k(z10, false);
    }

    public static ik0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        fg0 fg0Var = f23914p0;
        if (fg0Var.P && !z10) {
            obj.f24953a = fg0Var.K;
            obj.f24954b = fg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f24955c = fg0Var.H;
            obj.d = fg0Var.I;
            return obj;
        }
        float f11 = fg0Var.n().f7357a.getFloat("x", -1.0f);
        float f12 = fg0Var.n().f7357a.getFloat("y", -1.0f);
        float f13 = fg0Var.n().f7357a.getFloat("scale_factor", 1.0f);
        obj.f24955c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f24955c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f24953a = dp;
        } else {
            obj.f24953a = (AndroidUtilities.displaySize.x - obj.f24955c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f24954b = w7.p.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f24954b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        fg0 fg0Var = f23914p0;
        if (fg0Var != null) {
            return fg0Var.W;
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
        fg0 fg0Var = f23914p0;
        x61 x61Var = fg0Var.Q;
        x61Var.e(false);
        x61Var.d(!z10);
        x61Var.f(true);
        ai.n4 n4Var = fg0Var.f23918b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        eg0 eg0Var = fg0Var.h;
        if (eg0Var != null) {
            eg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        fg0 fg0Var = f23914p0;
        fg0Var.V = photoViewer;
        h71 h71Var = photoViewer.F2;
        pf.e eVar = fg0Var.W;
        if (eVar != null) {
            eVar.c();
            fg0Var.W = null;
        }
        if (h71Var != null && sf.c.a(photoViewer.f31132y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31132y, fg0Var);
            dVar.f40812c = "photo-viewer-pip-" + h71Var.f24527a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f40816j = fg0Var.d;
            dVar.f40817k = fg0Var.f23929k0;
            int i10 = fg0Var.S;
            int i11 = fg0Var.T;
            dVar.h = i10;
            dVar.f40815i = i11;
            dVar.f40814g = h71Var.d;
            dVar.f40813f = true;
            fg0Var.W = dVar.a();
        }
        fg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.qf0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fg0.x(boolean, android.app.Activity, org.telegram.ui.Components.qf0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f23917b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        h71 h71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f23919c;
            int width = this.W.h.f42931a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f23919c;
            int height = this.W.h.f42931a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f23917b.addView(this.d, this.f23919c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            h71Var = photoViewer.F2;
        } else {
            h71Var = null;
        }
        if (h71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f23930l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f23930l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31116w3) != null && textureView.isAvailable()) {
            return this.V.f31116w3.getBitmap();
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
        this.f23930l0 = textureView;
        textureView.setVisibility(4);
        this.f23930l0.setOpaque(false);
        this.f23930l0.setSurfaceTextureListener(new j50(this, 1));
        return this.f23930l0;
    }

    public final void i() {
        org.telegram.ui.mt0 mt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (mt0Var = photoViewer.f30940c4) == null) {
            return;
        }
        mt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f23920c0) {
            return;
        }
        this.f23920c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f23927i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f23928j0);
            this.f23927i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(qr.f27383f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new cg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new ag0(this, 0), 100L);
        }
    }

    public final long l() {
        qf0 qf0Var = this.f23932r;
        if (qf0Var != null) {
            return qf0Var.getCurrentPosition();
        }
        h71 h71Var = this.V.F2;
        if (h71Var == null) {
            return 0L;
        }
        return h71Var.n();
    }

    public final long m() {
        qf0 qf0Var = this.f23932r;
        if (qf0Var != null) {
            return qf0Var.getVideoDuration();
        }
        h71 h71Var = this.V.F2;
        if (h71Var == null) {
            return 0L;
        }
        return h71Var.p();
    }

    public final com.google.firebase.messaging.v n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new com.google.firebase.messaging.v(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f23915a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            x61 x61Var = this.Q;
            x61Var.f29878q = f7;
            x61Var.a();
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
                this.f23917b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f23918b0 = null;
        this.f23923f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f23932r = null;
        this.U = null;
        this.f23936y = null;
        this.f23934w = false;
        this.P = false;
        this.f23920c0 = false;
        this.f23924f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f23926h0);
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
        duration.setInterpolator(qr.f27383f);
        this.F.addUpdateListener(new h70(this, 3));
        this.F.addListener(new cg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            qf0 qf0Var = this.f23932r;
            if (qf0Var != null) {
                y3 = qf0Var.G;
            } else {
                h71 h71Var = photoViewer.F2;
                if (h71Var != null) {
                    y3 = h71Var.y();
                } else {
                    return;
                }
            }
            ag0 ag0Var = this.f23922e0;
            AndroidUtilities.cancelRunOnUIThread(ag0Var);
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
            AndroidUtilities.runOnUIThread(ag0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
