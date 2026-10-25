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
public final class ch0 implements uf.a {
    public static final pw0 f27155n0 = new pw0(new qd0(7), new qd0(8));
    public static final pw0 f27156o0 = new pw0(new qd0(9), new qd0(10));
    public static final ch0 f27157p0 = new ch0();
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
    public qp0 R;
    public int S;
    public int T;
    public dv U;
    public PhotoViewer V;
    public sf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float f27159a0;
    public WindowManager f27160b;
    public di.h3 f27161b0;
    public WindowManager.LayoutParams f27162c;
    public boolean f27163c0;
    public org.telegram.ui.e d;
    public boolean f27164d0;
    public bh0 e;
    public View f27166f;
    public boolean f27167f0;
    public bh0 h;
    public boolean f27170i0;
    public View f27172k0;
    public TextureView f27173l0;
    public boolean m0;
    public boolean f27174n;
    public mg0 f27175r;
    public ScaleGestureDetector f27176s;
    public jg.i v;
    public boolean f27177w;
    public boolean f27178x;
    public View f27179y;
    public float f27158a = 1.4f;
    public float J = 1.0f;
    public final j81 Q = new j81(false);
    public final xg0 f27165e0 = new xg0(this, 1);
    public float[] f27168g0 = new float[2];
    public final xg0 f27169h0 = new xg0(this, 2);
    public final xg0 f27171j0 = new xg0(this, 3);

    public static void j(boolean z10) {
        f27157p0.k(z10, false);
    }

    public static hl0 o(float f7, boolean z10) {
        float dp;
        ?? obj = new Object();
        float f10 = 1.0f / f7;
        ch0 ch0Var = f27157p0;
        if (ch0Var.P && !z10) {
            obj.f29007a = ch0Var.K;
            obj.f29008b = ch0Var.L + AndroidUtilities.statusBarHeight;
            obj.f29009c = ch0Var.H;
            obj.d = ch0Var.I;
            return obj;
        }
        float f11 = ((SharedPreferences) ch0Var.n().f17210b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) ch0Var.n().f17210b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) ch0Var.n().f17210b).getFloat("scale_factor", 1.0f);
        obj.f29009c = s(f10) * f13;
        obj.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = obj.f29009c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            if (f15 >= f16 / 2.0f) {
                dp = (f16 - f14) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            obj.f29007a = dp;
        } else {
            obj.f29007a = (AndroidUtilities.displaySize.x - obj.f29009c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            obj.f29008b = a8.ee.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - obj.d) + AndroidUtilities.statusBarHeight;
            return obj;
        }
        obj.f29008b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return obj;
    }

    public static sf.d p() {
        ch0 ch0Var = f27157p0;
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
        ch0 ch0Var = f27157p0;
        j81 j81Var = ch0Var.Q;
        j81Var.e(false);
        j81Var.d(!z10);
        j81Var.f(true);
        di.h3 h3Var = ch0Var.f27161b0;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        bh0 bh0Var = ch0Var.h;
        if (bh0Var != null) {
            bh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ch0 ch0Var = f27157p0;
        ch0Var.V = photoViewer;
        s81 s81Var = photoViewer.F2;
        sf.d dVar = ch0Var.W;
        if (dVar != null) {
            dVar.c();
            ch0Var.W = null;
        }
        if (s81Var != null && vf.b.a(photoViewer.f35822y) == 1) {
            sf.c cVar = new sf.c(photoViewer.f35822y, ch0Var);
            cVar.f48117c = "photo-viewer-pip-" + s81Var.f32455a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.f48121j = ch0Var.d;
            cVar.f48122k = ch0Var.f27172k0;
            int i10 = ch0Var.S;
            int i11 = ch0Var.T;
            cVar.h = i10;
            cVar.f48120i = i11;
            cVar.f48119g = s81Var.d;
            cVar.f48118f = true;
            ch0Var.W = cVar.a();
        }
        ch0Var.z();
    }

    public static boolean x(boolean r24, android.app.Activity r25, org.telegram.ui.Components.mg0 r26, android.view.View r27, int r28, int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.x(boolean, android.app.Activity, org.telegram.ui.Components.mg0, android.view.View, int, int, boolean):boolean");
    }

    @Override
    public final void a(a8.fg fgVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = fgVar;
        }
        this.f27160b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override
    public final void b(a8.fg fgVar) {
        s81 s81Var;
        sf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f27162c;
            int width = ((Rect) this.W.h.f16247a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f27162c;
            int height = ((Rect) this.W.h.f16247a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.f27160b.addView(this.d, this.f27162c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null) {
            s81Var = photoViewer.F2;
        } else {
            s81Var = null;
        }
        if (s81Var == null) {
            return;
        }
        photoViewer.Q8 = fgVar;
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f27173l0;
        if (textureView != null && textureView.isAvailable()) {
            return this.f27173l0.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && (textureView = photoViewer.f35806w3) != null && textureView.isAvailable()) {
            return this.V.f35806w3.getBitmap();
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
        this.f27173l0 = textureView;
        textureView.setVisibility(4);
        this.f27173l0.setOpaque(false);
        this.f27173l0.setSurfaceTextureListener(new v50(this, 1));
        return this.f27173l0;
    }

    public final void i() {
        org.telegram.ui.xs0 xs0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (xs0Var = photoViewer.f35629c4) == null) {
            return;
        }
        xs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f27163c0) {
            return;
        }
        this.f27163c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f27170i0) {
            AndroidUtilities.cancelRunOnUIThread(this.f27171j0);
            this.f27170i0 = false;
        }
        o1.j jVar = this.M;
        if (jVar != null) {
            jVar.c();
            this.N.c();
        }
        if (!z10 && this.d != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ds.f27584f);
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
        mg0 mg0Var = this.f27175r;
        if (mg0Var != null) {
            return mg0Var.getCurrentPosition();
        }
        s81 s81Var = this.V.F2;
        if (s81Var == null) {
            return 0L;
        }
        return s81Var.n();
    }

    public final long m() {
        mg0 mg0Var = this.f27175r;
        if (mg0Var != null) {
            return mg0Var.getVideoDuration();
        }
        s81 s81Var = this.V.F2;
        if (s81Var == null) {
            return 0L;
        }
        return s81Var.p();
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
            this.f27158a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            if (this.O.floatValue() < 1.0f) {
                f7 = 0.6f;
            } else {
                f7 = 0.45f;
            }
            j81 j81Var = this.Q;
            j81Var.f29527q = f7;
            j81Var.a();
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
                this.f27160b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.f27161b0 = null;
        this.f27166f = null;
        this.V = null;
        sf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
            this.W = null;
        }
        this.f27175r = null;
        this.U = null;
        this.f27179y = null;
        this.f27177w = false;
        this.P = false;
        this.f27163c0 = false;
        this.f27167f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.f27169h0);
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
        duration.setInterpolator(ds.f27584f);
        this.F.addUpdateListener(new e80(this, 4));
        this.F.addListener(new zg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && this.X != null) {
            mg0 mg0Var = this.f27175r;
            if (mg0Var != null) {
                y3 = mg0Var.G;
            } else {
                s81 s81Var = photoViewer.F2;
                if (s81Var != null) {
                    y3 = s81Var.y();
                } else {
                    return;
                }
            }
            xg0 xg0Var = this.f27165e0;
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
