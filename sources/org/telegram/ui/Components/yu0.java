package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yu0 extends gl0 {
    public final Context f30755c;
    public final int d;
    public boolean e;
    public final lv0 f30756f;

    public yu0(lv0 lv0Var, Context context, int i10) {
        this.f30756f = lv0Var;
        this.f30755c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f30756f.f26230t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((ju0) arrayList.get(i11)).f25469b) {
                    return ((ju0) arrayList.get(i11)).f25468a;
                }
            }
            return ((ju0) hg.k0.g(1, arrayList)).f25468a;
        }
        return "";
    }

    @Override
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        int measuredHeight = yl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (yl0Var.getMeasuredHeight() - yl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(yl0 yl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < yl0Var.getChildCount() && (i10 = lv0.p(yl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f30756f.S(this.d, yl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        eu0 W = this.f30756f.W(this.d);
        if (W != null) {
            lv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        av0[] av0VarArr = this.f30756f.f26230t1;
        int i12 = this.d;
        av0 av0Var = av0VarArr[i12];
        if (av0Var.f22755o) {
            return av0Var.e();
        }
        if (av0Var.f22744a.size() == 0 && !av0VarArr[i12].f22748g) {
            return 1;
        }
        if (av0VarArr[i12].f22744a.size() == 0) {
            av0 av0Var2 = av0VarArr[i12];
            boolean[] zArr = av0Var2.f22749i;
            if ((!zArr[0] || !zArr[1]) && av0Var2.f22752l) {
                return 0;
            }
        }
        if (av0VarArr[i12].e() == 0) {
            int size = av0VarArr[i12].c().size() + av0VarArr[i12].d();
            if (size != 0) {
                av0 av0Var3 = av0VarArr[i12];
                boolean[] zArr2 = av0Var3.f22749i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = av0Var3.f22758r;
                    if (z10) {
                        i10 = av0Var3.f22761u;
                    } else {
                        i10 = av0Var3.f22754n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = av0Var3.f22761u;
                        } else {
                            i11 = av0Var3.f22754n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(av0VarArr[i12].e(), av0VarArr[i12].c().size() + av0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        av0[] av0VarArr = this.f30756f.f26230t1;
        int i11 = this.d;
        if (av0VarArr[i11].f22746c.size() == 0 && !av0VarArr[i11].f22748g) {
            return 9;
        }
        av0 av0Var = av0VarArr[i11];
        int i12 = av0Var.f22753m;
        if (i10 >= i12 && i10 < av0Var.f22744a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f30756f.f26230t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        lv0 lv0Var = this.f30756f;
        long j3 = lv0Var.f26209j1;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        av0 av0Var = lv0Var.f26230t1[this.d];
        ArrayList arrayList = av0Var.f22744a;
        int i11 = c1Var.f42998f;
        View view = c1Var.f42995a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - av0Var.f22753m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.f(messageObject, z11);
                if (lv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    k7Var.e(z12, !lv0Var.f26189b1);
                    return;
                }
                k7Var.e(false, !lv0Var.f26189b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.l7)) {
        } else {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - av0Var.f22753m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l7Var.c(messageObject2, z10);
            if (lv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                l7Var.b(z12, !lv0Var.f26189b1);
                return;
            }
            l7Var.b(false, !lv0Var.f26189b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        lv0 lv0Var = this.f30756f;
        t00 t00Var = lv0Var.f26241y;
        ArrayList arrayList = lv0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
        Context context = this.f30755c;
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
                        view2 = new gu0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                    k7Var.setGlobalGradientView(t00Var);
                    view = view2;
                    if (i11 == 4) {
                        lv0Var.H0.add(k7Var);
                        view = view2;
                    }
                } else {
                    yt0 M = lv0.M(i11, lv0Var.f26209j1, context, f6Var);
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
                t00Var2.f28362w = false;
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
