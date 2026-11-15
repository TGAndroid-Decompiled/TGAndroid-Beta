package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class u41 extends uj0 {
    public v4.b0 f39891f3;
    public final p41 f39892g3;
    public v4.y f39893h3;
    public boolean f39894i3;
    public boolean j3;
    public boolean f39895k3;
    public v4.e1 f39896l3;
    public boolean f39897m3;

    public u41(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.messenger.y10 y10Var) {
        this(e2Var.getContext(), e2Var.getCurrentAccount(), e2Var.getClassGuid(), false, s10Var, x10Var, y10Var, e2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            p41 p41Var = this.f39892g3;
            if (i10 < p41Var.E.size()) {
                b41 G = p41Var.G(i10);
                if (G != null && G.d == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final View B1(int i7) {
        int i10 = 0;
        while (true) {
            p41 p41Var = this.f39892g3;
            if (i10 < p41Var.E.size()) {
                b41 G = p41Var.G(i10);
                if (G != null && G.d == i7) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return T0(i10);
    }

    public final View C1(Object obj) {
        int i7 = 0;
        while (true) {
            p41 p41Var = this.f39892g3;
            if (i7 < p41Var.E.size()) {
                b41 G = p41Var.G(i7);
                if (G != null && G.G == obj) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        return T0(i7);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(org.telegram.messenger.s10 s10Var, boolean z10) {
        this.j3 = z10;
        v4.y yVar = new v4.y(new gi.c(this, 7));
        this.f39893h3 = yVar;
        yVar.h(this);
        this.f39892g3.N = s10Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        if (!b1()) {
            p41 p41Var = this.f39892g3;
            ArrayList arrayList = p41Var.H;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                m41 m41Var = (m41) arrayList.get(i10);
                int i11 = m41Var.f37055b;
                if (i11 >= 0) {
                    int i12 = m41Var.f37054a;
                    if (p41Var.f38198n) {
                        i7 = org.telegram.ui.ActionBar.j6.f28922h5;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f28849d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i7, p41Var.f38202x);
                    if (i11 >= i12 && i12 >= 0 && i11 >= 0) {
                        int i13 = Integer.MAX_VALUE;
                        int i14 = Integer.MIN_VALUE;
                        for (int i15 = 0; i15 < getChildCount(); i15++) {
                            View childAt = getChildAt(i15);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= i12 && R <= i11) {
                                    i13 = Math.min(top, i13);
                                    i14 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i14);
                                }
                            }
                        }
                        if (i13 < i14) {
                            if (this.f40079t2 == null) {
                                this.f40079t2 = new Paint(1);
                            }
                            this.f40079t2.setColor(w02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.f40079t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        v4.b0 b0Var = this.f39891f3;
        if (b0Var instanceof oy) {
            return ((oy) b0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i7, float f10, boolean z10) {
        t1(new mi(this, 3), new ci.x(8), i7, f10, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f39897m3 = z10;
    }

    public void setSpanCount(int i7) {
        v4.b0 b0Var = this.f39891f3;
        if (b0Var instanceof oy) {
            ((oy) b0Var).y1(i7);
        } else if (b0Var != null && i7 != -1) {
            getContext();
            s41 s41Var = new s41(this, i7, 1);
            s41Var.O = new tq0(this, s41Var, 2);
            this.f39891f3 = s41Var;
            setLayoutManager(s41Var);
        }
    }

    public final void z1(boolean z10) {
        if (this.f39895k3 == z10) {
            return;
        }
        this.f39895k3 = z10;
        this.f39892g3.O = z10;
        org.telegram.messenger.g0.d0(this, new q2(this, 14));
    }

    public u41(Context context, int i7, int i10, boolean z10, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i7, i10, z10, s10Var, x10Var, y10Var, e6Var, -1, 1);
    }

    public u41(Context context, int i7, int i10, boolean z10, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12) {
        super(context, e6Var);
        this.f39897m3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.f39891f3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            s41 s41Var = new s41(this, i11, 0);
            s41Var.O = new tq0(this, s41Var, 1);
            this.f39891f3 = s41Var;
            setLayoutManager(s41Var);
        }
        p41 p41Var = new p41(this, context, i7, i10, z10, s10Var, e6Var);
        this.f39892g3 = p41Var;
        setAdapter(p41Var);
        if (x10Var != null) {
            setOnItemClickListener(new f1(24, this, x10Var));
        }
        if (y10Var != null) {
            setOnItemLongClickListener(new f1(25, this, y10Var));
        }
        t41 t41Var = new t41(this);
        t41Var.f58564m = false;
        t41Var.C = false;
        t41Var.o(er.h);
        t41Var.n(350L);
        setItemAnimator(t41Var);
    }

    public void H1(v4.e1 e1Var) {
    }

    public void I1(v4.e1 e1Var) {
    }

    public void J1(v4.e1 e1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
