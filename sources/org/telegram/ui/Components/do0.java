package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class do0 extends s4.s0 {
    public final int f23691a;
    public final org.telegram.ui.qy f23692b;
    public final org.telegram.ui.zx f23693c;

    public do0(org.telegram.ui.zx zxVar, org.telegram.ui.qy qyVar, int i10) {
        this.f23691a = i10;
        this.f23693c = zxVar;
        this.f23692b = qyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f23691a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23692b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23692b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23692b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23692b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.cy cyVar;
        int i12;
        zl0 zl0Var;
        switch (this.f23691a) {
            case 0:
                org.telegram.ui.zx zxVar = this.f23693c;
                zxVar.f27148o0.V();
                zxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.zx zxVar2 = this.f23693c;
                zxVar2.f27155v0.W();
                zxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.zx zxVar3 = this.f23693c;
                ho0 ho0Var = zxVar3.f27136b0;
                s4.c0 c0Var = zxVar3.f27137c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((ho0Var.U.a() != 0 && !ho0Var.X) || !ho0Var.W) && (N0 == h - 1 || ((cyVar = ho0Var.U) != null && cyVar.a() != 0 && (i12 = ho0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    ho0Var.Q();
                }
                zxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.zx zxVar4 = this.f23693c;
                jo0 jo0Var = zxVar4.f27144j0;
                if (jo0Var.Y && !jo0Var.W && !TextUtils.isEmpty(jo0Var.f30051b0) && (zl0Var = jo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < zl0Var.getChildCount()) {
                            if (zl0Var.getChildAt(i13) instanceof w00) {
                                if (jo0Var.Y && !jo0Var.W && !TextUtils.isEmpty(jo0Var.f30051b0)) {
                                    jo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                zxVar4.S(i10, i11);
                return;
        }
    }
}
