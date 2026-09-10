package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class vu0 extends dl0 {
    public final Context f28599c;
    public final int d;
    public boolean e;
    public final iv0 f28600f;

    public vu0(iv0 iv0Var, Context context, int i10) {
        this.f28600f = iv0Var;
        this.f28599c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f28600f.f24127t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((fu0) arrayList.get(i11)).f23084b) {
                    return ((fu0) arrayList.get(i11)).f23083a;
                }
            }
            return ((fu0) hc.b.i(1, arrayList)).f23083a;
        }
        return "";
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(vl0 vl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < vl0Var.getChildCount() && (i10 = iv0.p(vl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f28600f.S(this.d, vl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        au0 W = this.f28600f.W(this.d);
        if (W != null) {
            iv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        xu0[] xu0VarArr = this.f28600f.f24127t1;
        int i12 = this.d;
        xu0 xu0Var = xu0VarArr[i12];
        if (xu0Var.f29167o) {
            return xu0Var.e();
        }
        if (xu0Var.f29156a.size() == 0 && !xu0VarArr[i12].f29160g) {
            return 1;
        }
        if (xu0VarArr[i12].f29156a.size() == 0) {
            xu0 xu0Var2 = xu0VarArr[i12];
            boolean[] zArr = xu0Var2.f29161i;
            if ((!zArr[0] || !zArr[1]) && xu0Var2.f29164l) {
                return 0;
            }
        }
        if (xu0VarArr[i12].e() == 0) {
            int size = xu0VarArr[i12].c().size() + xu0VarArr[i12].d();
            if (size != 0) {
                xu0 xu0Var3 = xu0VarArr[i12];
                boolean[] zArr2 = xu0Var3.f29161i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = xu0Var3.f29170r;
                    if (z10) {
                        i10 = xu0Var3.f29173u;
                    } else {
                        i10 = xu0Var3.f29166n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = xu0Var3.f29173u;
                        } else {
                            i11 = xu0Var3.f29166n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(xu0VarArr[i12].e(), xu0VarArr[i12].c().size() + xu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        xu0[] xu0VarArr = this.f28600f.f24127t1;
        int i11 = this.d;
        if (xu0VarArr[i11].f29158c.size() == 0 && !xu0VarArr[i11].f29160g) {
            return 9;
        }
        xu0 xu0Var = xu0VarArr[i11];
        int i12 = xu0Var.f29165m;
        if (i10 >= i12 && i10 < xu0Var.f29156a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f28600f.f24127t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        iv0 iv0Var = this.f28600f;
        long j3 = iv0Var.f24106j1;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        xu0 xu0Var = iv0Var.f24127t1[this.d];
        ArrayList arrayList = xu0Var.f29156a;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - xu0Var.f29165m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.f(messageObject, z11);
                if (iv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    k7Var.e(z12, !iv0Var.f24086b1);
                    return;
                }
                k7Var.e(false, !iv0Var.f24086b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.l7)) {
        } else {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - xu0Var.f29165m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l7Var.c(messageObject2, z10);
            if (iv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                l7Var.b(z12, !iv0Var.f24086b1);
                return;
            }
            l7Var.b(false, !iv0Var.f24086b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        iv0 iv0Var = this.f28600f;
        a10 a10Var = iv0Var.f24138y;
        ArrayList arrayList = iv0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.f28599c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 != 8) {
                if (i10 != 9) {
                    if (i11 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new cu0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                    k7Var.setGlobalGradientView(a10Var);
                    view = view2;
                    if (i11 == 4) {
                        iv0Var.H0.add(k7Var);
                        view = view2;
                    }
                } else {
                    ut0 M = iv0.M(i11, iv0Var.f24106j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                a10 a10Var2 = new a10(context, f6Var);
                if (i11 == 2) {
                    a10Var2.setViewType(4);
                } else {
                    a10Var2.setViewType(3);
                }
                a10Var2.f21345w = false;
                a10Var2.setIsSingleCell(true);
                a10Var2.setGlobalGradientView(a10Var);
                view = a10Var2;
            }
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, f6Var);
            l7Var.setGlobalGradientView(a10Var);
            view = l7Var;
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
