package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class ct0 extends kj0 {
    public final Context f34126c;
    public boolean d;
    public ga.d f34127e;
    public final it0 f34128f;

    public ct0(it0 it0Var, Context context) {
        this.f34128f = it0Var;
        this.f34126c = context;
    }

    @Override
    public boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final boolean E(ek0 ek0Var) {
        int i7;
        it0 it0Var = this.f34128f;
        if (!it0Var.G0()) {
            if (this != it0Var.K && it0.x(it0Var, this) == -1) {
                i7 = it0Var.f36153t1;
            } else {
                i7 = it0Var.f36139p1[0];
            }
            int ceil = (int) Math.ceil(e() / i7);
            if (ek0Var.getChildCount() != 0 && ek0Var.getChildAt(0).getMeasuredHeight() * ceil > ek0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i7) {
        ArrayList arrayList = this.f34128f.f36160w1[0].f42168e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((is0) arrayList.get(i10)).f36085b) {
                return ((is0) arrayList.get(i10)).f36084a;
            }
        }
        return ((is0) i5.c.h(1, arrayList)).f36084a;
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        it0 it0Var = this.f34128f;
        int[] iArr2 = it0Var.f36139p1;
        if (it0.y(it0Var, this) == -1 && this != it0Var.L) {
            if (it0.x(it0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = it0Var.f36153t1;
        }
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop();
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
    public final float H(ek0 ek0Var) {
        int i7;
        it0 it0Var = this.f34128f;
        int[] iArr = it0Var.f36139p1;
        if (this != it0Var.L && it0.y(it0Var, this) == -1) {
            if (it0.x(it0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = it0Var.f36153t1;
        }
        int ceil = (int) Math.ceil(e() / i7);
        if (ek0Var.getChildCount() != 0) {
            int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ek0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i7) * measuredHeight) - (childAt.getTop() - ek0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f34128f.r1(0, true);
    }

    @Override
    public final void J(ek0 ek0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                View childAt = ek0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i7 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f34128f.c0(0, ek0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        ds0 g02 = this.f34128f.g0(0);
        if (g02 != null) {
            it0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f34128f.f36160w1[0].f42175m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ct0.b():int");
    }

    @Override
    public int d(int i7) {
        xs0[] xs0VarArr = this.f34128f.f36160w1;
        if (!this.d && xs0VarArr[0].c().size() == 0) {
            xs0 xs0Var = xs0VarArr[0];
            if (!xs0Var.f42170g && xs0Var.f42174l) {
                return 2;
            }
        }
        xs0VarArr[0].getClass();
        xs0VarArr[0].c().size();
        xs0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f34128f.f36160w1[0].e();
    }

    @Override
    public void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        char c10;
        it0 it0Var = this.f34128f;
        int[] iArr = it0Var.f36139p1;
        xs0[] xs0VarArr = it0Var.f36160w1;
        if (f1Var.f59249f == 0) {
            ArrayList c11 = xs0VarArr[0].c();
            int d = i7 - xs0VarArr[0].d();
            View view = f1Var.f59245a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                boolean z11 = true;
                if (this == it0Var.K) {
                    i10 = iArr[0];
                } else if (it0.x(it0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = it0Var.f36153t1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c11.get(d);
                    if (fjVar.e1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (it0Var.F1) {
                        SparseArray[] sparseArrayArr = it0Var.f36101c1;
                        if (org.telegram.messenger.fj.B0(fjVar.f24073k) == it0Var.f36130m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                            z11 = false;
                        }
                        o7Var.i(z11, z10);
                    } else {
                        o7Var.i(false, z10);
                    }
                    o7Var.k(fjVar, i10, false);
                    return;
                }
                o7Var.k(null, i10, false);
                o7Var.i(false, false);
            }
        }
    }

    @Override
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.f34128f;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.f34126c;
        if (i7 != 0 && i7 != 19) {
            x3 X = it0.X(0, it0Var.f36130m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        if (this.f34127e == null) {
            this.f34127e = new ga.d(viewGroup.getContext(), i6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f34127e, it0Var.f36166y1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.f31291x0 = true;
        }
        o7Var.setGradientView(it0Var.E);
        if (it0.x(it0Var, this) != -1) {
            o7Var.f31267e0 = true;
        }
        o7Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(o7Var);
    }
}
