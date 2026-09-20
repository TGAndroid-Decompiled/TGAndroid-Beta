package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class wu0 extends dl0 {
    public final Context f30101c;
    public final int d;
    public boolean e;
    public final jv0 f30102f;

    public wu0(jv0 jv0Var, Context context, int i10) {
        this.f30102f = jv0Var;
        this.f30101c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f30102f.f25524t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((hu0) arrayList.get(i11)).f24761b) {
                    return ((hu0) arrayList.get(i11)).f24760a;
                }
            }
            return ((hu0) hg.k0.g(1, arrayList)).f24760a;
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
            for (int i11 = 0; i11 < vl0Var.getChildCount() && (i10 = jv0.p(vl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f30102f.S(this.d, vl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        cu0 W = this.f30102f.W(this.d);
        if (W != null) {
            jv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        yu0[] yu0VarArr = this.f30102f.f25524t1;
        int i12 = this.d;
        yu0 yu0Var = yu0VarArr[i12];
        if (yu0Var.f30623o) {
            return yu0Var.e();
        }
        if (yu0Var.f30612a.size() == 0 && !yu0VarArr[i12].f30616g) {
            return 1;
        }
        if (yu0VarArr[i12].f30612a.size() == 0) {
            yu0 yu0Var2 = yu0VarArr[i12];
            boolean[] zArr = yu0Var2.f30617i;
            if ((!zArr[0] || !zArr[1]) && yu0Var2.f30620l) {
                return 0;
            }
        }
        if (yu0VarArr[i12].e() == 0) {
            int size = yu0VarArr[i12].c().size() + yu0VarArr[i12].d();
            if (size != 0) {
                yu0 yu0Var3 = yu0VarArr[i12];
                boolean[] zArr2 = yu0Var3.f30617i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = yu0Var3.f30626r;
                    if (z10) {
                        i10 = yu0Var3.f30629u;
                    } else {
                        i10 = yu0Var3.f30622n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = yu0Var3.f30629u;
                        } else {
                            i11 = yu0Var3.f30622n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(yu0VarArr[i12].e(), yu0VarArr[i12].c().size() + yu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        yu0[] yu0VarArr = this.f30102f.f25524t1;
        int i11 = this.d;
        if (yu0VarArr[i11].f30614c.size() == 0 && !yu0VarArr[i11].f30616g) {
            return 9;
        }
        yu0 yu0Var = yu0VarArr[i11];
        int i12 = yu0Var.f30621m;
        if (i10 >= i12 && i10 < yu0Var.f30612a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f30102f.f25524t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        jv0 jv0Var = this.f30102f;
        long j3 = jv0Var.f25503j1;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        yu0 yu0Var = jv0Var.f25524t1[this.d];
        ArrayList arrayList = yu0Var.f30612a;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - yu0Var.f30621m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.f(messageObject, z11);
                if (jv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    k7Var.e(z12, !jv0Var.f25483b1);
                    return;
                }
                k7Var.e(false, !jv0Var.f25483b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.l7)) {
        } else {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - yu0Var.f30621m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l7Var.c(messageObject2, z10);
            if (jv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                l7Var.b(z12, !jv0Var.f25483b1);
                return;
            }
            l7Var.b(false, !jv0Var.f25483b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        jv0 jv0Var = this.f30102f;
        t00 t00Var = jv0Var.f25535y;
        ArrayList arrayList = jv0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = jv0Var.F1;
        Context context = this.f30101c;
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
                        view2 = new eu0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                    k7Var.setGlobalGradientView(t00Var);
                    view = view2;
                    if (i11 == 4) {
                        jv0Var.H0.add(k7Var);
                        view = view2;
                    }
                } else {
                    wt0 M = jv0.M(i11, jv0Var.f25503j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                t00 t00Var2 = new t00(context, f6Var);
                if (i11 == 2) {
                    t00Var2.setViewType(4);
                } else {
                    t00Var2.setViewType(3);
                }
                t00Var2.f28252w = false;
                t00Var2.setIsSingleCell(true);
                t00Var2.setGlobalGradientView(t00Var);
                view = t00Var2;
            }
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, f6Var);
            l7Var.setGlobalGradientView(t00Var);
            view = l7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
