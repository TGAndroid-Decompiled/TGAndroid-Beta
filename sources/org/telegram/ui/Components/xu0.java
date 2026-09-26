package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xu0 extends fl0 {
    public final Context f30477c;
    public final int d;
    public boolean e;
    public final kv0 f30478f;

    public xu0(kv0 kv0Var, Context context, int i10) {
        this.f30478f = kv0Var;
        this.f30477c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f30478f.f25862t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((iu0) arrayList.get(i11)).f25191b) {
                    return ((iu0) arrayList.get(i11)).f25190a;
                }
            }
            return ((iu0) hg.c.g(1, arrayList)).f25190a;
        }
        return "";
    }

    @Override
    public final void G(xl0 xl0Var, float f7, int[] iArr) {
        int measuredHeight = xl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (xl0Var.getMeasuredHeight() - xl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(xl0 xl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < xl0Var.getChildCount() && (i10 = kv0.p(xl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f30478f.S(this.d, xl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        du0 W = this.f30478f.W(this.d);
        if (W != null) {
            kv0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        zu0[] zu0VarArr = this.f30478f.f25862t1;
        int i12 = this.d;
        zu0 zu0Var = zu0VarArr[i12];
        if (zu0Var.f30980o) {
            return zu0Var.e();
        }
        if (zu0Var.f30969a.size() == 0 && !zu0VarArr[i12].f30973g) {
            return 1;
        }
        if (zu0VarArr[i12].f30969a.size() == 0) {
            zu0 zu0Var2 = zu0VarArr[i12];
            boolean[] zArr = zu0Var2.f30974i;
            if ((!zArr[0] || !zArr[1]) && zu0Var2.f30977l) {
                return 0;
            }
        }
        if (zu0VarArr[i12].e() == 0) {
            int size = zu0VarArr[i12].c().size() + zu0VarArr[i12].d();
            if (size != 0) {
                zu0 zu0Var3 = zu0VarArr[i12];
                boolean[] zArr2 = zu0Var3.f30974i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = zu0Var3.f30983r;
                    if (z10) {
                        i10 = zu0Var3.f30986u;
                    } else {
                        i10 = zu0Var3.f30979n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = zu0Var3.f30986u;
                        } else {
                            i11 = zu0Var3.f30979n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(zu0VarArr[i12].e(), zu0VarArr[i12].c().size() + zu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        zu0[] zu0VarArr = this.f30478f.f25862t1;
        int i11 = this.d;
        if (zu0VarArr[i11].f30971c.size() == 0 && !zu0VarArr[i11].f30973g) {
            return 9;
        }
        zu0 zu0Var = zu0VarArr[i11];
        int i12 = zu0Var.f30978m;
        if (i10 >= i12 && i10 < zu0Var.f30969a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f30478f.f25862t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        kv0 kv0Var = this.f30478f;
        long j3 = kv0Var.f25841j1;
        SparseArray[] sparseArrayArr = kv0Var.Z0;
        zu0 zu0Var = kv0Var.f25862t1[this.d];
        ArrayList arrayList = zu0Var.f30969a;
        int i11 = c1Var.f42962f;
        View view = c1Var.f42959a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - zu0Var.f30978m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (kv0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !kv0Var.f25821b1);
                    return;
                }
                j7Var.e(false, !kv0Var.f25821b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - zu0Var.f30978m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (kv0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !kv0Var.f25821b1);
                return;
            }
            k7Var.b(false, !kv0Var.f25821b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        kv0 kv0Var = this.f30478f;
        v00 v00Var = kv0Var.f25873y;
        ArrayList arrayList = kv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = kv0Var.F1;
        Context context = this.f30477c;
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
                        view2 = new fu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(v00Var);
                    view = view2;
                    if (i11 == 4) {
                        kv0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    xt0 M = kv0.M(i11, kv0Var.f25841j1, context, d6Var);
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
                v00Var2.f28952w = false;
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
