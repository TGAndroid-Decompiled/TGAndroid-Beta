package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ks0 extends vi0 {
    public final Context f35410c;
    public final int d;
    public boolean f35411e;
    public final xs0 f35412f;

    public ks0(xs0 xs0Var, Context context, int i7) {
        this.f35412f = xs0Var;
        this.f35410c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f35412f.f40399v1[this.d].f36112e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((xr0) arrayList.get(i10)).f40328b) {
                    return ((xr0) arrayList.get(i10)).f40327a;
                }
            }
            return ((xr0) jg.g.i(1, arrayList)).f40327a;
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
        if (this.f35411e) {
            this.f35411e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < pj0Var.getChildCount() && (i7 = xs0.o(pj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f35412f.c0(this.d, pj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f35411e = true;
        sr0 g02 = this.f35412f.g0(this.d);
        if (g02 != null) {
            xs0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        ms0[] ms0VarArr = this.f35412f.f40399v1;
        int i11 = this.d;
        ms0 ms0Var = ms0VarArr[i11];
        if (ms0Var.f36121o) {
            return ms0Var.e();
        }
        if (ms0Var.f36109a.size() == 0 && !ms0VarArr[i11].f36114g) {
            return 1;
        }
        if (ms0VarArr[i11].f36109a.size() == 0) {
            ms0 ms0Var2 = ms0VarArr[i11];
            boolean[] zArr = ms0Var2.f36115i;
            if ((!zArr[0] || !zArr[1]) && ms0Var2.f36118l) {
                return 0;
            }
        }
        if (ms0VarArr[i11].e() == 0) {
            int size = ms0VarArr[i11].c().size() + ms0VarArr[i11].d();
            if (size != 0) {
                ms0 ms0Var3 = ms0VarArr[i11];
                boolean[] zArr2 = ms0Var3.f36115i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z9 = ms0Var3.f36124r;
                    if (z9) {
                        i7 = ms0Var3.f36127u;
                    } else {
                        i7 = ms0Var3.f36120n;
                    }
                    if (i7 != 0) {
                        if (z9) {
                            i10 = ms0Var3.f36127u;
                        } else {
                            i10 = ms0Var3.f36120n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ms0VarArr[i11].e(), ms0VarArr[i11].c().size() + ms0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        ms0[] ms0VarArr = this.f35412f.f40399v1;
        int i10 = this.d;
        if (ms0VarArr[i10].f36111c.size() == 0 && !ms0VarArr[i10].f36114g) {
            return 9;
        }
        ms0 ms0Var = ms0VarArr[i10];
        int i11 = ms0Var.f36119m;
        if (i7 >= i11 && i7 < ms0Var.f36109a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f35412f.f40399v1[this.d].e();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        char c10;
        boolean z10;
        char c11;
        xs0 xs0Var = this.f35412f;
        long j3 = xs0Var.l1;
        SparseArray[] sparseArrayArr = xs0Var.f40340b1;
        ms0 ms0Var = xs0Var.f40399v1[this.d];
        ArrayList arrayList = ms0Var.f36109a;
        int i10 = d1Var.f56931f;
        View view = d1Var.f56927a;
        boolean z11 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7 - ms0Var.f36119m);
                if (i7 != arrayList.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.f(ijVar, z10);
                if (xs0Var.E1) {
                    if (org.telegram.messenger.ij.B0(ijVar.f23237k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(ijVar.f1()) >= 0) {
                        z11 = true;
                    }
                    g7Var.e(z11, !xs0Var.f40347d1);
                    return;
                }
                g7Var.e(false, !xs0Var.f40347d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7 - ms0Var.f36119m);
            if (i7 != arrayList.size() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h7Var.c(ijVar2, z9);
            if (xs0Var.E1) {
                if (org.telegram.messenger.ij.B0(ijVar2.f23237k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(ijVar2.f1()) >= 0) {
                    z11 = true;
                }
                h7Var.b(z11, !xs0Var.f40347d1);
                return;
            }
            h7Var.b(false, !xs0Var.f40347d1);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        xs0 xs0Var = this.f35412f;
        lz lzVar = xs0Var.D;
        ArrayList arrayList = xs0Var.I0;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.f35410c;
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
                        view2 = new tr0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view2;
                    g7Var.setGlobalGradientView(lzVar);
                    view = view2;
                    if (i10 == 4) {
                        xs0Var.J0.add(g7Var);
                        view = view2;
                    }
                } else {
                    r3 X = xs0.X(i10, xs0Var.l1, context, f6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new v4.d1(X);
                }
            } else {
                lz lzVar2 = new lz(context, f6Var);
                if (i10 == 2) {
                    lzVar2.setViewType(4);
                } else {
                    lzVar2.setViewType(3);
                }
                lzVar2.f35802x = false;
                lzVar2.setIsSingleCell(true);
                lzVar2.setGlobalGradientView(lzVar);
                view = lzVar2;
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, f6Var);
            h7Var.setGlobalGradientView(lzVar);
            view = h7Var;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
