package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class so0 extends s4.u0 {
    public final int f32653a;
    public final org.telegram.ui.cy f32654b;
    public final org.telegram.ui.jx f32655c;

    public so0(org.telegram.ui.jx jxVar, org.telegram.ui.cy cyVar, int i10) {
        this.f32653a = i10;
        this.f32655c = jxVar;
        this.f32654b = cyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f32653a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f32654b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f32654b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f32654b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f32654b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.lx lxVar;
        int i12;
        mm0 mm0Var;
        switch (this.f32653a) {
            case 0:
                org.telegram.ui.jx jxVar = this.f32655c;
                jxVar.f27948q0.W();
                jxVar.T();
                return;
            case 1:
                org.telegram.ui.jx jxVar2 = this.f32655c;
                jxVar2.f27955x0.X();
                jxVar2.T();
                return;
            case 2:
                org.telegram.ui.jx jxVar3 = this.f32655c;
                wo0 wo0Var = jxVar3.f27936d0;
                s4.c0 c0Var = jxVar3.f27937e0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wo0Var.U.a() != 0 && !wo0Var.X) || !wo0Var.W) && (N0 == h - 1 || ((lxVar = wo0Var.U) != null && lxVar.a() != 0 && (i12 = wo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wo0Var.P();
                }
                jxVar3.T();
                return;
            default:
                org.telegram.ui.jx jxVar4 = this.f32655c;
                yo0 yo0Var = jxVar4.f27944l0;
                if (yo0Var.f27979a0 && !yo0Var.Y && !TextUtils.isEmpty(yo0Var.f27982d0) && (mm0Var = yo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < mm0Var.getChildCount()) {
                            if (mm0Var.getChildAt(i13) instanceof c10) {
                                if (yo0Var.f27979a0 && !yo0Var.Y && !TextUtils.isEmpty(yo0Var.f27982d0)) {
                                    yo0Var.W(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                jxVar4.T();
                return;
        }
    }
}
