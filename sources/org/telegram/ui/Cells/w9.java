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
import org.telegram.messenger.jj;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.tk;
public abstract class w9 {
    public final i9 A;
    public final Rect B;
    public v9 C;
    public w7.x5 D;
    public tk0 E;
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
    public org.telegram.ui.ActionBar.d4 Y;
    public boolean Z;
    public int f23412a;
    public final ge.b f23413a0;
    public int f23414b;
    public int f23415b0;
    public int f23416c;
    public final OvershootInterpolator f23417c0;
    public int d;
    public int f23418d0;
    public boolean e;
    public final f9 f23419e0;
    public float f23420f;
    public final f9 f23421f0;
    public float f23422g;
    public org.telegram.ui.ActionBar.p6 f23423g0;
    public final int[] h = new int[2];
    public boolean f23424h0;
    public boolean f23425i;
    public boolean f23426i0;
    public boolean f23427j;
    public boolean f23428j0;
    public boolean f23429k;
    public org.telegram.ui.r f23430k0;
    public final int f23431l;
    public ValueAnimator f23432l0;
    public final int f23433m;
    public final f m0;
    public final float f23434n;
    public final f9 f23435n0;
    public final Paint f23436o;
    public final q9 f23437o0;
    public final Paint f23438p;
    public final jq f23439q;
    public final Path f23440r;
    public int f23441s;
    public int f23442t;
    public int f23443u;
    public int v;
    public int f23444w;
    public int f23445x;
    public boolean f23446y;
    public boolean f23447z;

    public w9() {
        new Path().f22408a = 0.0f;
        Paint paint = new Paint(1);
        this.f23436o = paint;
        this.f23438p = new Paint(1);
        jq jqVar = new jq();
        this.f23439q = jqVar;
        this.f23440r = new Path();
        new Path().f22370a = jqVar;
        this.f23443u = -1;
        this.v = -1;
        this.A = new i9(this, new h9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f23413a0 = new Object();
        this.f23417c0 = new OvershootInterpolator();
        this.f23419e0 = new f9(this, 0);
        this.f23421f0 = new f9(this, 1);
        this.f23424h0 = true;
        this.f23430k0 = null;
        new ArrayList();
        this.m0 = new f(this, 7);
        this.f23435n0 = new f9(this, 2);
        ?? path = new Path();
        path.f22853a = 0.0f;
        path.f22854b = new ArrayList(1);
        path.f22855c = 0;
        this.f23437o0 = path;
        this.f23431l = ViewConfiguration.getLongPressTimeout();
        this.f23433m = ViewConfiguration.get(org.telegram.messenger.w0.f19025b).getScaledTouchSlop();
        float L = org.telegram.messenger.i0.L(6.0f);
        this.f23434n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        jqVar.d = 1.0f;
    }

    public static void a(w9 w9Var, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        ge.b bVar = w9Var.f23413a0;
        if (Build.VERSION.SDK_INT >= 28 && w9Var.W != null && !w9Var.f23429k && w9Var.f23425i && w9Var.C != null) {
            if (w9Var.f23427j) {
                i11 = w9Var.f23443u;
            } else {
                i11 = w9Var.v;
            }
            w9Var.i(i11, bVar, false);
            Layout layout = (Layout) bVar.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i11 - bVar.f7470a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l4 = w9Var.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + w9Var.f23414b) + l4[1]) - lineBottom) - org.telegram.messenger.i0.L(8.0f)) + bVar.f7471b);
                r9 r9Var = w9Var.W;
                if (r9Var instanceof org.telegram.ui.s2) {
                    lineLeft = l4[0];
                    lineRight = ((View) r9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = l4[0] + w9Var.f23412a + bVar.f7472c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l4[0] + w9Var.f23412a + bVar.f7472c);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f7);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (w9Var.I != f10) {
                    w9Var.I = f10;
                    w9Var.J = (f10 - w9Var.H) / 200.0f;
                }
                float f11 = i10;
                if (w9Var.L != f11) {
                    w9Var.L = f11;
                    w9Var.M = (f11 - w9Var.K) / 100.0f;
                }
                if (w9Var.G == null) {
                    w9Var.G = new Magnifier(w9Var.C);
                    w9Var.H = w9Var.I;
                    w9Var.K = w9Var.L;
                }
                float f12 = w9Var.H;
                float f13 = w9Var.I;
                if (f12 != f13) {
                    w9Var.H = (w9Var.J * 16.0f) + f12;
                }
                float f14 = w9Var.J;
                if (f14 > 0.0f && w9Var.H > f13) {
                    w9Var.H = f13;
                } else if (f14 < 0.0f && w9Var.H < f13) {
                    w9Var.H = f13;
                }
                float f15 = w9Var.K;
                float f16 = w9Var.L;
                if (f15 != f16) {
                    w9Var.K = (w9Var.M * 16.0f) + f15;
                }
                float f17 = w9Var.M;
                if (f17 > 0.0f && w9Var.K > f16) {
                    w9Var.K = f16;
                } else if (f17 < 0.0f && w9Var.K < f16) {
                    w9Var.K = f16;
                }
                w9Var.G.show(w9Var.K, (lineBottom * 1.5f) + w9Var.H + org.telegram.messenger.i0.L(8.0f));
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

    public void A(int i10, int i11, boolean z10, float f7, float f10, r9 r9Var) {
        int i12;
        int i13;
        if (this.f23427j) {
            this.f23443u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f23443u = i13;
                this.f23427j = false;
            }
            this.f23446y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f23443u) > i11) {
            this.v = i12;
            this.f23443u = i11;
            this.f23427j = true;
        }
        this.f23446y = true;
    }

    public final int[] B(int i10) {
        ge.b bVar = this.f23413a0;
        i(i10, bVar, false);
        Layout layout = (Layout) bVar.d;
        int i11 = i10 - bVar.f7470a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + bVar.f7472c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + bVar.f7471b);
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
        f9 f9Var = this.f23421f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f23442t - ((int) motionEvent.getY());
                    int x10 = this.f23441s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f23433m;
                    if (i10 > i11 * i11) {
                        org.telegram.messenger.i0.r(f9Var);
                        this.f23447z = false;
                    }
                    return this.f23447z;
                }
            }
            org.telegram.messenger.i0.r(f9Var);
            this.f23447z = false;
            return false;
        }
        this.f23441s = (int) motionEvent.getX();
        this.f23442t = (int) motionEvent.getY();
        this.f23447z = false;
        Rect rect = this.B;
        rect.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
        if (rect.contains(this.f23441s, this.f23442t) && this.X != null) {
            rect.inset(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            int i12 = this.f23441s;
            int i13 = this.f23442t;
            int i14 = rect.right;
            if (i12 > i14) {
                i12 = i14 - 1;
            }
            int i15 = rect.left;
            if (i12 < i15) {
                i12 = i15 + 1;
            }
            int i16 = i12;
            int i17 = rect.top;
            if (i13 < i17) {
                i13 = i17 + 1;
            }
            int i18 = rect.bottom;
            if (i13 > i18) {
                i13 = i18 - 1;
            }
            w9Var = this;
            int k10 = w9Var.k(i16, i13, this.f23416c, this.d, this.X, true);
            CharSequence s10 = s(w9Var.X, true);
            if (k10 >= s10.length()) {
                ge.b bVar = w9Var.f23413a0;
                i(k10, bVar, true);
                Layout layout = (Layout) bVar.d;
                if (layout == null) {
                    w9Var.f23447z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - w9Var.f23416c;
                if (f7 < ((Layout) bVar.d).getLineRight(lineCount) + org.telegram.messenger.i0.L(4.0f) && f7 > ((Layout) bVar.d).getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                org.telegram.messenger.i0.r(f9Var);
                org.telegram.messenger.i0.h3(f9Var, w9Var.f23431l);
                w9Var.f23447z = true;
            }
        } else {
            w9Var = this;
        }
        return w9Var.f23447z;
    }

    public boolean P(int i10, int i11) {
        return false;
    }

    public final void Q(tk tkVar) {
        this.D = tkVar;
    }

    public final void R() {
        this.f23426i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof tk0) {
            this.E = (tk0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f23425i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.d4 d4Var = this.Y;
                i9 i9Var = this.A;
                if (d4Var == null) {
                    org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4(this.C.getContext(), i9Var, this.C, new org.telegram.ui.ActionBar.s4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = d4Var2;
                    i9Var.onCreateActionMode(d4Var2, d4Var2.f20254c);
                }
                org.telegram.ui.ActionBar.d4 d4Var3 = this.Y;
                i9Var.onPrepareActionMode(d4Var3, d4Var3.f20254c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.i0.r(this.f23435n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f23432l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f23432l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f23432l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f23432l0.start();
        }
    }

    public final void V() {
        this.Q = false;
        this.C.invalidate();
        f fVar = this.m0;
        org.telegram.messenger.i0.r(fVar);
        org.telegram.messenger.i0.g3(fVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f23443u && i10 != this.v) {
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
        this.f23443u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f23444w = 0;
        org.telegram.messenger.i0.r(this.f23421f0);
        this.f23447z = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(false);
        }
        this.f23441s = -1;
        this.f23442t = -1;
        this.f23416c = -1;
        this.d = -1;
        this.f23420f = 0.0f;
        this.f23422g = 0.0f;
        this.f23425i = false;
    }

    public final void g(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        jq jqVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        q9 q9Var = this.f23437o0;
        q9Var.reset();
        layout.getSelectionPath(i11, i12, q9Var);
        if (q9Var.f22853a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (q9Var.f22853a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = q9Var.f22855c;
            jqVar = this.f23439q;
            f12 = this.f23434n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) q9Var.f22854b.get(i14);
            float max = Math.max(f7, rectF.left);
            if (z10) {
                f13 = f12 / 2.0f;
            } else {
                f13 = 0.0f;
            }
            float f15 = (int) (max - f13);
            float z12 = (int) c3.i0.z(rectF.top, f11, f10, f11);
            float max2 = Math.max(f7, rectF.right);
            if (z11) {
                f14 = f12 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            rectF.set(f15, z12, (int) (max2 + f14), (int) c3.i0.z(rectF.bottom, f11, f10, f11));
            jqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                jqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w9.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i10, ge.b bVar, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10);

    public final int[] l() {
        int i10;
        View view = (View) this.W;
        int i11 = 0;
        if (view != null && this.F != null) {
            i10 = 0;
            int i12 = 0;
            while (view != this.F) {
                if (view != null) {
                    i10 = (int) (view.getY() + i10);
                    i12 = (int) (view.getX() + i12);
                    if (view instanceof NestedScrollView) {
                        i10 -= view.getScrollY();
                        i12 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i11 = i12;
            return new int[]{i11, i10};
        }
        i10 = 0;
        return new int[]{i11, i10};
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

    public org.telegram.ui.ActionBar.p6 q() {
        return this.f23423g0;
    }

    public CharSequence r() {
        CharSequence s10 = s(this.W, false);
        if (s10 != null) {
            return s10.subSequence(this.f23443u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(r9 r9Var, boolean z10);

    public int t(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.f23423g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.d4 d4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f23435n0.run();
        }
        this.P = false;
        if (!x() && (d4Var = this.Y) != null) {
            d4Var.finish();
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
        if (this.f23443u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(jj jjVar) {
        if (jjVar == null || this.f23444w != jjVar.f1()) {
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

    public void K(float f7, float f10) {
    }

    public void I(int i10, int i11, jj jjVar) {
    }
}
