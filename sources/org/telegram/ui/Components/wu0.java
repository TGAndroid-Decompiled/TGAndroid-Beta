package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class wu0 extends el0 {
    public final Context f30192c;
    public final int d;
    public boolean e;
    public final jv0 f30193f;

    public wu0(jv0 jv0Var, Context context, int i10) {
        this.f30193f = jv0Var;
        this.f30192c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f30193f.f25555t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((hu0) arrayList.get(i11)).f24870b) {
                    return ((hu0) arrayList.get(i11)).f24869a;
                }
            }
            return ((hu0) hg.c.g(1, arrayList)).f24869a;
        }
        return "";
    }

    @Override
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(wl0 wl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wl0Var.getChildCount() && (i10 = jv0.p(wl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f30193f.S(this.d, wl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        cu0 W = this.f30193f.W(this.d);
        if (W != null) {
            jv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        yu0[] yu0VarArr = this.f30193f.f25555t1;
        int i12 = this.d;
        yu0 yu0Var = yu0VarArr[i12];
        if (yu0Var.f30703o) {
            return yu0Var.e();
        }
        if (yu0Var.f30692a.size() == 0 && !yu0VarArr[i12].f30696g) {
            return 1;
        }
        if (yu0VarArr[i12].f30692a.size() == 0) {
            yu0 yu0Var2 = yu0VarArr[i12];
            boolean[] zArr = yu0Var2.f30697i;
            if ((!zArr[0] || !zArr[1]) && yu0Var2.f30700l) {
                return 0;
            }
        }
        if (yu0VarArr[i12].e() == 0) {
            int size = yu0VarArr[i12].c().size() + yu0VarArr[i12].d();
            if (size != 0) {
                yu0 yu0Var3 = yu0VarArr[i12];
                boolean[] zArr2 = yu0Var3.f30697i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = yu0Var3.f30706r;
                    if (z10) {
                        i10 = yu0Var3.f30709u;
                    } else {
                        i10 = yu0Var3.f30702n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = yu0Var3.f30709u;
                        } else {
                            i11 = yu0Var3.f30702n;
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
        yu0[] yu0VarArr = this.f30193f.f25555t1;
        int i11 = this.d;
        if (yu0VarArr[i11].f30694c.size() == 0 && !yu0VarArr[i11].f30696g) {
            return 9;
        }
        yu0 yu0Var = yu0VarArr[i11];
        int i12 = yu0Var.f30701m;
        if (i10 >= i12 && i10 < yu0Var.f30692a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f30193f.f25555t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        jv0 jv0Var = this.f30193f;
        long j3 = jv0Var.f25534j1;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        yu0 yu0Var = jv0Var.f25555t1[this.d];
        ArrayList arrayList = yu0Var.f30692a;
        int i11 = c1Var.f42963f;
        View view = c1Var.f42960a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - yu0Var.f30701m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (jv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !jv0Var.f25514b1);
                    return;
                }
                j7Var.e(false, !jv0Var.f25514b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - yu0Var.f30701m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (jv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !jv0Var.f25514b1);
                return;
            }
            k7Var.b(false, !jv0Var.f25514b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        jv0 jv0Var = this.f30193f;
        u00 u00Var = jv0Var.f25566y;
        ArrayList arrayList = jv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.f30192c;
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
                        view2 = new eu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(u00Var);
                    view = view2;
                    if (i11 == 4) {
                        jv0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    wt0 M = jv0.M(i11, jv0Var.f25534j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                u00 u00Var2 = new u00(context, d6Var);
                if (i11 == 2) {
                    u00Var2.setViewType(4);
                } else {
                    u00Var2.setViewType(3);
                }
                u00Var2.f28661w = false;
                u00Var2.setIsSingleCell(true);
                u00Var2.setGlobalGradientView(u00Var);
                view = u00Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, d6Var);
            k7Var.setGlobalGradientView(u00Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
