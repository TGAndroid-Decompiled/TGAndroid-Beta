package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 extends s4.r0 {
    public final int f29282a;
    public final org.telegram.ui.ey f29283b;
    public final org.telegram.ui.nx f29284c;

    public oo0(org.telegram.ui.nx nxVar, org.telegram.ui.ey eyVar, int i10) {
        this.f29282a = i10;
        this.f29284c = nxVar;
        this.f29283b = eyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f29282a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29283b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29283b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29283b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f29283b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.px pxVar;
        int i12;
        mm0 mm0Var;
        switch (this.f29282a) {
            case 0:
                org.telegram.ui.nx nxVar = this.f29284c;
                nxVar.f24811o0.V();
                nxVar.R(i10, i11);
                return;
            case 1:
                org.telegram.ui.nx nxVar2 = this.f29284c;
                nxVar2.f24818v0.W();
                nxVar2.R(i10, i11);
                return;
            case 2:
                org.telegram.ui.nx nxVar3 = this.f29284c;
                so0 so0Var = nxVar3.f24799b0;
                s4.b0 b0Var = nxVar3.f24800c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((so0Var.U.a() != 0 && !so0Var.X) || !so0Var.W) && (N0 == h - 1 || ((pxVar = so0Var.U) != null && pxVar.a() != 0 && (i12 = so0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    so0Var.P();
                }
                nxVar3.R(i10, i11);
                return;
            default:
                org.telegram.ui.nx nxVar4 = this.f29284c;
                uo0 uo0Var = nxVar4.f24807j0;
                if (uo0Var.f25418a0 && !uo0Var.Y && !TextUtils.isEmpty(uo0Var.f25421d0) && (mm0Var = uo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < mm0Var.getChildCount()) {
                            if (mm0Var.getChildAt(i13) instanceof b10) {
                                if (uo0Var.f25418a0 && !uo0Var.Y && !TextUtils.isEmpty(uo0Var.f25421d0)) {
                                    uo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                nxVar4.R(i10, i11);
                return;
        }
    }
}
