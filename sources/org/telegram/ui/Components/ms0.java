package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ms0 extends kj0 {
    public final Context f36086r;
    public final ys0 f36087s;

    public ms0(ys0 ys0Var, Context context) {
        this.f36087s = ys0Var;
        this.f36086r = context;
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
        ns0[] ns0VarArr = this.f36087s.f40713v1;
        int i10 = 1;
        if ((ns0VarArr[3].f36371c.size() == 0 && !ns0VarArr[3].f36374g) || i7 >= ns0VarArr[3].f36371c.size()) {
            return 1;
        }
        ns0 ns0Var = ns0VarArr[3];
        int size = ((ArrayList) ns0Var.d.get(ns0Var.f36371c.get(i7))).size();
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
        ns0[] ns0VarArr = this.f36087s.f40713v1;
        if (ns0VarArr[3].f36371c.size() == 0 && !ns0VarArr[3].f36374g) {
            return 5;
        }
        if (i7 < ns0VarArr[3].f36371c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ms0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        ys0 ys0Var = this.f36087s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.f36086r, ys0Var.H1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < ys0Var.f40713v1[3].f36371c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) ys0Var.f40713v1[3].d.get((String) ys0Var.f40713v1[3].f36371c.get(i7))).get(0)).f23266k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        ns0[] ns0VarArr = this.f36087s.f40713v1;
        if (ns0VarArr[3].f36371c.size() != 0 || ns0VarArr[3].f36374g) {
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
        ys0 ys0Var = this.f36087s;
        ns0[] ns0VarArr = ys0Var.f40713v1;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) ns0VarArr[3].d.get((String) ns0VarArr[3].f36371c.get(i7));
            int i12 = d1Var.f57056f;
            boolean z10 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != ns0VarArr[3].f36371c.size() - 1 || !ns0VarArr[3].f36374g)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        k7Var.D = z9;
                        k7Var.e();
                        k7Var.f29450b0 = ijVar;
                        k7Var.requestLayout();
                        if (ys0Var.E1) {
                            SparseArray[] sparseArrayArr = ys0Var.f40654b1;
                            if (org.telegram.messenger.ij.B0(ijVar.f23266k) == ys0Var.l1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                                z10 = true;
                            }
                            k7Var.f(z10, !ys0Var.f40661d1);
                            return;
                        }
                        k7Var.f(false, !ys0Var.f40661d1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(ijVar2.f23266k.date, false));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        ys0 ys0Var = this.f36087s;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.f36086r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    lz lzVar = new lz(context, h6Var);
                    lzVar.setIsSingleCell(true);
                    lzVar.f35774x = false;
                    lzVar.setViewType(5);
                    x3Var = lzVar;
                } else {
                    q3 X = ys0.X(3, ys0Var.l1, context, h6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new v4.d1(X);
                }
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, h6Var);
                k7Var.setDelegate(ys0Var.V1);
                x3Var = k7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(28, context, h6Var);
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}
