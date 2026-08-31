package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class mu0 extends dl0 {
    public final Context f29249c;
    public final int d;
    public boolean f29250e;
    public final zu0 f29251f;

    public mu0(zu0 zu0Var, Context context, int i10) {
        this.f29251f = zu0Var;
        this.f29249c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f29251f.f33998q1[this.d].f29854e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((wt0) arrayList.get(i11)).f32847b) {
                    return ((wt0) arrayList.get(i11)).f32846a;
                }
            }
            return ((wt0) l.d.i(1, arrayList)).f32846a;
        }
        return "";
    }

    @Override
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(tl0 tl0Var) {
        if (this.f29250e) {
            this.f29250e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tl0Var.getChildCount() && (i10 = zu0.p(tl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f29251f.S(this.d, tl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f29250e = true;
        rt0 W = this.f29251f.W(this.d);
        if (W != null) {
            zu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        ou0[] ou0VarArr = this.f29251f.f33998q1;
        int i12 = this.d;
        ou0 ou0Var = ou0VarArr[i12];
        if (ou0Var.f29863o) {
            return ou0Var.e();
        }
        if (ou0Var.f29851a.size() == 0 && !ou0VarArr[i12].f29856g) {
            return 1;
        }
        if (ou0VarArr[i12].f29851a.size() == 0) {
            ou0 ou0Var2 = ou0VarArr[i12];
            boolean[] zArr = ou0Var2.f29857i;
            if ((!zArr[0] || !zArr[1]) && ou0Var2.f29860l) {
                return 0;
            }
        }
        if (ou0VarArr[i12].e() == 0) {
            int size = ou0VarArr[i12].c().size() + ou0VarArr[i12].d();
            if (size != 0) {
                ou0 ou0Var3 = ou0VarArr[i12];
                boolean[] zArr2 = ou0Var3.f29857i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z4 = ou0Var3.f29866r;
                    if (z4) {
                        i10 = ou0Var3.f29869u;
                    } else {
                        i10 = ou0Var3.f29862n;
                    }
                    if (i10 != 0) {
                        if (z4) {
                            i11 = ou0Var3.f29869u;
                        } else {
                            i11 = ou0Var3.f29862n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ou0VarArr[i12].e(), ou0VarArr[i12].c().size() + ou0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        ou0[] ou0VarArr = this.f29251f.f33998q1;
        int i11 = this.d;
        if (ou0VarArr[i11].f29853c.size() == 0 && !ou0VarArr[i11].f29856g) {
            return 9;
        }
        ou0 ou0Var = ou0VarArr[i11];
        int i12 = ou0Var.f29861m;
        if (i10 >= i12 && i10 < ou0Var.f29851a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f29251f.f33998q1[this.d].e();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        char c3;
        boolean z10;
        char c10;
        zu0 zu0Var = this.f29251f;
        long j10 = zu0Var.f33979g1;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        ou0 ou0Var = zu0Var.f33998q1[this.d];
        ArrayList arrayList = ou0Var.f29851a;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z11 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - ou0Var.f29861m);
                if (i10 != arrayList.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h7Var.f(messageObject, z10);
                if (zu0Var.f34021z1) {
                    if (messageObject.getDialogId() == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                        z11 = true;
                    }
                    h7Var.e(z11, !zu0Var.Y0);
                    return;
                }
                h7Var.e(false, !zu0Var.Y0);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - ou0Var.f29861m);
            if (i10 != arrayList.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            i7Var.c(messageObject2, z4);
            if (zu0Var.f34021z1) {
                if (messageObject2.getDialogId() == j10) {
                    c3 = 0;
                } else {
                    c3 = 1;
                }
                if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                    z11 = true;
                }
                i7Var.b(z11, !zu0Var.Y0);
                return;
            }
            i7Var.b(false, !zu0Var.Y0);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        zu0 zu0Var = this.f29251f;
        u00 u00Var = zu0Var.f34017y;
        ArrayList arrayList = zu0Var.D0;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.f29249c;
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
                        view2 = new tt0(this, context, g6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(u00Var);
                    view = view2;
                    if (i11 == 4) {
                        zu0Var.E0.add(h7Var);
                        view = view2;
                    }
                } else {
                    lt0 M = zu0.M(i11, zu0Var.f33979g1, context, g6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new f2.m1(M);
                }
            } else {
                u00 u00Var2 = new u00(context, g6Var);
                if (i11 == 2) {
                    u00Var2.setViewType(4);
                } else {
                    u00Var2.setViewType(3);
                }
                u00Var2.f31509w = false;
                u00Var2.setIsSingleCell(true);
                u00Var2.setGlobalGradientView(u00Var);
                view = u00Var2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, g6Var);
            i7Var.setGlobalGradientView(u00Var);
            view = i7Var;
        }
        return org.telegram.ui.yh.o(view, view, -1, -2);
    }
}
