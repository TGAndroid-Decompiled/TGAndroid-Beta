package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sn0 extends f2.z0 {
    public final int f28782a;
    public final org.telegram.ui.oy f28783b;
    public final org.telegram.ui.xx f28784c;

    public sn0(org.telegram.ui.xx xxVar, org.telegram.ui.oy oyVar, int i10) {
        this.f28782a = i10;
        this.f28784c = xxVar;
        this.f28783b = oyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28782a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28783b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28783b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28783b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28783b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.zx zxVar;
        int i12;
        sl0 sl0Var;
        switch (this.f28782a) {
            case 0:
                org.telegram.ui.xx xxVar = this.f28784c;
                xxVar.f24328l0.V();
                xxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.xx xxVar2 = this.f28784c;
                xxVar2.f24334s0.W();
                xxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.xx xxVar3 = this.f28784c;
                wn0 wn0Var = xxVar3.V;
                f2.i0 i0Var = xxVar3.W;
                int L0 = i0Var.L0();
                int N0 = i0Var.N0();
                int abs = Math.abs(i0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wn0Var.R.a() != 0 && !wn0Var.U) || !wn0Var.T) && (N0 == h - 1 || ((zxVar = wn0Var.R) != null && zxVar.a() != 0 && (i12 = wn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wn0Var.Q();
                }
                xxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.xx xxVar4 = this.f28784c;
                yn0 yn0Var = xxVar4.f24323g0;
                if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y) && (sl0Var = yn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < sl0Var.getChildCount()) {
                            if (sl0Var.getChildAt(i13) instanceof t00) {
                                if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y)) {
                                    yn0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                xxVar4.S(i10, i11);
                return;
        }
    }
}
