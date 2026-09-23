package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lu0 extends uk0 {
    public final Context f25946c;
    public final int d;
    public boolean e;
    public final yu0 f25947f;

    public lu0(yu0 yu0Var, Context context, int i10) {
        this.f25947f = yu0Var;
        this.f25946c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f25947f.f30446t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((wt0) arrayList.get(i11)).f29808b) {
                    return ((wt0) arrayList.get(i11)).f29807a;
                }
            }
            return ((wt0) hg.c.h(1, arrayList)).f29807a;
        }
        return "";
    }

    @Override
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        int measuredHeight = ml0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (ml0Var.getMeasuredHeight() - ml0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(ml0 ml0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ml0Var.getChildCount() && (i10 = yu0.p(ml0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f25947f.S(this.d, ml0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        rt0 W = this.f25947f.W(this.d);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        nu0[] nu0VarArr = this.f25947f.f30446t1;
        int i12 = this.d;
        nu0 nu0Var = nu0VarArr[i12];
        if (nu0Var.f26523o) {
            return nu0Var.e();
        }
        if (nu0Var.f26512a.size() == 0 && !nu0VarArr[i12].f26516g) {
            return 1;
        }
        if (nu0VarArr[i12].f26512a.size() == 0) {
            nu0 nu0Var2 = nu0VarArr[i12];
            boolean[] zArr = nu0Var2.f26517i;
            if ((!zArr[0] || !zArr[1]) && nu0Var2.f26520l) {
                return 0;
            }
        }
        if (nu0VarArr[i12].e() == 0) {
            int size = nu0VarArr[i12].c().size() + nu0VarArr[i12].d();
            if (size != 0) {
                nu0 nu0Var3 = nu0VarArr[i12];
                boolean[] zArr2 = nu0Var3.f26517i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = nu0Var3.f26526r;
                    if (z10) {
                        i10 = nu0Var3.f26529u;
                    } else {
                        i10 = nu0Var3.f26522n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = nu0Var3.f26529u;
                        } else {
                            i11 = nu0Var3.f26522n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(nu0VarArr[i12].e(), nu0VarArr[i12].c().size() + nu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        nu0[] nu0VarArr = this.f25947f.f30446t1;
        int i11 = this.d;
        if (nu0VarArr[i11].f26514c.size() == 0 && !nu0VarArr[i11].f26516g) {
            return 9;
        }
        nu0 nu0Var = nu0VarArr[i11];
        int i12 = nu0Var.f26521m;
        if (i10 >= i12 && i10 < nu0Var.f26512a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f25947f.f30446t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        yu0 yu0Var = this.f25947f;
        long j3 = yu0Var.f30425j1;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        nu0 nu0Var = yu0Var.f30446t1[this.d];
        ArrayList arrayList = nu0Var.f26512a;
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.i7)) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - nu0Var.f26521m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.f(messageObject, z11);
                if (yu0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    i7Var.e(z12, !yu0Var.f30405b1);
                    return;
                }
                i7Var.e(false, !yu0Var.f30405b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.j7)) {
        } else {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - nu0Var.f26521m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7Var.c(messageObject2, z10);
            if (yu0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                j7Var.b(z12, !yu0Var.f30405b1);
                return;
            }
            j7Var.b(false, !yu0Var.f30405b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        yu0 yu0Var = this.f25947f;
        u00 u00Var = yu0Var.f30457y;
        ArrayList arrayList = yu0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = yu0Var.F1;
        Context context = this.f25946c;
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
                        view2 = new tt0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view2;
                    i7Var.setGlobalGradientView(u00Var);
                    view = view2;
                    if (i11 == 4) {
                        yu0Var.H0.add(i7Var);
                        view = view2;
                    }
                } else {
                    lt0 M = yu0.M(i11, yu0Var.f30425j1, context, d6Var);
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
                u00Var2.f28353w = false;
                u00Var2.setIsSingleCell(true);
                u00Var2.setGlobalGradientView(u00Var);
                view = u00Var2;
            }
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, d6Var);
            j7Var.setGlobalGradientView(u00Var);
            view = j7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
