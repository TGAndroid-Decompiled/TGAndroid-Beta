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
import org.telegram.messenger.fj;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.pq;
public abstract class w9 {
    public final h9 A;
    public final Rect B;
    public v9 C;
    public c8.ha D;
    public ck0 E;
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
    public org.telegram.ui.ActionBar.y3 Y;
    public boolean Z;
    public int f32237a;
    public final m9 f32238a0;
    public int f32239b;
    public int f32240b0;
    public int f32241c;
    public final OvershootInterpolator f32242c0;
    public int d;
    public int f32243d0;
    public boolean f32244e;
    public final e9 f32245e0;
    public float f32246f;
    public final e9 f32247f0;
    public float f32248g;
    public org.telegram.ui.ActionBar.i6 f32249g0;
    public final int[] h = new int[2];
    public boolean f32250h0;
    public boolean f32251i;
    public boolean f32252i0;
    public boolean f32253j;
    public boolean f32254j0;
    public boolean f32255k;
    public org.telegram.ui.s f32256k0;
    public final int f32257l;
    public ValueAnimator f32258l0;
    public final int f32259m;
    public final f m0;
    public final float f32260n;
    public final e9 f32261n0;
    public final Paint f32262o;
    public final q9 f32263o0;
    public final Paint f32264p;
    public final pq f32265q;
    public final Path f32266r;
    public int f32267s;
    public int f32268t;
    public int f32269u;
    public int v;
    public int f32270w;
    public int f32271x;
    public boolean f32272y;
    public boolean f32273z;

    public w9() {
        new Path().f31185a = 0.0f;
        Paint paint = new Paint(1);
        this.f32262o = paint;
        this.f32264p = new Paint(1);
        pq pqVar = new pq();
        this.f32265q = pqVar;
        this.f32266r = new Path();
        new Path().f31145a = pqVar;
        this.f32269u = -1;
        this.v = -1;
        this.A = new h9(this, new g9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f32238a0 = new Object();
        this.f32242c0 = new OvershootInterpolator();
        this.f32245e0 = new e9(this, 0);
        this.f32247f0 = new e9(this, 1);
        this.f32250h0 = true;
        this.f32256k0 = null;
        new ArrayList();
        this.m0 = new f(this, 9);
        this.f32261n0 = new e9(this, 2);
        ?? path = new Path();
        path.f31302a = 0.0f;
        path.f31303b = new ArrayList(1);
        path.f31304c = 0;
        this.f32263o0 = path;
        this.f32257l = ViewConfiguration.getLongPressTimeout();
        this.f32259m = ViewConfiguration.get(org.telegram.messenger.t0.f26913b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.f32260n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        pqVar.d = 1.0f;
    }

    public static void a(w9 w9Var, int i7) {
        int i10;
        int lineRight;
        int lineLeft;
        m9 m9Var = w9Var.f32238a0;
        if (Build.VERSION.SDK_INT >= 28 && w9Var.W != null && !w9Var.f32255k && w9Var.f32251i && w9Var.C != null) {
            if (w9Var.f32253j) {
                i10 = w9Var.f32269u;
            } else {
                i10 = w9Var.v;
            }
            w9Var.i(i10, m9Var, false);
            Layout layout = (Layout) m9Var.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i10 - m9Var.f31080a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l10 = w9Var.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + w9Var.f32239b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + m9Var.f31081b);
                r9 r9Var = w9Var.W;
                if (r9Var instanceof org.telegram.ui.s2) {
                    lineLeft = l10[0];
                    lineRight = ((View) r9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = l10[0] + w9Var.f32237a + m9Var.f31082c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + w9Var.f32237a + m9Var.f31082c);
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
        if (this.f32253j) {
            this.f32269u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.f32269u = i12;
                this.f32253j = false;
            }
            this.f32272y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.f32269u) > i10) {
            this.v = i11;
            this.f32269u = i10;
            this.f32253j = true;
        }
        this.f32272y = true;
    }

    public final int[] B(int i7) {
        m9 m9Var = this.f32238a0;
        i(i7, m9Var, false);
        Layout layout = (Layout) m9Var.d;
        int i10 = i7 - m9Var.f31080a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + m9Var.f31082c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + m9Var.f31081b);
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
        e9 e9Var = this.f32247f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f32268t - ((int) motionEvent.getY());
                    int x10 = this.f32267s - ((int) motionEvent.getX());
                    int i7 = (x10 * x10) + (y10 * y10);
                    int i10 = this.f32259m;
                    if (i7 > i10 * i10) {
                        org.telegram.messenger.g0.r(e9Var);
                        this.f32273z = false;
                    }
                    return this.f32273z;
                }
            }
            org.telegram.messenger.g0.r(e9Var);
            this.f32273z = false;
            return false;
        }
        this.f32267s = (int) motionEvent.getX();
        this.f32268t = (int) motionEvent.getY();
        this.f32273z = false;
        Rect rect = this.B;
        rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        if (rect.contains(this.f32267s, this.f32268t) && this.X != null) {
            rect.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            int i11 = this.f32267s;
            int i12 = this.f32268t;
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
            int k10 = w9Var.k(i15, i12, this.f32241c, this.d, this.X, true);
            CharSequence s5 = s(w9Var.X, true);
            if (k10 >= s5.length()) {
                m9 m9Var = w9Var.f32238a0;
                i(k10, m9Var, true);
                Layout layout = (Layout) m9Var.d;
                if (layout == null) {
                    w9Var.f32273z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - w9Var.f32241c;
                if (f10 < ((Layout) m9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) m9Var.d).getLineLeft(lineCount)) {
                    k10 = s5.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(e9Var);
                org.telegram.messenger.g0.h3(e9Var, w9Var.f32257l);
                w9Var.f32273z = true;
            }
        } else {
            w9Var = this;
        }
        return w9Var.f32273z;
    }

    public boolean P(int i7, int i10) {
        return false;
    }

    public final void Q(fi.b2 b2Var) {
        this.D = b2Var;
    }

    public final void R() {
        this.f32252i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof ck0) {
            this.E = (ck0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f32251i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.y3 y3Var = this.Y;
                h9 h9Var = this.A;
                if (y3Var == null) {
                    org.telegram.ui.ActionBar.y3 y3Var2 = new org.telegram.ui.ActionBar.y3(this.C.getContext(), h9Var, this.C, new org.telegram.ui.ActionBar.m4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = y3Var2;
                    h9Var.onCreateActionMode(y3Var2, y3Var2.f30274c);
                }
                org.telegram.ui.ActionBar.y3 y3Var3 = this.Y;
                h9Var.onPrepareActionMode(y3Var3, y3Var3.f30274c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.g0.r(this.f32261n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f32258l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f32258l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f32258l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f32258l0.start();
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
        if (i7 != this.f32269u && i7 != this.v) {
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
        this.f32269u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f32270w = 0;
        org.telegram.messenger.g0.r(this.f32247f0);
        this.f32273z = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        c8.ha haVar = this.D;
        if (haVar != null) {
            haVar.a(false);
        }
        this.f32267s = -1;
        this.f32268t = -1;
        this.f32241c = -1;
        this.d = -1;
        this.f32246f = 0.0f;
        this.f32248g = 0.0f;
        this.f32251i = false;
    }

    public final void g(Layout layout, int i7, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        pq pqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        q9 q9Var = this.f32263o0;
        q9Var.reset();
        layout.getSelectionPath(i10, i11, q9Var);
        if (q9Var.f31302a < layout.getLineBottom(i7)) {
            f12 = layout.getLineTop(i7);
            f11 = (layout.getLineBottom(i7) - lineTop) / (q9Var.f31302a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = q9Var.f31304c;
            pqVar = this.f32265q;
            f13 = this.f32260n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) q9Var.f31303b.get(i13);
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
            pqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 == 0 && !z11) {
            try {
                pqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i7), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i7), Path.Direction.CW);
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

    public org.telegram.ui.ActionBar.i6 q() {
        return this.f32249g0;
    }

    public CharSequence r() {
        CharSequence s5 = s(this.W, false);
        if (s5 != null) {
            return s5.subSequence(this.f32269u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(r9 r9Var, boolean z10);

    public int t(int i7) {
        return org.telegram.ui.ActionBar.n6.w0(i7, this.f32249g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.y3 y3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f32261n0.run();
        }
        this.P = false;
        if (!x() && (y3Var = this.Y) != null) {
            y3Var.finish();
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
        if (this.f32269u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(fj fjVar) {
        if (fjVar == null || this.f32270w != fjVar.e1()) {
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

    public void I(int i7, int i10, fj fjVar) {
    }
}
