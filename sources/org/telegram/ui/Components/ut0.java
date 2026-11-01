package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class ut0 extends bk0 {
    public final Context f31084c;
    public boolean d;
    public m.p3 e;
    public final au0 f31085f;

    public ut0(au0 au0Var, Context context) {
        this.f31085f = au0Var;
        this.f31084c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(uk0 uk0Var) {
        int i10;
        au0 au0Var = this.f31085f;
        if (!au0Var.D0()) {
            if (this != au0Var.J && au0.v(au0Var, this) == -1) {
                i10 = au0Var.f24556s1;
            } else {
                i10 = au0Var.f24542o1[0];
            }
            int ceil = (int) Math.ceil(e() / i10);
            if (uk0Var.getChildCount() != 0 && uk0Var.getChildAt(0).getMeasuredHeight() * ceil > uk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f31085f.f24562v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ys0) arrayList.get(i11)).f32902b) {
                return ((ys0) arrayList.get(i11)).f32901a;
            }
        }
        return ((ys0) i0.a.g(1, arrayList)).f32901a;
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        au0 au0Var = this.f31085f;
        int[] iArr2 = au0Var.f24542o1;
        if (au0.w(au0Var, this) == -1 && this != au0Var.K) {
            if (au0.v(au0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = au0Var.f24556s1;
        }
        int ceil = (int) (Math.ceil(e() / i10) * measuredHeight);
        int measuredHeight2 = uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f10 = f7 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f10 / measuredHeight)) * i10;
        iArr[1] = ((int) f10) % measuredHeight;
    }

    @Override
    public final float H(uk0 uk0Var) {
        int i10;
        au0 au0Var = this.f31085f;
        int[] iArr = au0Var.f24542o1;
        if (this != au0Var.K && au0.w(au0Var, this) == -1) {
            if (au0.v(au0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = au0Var.f24556s1;
        }
        int ceil = (int) Math.ceil(e() / i10);
        if (uk0Var.getChildCount() != 0) {
            int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
            View childAt = uk0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - uk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f31085f.n1(0, true);
    }

    @Override
    public final void J(uk0 uk0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < uk0Var.getChildCount(); i11++) {
                View childAt = uk0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f31085f.b0(0, uk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        ts0 f02 = this.f31085f.f0(0);
        if (f02 != null) {
            au0.p(f02, null, false);
        }
    }

    public int L(int i10) {
        return this.f31085f.f24562v1[0].f29541m + i10;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ut0.b():int");
    }

    @Override
    public int d(int i10) {
        pt0[] pt0VarArr = this.f31085f.f24562v1;
        if (!this.d && pt0VarArr[0].c().size() == 0) {
            pt0 pt0Var = pt0VarArr[0];
            if (!pt0Var.f29536g && pt0Var.f29540l) {
                return 2;
            }
        }
        pt0VarArr[0].getClass();
        pt0VarArr[0].c().size();
        pt0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f31085f.f24562v1[0].e();
    }

    @Override
    public void t(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        au0 au0Var = this.f31085f;
        int[] iArr = au0Var.f24542o1;
        pt0[] pt0VarArr = au0Var.f24562v1;
        if (c1Var.f47912f == 0) {
            ArrayList c11 = pt0VarArr[0].c();
            int d = i10 - pt0VarArr[0].d();
            View view = c1Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                boolean z11 = true;
                if (this == au0Var.J) {
                    i11 = iArr[0];
                } else if (au0.v(au0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = au0Var.f24556s1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) c11.get(d);
                    if (kjVar.f1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (au0Var.E1) {
                        SparseArray[] sparseArrayArr = au0Var.f24502b1;
                        if (org.telegram.messenger.kj.B0(kjVar.f16690k) == au0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) < 0) {
                            z11 = false;
                        }
                        s7Var.i(z11, z10);
                    } else {
                        s7Var.i(false, z10);
                    }
                    s7Var.k(kjVar, i11, false);
                    return;
                }
                s7Var.k(null, i11, false);
                s7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = this.f31085f;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.f31084c;
        if (i10 != 0 && i10 != 19) {
            p3 W = au0.W(0, au0Var.l1, context, p6Var);
            W.setLayoutParams(new s4.o0(-1, -1));
            return new s4.c1(W);
        }
        if (this.e == null) {
            this.e = new m.p3(viewGroup.getContext(), p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, au0Var.f24568x1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.f23047w0 = true;
        }
        s7Var.setGradientView(au0Var.D);
        if (au0.v(au0Var, this) != -1) {
            s7Var.f23024d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(s7Var);
    }
}
