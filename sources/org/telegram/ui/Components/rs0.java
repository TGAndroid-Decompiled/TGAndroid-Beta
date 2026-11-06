package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class rs0 extends vi0 {
    public final Context f37773c;
    public boolean d;
    public m.q3 f37774e;
    public final xs0 f37775f;

    public rs0(xs0 xs0Var, Context context) {
        this.f37775f = xs0Var;
        this.f37773c = context;
    }

    @Override
    public boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(pj0 pj0Var) {
        int i7;
        xs0 xs0Var = this.f37775f;
        if (!xs0Var.F0()) {
            if (this != xs0Var.J && xs0.x(xs0Var, this) == -1) {
                i7 = xs0Var.f40412s1;
            } else {
                i7 = xs0Var.f40398o1[0];
            }
            int ceil = (int) Math.ceil(e() / i7);
            if (pj0Var.getChildCount() != 0 && pj0Var.getChildAt(0).getMeasuredHeight() * ceil > pj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i7) {
        ArrayList arrayList = this.f37775f.f40418v1[0].f36050e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((xr0) arrayList.get(i10)).f40347b) {
                return ((xr0) arrayList.get(i10)).f40346a;
            }
        }
        return ((xr0) jg.g.i(1, arrayList)).f40346a;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        xs0 xs0Var = this.f37775f;
        int[] iArr2 = xs0Var.f40398o1;
        if (xs0.y(xs0Var, this) == -1 && this != xs0Var.K) {
            if (xs0.x(xs0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = xs0Var.f40412s1;
        }
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i7;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    @Override
    public final float H(pj0 pj0Var) {
        int i7;
        xs0 xs0Var = this.f37775f;
        int[] iArr = xs0Var.f40398o1;
        if (this != xs0Var.K && xs0.y(xs0Var, this) == -1) {
            if (xs0.x(xs0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = xs0Var.f40412s1;
        }
        int ceil = (int) Math.ceil(e() / i7);
        if (pj0Var.getChildCount() != 0) {
            int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = pj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i7) * measuredHeight) - (childAt.getTop() - pj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f37775f.p1(0, true);
    }

    @Override
    public final void J(pj0 pj0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                View childAt = pj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i7 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f37775f.c0(0, pj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        sr0 g02 = this.f37775f.g0(0);
        if (g02 != null) {
            xs0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f37775f.f40418v1[0].f36057m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs0.b():int");
    }

    @Override
    public int d(int i7) {
        ms0[] ms0VarArr = this.f37775f.f40418v1;
        if (!this.d && ms0VarArr[0].c().size() == 0) {
            ms0 ms0Var = ms0VarArr[0];
            if (!ms0Var.f36052g && ms0Var.f36056l) {
                return 2;
            }
        }
        ms0VarArr[0].getClass();
        ms0VarArr[0].c().size();
        ms0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f37775f.f40418v1[0].e();
    }

    @Override
    public void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        char c10;
        xs0 xs0Var = this.f37775f;
        int[] iArr = xs0Var.f40398o1;
        ms0[] ms0VarArr = xs0Var.f40418v1;
        if (d1Var.f56956f == 0) {
            ArrayList c11 = ms0VarArr[0].c();
            int d = i7 - ms0VarArr[0].d();
            View view = d1Var.f56952a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                boolean z10 = true;
                if (this == xs0Var.J) {
                    i10 = iArr[0];
                } else if (xs0.x(xs0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = xs0Var.f40412s1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c11.get(d);
                    if (ijVar.f1() == messageId) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (xs0Var.E1) {
                        SparseArray[] sparseArrayArr = xs0Var.f40359b1;
                        if (org.telegram.messenger.ij.B0(ijVar.f23237k) == xs0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) < 0) {
                            z10 = false;
                        }
                        o7Var.i(z10, z9);
                    } else {
                        o7Var.i(false, z9);
                    }
                    o7Var.k(ijVar, i10, false);
                    return;
                }
                o7Var.k(null, i10, false);
                o7Var.i(false, false);
            }
        }
    }

    @Override
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.f37775f;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.f37773c;
        if (i7 != 0 && i7 != 19) {
            r3 X = xs0.X(0, xs0Var.l1, context, f6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        if (this.f37774e == null) {
            this.f37774e = new m.q3(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f37774e, xs0Var.f40424x1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.f29686w0 = true;
        }
        o7Var.setGradientView(xs0Var.D);
        if (xs0.x(xs0Var, this) != -1) {
            o7Var.f29662d0 = true;
        }
        o7Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(o7Var);
    }
}
