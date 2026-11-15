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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.uj0;
public abstract class u9 {
    public final f9 A;
    public final Rect B;
    public t9 C;
    public c8.fa D;
    public uj0 E;
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
    public int f31735a;
    public final k9 f31736a0;
    public int f31737b;
    public int f31738b0;
    public int f31739c;
    public final OvershootInterpolator f31740c0;
    public int d;
    public int f31741d0;
    public boolean f31742e;
    public final c9 f31743e0;
    public float f31744f;
    public final c9 f31745f0;
    public float f31746g;
    public org.telegram.ui.ActionBar.e6 f31747g0;
    public final int[] h = new int[2];
    public boolean f31748h0;
    public boolean f31749i;
    public boolean f31750i0;
    public boolean f31751j;
    public boolean f31752j0;
    public boolean f31753k;
    public org.telegram.ui.s f31754k0;
    public final int f31755l;
    public ValueAnimator f31756l0;
    public final int f31757m;
    public final f m0;
    public final float f31758n;
    public final c9 f31759n0;
    public final Paint f31760o;
    public final o9 f31761o0;
    public final Paint f31762p;
    public final iq f31763q;
    public final Path f31764r;
    public int f31765s;
    public int f31766t;
    public int f31767u;
    public int v;
    public int f31768w;
    public int f31769x;
    public boolean f31770y;
    public boolean f31771z;

    public u9() {
        new Path().f30696a = 0.0f;
        Paint paint = new Paint(1);
        this.f31760o = paint;
        this.f31762p = new Paint(1);
        iq iqVar = new iq();
        this.f31763q = iqVar;
        this.f31764r = new Path();
        new Path().f30664a = iqVar;
        this.f31767u = -1;
        this.v = -1;
        this.A = new f9(this, new e9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f31736a0 = new Object();
        this.f31740c0 = new OvershootInterpolator();
        this.f31743e0 = new c9(this, 0);
        this.f31745f0 = new c9(this, 1);
        this.f31748h0 = true;
        this.f31754k0 = null;
        new ArrayList();
        this.m0 = new f(this, 9);
        this.f31759n0 = new c9(this, 2);
        ?? path = new Path();
        path.f30822a = 0.0f;
        path.f30823b = new ArrayList(1);
        path.f30824c = 0;
        this.f31761o0 = path;
        this.f31755l = ViewConfiguration.getLongPressTimeout();
        this.f31757m = ViewConfiguration.get(org.telegram.messenger.t0.f26600b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.f31758n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        iqVar.d = 1.0f;
    }

    public static void a(u9 u9Var, int i7) {
        int i10;
        int lineRight;
        int lineLeft;
        k9 k9Var = u9Var.f31736a0;
        if (Build.VERSION.SDK_INT >= 28 && u9Var.W != null && !u9Var.f31753k && u9Var.f31749i && u9Var.C != null) {
            if (u9Var.f31751j) {
                i10 = u9Var.f31767u;
            } else {
                i10 = u9Var.v;
            }
            u9Var.i(i10, k9Var, false);
            Layout layout = (Layout) k9Var.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i10 - k9Var.f30570a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l10 = u9Var.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + u9Var.f31737b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + k9Var.f30571b);
                p9 p9Var = u9Var.W;
                if (p9Var instanceof org.telegram.ui.s2) {
                    lineLeft = l10[0];
                    lineRight = ((View) p9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = l10[0] + u9Var.f31735a + k9Var.f30572c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + u9Var.f31735a + k9Var.f30572c);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i7 < lineLeft) {
                    i7 = lineLeft;
                } else if (i7 > lineRight) {
                    i7 = lineRight;
                }
                float f11 = lineTop;
                if (u9Var.I != f11) {
                    u9Var.I = f11;
                    u9Var.J = (f11 - u9Var.H) / 200.0f;
                }
                float f12 = i7;
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

    public static boolean y(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i7, int i10, boolean z10, float f10, float f11, p9 p9Var) {
        int i11;
        int i12;
        if (this.f31751j) {
            this.f31767u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.f31767u = i12;
                this.f31751j = false;
            }
            this.f31770y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.f31767u) > i10) {
            this.v = i11;
            this.f31767u = i10;
            this.f31751j = true;
        }
        this.f31770y = true;
    }

    public final int[] B(int i7) {
        k9 k9Var = this.f31736a0;
        i(i7, k9Var, false);
        Layout layout = (Layout) k9Var.d;
        int i10 = i7 - k9Var.f30570a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + k9Var.f30572c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + k9Var.f30571b);
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
        c9 c9Var = this.f31745f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f31766t - ((int) motionEvent.getY());
                    int x10 = this.f31765s - ((int) motionEvent.getX());
                    int i7 = (x10 * x10) + (y10 * y10);
                    int i10 = this.f31757m;
                    if (i7 > i10 * i10) {
                        org.telegram.messenger.g0.r(c9Var);
                        this.f31771z = false;
                    }
                    return this.f31771z;
                }
            }
            org.telegram.messenger.g0.r(c9Var);
            this.f31771z = false;
            return false;
        }
        this.f31765s = (int) motionEvent.getX();
        this.f31766t = (int) motionEvent.getY();
        this.f31771z = false;
        Rect rect = this.B;
        rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        if (rect.contains(this.f31765s, this.f31766t) && this.X != null) {
            rect.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            int i11 = this.f31765s;
            int i12 = this.f31766t;
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
            int k10 = u9Var.k(i15, i12, this.f31739c, this.d, this.X, true);
            CharSequence s5 = s(u9Var.X, true);
            if (k10 >= s5.length()) {
                k9 k9Var = u9Var.f31736a0;
                i(k10, k9Var, true);
                Layout layout = (Layout) k9Var.d;
                if (layout == null) {
                    u9Var.f31771z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - u9Var.f31739c;
                if (f10 < ((Layout) k9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) k9Var.d).getLineLeft(lineCount)) {
                    k10 = s5.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(c9Var);
                org.telegram.messenger.g0.i3(c9Var, u9Var.f31755l);
                u9Var.f31771z = true;
            }
        } else {
            u9Var = this;
        }
        return u9Var.f31771z;
    }

    public boolean P(int i7, int i10) {
        return false;
    }

    public final void Q(fi.d2 d2Var) {
        this.D = d2Var;
    }

    public final void R() {
        this.f31750i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof uj0) {
            this.E = (uj0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f31749i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.u3 u3Var = this.Y;
                f9 f9Var = this.A;
                if (u3Var == null) {
                    org.telegram.ui.ActionBar.u3 u3Var2 = new org.telegram.ui.ActionBar.u3(this.C.getContext(), f9Var, this.C, new org.telegram.ui.ActionBar.i4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = u3Var2;
                    f9Var.onCreateActionMode(u3Var2, u3Var2.f29728c);
                }
                org.telegram.ui.ActionBar.u3 u3Var3 = this.Y;
                f9Var.onPrepareActionMode(u3Var3, u3Var3.f29728c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.g0.r(this.f31759n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f31756l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f31756l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f31756l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f31756l0.start();
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

    public boolean c(int i7) {
        if (i7 != this.f31767u && i7 != this.v) {
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
        this.f31767u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f31768w = 0;
        org.telegram.messenger.g0.r(this.f31745f0);
        this.f31771z = false;
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        c8.fa faVar = this.D;
        if (faVar != null) {
            faVar.a(false);
        }
        this.f31765s = -1;
        this.f31766t = -1;
        this.f31739c = -1;
        this.d = -1;
        this.f31744f = 0.0f;
        this.f31746g = 0.0f;
        this.f31749i = false;
    }

    public final void g(Layout layout, int i7, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        iq iqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        o9 o9Var = this.f31761o0;
        o9Var.reset();
        layout.getSelectionPath(i10, i11, o9Var);
        if (o9Var.f30822a < layout.getLineBottom(i7)) {
            f12 = layout.getLineTop(i7);
            f11 = (layout.getLineBottom(i7) - lineTop) / (o9Var.f30822a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = o9Var.f30824c;
            iqVar = this.f31763q;
            f13 = this.f31758n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) o9Var.f30823b.get(i13);
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
            iqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 == 0 && !z11) {
            try {
                iqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i7), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i7), Path.Direction.CW);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u9.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i7, k9 k9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i7, int i10, int i11, int i12, p9 p9Var, boolean z10);

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
        return this.f31747g0;
    }

    public CharSequence r() {
        CharSequence s5 = s(this.W, false);
        if (s5 != null) {
            return s5.subSequence(this.f31767u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(p9 p9Var, boolean z10);

    public int t(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.f31747g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.u3 u3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f31759n0.run();
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
        if (this.f31767u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(gj gjVar) {
        if (gjVar == null || this.f31768w != gjVar.e1()) {
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
