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
import b8.hf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.tj0;
public abstract class u9 {
    public final f9 A;
    public final Rect B;
    public t9 C;
    public hf D;
    public tj0 E;
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
    public p9 W;
    public p9 X;
    public org.telegram.ui.ActionBar.u3 Y;
    public boolean Z;
    public int f30659a;
    public final k9 f30660a0;
    public int f30661b;
    public int f30662b0;
    public int f30663c;
    public final OvershootInterpolator f30664c0;
    public int d;
    public int f30665d0;
    public boolean f30666e;
    public final c9 f30667e0;
    public float f30668f;
    public final c9 f30669f0;
    public float f30670g;
    public org.telegram.ui.ActionBar.e6 f30671g0;
    public final int[] h = new int[2];
    public boolean f30672h0;
    public boolean f30673i;
    public boolean f30674i0;
    public boolean f30675j;
    public boolean f30676j0;
    public boolean f30677k;
    public org.telegram.ui.s f30678k0;
    public final int f30679l;
    public ValueAnimator f30680l0;
    public final int f30681m;
    public final f m0;
    public final float f30682n;
    public final c9 f30683n0;
    public final Paint f30684o;
    public final o9 f30685o0;
    public final Paint f30686p;
    public final bq f30687q;
    public final Path f30688r;
    public int f30689s;
    public int f30690t;
    public int f30691u;
    public int v;
    public int f30692w;
    public int f30693x;
    public boolean f30694y;
    public boolean f30695z;

    public u9() {
        new Path().f29635a = 0.0f;
        Paint paint = new Paint(1);
        this.f30684o = paint;
        this.f30686p = new Paint(1);
        bq bqVar = new bq();
        this.f30687q = bqVar;
        this.f30688r = new Path();
        new Path().f29603a = bqVar;
        this.f30691u = -1;
        this.v = -1;
        this.A = new f9(this, new e9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f30660a0 = new Object();
        this.f30664c0 = new OvershootInterpolator();
        this.f30667e0 = new c9(this, 0);
        this.f30669f0 = new c9(this, 1);
        this.f30672h0 = true;
        this.f30678k0 = null;
        new ArrayList();
        this.m0 = new f(this, 8);
        this.f30683n0 = new c9(this, 2);
        ?? path = new Path();
        path.f29761a = 0.0f;
        path.f29762b = new ArrayList(1);
        path.f29763c = 0;
        this.f30685o0 = path;
        this.f30679l = ViewConfiguration.getLongPressTimeout();
        this.f30681m = ViewConfiguration.get(org.telegram.messenger.t0.f25457b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.f30682n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        bqVar.d = 1.0f;
    }

    public static void a(u9 u9Var, int i3) {
        int i10;
        int lineRight;
        int lineLeft;
        k9 k9Var = u9Var.f30660a0;
        if (Build.VERSION.SDK_INT >= 28 && u9Var.W != null && !u9Var.f30677k && u9Var.f30673i && u9Var.C != null) {
            if (u9Var.f30675j) {
                i10 = u9Var.f30691u;
            } else {
                i10 = u9Var.v;
            }
            u9Var.i(i10, k9Var, false);
            Layout layout = (Layout) k9Var.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i10 - k9Var.f29509a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l10 = u9Var.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + u9Var.f30661b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + k9Var.f29510b);
                p9 p9Var = u9Var.W;
                if (p9Var instanceof org.telegram.ui.t2) {
                    lineLeft = l10[0];
                    lineRight = ((View) p9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = l10[0] + u9Var.f30659a + k9Var.f29511c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + u9Var.f30659a + k9Var.f29511c);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i3 < lineLeft) {
                    i3 = lineLeft;
                } else if (i3 > lineRight) {
                    i3 = lineRight;
                }
                float f11 = lineTop;
                if (u9Var.I != f11) {
                    u9Var.I = f11;
                    u9Var.J = (f11 - u9Var.H) / 200.0f;
                }
                float f12 = i3;
                if (u9Var.L != f12) {
                    u9Var.L = f12;
                    u9Var.M = (f12 - u9Var.K) / 100.0f;
                }
                if (u9Var.G == null) {
                    u9Var.G = new Magnifier(u9Var.C);
                    u9Var.H = u9Var.I;
                    u9Var.K = u9Var.L;
                }
                float f13 = u9Var.H;
                float f14 = u9Var.I;
                if (f13 != f14) {
                    u9Var.H = (u9Var.J * 16.0f) + f13;
                }
                float f15 = u9Var.J;
                if (f15 > 0.0f && u9Var.H > f14) {
                    u9Var.H = f14;
                } else if (f15 < 0.0f && u9Var.H < f14) {
                    u9Var.H = f14;
                }
                float f16 = u9Var.K;
                float f17 = u9Var.L;
                if (f16 != f17) {
                    u9Var.K = (u9Var.M * 16.0f) + f16;
                }
                float f18 = u9Var.M;
                if (f18 > 0.0f && u9Var.K > f17) {
                    u9Var.K = f17;
                } else if (f18 < 0.0f && u9Var.K < f17) {
                    u9Var.K = f17;
                }
                u9Var.G.show(u9Var.K, (lineBottom * 1.5f) + u9Var.H + org.telegram.messenger.g0.L(8.0f));
                u9Var.G.update();
            }
        }
    }

    public static boolean y(char c2) {
        if (!Character.isLetter(c2) && !Character.isDigit(c2) && c2 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i3, int i10, boolean z10, float f10, float f11, p9 p9Var) {
        int i11;
        int i12;
        if (this.f30675j) {
            this.f30691u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.f30691u = i12;
                this.f30675j = false;
            }
            this.f30694y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.f30691u) > i10) {
            this.v = i11;
            this.f30691u = i10;
            this.f30675j = true;
        }
        this.f30694y = true;
    }

    public final int[] B(int i3) {
        k9 k9Var = this.f30660a0;
        i(i3, k9Var, false);
        Layout layout = (Layout) k9Var.d;
        int i10 = i3 - k9Var.f29509a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + k9Var.f29511c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + k9Var.f29510b);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        t9 t9Var;
        if (x() && (t9Var = this.C) != null) {
            this.Q = true;
            t9Var.invalidate();
            u();
        }
    }

    public boolean J() {
        return false;
    }

    public abstract void L(p9 p9Var, p9 p9Var2);

    public final boolean M(MotionEvent motionEvent) {
        u9 u9Var;
        int action = motionEvent.getAction();
        c9 c9Var = this.f30669f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y9 = this.f30690t - ((int) motionEvent.getY());
                    int x10 = this.f30689s - ((int) motionEvent.getX());
                    int i3 = (x10 * x10) + (y9 * y9);
                    int i10 = this.f30681m;
                    if (i3 > i10 * i10) {
                        org.telegram.messenger.g0.r(c9Var);
                        this.f30695z = false;
                    }
                    return this.f30695z;
                }
            }
            org.telegram.messenger.g0.r(c9Var);
            this.f30695z = false;
            return false;
        }
        this.f30689s = (int) motionEvent.getX();
        this.f30690t = (int) motionEvent.getY();
        this.f30695z = false;
        Rect rect = this.B;
        rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        if (rect.contains(this.f30689s, this.f30690t) && this.X != null) {
            rect.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            int i11 = this.f30689s;
            int i12 = this.f30690t;
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
            u9Var = this;
            int k10 = u9Var.k(i15, i12, this.f30663c, this.d, this.X, true);
            CharSequence s6 = s(u9Var.X, true);
            if (k10 >= s6.length()) {
                k9 k9Var = u9Var.f30660a0;
                i(k10, k9Var, true);
                Layout layout = (Layout) k9Var.d;
                if (layout == null) {
                    u9Var.f30695z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - u9Var.f30663c;
                if (f10 < ((Layout) k9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) k9Var.d).getLineLeft(lineCount)) {
                    k10 = s6.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s6.length() && s6.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(c9Var);
                org.telegram.messenger.g0.i3(c9Var, u9Var.f30679l);
                u9Var.f30695z = true;
            }
        } else {
            u9Var = this;
        }
        return u9Var.f30695z;
    }

    public boolean P(int i3, int i10) {
        return false;
    }

    public final void Q(ei.l2 l2Var) {
        this.D = l2Var;
    }

    public final void R() {
        this.f30674i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof tj0) {
            this.E = (tj0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f30673i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.u3 u3Var = this.Y;
                f9 f9Var = this.A;
                if (u3Var == null) {
                    org.telegram.ui.ActionBar.u3 u3Var2 = new org.telegram.ui.ActionBar.u3(this.C.getContext(), f9Var, this.C, new org.telegram.ui.ActionBar.k4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = u3Var2;
                    f9Var.onCreateActionMode(u3Var2, u3Var2.f28677c);
                }
                org.telegram.ui.ActionBar.u3 u3Var3 = this.Y;
                f9Var.onPrepareActionMode(u3Var3, u3Var3.f28677c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.g0.r(this.f30683n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f30680l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f30680l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f30680l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f30680l0.start();
        }
    }

    public final void V() {
        this.Q = false;
        this.C.invalidate();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.h3(fVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i3) {
        if (i3 != this.f30691u && i3 != this.v) {
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
        this.f30691u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f30692w = 0;
        org.telegram.messenger.g0.r(this.f30669f0);
        this.f30695z = false;
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        hf hfVar = this.D;
        if (hfVar != null) {
            hfVar.a(false);
        }
        this.f30689s = -1;
        this.f30690t = -1;
        this.f30663c = -1;
        this.d = -1;
        this.f30668f = 0.0f;
        this.f30670g = 0.0f;
        this.f30673i = false;
    }

    public final void g(Layout layout, int i3, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        bq bqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        o9 o9Var = this.f30685o0;
        o9Var.reset();
        layout.getSelectionPath(i10, i11, o9Var);
        if (o9Var.f29761a < layout.getLineBottom(i3)) {
            f12 = layout.getLineTop(i3);
            f11 = (layout.getLineBottom(i3) - lineTop) / (o9Var.f29761a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = o9Var.f29763c;
            bqVar = this.f30687q;
            f13 = this.f30682n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) o9Var.f29762b.get(i13);
            float max = Math.max(f10, rectF.left);
            if (z10) {
                f14 = f13 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            float f16 = (int) (max - f14);
            float y9 = (int) com.google.android.recaptcha.internal.a.y(rectF.top, f12, f11, f12);
            float max2 = Math.max(f10, rectF.right);
            if (z11) {
                f15 = f13 / 2.0f;
            } else {
                f15 = 0.0f;
            }
            rectF.set(f16, y9, (int) (max2 + f15), (int) com.google.android.recaptcha.internal.a.y(rectF.bottom, f12, f11, f12));
            bqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 == 0 && !z11) {
            try {
                bqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i3), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i3), Path.Direction.CW);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u9.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i3, k9 k9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i3, int i10, int i11, int i12, p9 p9Var, boolean z10);

    public final int[] l() {
        int i3;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            i3 = 0;
            int i11 = 0;
            while (view != this.F) {
                if (view != null) {
                    i3 = (int) (view.getY() + i3);
                    i11 = (int) (view.getX() + i11);
                    if (view instanceof NestedScrollView) {
                        i3 -= view.getScrollY();
                        i11 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i10 = i11;
            return new int[]{i10, i3};
        }
        i3 = 0;
        return new int[]{i10, i3};
    }

    public abstract int m();

    public final t9 n(Context context) {
        if (this.C == null) {
            this.C = new t9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.e6 q() {
        return this.f30671g0;
    }

    public CharSequence r() {
        CharSequence s6 = s(this.W, false);
        if (s6 != null) {
            return s6.subSequence(this.f30691u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(p9 p9Var, boolean z10);

    public int t(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.f30671g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.u3 u3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f30683n0.run();
        }
        this.P = false;
        if (!x() && (u3Var = this.Y) != null) {
            u3Var.finish();
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
        p9 p9Var = this.W;
        if (p9Var != null) {
            p9Var.invalidate();
        }
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.invalidate();
        }
    }

    public final boolean x() {
        if (this.f30691u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(zi ziVar) {
        if (ziVar == null || this.f30692w != ziVar.f1()) {
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

    public void I(int i3, int i10, zi ziVar) {
    }
}
