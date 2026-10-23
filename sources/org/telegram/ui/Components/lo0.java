package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lo0 extends s4.r0 {
    public final int f28240a;
    public final org.telegram.ui.cy f28241b;
    public final org.telegram.ui.lx f28242c;

    public lo0(org.telegram.ui.lx lxVar, org.telegram.ui.cy cyVar, int i10) {
        this.f28240a = i10;
        this.f28242c = lxVar;
        this.f28241b = cyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28240a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28241b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28241b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28241b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28241b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.nx nxVar;
        int i12;
        jm0 jm0Var;
        switch (this.f28240a) {
            case 0:
                org.telegram.ui.lx lxVar = this.f28242c;
                lxVar.f32195o0.V();
                lxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.lx lxVar2 = this.f28242c;
                lxVar2.f32202v0.W();
                lxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.lx lxVar3 = this.f28242c;
                po0 po0Var = lxVar3.f32183b0;
                s4.b0 b0Var = lxVar3.f32184c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((po0Var.U.a() != 0 && !po0Var.X) || !po0Var.W) && (N0 == h - 1 || ((nxVar = po0Var.U) != null && nxVar.a() != 0 && (i12 = po0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    po0Var.Q();
                }
                lxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.lx lxVar4 = this.f28242c;
                ro0 ro0Var = lxVar4.f32191j0;
                if (ro0Var.Y && !ro0Var.W && !TextUtils.isEmpty(ro0Var.f25260b0) && (jm0Var = ro0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < jm0Var.getChildCount()) {
                            if (jm0Var.getChildAt(i13) instanceof b10) {
                                if (ro0Var.Y && !ro0Var.W && !TextUtils.isEmpty(ro0Var.f25260b0)) {
                                    ro0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                lxVar4.S(i10, i11);
                return;
        }
    }
}
