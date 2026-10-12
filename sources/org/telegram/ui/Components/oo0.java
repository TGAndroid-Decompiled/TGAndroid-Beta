package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 extends s4.r0 {
    public final int f28005a;
    public final org.telegram.ui.yy f28006b;
    public final org.telegram.ui.iy f28007c;

    public oo0(org.telegram.ui.iy iyVar, org.telegram.ui.yy yyVar, int i10) {
        this.f28005a = i10;
        this.f28007c = iyVar;
        this.f28006b = yyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28005a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28006b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28006b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28006b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28006b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ky kyVar;
        int i12;
        mm0 mm0Var;
        switch (this.f28005a) {
            case 0:
                org.telegram.ui.iy iyVar = this.f28007c;
                iyVar.f31927o0.V();
                iyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.iy iyVar2 = this.f28007c;
                iyVar2.f31934v0.W();
                iyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.iy iyVar3 = this.f28007c;
                so0 so0Var = iyVar3.f31915b0;
                s4.b0 b0Var = iyVar3.f31916c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((so0Var.U.a() != 0 && !so0Var.X) || !so0Var.W) && (N0 == h - 1 || ((kyVar = so0Var.U) != null && kyVar.a() != 0 && (i12 = so0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    so0Var.Q();
                }
                iyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.iy iyVar4 = this.f28007c;
                uo0 uo0Var = iyVar4.f31923j0;
                if (uo0Var.Y && !uo0Var.W && !TextUtils.isEmpty(uo0Var.f25419b0) && (mm0Var = uo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < mm0Var.getChildCount()) {
                            if (mm0Var.getChildAt(i13) instanceof f10) {
                                if (uo0Var.Y && !uo0Var.W && !TextUtils.isEmpty(uo0Var.f25419b0)) {
                                    uo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                iyVar4.S(i10, i11);
                return;
        }
    }
}
