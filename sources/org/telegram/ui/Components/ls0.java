package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ls0 extends kj0 {
    public final Context f35737r;
    public final xs0 f35738s;

    public ls0(xs0 xs0Var, Context context) {
        this.f35738s = xs0Var;
        this.f35737r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        ms0[] ms0VarArr = this.f35738s.f40418v1;
        int i10 = 1;
        if ((ms0VarArr[3].f36049c.size() == 0 && !ms0VarArr[3].f36052g) || i7 >= ms0VarArr[3].f36049c.size()) {
            return 1;
        }
        ms0 ms0Var = ms0VarArr[3];
        int size = ((ArrayList) ms0Var.d.get(ms0Var.f36049c.get(i7))).size();
        if (i7 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        ms0[] ms0VarArr = this.f35738s.f40418v1;
        if (ms0VarArr[3].f36049c.size() == 0 && !ms0VarArr[3].f36052g) {
            return 5;
        }
        if (i7 < ms0VarArr[3].f36049c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ls0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        xs0 xs0Var = this.f35738s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.f35737r, xs0Var.H1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < xs0Var.f40418v1[3].f36049c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.ij) ((ArrayList) xs0Var.f40418v1[3].d.get((String) xs0Var.f40418v1[3].f36049c.get(i7))).get(0)).f23237k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        ms0[] ms0VarArr = this.f35738s.f40418v1;
        if (ms0VarArr[3].f36049c.size() != 0 || ms0VarArr[3].f36052g) {
            if (i7 != 0 && i10 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        boolean z9;
        char c10;
        xs0 xs0Var = this.f35738s;
        ms0[] ms0VarArr = xs0Var.f40418v1;
        int i11 = d1Var.f56956f;
        View view = d1Var.f56952a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) ms0VarArr[3].d.get((String) ms0VarArr[3].f36049c.get(i7));
            int i12 = d1Var.f56956f;
            boolean z10 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != ms0VarArr[3].f36049c.size() - 1 || !ms0VarArr[3].f36052g)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        k7Var.D = z9;
                        k7Var.e();
                        k7Var.f29431b0 = ijVar;
                        k7Var.requestLayout();
                        if (xs0Var.E1) {
                            SparseArray[] sparseArrayArr = xs0Var.f40359b1;
                            if (org.telegram.messenger.ij.B0(ijVar.f23237k) == xs0Var.l1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z10 = true;
                            }
                            k7Var.f(z10, !xs0Var.f40366d1);
                            return;
                        }
                        k7Var.f(false, !xs0Var.f40366d1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(ijVar2.f23237k.date, false));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        xs0 xs0Var = this.f35738s;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.f35737r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    lz lzVar = new lz(context, f6Var);
                    lzVar.setIsSingleCell(true);
                    lzVar.f35807x = false;
                    lzVar.setViewType(5);
                    x3Var = lzVar;
                } else {
                    r3 X = xs0.X(3, xs0Var.l1, context, f6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new v4.d1(X);
                }
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, f6Var);
                k7Var.setDelegate(xs0Var.V1);
                x3Var = k7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(28, context, f6Var);
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}
