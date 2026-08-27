package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class ym0 extends f2.b1 {

    public final int f34920a;

    public final org.telegram.ui.gy f34921b;

    public final org.telegram.ui.px f34922c;

    public ym0(org.telegram.ui.px pxVar, org.telegram.ui.gy gyVar, int i10) {
        this.f34920a = i10;
        this.f34922c = pxVar;
        this.f34921b = gyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f34920a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34921b.getParentActivity().getCurrentFocus());
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34921b.getParentActivity().getCurrentFocus());
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34921b.getParentActivity().getCurrentFocus());
                }
                break;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34921b.getParentActivity().getCurrentFocus());
                }
                break;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.rx rxVar;
        int i12;
        zk0 zk0Var;
        switch (this.f34920a) {
            case 0:
                org.telegram.ui.px pxVar = this.f34922c;
                pxVar.f29752k0.V();
                pxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.px pxVar2 = this.f34922c;
                pxVar2.f29758r0.W();
                pxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.px pxVar3 = this.f34922c;
                cn0 cn0Var = pxVar3.U;
                f2.k0 k0Var = pxVar3.V;
                int iL0 = k0Var.L0();
                int iN0 = k0Var.N0();
                int iAbs = Math.abs(k0Var.N0() - iL0) + 1;
                int iH = recyclerView.getAdapter().h();
                if (iAbs > 0 && (((cn0Var.Q.a() != 0 && !cn0Var.T) || !cn0Var.S) && (iN0 == iH - 1 || ((rxVar = cn0Var.Q) != null && rxVar.a() != 0 && (i12 = cn0Var.U) >= 0 && iL0 <= i12 && iN0 >= i12)))) {
                    cn0Var.Q();
                }
                pxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.px pxVar4 = this.f34922c;
                en0 en0Var = pxVar4.f29747f0;
                if (en0Var.U && !en0Var.S && !TextUtils.isEmpty(en0Var.X) && (zk0Var = en0Var.d) != null) {
                    for (int i13 = 0; i13 < zk0Var.getChildCount(); i13++) {
                        if (zk0Var.getChildAt(i13) instanceof h00) {
                            if (en0Var.U && !en0Var.S && !TextUtils.isEmpty(en0Var.X)) {
                                en0Var.V(true);
                            }
                        }
                    }
                }
                pxVar4.S(i10, i11);
                break;
        }
    }
}
