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
public final class pg0 implements rf.a {
    public static final uv0 f27351n0 = new uv0(new ga0(10), new ga0(11));
    public static final uv0 f27352o0 = new uv0(new ga0(12), new ga0(13));
    public static final pg0 f27353p0 = new pg0();
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
    public yo0 R;
    public int S;
    public int T;
    public xu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27355a0;
    public WindowManager f27356b;
    public ai.n4 f27357b0;
    public WindowManager.LayoutParams f27358c;
    public boolean f27359c0;
    public org.telegram.ui.f d;
    public boolean f27360d0;
    public og0 e;
    public View f27362f;
    public boolean f27363f0;
    public og0 h;
    public boolean f27366i0;
    public View f27368k0;
    public TextureView f27369l0;
    public boolean m0;
    public boolean f27370n;
    public bg0 f27371r;
    public ScaleGestureDetector f27372s;
    public ka.c v;
    public boolean f27373w;
    public boolean f27374x;
    public View f27375y;
    public float f27354a = 1.4f;
    public float J = 1.0f;
    public final l71 Q = new l71(false);
    public final kg0 f27361e0 = new kg0(this, 1);
    public float[] f27364g0 = new float[2];
    public final kg0 f27365h0 = new kg0(this, 2);
    public final kg0 f27367j0 = new kg0(this, 3);

    public static void j(boolean z10) {
        f27353p0.k(z10, false);
    }

    public static tk0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        pg0 pg0Var = f27353p0;
        if (pg0Var.P && !z10) {
            obj.f28551a = pg0Var.K;
            obj.f28552b = pg0Var.L + AndroidUtilities.statusBarHeight;
            obj.f28553c = pg0Var.H;
            obj.d = pg0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) pg0Var.n().f13369b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) pg0Var.n().f13369b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) pg0Var.n().f13369b).getFloat("scale_factor", 1.0f);
        obj.f28553c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f28553c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f28551a = dp;
        } else {
            obj.f28551a = (AndroidUtilities.displaySize.x - obj.f28553c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f28552b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f28552b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static pf.e p() {
        pg0 pg0Var = f27353p0;
        if (pg0Var != null) {
            return pg0Var.W;
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
        pg0 pg0Var = f27353p0;
        l71 l71Var = pg0Var.Q;
        l71Var.e(false);
        l71Var.d(!z10);
        l71Var.f(true);
        ai.n4 n4Var = pg0Var.f27357b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        og0 og0Var = pg0Var.h;
        if (og0Var != null) {
            og0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        pg0 pg0Var = f27353p0;
        pg0Var.V = photoViewer;
        t71 t71Var = photoViewer.F2;
        pf.e eVar = pg0Var.W;
        if (eVar != null) {
            eVar.c();
            pg0Var.W = null;
        }
        if (t71Var != null && sf.c.a(photoViewer.f31400y) == 1) {
            pf.d dVar = new pf.d(photoViewer.f31400y, pg0Var);
            dVar.f41051c = "photo-viewer-pip-" + t71Var.f28484a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.f41055j = pg0Var.d;
            dVar.f41056k = pg0Var.f27368k0;
            int i10 = pg0Var.S;
            int i11 = pg0Var.T;
            dVar.h = i10;
            dVar.f41054i = i11;
            dVar.f41053g = t71Var.d;
            dVar.f41052f = true;
            pg0Var.W = dVar.a();
        }
        pg0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.bg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg0.x(boolean, android.app.Activity, org.telegram.ui.Components.bg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.f27356b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        t71 t71Var;
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f27358c;
            int width = this.W.h.f43191a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27358c;
            int height = this.W.h.f43191a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27356b.addView(this.d, this.f27358c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            t71Var = photoViewer.F2;
        } else {
            t71Var = null;
        }
        if (t71Var == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27369l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27369l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f31384w3) != null && textureView.isAvailable()) {
            return this.V.f31384w3.getBitmap();
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
        this.f27369l0 = textureView;
        textureView.setVisibility(4);
        this.f27369l0.setOpaque(false);
        this.f27369l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.f27369l0;
    }

    public final void i() {
        org.telegram.ui.ct0 ct0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ct0Var = photoViewer.f31208c4) == null) {
            return;
        }
        ct0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27359c0) {
            return;
        }
        this.f27359c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27366i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27367j0);
            this.f27366i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(sr.f28339f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new mg0(this, 1));
            animatorSet.start();
        } else if (z11) {
            u();
        } else {
            AndroidUtilities.runOnUIThread(new kg0(this, 0), 100L);
        }
    }

    public final long l() {
        bg0 bg0Var = this.f27371r;
        if (bg0Var != null) {
            return bg0Var.getCurrentPosition();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.n();
    }

    public final long m() {
        bg0 bg0Var = this.f27371r;
        if (bg0Var != null) {
            return bg0Var.getVideoDuration();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
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
            this.f27354a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            l71 l71Var = this.Q;
            l71Var.f26003q = f7;
            l71Var.a();
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
                this.f27356b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27357b0 = null;
        this.f27362f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.f27371r = null;
        this.U = null;
        this.f27375y = null;
        this.f27373w = false;
        this.P = false;
        this.f27359c0 = false;
        this.f27363f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27365h0);
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
        duration.setInterpolator(sr.f28339f);
        this.F.addUpdateListener(new t70(this, 3));
        this.F.addListener(new mg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            bg0 bg0Var = this.f27371r;
            if (bg0Var != null) {
                y3 = bg0Var.G;
            } else {
                t71 t71Var = photoViewer.F2;
                if (t71Var != null) {
                    y3 = t71Var.y();
                } else {
                    return;
                }
            }
            kg0 kg0Var = this.f27361e0;
            AndroidUtilities.cancelRunOnUIThread(kg0Var);
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
            AndroidUtilities.runOnUIThread(kg0Var, 500L);
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}
