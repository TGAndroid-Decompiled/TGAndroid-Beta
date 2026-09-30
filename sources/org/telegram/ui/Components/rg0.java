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
public final class rg0 implements rf.a {
    public static final wv0 f27985n0 = new wv0(new ia0(10), new ia0(11));
    public static final wv0 f27986o0 = new wv0(new ia0(12), new ia0(13));
    public static final rg0 f27987p0 = new rg0();
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
    public ap0 R;
    public int S;
    public int T;
    public yu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27989a0;
    public WindowManager f27990b;
    public ai.n4 f27991b0;
    public WindowManager.LayoutParams f27992c;
    public boolean f27993c0;
    public org.telegram.ui.f d;
    public boolean f27994d0;
    public qg0 e;
    public View f27996f;
    public boolean f27997f0;
    public qg0 h;
    public boolean f28000i0;
    public View f28002k0;
    public TextureView f28003l0;
    public boolean m0;
    public boolean f28004n;
    public dg0 f28005r;
    public ScaleGestureDetector f28006s;
    public ka.c v;
    public boolean f28007w;
    public boolean f28008x;
    public View f28009y;
    public float f27988a = 1.4f;
    public float J = 1.0f;
    public final n71 Q = new n71(false);
    public final mg0 f27995e0 = new mg0(this, 1);
    public float[] f27998g0 = new float[2];
    public final mg0 f27999h0 = new mg0(this, 2);
    public final mg0 f28001j0 = new mg0(this, 3);

    public static void j(boolean z10) {
        f27987p0.k(z10, false);
    }

    public static vk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        rg0 rg0Var = f27987p0;
        if (rg0Var.P && !z10) {
            obj.f29132a = rg0Var.K;
            obj.f29133b = rg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f29134c = rg0Var.H;
            obj.d = rg0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) rg0Var.n().f13384b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) rg0Var.n().f13384b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) rg0Var.n().f13384b).getFloat("scale_factor", 1.0f);
        obj.f29134c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29134c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f29132a = dp;
        } else {
            obj.f29132a = (AndroidUtilities.displaySize.x - obj.f29134c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29133b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f29133b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        rg0 rg0Var = f27987p0;
        if (rg0Var != null) {
            return rg0Var.W;
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
        rg0 rg0Var = f27987p0;
        n71 n71Var = rg0Var.Q;
        n71Var.e(false);
        n71Var.d(!z10);
        n71Var.f(true);
        ai.n4 n4Var = rg0Var.f27991b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        qg0 qg0Var = rg0Var.h;
        if (qg0Var != null) {
            qg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        rg0 rg0Var = f27987p0;
        rg0Var.V = photoViewer;
        v71 v71Var = photoViewer.F2;
        pf.e eVar = rg0Var.W;
        if (eVar != null) {
            eVar.c();
            rg0Var.W = null;
        }
        if (v71Var != null && sf.c.a(photoViewer.f31475y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31475y, rg0Var);
            dVar.f41151c = "photo-viewer-pip-" + v71Var.f29060a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f41155j = rg0Var.d;
            dVar.f41156k = rg0Var.f28002k0;
            int i10 = rg0Var.S;
            int i11 = rg0Var.T;
            dVar.h = i10;
            dVar.f41154i = i11;
            dVar.f41153g = v71Var.d;
            dVar.f41152f = true;
            rg0Var.W = dVar.a();
        }
        rg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.dg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg0.x(boolean, android.app.Activity, org.telegram.ui.Components.dg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27990b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        v71 v71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27992c;
            int width = this.W.h.f43300a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27992c;
            int height = this.W.h.f43300a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27990b.addView(this.d, this.f27992c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            v71Var = photoViewer.F2;
        } else {
            v71Var = null;
        }
        if (v71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f28003l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f28003l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31459w3) != null && textureView.isAvailable()) {
            return this.V.f31459w3.getBitmap();
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
        this.f28003l0 = textureView;
        textureView.setVisibility(4);
        this.f28003l0.setOpaque(false);
        this.f28003l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f28003l0;
    }

    public final void i() {
        org.telegram.ui.ct0 ct0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ct0Var = photoViewer.f31283c4) == null) {
            return;
        }
        ct0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27993c0) {
            return;
        }
        this.f27993c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f28000i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f28001j0);
            this.f28000i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(tr.f28636f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new og0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new mg0(this, 0), 100L);
        }
    }

    public final long l() {
        dg0 dg0Var = this.f28005r;
        if (dg0Var != null) {
            return dg0Var.getCurrentPosition();
        }
        v71 v71Var = this.V.F2;
        if (v71Var == null) {
            return 0L;
        }
        return v71Var.n();
    }

    public final long m() {
        dg0 dg0Var = this.f28005r;
        if (dg0Var != null) {
            return dg0Var.getVideoDuration();
        }
        v71 v71Var = this.V.F2;
        if (v71Var == null) {
            return 0L;
        }
        return v71Var.p();
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
            this.f27988a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            n71 n71Var = this.Q;
            n71Var.f26618q = f7;
            n71Var.a();
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
                this.f27990b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27991b0 = null;
        this.f27996f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f28005r = null;
        this.U = null;
        this.f28009y = null;
        this.f28007w = false;
        this.P = false;
        this.f27993c0 = false;
        this.f27997f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27999h0);
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
        duration.setInterpolator(tr.f28636f);
        this.F.addUpdateListener(new v70(this, 3));
        this.F.addListener(new og0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            dg0 dg0Var = this.f28005r;
            if (dg0Var != null) {
                y3 = dg0Var.G;
            } else {
                v71 v71Var = photoViewer.F2;
                if (v71Var != null) {
                    y3 = v71Var.y();
                } else {
                    return;
                }
            }
            mg0 mg0Var = this.f27995e0;
            AndroidUtilities.cancelRunOnUIThread(mg0Var);
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
            AndroidUtilities.runOnUIThread(mg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
