package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class p41 extends pj0 {
    public v4.b0 f36780e3;
    public final k41 f36781f3;
    public v4.y f36782g3;
    public boolean f36783h3;
    public boolean f36784i3;
    public boolean j3;
    public v4.d1 f36785k3;
    public boolean f36786l3;

    public p41(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var) {
        this(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getClassGuid(), false, v10Var, a20Var, b20Var, f2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            k41 k41Var = this.f36781f3;
            if (i10 < k41Var.D.size()) {
                w31 G = k41Var.G(i10);
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
            k41 k41Var = this.f36781f3;
            if (i10 < k41Var.D.size()) {
                w31 G = k41Var.G(i10);
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
            k41 k41Var = this.f36781f3;
            if (i7 < k41Var.D.size()) {
                w31 G = k41Var.G(i7);
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

    public final void E1(org.telegram.messenger.v10 v10Var, boolean z9) {
        this.f36784i3 = z9;
        v4.y yVar = new v4.y(new ei.d(this, 7));
        this.f36782g3 = yVar;
        yVar.h(this);
        this.f36781f3.M = v10Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        if (!b1()) {
            k41 k41Var = this.f36781f3;
            ArrayList arrayList = k41Var.G;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                h41 h41Var = (h41) arrayList.get(i10);
                int i11 = h41Var.f34163b;
                if (i11 >= 0) {
                    int i12 = h41Var.f34162a;
                    if (k41Var.f35131n) {
                        i7 = org.telegram.ui.ActionBar.k6.f27921h5;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.f27848d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i7, k41Var.f35135x);
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
                            if (this.f36949s2 == null) {
                                this.f36949s2 = new Paint(1);
                            }
                            this.f36949s2.setColor(w02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.f36949s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        v4.b0 b0Var = this.f36780e3;
        if (b0Var instanceof jy) {
            return ((jy) b0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i7, float f10, boolean z9) {
        t1(new fi(this, 3), new ai.c0(8), i7, f10, z9);
    }

    public void setReorderLongPressEnabled(boolean z9) {
        this.f36786l3 = z9;
    }

    public void setSpanCount(int i7) {
        v4.b0 b0Var = this.f36780e3;
        if (b0Var instanceof jy) {
            ((jy) b0Var).y1(i7);
        } else if (b0Var != null && i7 != -1) {
            getContext();
            n41 n41Var = new n41(this, i7, 1);
            n41Var.O = new rq0(this, n41Var, 2);
            this.f36780e3 = n41Var;
            setLayoutManager(n41Var);
        }
    }

    public final void z1(boolean z9) {
        if (this.j3 == z9) {
            return;
        }
        this.j3 = z9;
        this.f36781f3.N = z9;
        org.telegram.messenger.g0.d0(this, new s2(this, 12));
    }

    public p41(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i7, i10, z9, v10Var, a20Var, b20Var, f6Var, -1, 1);
    }

    public p41(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context, f6Var);
        this.f36786l3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.f36780e3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            n41 n41Var = new n41(this, i11, 0);
            n41Var.O = new rq0(this, n41Var, 1);
            this.f36780e3 = n41Var;
            setLayoutManager(n41Var);
        }
        k41 k41Var = new k41(this, context, i7, i10, z9, v10Var, f6Var);
        this.f36781f3 = k41Var;
        setAdapter(k41Var);
        if (a20Var != null) {
            setOnItemClickListener(new f2(20, this, a20Var));
        }
        if (b20Var != null) {
            setOnItemLongClickListener(new f2(21, this, b20Var));
        }
        o41 o41Var = new o41(this);
        o41Var.f56979m = false;
        o41Var.C = false;
        o41Var.o(xq.h);
        o41Var.n(350L);
        setItemAnimator(o41Var);
    }

    public void H1(v4.d1 d1Var) {
    }

    public void I1(v4.d1 d1Var) {
    }

    public void J1(v4.d1 d1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
