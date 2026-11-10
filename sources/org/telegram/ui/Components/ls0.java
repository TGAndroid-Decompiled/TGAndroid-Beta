package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ls0 extends vi0 {
    public final Context f35736c;
    public final int d;
    public boolean f35737e;
    public final ys0 f35738f;

    public ls0(ys0 ys0Var, Context context, int i7) {
        this.f35738f = ys0Var;
        this.f35736c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f35738f.f40713v1[this.d].f36372e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((yr0) arrayList.get(i10)).f40642b) {
                    return ((yr0) arrayList.get(i10)).f40641a;
                }
            }
            return ((yr0) jg.g.i(1, arrayList)).f40641a;
        }
        return "";
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override
    public final void J(pj0 pj0Var) {
        if (this.f35737e) {
            this.f35737e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < pj0Var.getChildCount() && (i7 = ys0.o(pj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f35738f.c0(this.d, pj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f35737e = true;
        tr0 g02 = this.f35738f.g0(this.d);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        ns0[] ns0VarArr = this.f35738f.f40713v1;
        int i11 = this.d;
        ns0 ns0Var = ns0VarArr[i11];
        if (ns0Var.f36381o) {
            return ns0Var.e();
        }
        if (ns0Var.f36369a.size() == 0 && !ns0VarArr[i11].f36374g) {
            return 1;
        }
        if (ns0VarArr[i11].f36369a.size() == 0) {
            ns0 ns0Var2 = ns0VarArr[i11];
            boolean[] zArr = ns0Var2.f36375i;
            if ((!zArr[0] || !zArr[1]) && ns0Var2.f36378l) {
                return 0;
            }
        }
        if (ns0VarArr[i11].e() == 0) {
            int size = ns0VarArr[i11].c().size() + ns0VarArr[i11].d();
            if (size != 0) {
                ns0 ns0Var3 = ns0VarArr[i11];
                boolean[] zArr2 = ns0Var3.f36375i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z9 = ns0Var3.f36384r;
                    if (z9) {
                        i7 = ns0Var3.f36387u;
                    } else {
                        i7 = ns0Var3.f36380n;
                    }
                    if (i7 != 0) {
                        if (z9) {
                            i10 = ns0Var3.f36387u;
                        } else {
                            i10 = ns0Var3.f36380n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ns0VarArr[i11].e(), ns0VarArr[i11].c().size() + ns0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        ns0[] ns0VarArr = this.f35738f.f40713v1;
        int i10 = this.d;
        if (ns0VarArr[i10].f36371c.size() == 0 && !ns0VarArr[i10].f36374g) {
            return 9;
        }
        ns0 ns0Var = ns0VarArr[i10];
        int i11 = ns0Var.f36379m;
        if (i7 >= i11 && i7 < ns0Var.f36369a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f35738f.f40713v1[this.d].e();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        char c10;
        boolean z10;
        char c11;
        ys0 ys0Var = this.f35738f;
        long j3 = ys0Var.l1;
        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
        ns0 ns0Var = ys0Var.f40713v1[this.d];
        ArrayList arrayList = ns0Var.f36369a;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z11 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7 - ns0Var.f36379m);
                if (i7 != arrayList.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.f(ijVar, z10);
                if (ys0Var.E1) {
                    if (org.telegram.messenger.ij.B0(ijVar.f23266k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(ijVar.e1()) >= 0) {
                        z11 = true;
                    }
                    g7Var.e(z11, !ys0Var.f40661d1);
                    return;
                }
                g7Var.e(false, !ys0Var.f40661d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7 - ns0Var.f36379m);
            if (i7 != arrayList.size() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h7Var.c(ijVar2, z9);
            if (ys0Var.E1) {
                if (org.telegram.messenger.ij.B0(ijVar2.f23266k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(ijVar2.e1()) >= 0) {
                    z11 = true;
                }
                h7Var.b(z11, !ys0Var.f40661d1);
                return;
            }
            h7Var.b(false, !ys0Var.f40661d1);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        ys0 ys0Var = this.f35738f;
        lz lzVar = ys0Var.D;
        ArrayList arrayList = ys0Var.I0;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.f35736c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 != 8) {
                if (i7 != 9) {
                    if (i10 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new ur0(this, context, h6Var, 1);
                    }
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view2;
                    g7Var.setGlobalGradientView(lzVar);
                    view = view2;
                    if (i10 == 4) {
                        ys0Var.J0.add(g7Var);
                        view = view2;
                    }
                } else {
                    q3 X = ys0.X(i10, ys0Var.l1, context, h6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new v4.d1(X);
                }
            } else {
                lz lzVar2 = new lz(context, h6Var);
                if (i10 == 2) {
                    lzVar2.setViewType(4);
                } else {
                    lzVar2.setViewType(3);
                }
                lzVar2.f35774x = false;
                lzVar2.setIsSingleCell(true);
                lzVar2.setGlobalGradientView(lzVar);
                view = lzVar2;
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, h6Var);
            h7Var.setGlobalGradientView(lzVar);
            view = h7Var;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
