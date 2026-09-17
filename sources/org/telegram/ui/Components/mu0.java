package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class mu0 extends uk0 {
    public final Context f26268c;
    public final int d;
    public boolean e;
    public final zu0 f26269f;

    public mu0(zu0 zu0Var, Context context, int i10) {
        this.f26269f = zu0Var;
        this.f26268c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f26269f.f30652t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((xt0) arrayList.get(i11)).f29987b) {
                    return ((xt0) arrayList.get(i11)).f29986a;
                }
            }
            return ((xt0) hg.k0.h(1, arrayList)).f29986a;
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
            for (int i11 = 0; i11 < ml0Var.getChildCount() && (i10 = zu0.p(ml0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f26269f.S(this.d, ml0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        st0 W = this.f26269f.W(this.d);
        if (W != null) {
            zu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        ou0[] ou0VarArr = this.f26269f.f30652t1;
        int i12 = this.d;
        ou0 ou0Var = ou0VarArr[i12];
        if (ou0Var.f26860o) {
            return ou0Var.e();
        }
        if (ou0Var.f26849a.size() == 0 && !ou0VarArr[i12].f26853g) {
            return 1;
        }
        if (ou0VarArr[i12].f26849a.size() == 0) {
            ou0 ou0Var2 = ou0VarArr[i12];
            boolean[] zArr = ou0Var2.f26854i;
            if ((!zArr[0] || !zArr[1]) && ou0Var2.f26857l) {
                return 0;
            }
        }
        if (ou0VarArr[i12].e() == 0) {
            int size = ou0VarArr[i12].c().size() + ou0VarArr[i12].d();
            if (size != 0) {
                ou0 ou0Var3 = ou0VarArr[i12];
                boolean[] zArr2 = ou0Var3.f26854i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = ou0Var3.f26863r;
                    if (z10) {
                        i10 = ou0Var3.f26866u;
                    } else {
                        i10 = ou0Var3.f26859n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = ou0Var3.f26866u;
                        } else {
                            i11 = ou0Var3.f26859n;
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
        ou0[] ou0VarArr = this.f26269f.f30652t1;
        int i11 = this.d;
        if (ou0VarArr[i11].f26851c.size() == 0 && !ou0VarArr[i11].f26853g) {
            return 9;
        }
        ou0 ou0Var = ou0VarArr[i11];
        int i12 = ou0Var.f26858m;
        if (i10 >= i12 && i10 < ou0Var.f26849a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f26269f.f30652t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        zu0 zu0Var = this.f26269f;
        long j3 = zu0Var.f30631j1;
        SparseArray[] sparseArrayArr = zu0Var.Z0;
        ou0 ou0Var = zu0Var.f30652t1[this.d];
        ArrayList arrayList = ou0Var.f26849a;
        int i11 = c1Var.f42700f;
        View view = c1Var.f42697a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.i7)) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - ou0Var.f26858m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.f(messageObject, z11);
                if (zu0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    i7Var.e(z12, !zu0Var.f30611b1);
                    return;
                }
                i7Var.e(false, !zu0Var.f30611b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.j7)) {
        } else {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - ou0Var.f26858m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7Var.c(messageObject2, z10);
            if (zu0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                j7Var.b(z12, !zu0Var.f30611b1);
                return;
            }
            j7Var.b(false, !zu0Var.f30611b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        zu0 zu0Var = this.f26269f;
        t00 t00Var = zu0Var.f30663y;
        ArrayList arrayList = zu0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.f26268c;
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
                        view2 = new ut0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view2;
                    i7Var.setGlobalGradientView(t00Var);
                    view = view2;
                    if (i11 == 4) {
                        zu0Var.H0.add(i7Var);
                        view = view2;
                    }
                } else {
                    mt0 M = zu0.M(i11, zu0Var.f30631j1, context, f6Var);
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
                t00Var2.f27976w = false;
                t00Var2.setIsSingleCell(true);
                t00Var2.setGlobalGradientView(t00Var);
                view = t00Var2;
            }
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, f6Var);
            j7Var.setGlobalGradientView(t00Var);
            view = j7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
