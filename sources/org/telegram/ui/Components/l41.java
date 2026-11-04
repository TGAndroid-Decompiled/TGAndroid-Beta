package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class l41 extends tj0 {
    public u4.b0 f35593f3;
    public final f41 f35594g3;
    public u4.y f35595h3;
    public boolean i3;
    public boolean f35596j3;
    public boolean f35597k3;
    public u4.d1 f35598l3;
    public boolean f35599m3;

    public l41(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.n10 n10Var, org.telegram.messenger.s10 s10Var, org.telegram.messenger.t10 t10Var) {
        this(d2Var.getContext(), d2Var.getCurrentAccount(), d2Var.getClassGuid(), false, n10Var, s10Var, t10Var, d2Var.getResourceProvider());
    }

    public final int A1(int i3) {
        int i10 = 0;
        while (true) {
            f41 f41Var = this.f35594g3;
            if (i10 < f41Var.E.size()) {
                r31 G = f41Var.G(i10);
                if (G != null && G.d == i3) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final View B1(int i3) {
        int i10 = 0;
        while (true) {
            f41 f41Var = this.f35594g3;
            if (i10 < f41Var.E.size()) {
                r31 G = f41Var.G(i10);
                if (G != null && G.d == i3) {
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
        int i3 = 0;
        while (true) {
            f41 f41Var = this.f35594g3;
            if (i3 < f41Var.E.size()) {
                r31 G = f41Var.G(i3);
                if (G != null && G.G == obj) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        return T0(i3);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(org.telegram.messenger.n10 n10Var, boolean z10) {
        this.f35596j3 = z10;
        u4.y yVar = new u4.y(new fi.c(this, 7));
        this.f35595h3 = yVar;
        yVar.h(this);
        this.f35594g3.N = n10Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i3;
        if (!b1()) {
            f41 f41Var = this.f35594g3;
            ArrayList arrayList = f41Var.H;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c41 c41Var = (c41) arrayList.get(i10);
                int i11 = c41Var.f32560b;
                if (i11 >= 0) {
                    int i12 = c41Var.f32559a;
                    if (f41Var.f33697n) {
                        i3 = org.telegram.ui.ActionBar.k6.f27954h5;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f27878d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i3, f41Var.f33701x);
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
                            if (this.f38470t2 == null) {
                                this.f38470t2 = new Paint(1);
                            }
                            this.f38470t2.setColor(w02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.f38470t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        u4.b0 b0Var = this.f35593f3;
        if (b0Var instanceof hy) {
            return ((hy) b0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i3, float f10, boolean z10) {
        t1(new di(this, 3), new bi.x(8), i3, f10, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f35599m3 = z10;
    }

    public void setSpanCount(int i3) {
        u4.b0 b0Var = this.f35593f3;
        if (b0Var instanceof hy) {
            ((hy) b0Var).y1(i3);
        } else if (b0Var != null && i3 != -1) {
            getContext();
            j41 j41Var = new j41(this, i3, 1);
            j41Var.O = new rq0(this, j41Var, 2);
            this.f35593f3 = j41Var;
            setLayoutManager(j41Var);
        }
    }

    public final void z1(boolean z10) {
        if (this.f35597k3 == z10) {
            return;
        }
        this.f35597k3 = z10;
        this.f35594g3.O = z10;
        org.telegram.messenger.g0.d0(this, new p2(this, 12));
    }

    public l41(Context context, int i3, int i10, boolean z10, org.telegram.messenger.n10 n10Var, org.telegram.messenger.s10 s10Var, org.telegram.messenger.t10 t10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i3, i10, z10, n10Var, s10Var, t10Var, e6Var, -1, 1);
    }

    public l41(Context context, int i3, int i10, boolean z10, org.telegram.messenger.n10 n10Var, org.telegram.messenger.s10 s10Var, org.telegram.messenger.t10 t10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12) {
        super(context, e6Var);
        this.f35599m3 = true;
        if (i11 == -1) {
            kg.f0 f0Var = new kg.f0(this, i12);
            this.f35593f3 = f0Var;
            setLayoutManager(f0Var);
        } else {
            j41 j41Var = new j41(this, i11, 0);
            j41Var.O = new rq0(this, j41Var, 1);
            this.f35593f3 = j41Var;
            setLayoutManager(j41Var);
        }
        f41 f41Var = new f41(this, context, i3, i10, z10, n10Var, e6Var);
        this.f35594g3 = f41Var;
        setAdapter(f41Var);
        if (s10Var != null) {
            setOnItemClickListener(new i41(0, this, s10Var));
        }
        if (t10Var != null) {
            setOnItemLongClickListener(new i41(1, this, t10Var));
        }
        k41 k41Var = new k41(this);
        k41Var.f55567m = false;
        k41Var.C = false;
        k41Var.o(xq.h);
        k41Var.n(350L);
        setItemAnimator(k41Var);
    }

    public void H1(u4.d1 d1Var) {
    }

    public void I1(u4.d1 d1Var) {
    }

    public void J1(u4.d1 d1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
