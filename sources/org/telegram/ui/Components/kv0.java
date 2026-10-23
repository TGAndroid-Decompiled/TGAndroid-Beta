package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class kv0 extends ul0 {
    public final Context f28158c;
    public final int d;
    public boolean e;
    public final xv0 f28159f;

    public kv0(xv0 xv0Var, Context context, int i10) {
        this.f28159f = xv0Var;
        this.f28158c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f28159f.f32707t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((vu0) arrayList.get(i11)).f32055b) {
                    return ((vu0) arrayList.get(i11)).f32054a;
                }
            }
            return ((vu0) i2.o1.i(1, arrayList)).f32054a;
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
            for (int i11 = 0; i11 < mm0Var.getChildCount() && (i10 = xv0.q(mm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f28159f.T(this.d, mm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        qu0 X = this.f28159f.X(this.d);
        if (X != null) {
            xv0.r(X, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        mv0[] mv0VarArr = this.f28159f.f32707t1;
        int i12 = this.d;
        mv0 mv0Var = mv0VarArr[i12];
        if (mv0Var.f28768o) {
            return mv0Var.e();
        }
        if (mv0Var.f28757a.size() == 0 && !mv0VarArr[i12].f28761g) {
            return 1;
        }
        if (mv0VarArr[i12].f28757a.size() == 0) {
            mv0 mv0Var2 = mv0VarArr[i12];
            boolean[] zArr = mv0Var2.f28762i;
            if ((!zArr[0] || !zArr[1]) && mv0Var2.f28765l) {
                return 0;
            }
        }
        if (mv0VarArr[i12].e() == 0) {
            int size = mv0VarArr[i12].c().size() + mv0VarArr[i12].d();
            if (size != 0) {
                mv0 mv0Var3 = mv0VarArr[i12];
                boolean[] zArr2 = mv0Var3.f28762i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = mv0Var3.f28771r;
                    if (z10) {
                        i10 = mv0Var3.f28774u;
                    } else {
                        i10 = mv0Var3.f28767n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = mv0Var3.f28774u;
                        } else {
                            i11 = mv0Var3.f28767n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(mv0VarArr[i12].e(), mv0VarArr[i12].c().size() + mv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        mv0[] mv0VarArr = this.f28159f.f32707t1;
        int i11 = this.d;
        if (mv0VarArr[i11].f28759c.size() == 0 && !mv0VarArr[i11].f28761g) {
            return 9;
        }
        mv0 mv0Var = mv0VarArr[i11];
        int i12 = mv0Var.f28766m;
        if (i10 >= i12 && i10 < mv0Var.f28757a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f28159f.f32707t1[this.d].e();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        xv0 xv0Var = this.f28159f;
        long j10 = xv0Var.f32686j1;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        mv0 mv0Var = xv0Var.f32707t1[this.d];
        ArrayList arrayList = mv0Var.f28757a;
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - mv0Var.f28766m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (xv0Var.C1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !xv0Var.f32663b1);
                    return;
                }
                j7Var.e(false, !xv0Var.f32663b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - mv0Var.f28766m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (xv0Var.C1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !xv0Var.f32663b1);
                return;
            }
            k7Var.b(false, !xv0Var.f32663b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        xv0 xv0Var = this.f28159f;
        b10 b10Var = xv0Var.f32718y;
        ArrayList arrayList = xv0Var.G0;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.f28158c;
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
                        view2 = new su0(this, context, g6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(b10Var);
                    view = view2;
                    if (i11 == 4) {
                        xv0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    ku0 N = xv0.N(i11, xv0Var.f32686j1, context, g6Var);
                    N.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(N);
                }
            } else {
                b10 b10Var2 = new b10(context, g6Var);
                if (i11 == 2) {
                    b10Var2.setViewType(4);
                } else {
                    b10Var2.setViewType(3);
                }
                b10Var2.f24923w = false;
                b10Var2.setIsSingleCell(true);
                b10Var2.setGlobalGradientView(b10Var);
                view = b10Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, g6Var);
            k7Var.setGlobalGradientView(b10Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
