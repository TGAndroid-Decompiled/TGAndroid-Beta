package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class g51 extends ek0 {
    public v4.c0 f35322f3;
    public final b51 f35323g3;
    public v4.z f35324h3;
    public boolean f35325i3;
    public boolean j3;
    public boolean f35326k3;
    public v4.f1 f35327l3;
    public boolean f35328m3;

    public g51(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.p10 p10Var, org.telegram.messenger.u10 u10Var, org.telegram.messenger.v10 v10Var) {
        this(g2Var.getContext(), g2Var.getCurrentAccount(), g2Var.getClassGuid(), false, p10Var, u10Var, v10Var, g2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            b51 b51Var = this.f35323g3;
            if (i10 < b51Var.E.size()) {
                n41 G = b51Var.G(i10);
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
            b51 b51Var = this.f35323g3;
            if (i10 < b51Var.E.size()) {
                n41 G = b51Var.G(i10);
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
            b51 b51Var = this.f35323g3;
            if (i7 < b51Var.E.size()) {
                n41 G = b51Var.G(i7);
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

    public final void E1(org.telegram.messenger.p10 p10Var, boolean z10) {
        this.j3 = z10;
        v4.z zVar = new v4.z(new gi.c(this, 7));
        this.f35324h3 = zVar;
        zVar.h(this);
        this.f35323g3.N = p10Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        if (!b1()) {
            b51 b51Var = this.f35323g3;
            ArrayList arrayList = b51Var.H;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                y41 y41Var = (y41) arrayList.get(i10);
                int i11 = y41Var.f42356b;
                if (i11 >= 0) {
                    int i12 = y41Var.f42355a;
                    if (b51Var.f33630n) {
                        i7 = org.telegram.ui.ActionBar.n6.f29524h5;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29451d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i7, b51Var.f33634x);
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
                            if (this.f34777t2 == null) {
                                this.f34777t2 = new Paint(1);
                            }
                            this.f34777t2.setColor(w02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.f34777t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        v4.c0 c0Var = this.f35322f3;
        if (c0Var instanceof ty) {
            return ((ty) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i7, float f10, boolean z10) {
        t1(new vi(this, 3), new ci.y(8), i7, f10, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f35328m3 = z10;
    }

    public void setSpanCount(int i7) {
        v4.c0 c0Var = this.f35322f3;
        if (c0Var instanceof ty) {
            ((ty) c0Var).y1(i7);
        } else if (c0Var != null && i7 != -1) {
            getContext();
            e51 e51Var = new e51(this, i7, 1);
            e51Var.O = new cr0(this, e51Var, 2);
            this.f35322f3 = e51Var;
            setLayoutManager(e51Var);
        }
    }

    public final void z1(boolean z10) {
        if (this.f35326k3 == z10) {
            return;
        }
        this.f35326k3 = z10;
        this.f35323g3.O = z10;
        org.telegram.messenger.g0.d0(this, new y2(this, 14));
    }

    public g51(Context context, int i7, int i10, boolean z10, org.telegram.messenger.p10 p10Var, org.telegram.messenger.u10 u10Var, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, i10, z10, p10Var, u10Var, v10Var, i6Var, -1, 1);
    }

    public g51(Context context, int i7, int i10, boolean z10, org.telegram.messenger.p10 p10Var, org.telegram.messenger.u10 u10Var, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11, int i12) {
        super(context, i6Var);
        this.f35328m3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.f35322f3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            e51 e51Var = new e51(this, i11, 0);
            e51Var.O = new cr0(this, e51Var, 1);
            this.f35322f3 = e51Var;
            setLayoutManager(e51Var);
        }
        b51 b51Var = new b51(this, context, i7, i10, z10, p10Var, i6Var);
        this.f35323g3 = b51Var;
        setAdapter(b51Var);
        if (u10Var != null) {
            setOnItemClickListener(new g2(23, this, u10Var));
        }
        if (v10Var != null) {
            setOnItemLongClickListener(new g2(24, this, v10Var));
        }
        f51 f51Var = new f51(this);
        f51Var.f59274m = false;
        f51Var.C = false;
        f51Var.o(kr.h);
        f51Var.n(350L);
        setItemAnimator(f51Var);
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
