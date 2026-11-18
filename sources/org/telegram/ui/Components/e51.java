package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class e51 extends ck0 {
    public v4.c0 f34606f3;
    public final z41 f34607g3;
    public v4.z f34608h3;
    public boolean f34609i3;
    public boolean j3;
    public boolean f34610k3;
    public v4.f1 f34611l3;
    public boolean f34612m3;

    public e51(org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.q10 q10Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.w10 w10Var) {
        this(h2Var.getContext(), h2Var.getCurrentAccount(), h2Var.getClassGuid(), false, q10Var, v10Var, w10Var, h2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            z41 z41Var = this.f34607g3;
            if (i10 < z41Var.E.size()) {
                l41 G = z41Var.G(i10);
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
            z41 z41Var = this.f34607g3;
            if (i10 < z41Var.E.size()) {
                l41 G = z41Var.G(i10);
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
            z41 z41Var = this.f34607g3;
            if (i7 < z41Var.E.size()) {
                l41 G = z41Var.G(i7);
                if (G != null && G.H == obj) {
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

    public final void E1(org.telegram.messenger.q10 q10Var, boolean z10) {
        this.j3 = z10;
        v4.z zVar = new v4.z(new gi.c(this, 7));
        this.f34608h3 = zVar;
        zVar.h(this);
        this.f34607g3.N = q10Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        if (!b1()) {
            z41 z41Var = this.f34607g3;
            ArrayList arrayList = z41Var.H;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                w41 w41Var = (w41) arrayList.get(i10);
                int i11 = w41Var.f41564b;
                if (i11 >= 0) {
                    int i12 = w41Var.f41563a;
                    if (z41Var.f42808n) {
                        i7 = org.telegram.ui.ActionBar.n6.f29467h5;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29394d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i7, z41Var.f42812x);
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
                            if (this.f34084t2 == null) {
                                this.f34084t2 = new Paint(1);
                            }
                            this.f34084t2.setColor(w02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.f34084t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        v4.c0 c0Var = this.f34606f3;
        if (c0Var instanceof uy) {
            return ((uy) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i7, float f10, boolean z10) {
        t1(new ui(this, 3), new ci.y(8), i7, f10, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f34612m3 = z10;
    }

    public void setSpanCount(int i7) {
        v4.c0 c0Var = this.f34606f3;
        if (c0Var instanceof uy) {
            ((uy) c0Var).y1(i7);
        } else if (c0Var != null && i7 != -1) {
            getContext();
            c51 c51Var = new c51(this, i7, 1);
            c51Var.O = new br0(this, c51Var, 2);
            this.f34606f3 = c51Var;
            setLayoutManager(c51Var);
        }
    }

    public final void z1(boolean z10) {
        if (this.f34610k3 == z10) {
            return;
        }
        this.f34610k3 = z10;
        this.f34607g3.O = z10;
        org.telegram.messenger.g0.d0(this, new y2(this, 14));
    }

    public e51(Context context, int i7, int i10, boolean z10, org.telegram.messenger.q10 q10Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, i10, z10, q10Var, v10Var, w10Var, i6Var, -1, 1);
    }

    public e51(Context context, int i7, int i10, boolean z10, org.telegram.messenger.q10 q10Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11, int i12) {
        super(context, i6Var);
        this.f34612m3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.f34606f3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            c51 c51Var = new c51(this, i11, 0);
            c51Var.O = new br0(this, c51Var, 1);
            this.f34606f3 = c51Var;
            setLayoutManager(c51Var);
        }
        z41 z41Var = new z41(this, context, i7, i10, z10, q10Var, i6Var);
        this.f34607g3 = z41Var;
        setAdapter(z41Var);
        if (v10Var != null) {
            setOnItemClickListener(new g2(23, this, v10Var));
        }
        if (w10Var != null) {
            setOnItemLongClickListener(new g2(24, this, w10Var));
        }
        d51 d51Var = new d51(this);
        d51Var.f59152m = false;
        d51Var.C = false;
        d51Var.o(lr.h);
        d51Var.n(350L);
        setItemAnimator(d51Var);
    }

    public void H1(v4.f1 f1Var) {
    }

    public void I1(v4.f1 f1Var) {
    }

    public void J1(v4.f1 f1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
