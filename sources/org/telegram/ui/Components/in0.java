package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends f2.a1 {
    public final int f29433a;
    public final org.telegram.ui.fy f29434b;
    public final org.telegram.ui.ox f29435c;

    public in0(org.telegram.ui.ox oxVar, org.telegram.ui.fy fyVar, int i10) {
        this.f29433a = i10;
        this.f29435c = oxVar;
        this.f29434b = fyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f29433a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29434b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29434b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29434b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29434b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.qx qxVar;
        int i12;
        jl0 jl0Var;
        switch (this.f29433a) {
            case 0:
                org.telegram.ui.ox oxVar = this.f29435c;
                oxVar.f32998k0.V();
                oxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.ox oxVar2 = this.f29435c;
                oxVar2.f33004r0.W();
                oxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.ox oxVar3 = this.f29435c;
                mn0 mn0Var = oxVar3.U;
                f2.j0 j0Var = oxVar3.V;
                int L0 = j0Var.L0();
                int N0 = j0Var.N0();
                int abs = Math.abs(j0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((mn0Var.Q.a() != 0 && !mn0Var.T) || !mn0Var.S) && (N0 == h - 1 || ((qxVar = mn0Var.Q) != null && qxVar.a() != 0 && (i12 = mn0Var.U) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    mn0Var.Q();
                }
                oxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.ox oxVar4 = this.f29435c;
                on0 on0Var = oxVar4.f32993f0;
                if (on0Var.U && !on0Var.S && !TextUtils.isEmpty(on0Var.X) && (jl0Var = on0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < jl0Var.getChildCount()) {
                            if (jl0Var.getChildAt(i13) instanceof p00) {
                                if (on0Var.U && !on0Var.S && !TextUtils.isEmpty(on0Var.X)) {
                                    on0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                oxVar4.S(i10, i11);
                return;
        }
    }
}
