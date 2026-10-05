package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class dv0 extends gl0 {
    public final Context f25881c;
    public final int d;
    public boolean f25882e;
    public final qv0 f25883f;

    public dv0(qv0 qv0Var, Context context, int i10) {
        this.f25883f = qv0Var;
        this.f25881c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f25883f.f30259t1[this.d].f26594e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((ou0) arrayList.get(i11)).f29551b) {
                    return ((ou0) arrayList.get(i11)).f29550a;
                }
            }
            return ((ou0) hg.c.g(1, arrayList)).f29550a;
        }
        return "";
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(zl0 zl0Var) {
        if (this.f25882e) {
            this.f25882e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zl0Var.getChildCount() && (i10 = qv0.p(zl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f25883f.S(this.d, zl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f25882e = true;
        ju0 W = this.f25883f.W(this.d);
        if (W != null) {
            qv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        fv0[] fv0VarArr = this.f25883f.f30259t1;
        int i12 = this.d;
        fv0 fv0Var = fv0VarArr[i12];
        if (fv0Var.f26603o) {
            return fv0Var.e();
        }
        if (fv0Var.f26591a.size() == 0 && !fv0VarArr[i12].f26596g) {
            return 1;
        }
        if (fv0VarArr[i12].f26591a.size() == 0) {
            fv0 fv0Var2 = fv0VarArr[i12];
            boolean[] zArr = fv0Var2.f26597i;
            if ((!zArr[0] || !zArr[1]) && fv0Var2.f26600l) {
                return 0;
            }
        }
        if (fv0VarArr[i12].e() == 0) {
            int size = fv0VarArr[i12].c().size() + fv0VarArr[i12].d();
            if (size != 0) {
                fv0 fv0Var3 = fv0VarArr[i12];
                boolean[] zArr2 = fv0Var3.f26597i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = fv0Var3.f26606r;
                    if (z10) {
                        i10 = fv0Var3.f26609u;
                    } else {
                        i10 = fv0Var3.f26602n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = fv0Var3.f26609u;
                        } else {
                            i11 = fv0Var3.f26602n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(fv0VarArr[i12].e(), fv0VarArr[i12].c().size() + fv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        fv0[] fv0VarArr = this.f25883f.f30259t1;
        int i11 = this.d;
        if (fv0VarArr[i11].f26593c.size() == 0 && !fv0VarArr[i11].f26596g) {
            return 9;
        }
        fv0 fv0Var = fv0VarArr[i11];
        int i12 = fv0Var.f26601m;
        if (i10 >= i12 && i10 < fv0Var.f26591a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f25883f.f30259t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        qv0 qv0Var = this.f25883f;
        long j3 = qv0Var.f30238j1;
        SparseArray[] sparseArrayArr = qv0Var.Z0;
        fv0 fv0Var = qv0Var.f30259t1[this.d];
        ArrayList arrayList = fv0Var.f26591a;
        int i11 = c1Var.f46542f;
        View view = c1Var.f46538a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - fv0Var.f26601m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (qv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !qv0Var.f30217b1);
                    return;
                }
                j7Var.e(false, !qv0Var.f30217b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - fv0Var.f26601m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (qv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !qv0Var.f30217b1);
                return;
            }
            k7Var.b(false, !qv0Var.f30217b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        qv0 qv0Var = this.f25883f;
        w00 w00Var = qv0Var.f30270y;
        ArrayList arrayList = qv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.f25881c;
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
                        view2 = new lu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(w00Var);
                    view = view2;
                    if (i11 == 4) {
                        qv0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    du0 M = qv0.M(i11, qv0Var.f30238j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                w00 w00Var2 = new w00(context, d6Var);
                if (i11 == 2) {
                    w00Var2.setViewType(4);
                } else {
                    w00Var2.setViewType(3);
                }
                w00Var2.f32460w = false;
                w00Var2.setIsSingleCell(true);
                w00Var2.setGlobalGradientView(w00Var);
                view = w00Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, d6Var);
            k7Var.setGlobalGradientView(w00Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
