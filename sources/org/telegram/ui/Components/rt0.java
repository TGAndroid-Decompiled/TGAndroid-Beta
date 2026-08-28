package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class rt0 extends gk0 {
    public final Context f32286c;
    public final int d;
    public boolean f32287e;
    public final eu0 f32288f;

    public rt0(eu0 eu0Var, Context context, int i9) {
        this.f32288f = eu0Var;
        this.f32286c = context;
        this.d = i9;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final String F(int i9) {
        ArrayList arrayList = this.f32288f.f28155p1[this.d].f32791e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i9 <= ((ct0) arrayList.get(i10)).f27566b) {
                    return ((ct0) arrayList.get(i10)).f27565a;
                }
            }
            return ((ct0) j3.r0.j(1, arrayList)).f27565a;
        }
        return "";
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(wk0 wk0Var) {
        if (this.f32287e) {
            this.f32287e = false;
            int i9 = 0;
            for (int i10 = 0; i10 < wk0Var.getChildCount() && (i9 = eu0.p(wk0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i9 == 0) {
                this.f32288f.S(this.d, wk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f32287e = true;
        xs0 W = this.f32288f.W(this.d);
        if (W != null) {
            eu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i9;
        int i10;
        tt0[] tt0VarArr = this.f32288f.f28155p1;
        int i11 = this.d;
        tt0 tt0Var = tt0VarArr[i11];
        if (tt0Var.f32800o) {
            return tt0Var.e();
        }
        if (tt0Var.f32788a.size() == 0 && !tt0VarArr[i11].f32793g) {
            return 1;
        }
        if (tt0VarArr[i11].f32788a.size() == 0) {
            tt0 tt0Var2 = tt0VarArr[i11];
            boolean[] zArr = tt0Var2.f32794i;
            if ((!zArr[0] || !zArr[1]) && tt0Var2.f32797l) {
                return 0;
            }
        }
        if (tt0VarArr[i11].e() == 0) {
            int size = tt0VarArr[i11].c().size() + tt0VarArr[i11].d();
            if (size != 0) {
                tt0 tt0Var3 = tt0VarArr[i11];
                boolean[] zArr2 = tt0Var3.f32794i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = tt0Var3.f32803r;
                    if (z10) {
                        i9 = tt0Var3.f32806u;
                    } else {
                        i9 = tt0Var3.f32799n;
                    }
                    if (i9 != 0) {
                        if (z10) {
                            i10 = tt0Var3.f32806u;
                        } else {
                            i10 = tt0Var3.f32799n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(tt0VarArr[i11].e(), tt0VarArr[i11].c().size() + tt0VarArr[i11].d());
    }

    @Override
    public final int j(int i9) {
        tt0[] tt0VarArr = this.f32288f.f28155p1;
        int i10 = this.d;
        if (tt0VarArr[i10].f32790c.size() == 0 && !tt0VarArr[i10].f32793g) {
            return 9;
        }
        tt0 tt0Var = tt0VarArr[i10];
        int i11 = tt0Var.f32798m;
        if (i9 >= i11 && i9 < tt0Var.f32788a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f32288f.f28155p1[this.d].e();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        eu0 eu0Var = this.f32288f;
        long j10 = eu0Var.f28136f1;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        tt0 tt0Var = eu0Var.f28155p1[this.d];
        ArrayList arrayList = tt0Var.f32788a;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z12 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i9 - tt0Var.f32798m);
                if (i9 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.f(messageObject, z11);
                if (eu0Var.f28178y1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    h7Var.e(z12, !eu0Var.X0);
                    return;
                }
                h7Var.e(false, !eu0Var.X0);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i9 - tt0Var.f32798m);
            if (i9 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.c(messageObject2, z10);
            if (eu0Var.f28178y1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                i7Var.b(z12, !eu0Var.X0);
                return;
            }
            i7Var.b(false, !eu0Var.X0);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        eu0 eu0Var = this.f32288f;
        e00 e00Var = eu0Var.f28176y;
        ArrayList arrayList = eu0Var.C0;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.f32286c;
        if (i9 != 7) {
            int i10 = this.d;
            if (i9 != 8) {
                if (i9 != 9) {
                    if (i10 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new zs0(this, context, b6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(e00Var);
                    view = view2;
                    if (i10 == 4) {
                        eu0Var.D0.add(h7Var);
                        view = view2;
                    }
                } else {
                    rs0 M = eu0.M(i10, eu0Var.f28136f1, context, b6Var);
                    M.setLayoutParams(new f2.a1(-1, -1));
                    return new f2.q1(M);
                }
            } else {
                e00 e00Var2 = new e00(context, b6Var);
                if (i10 == 2) {
                    e00Var2.setViewType(4);
                } else {
                    e00Var2.setViewType(3);
                }
                e00Var2.f27885w = false;
                e00Var2.setIsSingleCell(true);
                e00Var2.setGlobalGradientView(e00Var);
                view = e00Var2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, b6Var);
            i7Var.setGlobalGradientView(e00Var);
            view = i7Var;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
