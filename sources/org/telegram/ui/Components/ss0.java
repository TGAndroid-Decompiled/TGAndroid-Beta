package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class ss0 extends vi0 {
    public final Context f38056c;
    public boolean d;
    public m.q3 f38057e;
    public final ys0 f38058f;

    public ss0(ys0 ys0Var, Context context) {
        this.f38058f = ys0Var;
        this.f38056c = context;
    }

    @Override
    public boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(pj0 pj0Var) {
        int i7;
        ys0 ys0Var = this.f38058f;
        if (!ys0Var.G0()) {
            if (this != ys0Var.J && ys0.x(ys0Var, this) == -1) {
                i7 = ys0Var.f40707s1;
            } else {
                i7 = ys0Var.f40693o1[0];
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
        ArrayList arrayList = this.f38058f.f40713v1[0].f36372e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((yr0) arrayList.get(i10)).f40642b) {
                return ((yr0) arrayList.get(i10)).f40641a;
            }
        }
        return ((yr0) jg.g.i(1, arrayList)).f40641a;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        ys0 ys0Var = this.f38058f;
        int[] iArr2 = ys0Var.f40693o1;
        if (ys0.y(ys0Var, this) == -1 && this != ys0Var.K) {
            if (ys0.x(ys0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = ys0Var.f40707s1;
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
        ys0 ys0Var = this.f38058f;
        int[] iArr = ys0Var.f40693o1;
        if (this != ys0Var.K && ys0.y(ys0Var, this) == -1) {
            if (ys0.x(ys0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = ys0Var.f40707s1;
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
        this.f38058f.r1(0, true);
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
                this.f38058f.c0(0, pj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        tr0 g02 = this.f38058f.g0(0);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f38058f.f40713v1[0].f36379m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss0.b():int");
    }

    @Override
    public int d(int i7) {
        ns0[] ns0VarArr = this.f38058f.f40713v1;
        if (!this.d && ns0VarArr[0].c().size() == 0) {
            ns0 ns0Var = ns0VarArr[0];
            if (!ns0Var.f36374g && ns0Var.f36378l) {
                return 2;
            }
        }
        ns0VarArr[0].getClass();
        ns0VarArr[0].c().size();
        ns0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f38058f.f40713v1[0].e();
    }

    @Override
    public void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        char c10;
        ys0 ys0Var = this.f38058f;
        int[] iArr = ys0Var.f40693o1;
        ns0[] ns0VarArr = ys0Var.f40713v1;
        if (d1Var.f57056f == 0) {
            ArrayList c11 = ns0VarArr[0].c();
            int d = i7 - ns0VarArr[0].d();
            View view = d1Var.f57052a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                boolean z10 = true;
                if (this == ys0Var.J) {
                    i10 = iArr[0];
                } else if (ys0.x(ys0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = ys0Var.f40707s1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c11.get(d);
                    if (ijVar.e1() == messageId) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (ys0Var.E1) {
                        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
                        if (org.telegram.messenger.ij.B0(ijVar.f23266k) == ys0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) < 0) {
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
        ys0 ys0Var = this.f38058f;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.f38056c;
        if (i7 != 0 && i7 != 19) {
            q3 X = ys0.X(0, ys0Var.l1, context, h6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        if (this.f38057e == null) {
            this.f38057e = new m.q3(viewGroup.getContext(), h6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f38057e, ys0Var.f40719x1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.f29705w0 = true;
        }
        o7Var.setGradientView(ys0Var.D);
        if (ys0.x(ys0Var, this) != -1) {
            o7Var.f29681d0 = true;
        }
        o7Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(o7Var);
    }
}
