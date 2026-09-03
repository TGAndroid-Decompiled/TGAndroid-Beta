package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rn0 extends f2.z0 {
    public final int f28543a;
    public final org.telegram.ui.qy f28544b;
    public final org.telegram.ui.zx f28545c;

    public rn0(org.telegram.ui.zx zxVar, org.telegram.ui.qy qyVar, int i10) {
        this.f28543a = i10;
        this.f28545c = zxVar;
        this.f28544b = qyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28543a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28544b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28544b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28544b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28544b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.cy cyVar;
        int i12;
        rl0 rl0Var;
        switch (this.f28543a) {
            case 0:
                org.telegram.ui.zx zxVar = this.f28545c;
                zxVar.f23994l0.V();
                zxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.zx zxVar2 = this.f28545c;
                zxVar2.f24000s0.W();
                zxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.zx zxVar3 = this.f28545c;
                vn0 vn0Var = zxVar3.V;
                f2.i0 i0Var = zxVar3.W;
                int L0 = i0Var.L0();
                int N0 = i0Var.N0();
                int abs = Math.abs(i0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((vn0Var.R.a() != 0 && !vn0Var.U) || !vn0Var.T) && (N0 == h - 1 || ((cyVar = vn0Var.R) != null && cyVar.a() != 0 && (i12 = vn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    vn0Var.Q();
                }
                zxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.zx zxVar4 = this.f28545c;
                xn0 xn0Var = zxVar4.f23989g0;
                if (xn0Var.V && !xn0Var.T && !TextUtils.isEmpty(xn0Var.Y) && (rl0Var = xn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < rl0Var.getChildCount()) {
                            if (rl0Var.getChildAt(i13) instanceof u00) {
                                if (xn0Var.V && !xn0Var.T && !TextUtils.isEmpty(xn0Var.Y)) {
                                    xn0Var.V(true);
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
