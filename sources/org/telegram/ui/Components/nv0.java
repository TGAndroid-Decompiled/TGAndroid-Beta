package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nv0 extends tl0 {
    public final Context f31084c;
    public final int d;
    public boolean e;
    public final aw0 f31085f;

    public nv0(aw0 aw0Var, Context context, int i10) {
        this.f31085f = aw0Var;
        this.f31084c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f31085f.f26698v1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((zu0) arrayList.get(i11)).f35410b) {
                    return ((zu0) arrayList.get(i11)).f35409a;
                }
            }
            return ((zu0) ic.a.g(1, arrayList)).f35409a;
        }
        return "";
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(mm0 mm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < mm0Var.getChildCount() && (i10 = aw0.r(mm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f31085f.Z(this.d, mm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        tu0 d02 = this.f31085f.d0(this.d);
        if (d02 != null) {
            aw0.t(d02, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        pv0[] pv0VarArr = this.f31085f.f26698v1;
        int i12 = this.d;
        pv0 pv0Var = pv0VarArr[i12];
        if (pv0Var.f31717o) {
            return pv0Var.e();
        }
        if (pv0Var.f31706a.size() == 0 && !pv0VarArr[i12].f31710g) {
            return 1;
        }
        if (pv0VarArr[i12].f31706a.size() == 0) {
            pv0 pv0Var2 = pv0VarArr[i12];
            boolean[] zArr = pv0Var2.f31711i;
            if ((!zArr[0] || !zArr[1]) && pv0Var2.f31714l) {
                return 0;
            }
        }
        if (pv0VarArr[i12].e() == 0) {
            int size = pv0VarArr[i12].c().size() + pv0VarArr[i12].d();
            if (size != 0) {
                pv0 pv0Var3 = pv0VarArr[i12];
                boolean[] zArr2 = pv0Var3.f31711i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = pv0Var3.f31720r;
                    if (z10) {
                        i10 = pv0Var3.f31723u;
                    } else {
                        i10 = pv0Var3.f31716n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = pv0Var3.f31723u;
                        } else {
                            i11 = pv0Var3.f31716n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(pv0VarArr[i12].e(), pv0VarArr[i12].c().size() + pv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        pv0[] pv0VarArr = this.f31085f.f26698v1;
        int i11 = this.d;
        if (pv0VarArr[i11].f31708c.size() == 0 && !pv0VarArr[i11].f31710g) {
            return 9;
        }
        pv0 pv0Var = pv0VarArr[i11];
        int i12 = pv0Var.f31715m;
        if (i10 >= i12 && i10 < pv0Var.f31706a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f31085f.f26698v1[this.d].e();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        aw0 aw0Var = this.f31085f;
        long j10 = aw0Var.l1;
        SparseArray[] sparseArrayArr = aw0Var.f26641b1;
        pv0 pv0Var = aw0Var.f26698v1[this.d];
        ArrayList arrayList = pv0Var.f31706a;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.n7)) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - pv0Var.f31715m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n7Var.f(messageObject, z11);
                if (aw0Var.E1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    n7Var.e(z12, !aw0Var.f26648d1);
                    return;
                }
                n7Var.e(false, !aw0Var.f26648d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.o7)) {
        } else {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - pv0Var.f31715m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.c(messageObject2, z10);
            if (aw0Var.E1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                o7Var.b(z12, !aw0Var.f26648d1);
                return;
            }
            o7Var.b(false, !aw0Var.f26648d1);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        aw0 aw0Var = this.f31085f;
        c10 c10Var = aw0Var.f26705y;
        ArrayList arrayList = aw0Var.I0;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.f31084c;
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
                        view2 = new vu0(this, context, u6Var, 1);
                    }
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view2;
                    n7Var.setGlobalGradientView(c10Var);
                    view = view2;
                    if (i11 == 4) {
                        aw0Var.J0.add(n7Var);
                        view = view2;
                    }
                } else {
                    nu0 U = aw0.U(i11, aw0Var.l1, context, u6Var);
                    U.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.e1(U);
                }
            } else {
                c10 c10Var2 = new c10(context, u6Var);
                if (i11 == 2) {
                    c10Var2.setViewType(4);
                } else {
                    c10Var2.setViewType(3);
                }
                c10Var2.f27031w = false;
                c10Var2.setIsSingleCell(true);
                c10Var2.setGlobalGradientView(c10Var);
                view = c10Var2;
            }
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, u6Var);
            o7Var.setGlobalGradientView(c10Var);
            view = o7Var;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
