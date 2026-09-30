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
public final class qg0 implements rf.a {
    public static final vv0 f27680n0 = new vv0(new ha0(10), new ha0(11));
    public static final vv0 f27681o0 = new vv0(new ha0(12), new ha0(13));
    public static final qg0 f27682p0 = new qg0();
    public boolean E;
    public ValueAnimator F;
    public k2.u G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public zo0 R;
    public int S;
    public int T;
    public xu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27684a0;
    public WindowManager f27685b;
    public ai.n4 f27686b0;
    public WindowManager.LayoutParams f27687c;
    public boolean f27688c0;
    public org.telegram.ui.f d;
    public boolean f27689d0;
    public pg0 e;
    public View f27691f;
    public boolean f27692f0;
    public pg0 h;
    public boolean f27695i0;
    public View f27697k0;
    public TextureView f27698l0;
    public boolean m0;
    public boolean f27699n;
    public cg0 f27700r;
    public ScaleGestureDetector f27701s;
    public ka.c v;
    public boolean f27702w;
    public boolean f27703x;
    public View f27704y;
    public float f27683a = 1.4f;
    public float J = 1.0f;
    public final m71 Q = new m71(false);
    public final lg0 f27690e0 = new lg0(this, 1);
    public float[] f27693g0 = new float[2];
    public final lg0 f27694h0 = new lg0(this, 2);
    public final lg0 f27696j0 = new lg0(this, 3);

    public static void j(boolean z10) {
        f27682p0.k(z10, false);
    }

    public static uk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        qg0 qg0Var = f27682p0;
        if (qg0Var.P && !z10) {
            obj.f28826a = qg0Var.K;
            obj.f28827b = qg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f28828c = qg0Var.H;
            obj.d = qg0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) qg0Var.n().f13369b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) qg0Var.n().f13369b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) qg0Var.n().f13369b).getFloat("scale_factor", 1.0f);
        obj.f28828c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f28828c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f28826a = dp;
        } else {
            obj.f28826a = (AndroidUtilities.displaySize.x - obj.f28828c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f28827b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f28827b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        qg0 qg0Var = f27682p0;
        if (qg0Var != null) {
            return qg0Var.W;
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
        qg0 qg0Var = f27682p0;
        m71 m71Var = qg0Var.Q;
        m71Var.e(false);
        m71Var.d(!z10);
        m71Var.f(true);
        ai.n4 n4Var = qg0Var.f27686b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        pg0 pg0Var = qg0Var.h;
        if (pg0Var != null) {
            pg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        qg0 qg0Var = f27682p0;
        qg0Var.V = photoViewer;
        u71 u71Var = photoViewer.F2;
        pf.e eVar = qg0Var.W;
        if (eVar != null) {
            eVar.c();
            qg0Var.W = null;
        }
        if (u71Var != null && sf.c.a(photoViewer.f31403y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31403y, qg0Var);
            dVar.f41054c = "photo-viewer-pip-" + u71Var.f28764a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f41058j = qg0Var.d;
            dVar.f41059k = qg0Var.f27697k0;
            int i10 = qg0Var.S;
            int i11 = qg0Var.T;
            dVar.h = i10;
            dVar.f41057i = i11;
            dVar.f41056g = u71Var.d;
            dVar.f41055f = true;
            qg0Var.W = dVar.a();
        }
        qg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.cg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qg0.x(boolean, android.app.Activity, org.telegram.ui.Components.cg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27685b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        u71 u71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27687c;
            int width = this.W.h.f43194a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27687c;
            int height = this.W.h.f43194a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27685b.addView(this.d, this.f27687c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            u71Var = photoViewer.F2;
        } else {
            u71Var = null;
        }
        if (u71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27698l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27698l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31387w3) != null && textureView.isAvailable()) {
            return this.V.f31387w3.getBitmap();
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
        this.f27698l0 = textureView;
        textureView.setVisibility(4);
        this.f27698l0.setOpaque(false);
        this.f27698l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f27698l0;
    }

    public final void i() {
        org.telegram.ui.ct0 ct0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ct0Var = photoViewer.f31211c4) == null) {
            return;
        }
        ct0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27688c0) {
            return;
        }
        this.f27688c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27695i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27696j0);
            this.f27695i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(sr.f28346f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ng0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new lg0(this, 0), 100L);
        }
    }

    public final long l() {
        cg0 cg0Var = this.f27700r;
        if (cg0Var != null) {
            return cg0Var.getCurrentPosition();
        }
        u71 u71Var = this.V.F2;
        if (u71Var == null) {
            return 0L;
        }
        return u71Var.n();
    }

    public final long m() {
        cg0 cg0Var = this.f27700r;
        if (cg0Var != null) {
            return cg0Var.getVideoDuration();
        }
        u71 u71Var = this.V.F2;
        if (u71Var == null) {
            return 0L;
        }
        return u71Var.p();
    }

    public final k2.u n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new k2.u(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        float f7;
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.f27683a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            m71 m71Var = this.Q;
            m71Var.f26326q = f7;
            m71Var.a();
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
                this.f27685b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27686b0 = null;
        this.f27691f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f27700r = null;
        this.U = null;
        this.f27704y = null;
        this.f27702w = false;
        this.P = false;
        this.f27688c0 = false;
        this.f27692f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27694h0);
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
        duration.setInterpolator(sr.f28346f);
        this.F.addUpdateListener(new u70(this, 3));
        this.F.addListener(new ng0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            cg0 cg0Var = this.f27700r;
            if (cg0Var != null) {
                y3 = cg0Var.G;
            } else {
                u71 u71Var = photoViewer.F2;
                if (u71Var != null) {
                    y3 = u71Var.y();
                } else {
                    return;
                }
            }
            lg0 lg0Var = this.f27690e0;
            AndroidUtilities.cancelRunOnUIThread(lg0Var);
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
            AndroidUtilities.runOnUIThread(lg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
