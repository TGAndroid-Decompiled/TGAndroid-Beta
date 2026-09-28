package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yu0 extends gl0 {
    public final Context f30760c;
    public final int d;
    public boolean e;
    public final lv0 f30761f;

    public yu0(lv0 lv0Var, Context context, int i10) {
        this.f30761f = lv0Var;
        this.f30760c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f30761f.f26155t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((ju0) arrayList.get(i11)).f25519b) {
                    return ((ju0) arrayList.get(i11)).f25518a;
                }
            }
            return ((ju0) hg.c.g(1, arrayList)).f25518a;
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
                this.f30761f.S(this.d, yl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        eu0 W = this.f30761f.W(this.d);
        if (W != null) {
            lv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        av0[] av0VarArr = this.f30761f.f26155t1;
        int i12 = this.d;
        av0 av0Var = av0VarArr[i12];
        if (av0Var.f22741o) {
            return av0Var.e();
        }
        if (av0Var.f22730a.size() == 0 && !av0VarArr[i12].f22734g) {
            return 1;
        }
        if (av0VarArr[i12].f22730a.size() == 0) {
            av0 av0Var2 = av0VarArr[i12];
            boolean[] zArr = av0Var2.f22735i;
            if ((!zArr[0] || !zArr[1]) && av0Var2.f22738l) {
                return 0;
            }
        }
        if (av0VarArr[i12].e() == 0) {
            int size = av0VarArr[i12].c().size() + av0VarArr[i12].d();
            if (size != 0) {
                av0 av0Var3 = av0VarArr[i12];
                boolean[] zArr2 = av0Var3.f22735i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = av0Var3.f22744r;
                    if (z10) {
                        i10 = av0Var3.f22747u;
                    } else {
                        i10 = av0Var3.f22740n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = av0Var3.f22747u;
                        } else {
                            i11 = av0Var3.f22740n;
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
        av0[] av0VarArr = this.f30761f.f26155t1;
        int i11 = this.d;
        if (av0VarArr[i11].f22732c.size() == 0 && !av0VarArr[i11].f22734g) {
            return 9;
        }
        av0 av0Var = av0VarArr[i11];
        int i12 = av0Var.f22739m;
        if (i10 >= i12 && i10 < av0Var.f22730a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f30761f.f26155t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        lv0 lv0Var = this.f30761f;
        long j3 = lv0Var.f26134j1;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        av0 av0Var = lv0Var.f26155t1[this.d];
        ArrayList arrayList = av0Var.f22730a;
        int i11 = c1Var.f42963f;
        View view = c1Var.f42960a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - av0Var.f22739m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (lv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !lv0Var.f26114b1);
                    return;
                }
                j7Var.e(false, !lv0Var.f26114b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - av0Var.f22739m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (lv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !lv0Var.f26114b1);
                return;
            }
            k7Var.b(false, !lv0Var.f26114b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        lv0 lv0Var = this.f30761f;
        v00 v00Var = lv0Var.f26166y;
        ArrayList arrayList = lv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = lv0Var.F1;
        Context context = this.f30760c;
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
                        view2 = new gu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(v00Var);
                    view = view2;
                    if (i11 == 4) {
                        lv0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    yt0 M = lv0.M(i11, lv0Var.f26134j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                v00 v00Var2 = new v00(context, d6Var);
                if (i11 == 2) {
                    v00Var2.setViewType(4);
                } else {
                    v00Var2.setViewType(3);
                }
                v00Var2.f28923w = false;
                v00Var2.setIsSingleCell(true);
                v00Var2.setGlobalGradientView(v00Var);
                view = v00Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, d6Var);
            k7Var.setGlobalGradientView(v00Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
