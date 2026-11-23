package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.rq;
public abstract class w9 {
    public final h9 A;
    public final Rect B;
    public v9 C;
    public c8.ia D;
    public ek0 E;
    public ViewGroup F;
    public Magnifier G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final RectF S;
    public final RectF T;
    public float U;
    public float V;
    public r9 W;
    public r9 X;
    public org.telegram.ui.ActionBar.x3 Y;
    public boolean Z;
    public int f32234a;
    public final m9 f32235a0;
    public int f32236b;
    public int f32237b0;
    public int f32238c;
    public final OvershootInterpolator f32239c0;
    public int d;
    public int f32240d0;
    public boolean f32241e;
    public final e9 f32242e0;
    public float f32243f;
    public final e9 f32244f0;
    public float f32245g;
    public org.telegram.ui.ActionBar.h6 f32246g0;
    public final int[] h = new int[2];
    public boolean f32247h0;
    public boolean f32248i;
    public boolean f32249i0;
    public boolean f32250j;
    public boolean f32251j0;
    public boolean f32252k;
    public org.telegram.ui.s f32253k0;
    public final int f32254l;
    public ValueAnimator f32255l0;
    public final int f32256m;
    public final f m0;
    public final float f32257n;
    public final e9 f32258n0;
    public final Paint f32259o;
    public final q9 f32260o0;
    public final Paint f32261p;
    public final rq f32262q;
    public final Path f32263r;
    public int f32264s;
    public int f32265t;
    public int f32266u;
    public int v;
    public int f32267w;
    public int f32268x;
    public boolean f32269y;
    public boolean f32270z;

    public w9() {
        new Path().f31182a = 0.0f;
        Paint paint = new Paint(1);
        this.f32259o = paint;
        this.f32261p = new Paint(1);
        rq rqVar = new rq();
        this.f32262q = rqVar;
        this.f32263r = new Path();
        new Path().f31142a = rqVar;
        this.f32266u = -1;
        this.v = -1;
        this.A = new h9(this, new g9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f32235a0 = new Object();
        this.f32239c0 = new OvershootInterpolator();
        this.f32242e0 = new e9(this, 0);
        this.f32244f0 = new e9(this, 1);
        this.f32247h0 = true;
        this.f32253k0 = null;
        new ArrayList();
        this.m0 = new f(this, 9);
        this.f32258n0 = new e9(this, 2);
        ?? path = new Path();
        path.f31299a = 0.0f;
        path.f31300b = new ArrayList(1);
        path.f31301c = 0;
        this.f32260o0 = path;
        this.f32254l = ViewConfiguration.getLongPressTimeout();
        this.f32256m = ViewConfiguration.get(org.telegram.messenger.t0.f26895b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.f32257n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        rqVar.d = 1.0f;
    }

    public static void a(w9 w9Var, int i7) {
        int i10;
        int lineRight;
        int lineLeft;
        m9 m9Var = w9Var.f32235a0;
        if (Build.VERSION.SDK_INT >= 28 && w9Var.W != null && !w9Var.f32252k && w9Var.f32248i && w9Var.C != null) {
            if (w9Var.f32250j) {
                i10 = w9Var.f32266u;
            } else {
                i10 = w9Var.v;
            }
            w9Var.i(i10, m9Var, false);
            Layout layout = (Layout) m9Var.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i10 - m9Var.f31077a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l10 = w9Var.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + w9Var.f32236b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + m9Var.f31078b);
                r9 r9Var = w9Var.W;
                if (r9Var instanceof org.telegram.ui.s2) {
                    lineLeft = l10[0];
                    lineRight = ((View) r9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = l10[0] + w9Var.f32234a + m9Var.f31079c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + w9Var.f32234a + m9Var.f31079c);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i7 < lineLeft) {
                    i7 = lineLeft;
                } else if (i7 > lineRight) {
                    i7 = lineRight;
                }
                float f11 = lineTop;
                if (w9Var.I != f11) {
                    w9Var.I = f11;
                    w9Var.J = (f11 - w9Var.H) / 200.0f;
                }
                float f12 = i7;
                if (w9Var.L != f12) {
                    w9Var.L = f12;
                    w9Var.M = (f12 - w9Var.K) / 100.0f;
                }
                if (w9Var.G == null) {
                    w9Var.G = new Magnifier(w9Var.C);
                    w9Var.H = w9Var.I;
                    w9Var.K = w9Var.L;
                }
                float f13 = w9Var.H;
                float f14 = w9Var.I;
                if (f13 != f14) {
                    w9Var.H = (w9Var.J * 16.0f) + f13;
                }
                float f15 = w9Var.J;
                if (f15 > 0.0f && w9Var.H > f14) {
                    w9Var.H = f14;
                } else if (f15 < 0.0f && w9Var.H < f14) {
                    w9Var.H = f14;
                }
                float f16 = w9Var.K;
                float f17 = w9Var.L;
                if (f16 != f17) {
                    w9Var.K = (w9Var.M * 16.0f) + f16;
                }
                float f18 = w9Var.M;
                if (f18 > 0.0f && w9Var.K > f17) {
                    w9Var.K = f17;
                } else if (f18 < 0.0f && w9Var.K < f17) {
                    w9Var.K = f17;
                }
                w9Var.G.show(w9Var.K, (lineBottom * 1.5f) + w9Var.H + org.telegram.messenger.g0.L(8.0f));
                w9Var.G.update();
            }
        }
    }

    public static boolean y(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i7, int i10, boolean z10, float f10, float f11, r9 r9Var) {
        int i11;
        int i12;
        if (this.f32250j) {
            this.f32266u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.f32266u = i12;
                this.f32250j = false;
            }
            this.f32269y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.f32266u) > i10) {
            this.v = i11;
            this.f32266u = i10;
            this.f32250j = true;
        }
        this.f32269y = true;
    }

    public final int[] B(int i7) {
        m9 m9Var = this.f32235a0;
        i(i7, m9Var, false);
        Layout layout = (Layout) m9Var.d;
        int i10 = i7 - m9Var.f31077a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + m9Var.f31079c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + m9Var.f31078b);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        v9 v9Var;
        if (x() && (v9Var = this.C) != null) {
            this.Q = true;
            v9Var.invalidate();
            u();
        }
    }

    public boolean J() {
        return false;
    }

    public abstract void L(r9 r9Var, r9 r9Var2);

    public final boolean M(MotionEvent motionEvent) {
        w9 w9Var;
        int action = motionEvent.getAction();
        e9 e9Var = this.f32244f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f32265t - ((int) motionEvent.getY());
                    int x10 = this.f32264s - ((int) motionEvent.getX());
                    int i7 = (x10 * x10) + (y10 * y10);
                    int i10 = this.f32256m;
                    if (i7 > i10 * i10) {
                        org.telegram.messenger.g0.r(e9Var);
                        this.f32270z = false;
                    }
                    return this.f32270z;
                }
            }
            org.telegram.messenger.g0.r(e9Var);
            this.f32270z = false;
            return false;
        }
        this.f32264s = (int) motionEvent.getX();
        this.f32265t = (int) motionEvent.getY();
        this.f32270z = false;
        Rect rect = this.B;
        rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        if (rect.contains(this.f32264s, this.f32265t) && this.X != null) {
            rect.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            int i11 = this.f32264s;
            int i12 = this.f32265t;
            int i13 = rect.right;
            if (i11 > i13) {
                i11 = i13 - 1;
            }
            int i14 = rect.left;
            if (i11 < i14) {
                i11 = i14 + 1;
            }
            int i15 = i11;
            int i16 = rect.top;
            if (i12 < i16) {
                i12 = i16 + 1;
            }
            int i17 = rect.bottom;
            if (i12 > i17) {
                i12 = i17 - 1;
            }
            w9Var = this;
            int k10 = w9Var.k(i15, i12, this.f32238c, this.d, this.X, true);
            CharSequence s5 = s(w9Var.X, true);
            if (k10 >= s5.length()) {
                m9 m9Var = w9Var.f32235a0;
                i(k10, m9Var, true);
                Layout layout = (Layout) m9Var.d;
                if (layout == null) {
                    w9Var.f32270z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - w9Var.f32238c;
                if (f10 < ((Layout) m9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) m9Var.d).getLineLeft(lineCount)) {
                    k10 = s5.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(e9Var);
                org.telegram.messenger.g0.h3(e9Var, w9Var.f32254l);
                w9Var.f32270z = true;
            }
        } else {
            w9Var = this;
        }
        return w9Var.f32270z;
    }

    public boolean P(int i7, int i10) {
        return false;
    }

    public final void Q(fi.b2 b2Var) {
        this.D = b2Var;
    }

    public final void R() {
        this.f32249i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof ek0) {
            this.E = (ek0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f32248i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.x3 x3Var = this.Y;
                h9 h9Var = this.A;
                if (x3Var == null) {
                    org.telegram.ui.ActionBar.x3 x3Var2 = new org.telegram.ui.ActionBar.x3(this.C.getContext(), h9Var, this.C, new org.telegram.ui.ActionBar.l4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = x3Var2;
                    h9Var.onCreateActionMode(x3Var2, x3Var2.f30226c);
                }
                org.telegram.ui.ActionBar.x3 x3Var3 = this.Y;
                h9Var.onPrepareActionMode(x3Var3, x3Var3.f30226c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.g0.r(this.f32258n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f32255l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f32255l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f32255l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f32255l0.start();
        }
    }

    public final void V() {
        this.Q = false;
        this.C.invalidate();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i7) {
        if (i7 != this.f32266u && i7 != this.v) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.W != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f(boolean z10) {
        E(z10);
        this.f32266u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f32267w = 0;
        org.telegram.messenger.g0.r(this.f32244f0);
        this.f32270z = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        c8.ia iaVar = this.D;
        if (iaVar != null) {
            iaVar.a(false);
        }
        this.f32264s = -1;
        this.f32265t = -1;
        this.f32238c = -1;
        this.d = -1;
        this.f32243f = 0.0f;
        this.f32245g = 0.0f;
        this.f32248i = false;
    }

    public final void g(Layout layout, int i7, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        rq rqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        q9 q9Var = this.f32260o0;
        q9Var.reset();
        layout.getSelectionPath(i10, i11, q9Var);
        if (q9Var.f31299a < layout.getLineBottom(i7)) {
            f12 = layout.getLineTop(i7);
            f11 = (layout.getLineBottom(i7) - lineTop) / (q9Var.f31299a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = q9Var.f31301c;
            rqVar = this.f32262q;
            f13 = this.f32257n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) q9Var.f31300b.get(i13);
            float max = Math.max(f10, rectF.left);
            if (z10) {
                f14 = f13 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            float f16 = (int) (max - f14);
            float z12 = (int) com.google.android.gms.internal.vision.e2.z(rectF.top, f12, f11, f12);
            float max2 = Math.max(f10, rectF.right);
            if (z11) {
                f15 = f13 / 2.0f;
            } else {
                f15 = 0.0f;
            }
            rectF.set(f16, z12, (int) (max2 + f15), (int) com.google.android.gms.internal.vision.e2.z(rectF.bottom, f12, f11, f12));
            rqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 == 0 && !z11) {
            try {
                rqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i7), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i7), Path.Direction.CW);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w9.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i7, m9 m9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i7, int i10, int i11, int i12, r9 r9Var, boolean z10);

    public final int[] l() {
        int i7;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            i7 = 0;
            int i11 = 0;
            while (view != this.F) {
                if (view != null) {
                    i7 = (int) (view.getY() + i7);
                    i11 = (int) (view.getX() + i11);
                    if (view instanceof NestedScrollView) {
                        i7 -= view.getScrollY();
                        i11 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i10 = i11;
            return new int[]{i10, i7};
        }
        i7 = 0;
        return new int[]{i10, i7};
    }

    public abstract int m();

    public final v9 n(Context context) {
        if (this.C == null) {
            this.C = new v9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.h6 q() {
        return this.f32246g0;
    }

    public CharSequence r() {
        CharSequence s5 = s(this.W, false);
        if (s5 != null) {
            return s5.subSequence(this.f32266u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(r9 r9Var, boolean z10);

    public int t(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.f32246g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.x3 x3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f32258n0.run();
        }
        this.P = false;
        if (!x() && (x3Var = this.Y) != null) {
            x3Var.finish();
            this.Y = null;
        }
    }

    public final void v() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT >= 28 && (magnifier = this.G) != null) {
            magnifier.dismiss();
            this.G = null;
        }
    }

    public void w() {
        r9 r9Var = this.W;
        if (r9Var != null) {
            r9Var.invalidate();
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
    }

    public final boolean x() {
        if (this.f32266u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(gj gjVar) {
        if (gjVar == null || this.f32267w != gjVar.e1()) {
            return false;
        }
        return true;
    }

    public void E(boolean z10) {
    }

    public void D() {
    }

    public void F() {
    }

    public void H() {
    }

    public void N() {
    }

    public void O() {
    }

    public void K(float f10, float f11) {
    }

    public void I(int i7, int i10, gj gjVar) {
    }
}
