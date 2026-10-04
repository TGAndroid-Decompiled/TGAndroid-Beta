package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class fo0 extends s4.s0 {
    public final int f26544a;
    public final org.telegram.ui.uy f26545b;
    public final org.telegram.ui.dy f26546c;

    public fo0(org.telegram.ui.dy dyVar, org.telegram.ui.uy uyVar, int i10) {
        this.f26544a = i10;
        this.f26546c = dyVar;
        this.f26545b = uyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f26544a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26545b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26545b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26545b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26545b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.fy fyVar;
        int i12;
        zl0 zl0Var;
        switch (this.f26544a) {
            case 0:
                org.telegram.ui.dy dyVar = this.f26546c;
                dyVar.f30137q0.V();
                dyVar.U();
                return;
            case 1:
                org.telegram.ui.dy dyVar2 = this.f26546c;
                dyVar2.f30144x0.W();
                dyVar2.U();
                return;
            case 2:
                org.telegram.ui.dy dyVar3 = this.f26546c;
                jo0 jo0Var = dyVar3.f30125d0;
                s4.c0 c0Var = dyVar3.f30126e0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((jo0Var.U.a() != 0 && !jo0Var.X) || !jo0Var.W) && (N0 == h - 1 || ((fyVar = jo0Var.U) != null && fyVar.a() != 0 && (i12 = jo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    jo0Var.Q();
                }
                dyVar3.U();
                return;
            default:
                org.telegram.ui.dy dyVar4 = this.f26546c;
                lo0 lo0Var = dyVar4.f30133l0;
                if (lo0Var.Y && !lo0Var.W && !TextUtils.isEmpty(lo0Var.f32624b0) && (zl0Var = lo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < zl0Var.getChildCount()) {
                            if (zl0Var.getChildAt(i13) instanceof w00) {
                                if (lo0Var.Y && !lo0Var.W && !TextUtils.isEmpty(lo0Var.f32624b0)) {
                                    lo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                dyVar4.U();
                return;
        }
    }
}
