package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class so0 extends s4.t0 {
    public final int f30861a;
    public final org.telegram.ui.ty f30862b;
    public final org.telegram.ui.dy f30863c;

    public so0(org.telegram.ui.dy dyVar, org.telegram.ui.ty tyVar, int i10) {
        this.f30861a = i10;
        this.f30863c = dyVar;
        this.f30862b = tyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f30861a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f30862b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f30862b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f30862b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f30862b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.fy fyVar;
        int i12;
        qm0 qm0Var;
        switch (this.f30861a) {
            case 0:
                org.telegram.ui.dy dyVar = this.f30863c;
                dyVar.f25778o0.V();
                dyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.dy dyVar2 = this.f30863c;
                dyVar2.f25785v0.W();
                dyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.dy dyVar3 = this.f30863c;
                wo0 wo0Var = dyVar3.f25766b0;
                s4.d0 d0Var = dyVar3.f25767c0;
                int L0 = d0Var.L0();
                int N0 = d0Var.N0();
                int abs = Math.abs(d0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wo0Var.U.a() != 0 && !wo0Var.X) || !wo0Var.W) && (N0 == h - 1 || ((fyVar = wo0Var.U) != null && fyVar.a() != 0 && (i12 = wo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wo0Var.Q();
                }
                dyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.dy dyVar4 = this.f30863c;
                yo0 yo0Var = dyVar4.f25774j0;
                if (yo0Var.Y && !yo0Var.W && !TextUtils.isEmpty(yo0Var.f28163b0) && (qm0Var = yo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < qm0Var.getChildCount()) {
                            if (qm0Var.getChildAt(i13) instanceof j10) {
                                if (yo0Var.Y && !yo0Var.W && !TextUtils.isEmpty(yo0Var.f28163b0)) {
                                    yo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                dyVar4.S(i10, i11);
                return;
        }
    }
}
