package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class du0 extends tk0 {
    public final Context f27876c;
    public final int d;
    public boolean f27877e;
    public final qu0 f27878f;

    public du0(qu0 qu0Var, Context context, int i10) {
        this.f27878f = qu0Var;
        this.f27876c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f27878f.f32088p1[this.d].f28537e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((nt0) arrayList.get(i11)).f31136b) {
                    return ((nt0) arrayList.get(i11)).f31135a;
                }
            }
            return ((nt0) j7.l1.i(1, arrayList)).f31135a;
        }
        return "";
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        float k9 = f9 * ((k() * measuredHeight) - (jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop()));
        iArr[0] = (int) (k9 / measuredHeight);
        iArr[1] = ((int) k9) % measuredHeight;
    }

    @Override
    public final void J(jl0 jl0Var) {
        if (this.f27877e) {
            this.f27877e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jl0Var.getChildCount() && (i10 = qu0.p(jl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f27878f.S(this.d, jl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f27877e = true;
        it0 W = this.f27878f.W(this.d);
        if (W != null) {
            qu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        fu0[] fu0VarArr = this.f27878f.f32088p1;
        int i12 = this.d;
        fu0 fu0Var = fu0VarArr[i12];
        if (fu0Var.f28546o) {
            return fu0Var.e();
        }
        if (fu0Var.f28534a.size() == 0 && !fu0VarArr[i12].f28539g) {
            return 1;
        }
        if (fu0VarArr[i12].f28534a.size() == 0) {
            fu0 fu0Var2 = fu0VarArr[i12];
            boolean[] zArr = fu0Var2.f28540i;
            if ((!zArr[0] || !zArr[1]) && fu0Var2.f28543l) {
                return 0;
            }
        }
        if (fu0VarArr[i12].e() == 0) {
            int size = fu0VarArr[i12].c().size() + fu0VarArr[i12].d();
            if (size != 0) {
                fu0 fu0Var3 = fu0VarArr[i12];
                boolean[] zArr2 = fu0Var3.f28540i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = fu0Var3.f28549r;
                    if (z10) {
                        i10 = fu0Var3.f28552u;
                    } else {
                        i10 = fu0Var3.f28545n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = fu0Var3.f28552u;
                        } else {
                            i11 = fu0Var3.f28545n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(fu0VarArr[i12].e(), fu0VarArr[i12].c().size() + fu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        fu0[] fu0VarArr = this.f27878f.f32088p1;
        int i11 = this.d;
        if (fu0VarArr[i11].f28536c.size() == 0 && !fu0VarArr[i11].f28539g) {
            return 9;
        }
        fu0 fu0Var = fu0VarArr[i11];
        int i12 = fu0Var.f28544m;
        if (i10 >= i12 && i10 < fu0Var.f28534a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f27878f.f32088p1[this.d].e();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        char c3;
        boolean z11;
        char c6;
        qu0 qu0Var = this.f27878f;
        long j10 = qu0Var.f32069f1;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        fu0 fu0Var = qu0Var.f32088p1[this.d];
        ArrayList arrayList = fu0Var.f28534a;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.f7)) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - fu0Var.f28544m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f7Var.f(messageObject, z11);
                if (qu0Var.f32111y1) {
                    if (messageObject.getDialogId() == j10) {
                        c6 = 0;
                    } else {
                        c6 = 1;
                    }
                    if (sparseArrayArr[c6].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    f7Var.e(z12, !qu0Var.X0);
                    return;
                }
                f7Var.e(false, !qu0Var.X0);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.g7)) {
        } else {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - fu0Var.f28544m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7Var.c(messageObject2, z10);
            if (qu0Var.f32111y1) {
                if (messageObject2.getDialogId() == j10) {
                    c3 = 0;
                } else {
                    c3 = 1;
                }
                if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                g7Var.b(z12, !qu0Var.X0);
                return;
            }
            g7Var.b(false, !qu0Var.X0);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        qu0 qu0Var = this.f27878f;
        p00 p00Var = qu0Var.f32109y;
        ArrayList arrayList = qu0Var.C0;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.f27876c;
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
                        view2 = new kt0(this, context, c6Var, 1);
                    }
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view2;
                    f7Var.setGlobalGradientView(p00Var);
                    view = view2;
                    if (i11 == 4) {
                        qu0Var.D0.add(f7Var);
                        view = view2;
                    }
                } else {
                    ct0 M = qu0.M(i11, qu0Var.f32069f1, context, c6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new f2.n1(M);
                }
            } else {
                p00 p00Var2 = new p00(context, c6Var);
                if (i11 == 2) {
                    p00Var2.setViewType(4);
                } else {
                    p00Var2.setViewType(3);
                }
                p00Var2.f31529w = false;
                p00Var2.setIsSingleCell(true);
                p00Var2.setGlobalGradientView(p00Var);
                view = p00Var2;
            }
        } else {
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(context, 0, c6Var);
            g7Var.setGlobalGradientView(p00Var);
            view = g7Var;
        }
        return org.telegram.ui.th.m(view, view, -1, -2);
    }
}
