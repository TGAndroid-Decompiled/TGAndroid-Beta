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
import org.telegram.messenger.ij;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.pj0;
public abstract class v9 {
    public final g9 A;
    public final Rect B;
    public u9 C;
    public c8.da D;
    public pj0 E;
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
    public q9 W;
    public q9 X;
    public org.telegram.ui.ActionBar.w3 Y;
    public boolean Z;
    public int f30648a;
    public final l9 f30649a0;
    public int f30650b;
    public int f30651b0;
    public int f30652c;
    public final OvershootInterpolator f30653c0;
    public int d;
    public int f30654d0;
    public boolean f30655e;
    public final d9 f30656e0;
    public float f30657f;
    public final d9 f30658f0;
    public float f30659g;
    public org.telegram.ui.ActionBar.f6 f30660g0;
    public final int[] h = new int[2];
    public boolean f30661h0;
    public boolean f30662i;
    public boolean f30663i0;
    public boolean f30664j;
    public boolean f30665j0;
    public boolean f30666k;
    public org.telegram.ui.s f30667k0;
    public final int f30668l;
    public ValueAnimator f30669l0;
    public final int f30670m;
    public final f m0;
    public final float f30671n;
    public final d9 f30672n0;
    public final Paint f30673o;
    public final p9 f30674o0;
    public final Paint f30675p;
    public final aq f30676q;
    public final Path f30677r;
    public int f30678s;
    public int f30679t;
    public int f30680u;
    public int v;
    public int f30681w;
    public int f30682x;
    public boolean f30683y;
    public boolean f30684z;

    public v9() {
        new Path().f29625a = 0.0f;
        Paint paint = new Paint(1);
        this.f30673o = paint;
        this.f30675p = new Paint(1);
        aq aqVar = new aq();
        this.f30676q = aqVar;
        this.f30677r = new Path();
        new Path().f29578a = aqVar;
        this.f30680u = -1;
        this.v = -1;
        this.A = new g9(this, new f9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f30649a0 = new Object();
        this.f30653c0 = new OvershootInterpolator();
        this.f30656e0 = new d9(this, 0);
        this.f30658f0 = new d9(this, 1);
        this.f30661h0 = true;
        this.f30667k0 = null;
        new ArrayList();
        this.m0 = new f(this, 8);
        this.f30672n0 = new d9(this, 2);
        ?? path = new Path();
        path.f29748a = 0.0f;
        path.f29749b = new ArrayList(1);
        path.f29750c = 0;
        this.f30674o0 = path;
        this.f30668l = ViewConfiguration.getLongPressTimeout();
        this.f30670m = ViewConfiguration.get(org.telegram.messenger.t0.f25566b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.f30671n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        aqVar.d = 1.0f;
    }

    public static void a(v9 v9Var, int i7) {
        int i10;
        int lineRight;
        int lineLeft;
        l9 l9Var = v9Var.f30649a0;
        if (Build.VERSION.SDK_INT >= 28 && v9Var.W != null && !v9Var.f30666k && v9Var.f30662i && v9Var.C != null) {
            if (v9Var.f30664j) {
                i10 = v9Var.f30680u;
            } else {
                i10 = v9Var.v;
            }
            v9Var.i(i10, l9Var, false);
            Layout layout = (Layout) l9Var.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i10 - l9Var.f29520a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l10 = v9Var.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + v9Var.f30650b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + l9Var.f29521b);
                q9 q9Var = v9Var.W;
                if (q9Var instanceof org.telegram.ui.s2) {
                    lineLeft = l10[0];
                    lineRight = ((View) q9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = l10[0] + v9Var.f30648a + l9Var.f29522c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + v9Var.f30648a + l9Var.f29522c);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i7 < lineLeft) {
                    i7 = lineLeft;
                } else if (i7 > lineRight) {
                    i7 = lineRight;
                }
                float f11 = lineTop;
                if (v9Var.I != f11) {
                    v9Var.I = f11;
                    v9Var.J = (f11 - v9Var.H) / 200.0f;
                }
                float f12 = i7;
                if (v9Var.L != f12) {
                    v9Var.L = f12;
                    v9Var.M = (f12 - v9Var.K) / 100.0f;
                }
                if (v9Var.G == null) {
                    v9Var.G = new Magnifier(v9Var.C);
                    v9Var.H = v9Var.I;
                    v9Var.K = v9Var.L;
                }
                float f13 = v9Var.H;
                float f14 = v9Var.I;
                if (f13 != f14) {
                    v9Var.H = (v9Var.J * 16.0f) + f13;
                }
                float f15 = v9Var.J;
                if (f15 > 0.0f && v9Var.H > f14) {
                    v9Var.H = f14;
                } else if (f15 < 0.0f && v9Var.H < f14) {
                    v9Var.H = f14;
                }
                float f16 = v9Var.K;
                float f17 = v9Var.L;
                if (f16 != f17) {
                    v9Var.K = (v9Var.M * 16.0f) + f16;
                }
                float f18 = v9Var.M;
                if (f18 > 0.0f && v9Var.K > f17) {
                    v9Var.K = f17;
                } else if (f18 < 0.0f && v9Var.K < f17) {
                    v9Var.K = f17;
                }
                v9Var.G.show(v9Var.K, (lineBottom * 1.5f) + v9Var.H + org.telegram.messenger.g0.L(8.0f));
                v9Var.G.update();
            }
        }
    }

    public static boolean y(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i7, int i10, boolean z9, float f10, float f11, q9 q9Var) {
        int i11;
        int i12;
        if (this.f30664j) {
            this.f30680u = i10;
            if (!z9 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.f30680u = i12;
                this.f30664j = false;
            }
            this.f30683y = true;
            return;
        }
        this.v = i10;
        if (!z9 && (i11 = this.f30680u) > i10) {
            this.v = i11;
            this.f30680u = i10;
            this.f30664j = true;
        }
        this.f30683y = true;
    }

    public final int[] B(int i7) {
        l9 l9Var = this.f30649a0;
        i(i7, l9Var, false);
        Layout layout = (Layout) l9Var.d;
        int i10 = i7 - l9Var.f29520a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + l9Var.f29522c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + l9Var.f29521b);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        u9 u9Var;
        if (x() && (u9Var = this.C) != null) {
            this.Q = true;
            u9Var.invalidate();
            u();
        }
    }

    public boolean J() {
        return false;
    }

    public abstract void L(q9 q9Var, q9 q9Var2);

    public final boolean M(MotionEvent motionEvent) {
        v9 v9Var;
        int action = motionEvent.getAction();
        d9 d9Var = this.f30658f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f30679t - ((int) motionEvent.getY());
                    int x10 = this.f30678s - ((int) motionEvent.getX());
                    int i7 = (x10 * x10) + (y10 * y10);
                    int i10 = this.f30670m;
                    if (i7 > i10 * i10) {
                        org.telegram.messenger.g0.r(d9Var);
                        this.f30684z = false;
                    }
                    return this.f30684z;
                }
            }
            org.telegram.messenger.g0.r(d9Var);
            this.f30684z = false;
            return false;
        }
        this.f30678s = (int) motionEvent.getX();
        this.f30679t = (int) motionEvent.getY();
        this.f30684z = false;
        Rect rect = this.B;
        rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        if (rect.contains(this.f30678s, this.f30679t) && this.X != null) {
            rect.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            int i11 = this.f30678s;
            int i12 = this.f30679t;
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
            v9Var = this;
            int k10 = v9Var.k(i15, i12, this.f30652c, this.d, this.X, true);
            CharSequence s5 = s(v9Var.X, true);
            if (k10 >= s5.length()) {
                l9 l9Var = v9Var.f30649a0;
                i(k10, l9Var, true);
                Layout layout = (Layout) l9Var.d;
                if (layout == null) {
                    v9Var.f30684z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - v9Var.f30652c;
                if (f10 < ((Layout) l9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) l9Var.d).getLineLeft(lineCount)) {
                    k10 = s5.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(d9Var);
                org.telegram.messenger.g0.i3(d9Var, v9Var.f30668l);
                v9Var.f30684z = true;
            }
        } else {
            v9Var = this;
        }
        return v9Var.f30684z;
    }

    public boolean P(int i7, int i10) {
        return false;
    }

    public final void Q(di.h2 h2Var) {
        this.D = h2Var;
    }

    public final void R() {
        this.f30663i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof pj0) {
            this.E = (pj0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f30662i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.w3 w3Var = this.Y;
                g9 g9Var = this.A;
                if (w3Var == null) {
                    org.telegram.ui.ActionBar.w3 w3Var2 = new org.telegram.ui.ActionBar.w3(this.C.getContext(), g9Var, this.C, new org.telegram.ui.ActionBar.k4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = w3Var2;
                    g9Var.onCreateActionMode(w3Var2, w3Var2.f28701c);
                }
                org.telegram.ui.ActionBar.w3 w3Var3 = this.Y;
                g9Var.onPrepareActionMode(w3Var3, w3Var3.f28701c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.g0.r(this.f30672n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f30669l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f30669l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f30669l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f30669l0.start();
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
        if (i7 != this.f30680u && i7 != this.v) {
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

    public void f(boolean z9) {
        E(z9);
        this.f30680u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f30681w = 0;
        org.telegram.messenger.g0.r(this.f30658f0);
        this.f30684z = false;
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        c8.da daVar = this.D;
        if (daVar != null) {
            daVar.a(false);
        }
        this.f30678s = -1;
        this.f30679t = -1;
        this.f30652c = -1;
        this.d = -1;
        this.f30657f = 0.0f;
        this.f30659g = 0.0f;
        this.f30662i = false;
    }

    public final void g(Layout layout, int i7, int i10, int i11, boolean z9, boolean z10, float f10) {
        float f11;
        float f12;
        int i12;
        aq aqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        p9 p9Var = this.f30674o0;
        p9Var.reset();
        layout.getSelectionPath(i10, i11, p9Var);
        if (p9Var.f29748a < layout.getLineBottom(i7)) {
            f12 = layout.getLineTop(i7);
            f11 = (layout.getLineBottom(i7) - lineTop) / (p9Var.f29748a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = p9Var.f29750c;
            aqVar = this.f30676q;
            f13 = this.f30671n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) p9Var.f29749b.get(i13);
            float max = Math.max(f10, rectF.left);
            if (z9) {
                f14 = f13 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            float f16 = (int) (max - f14);
            float z11 = (int) com.google.android.recaptcha.internal.a.z(rectF.top, f12, f11, f12);
            float max2 = Math.max(f10, rectF.right);
            if (z10) {
                f15 = f13 / 2.0f;
            } else {
                f15 = 0.0f;
            }
            rectF.set(f16, z11, (int) (max2 + f15), (int) com.google.android.recaptcha.internal.a.z(rectF.bottom, f12, f11, f12));
            aqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 == 0 && !z10) {
            try {
                aqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i7), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i7), Path.Direction.CW);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v9.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i7, l9 l9Var, boolean z9);

    public boolean j() {
        return false;
    }

    public abstract int k(int i7, int i10, int i11, int i12, q9 q9Var, boolean z9);

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

    public final u9 n(Context context) {
        if (this.C == null) {
            this.C = new u9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.f6 q() {
        return this.f30660g0;
    }

    public CharSequence r() {
        CharSequence s5 = s(this.W, false);
        if (s5 != null) {
            return s5.subSequence(this.f30680u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(q9 q9Var, boolean z9);

    public int t(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.f30660g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.w3 w3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f30672n0.run();
        }
        this.P = false;
        if (!x() && (w3Var = this.Y) != null) {
            w3Var.finish();
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
        q9 q9Var = this.W;
        if (q9Var != null) {
            q9Var.invalidate();
        }
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.invalidate();
        }
    }

    public final boolean x() {
        if (this.f30680u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(ij ijVar) {
        if (ijVar == null || this.f30681w != ijVar.f1()) {
            return false;
        }
        return true;
    }

    public void E(boolean z9) {
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

    public void I(int i7, int i10, ij ijVar) {
    }
}
