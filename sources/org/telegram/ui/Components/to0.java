package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class to0 extends s4.u0 {
    public final int f33115a;
    public final org.telegram.ui.ey f33116b;
    public final org.telegram.ui.mx f33117c;

    public to0(org.telegram.ui.mx mxVar, org.telegram.ui.ey eyVar, int i10) {
        this.f33115a = i10;
        this.f33117c = mxVar;
        this.f33116b = eyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f33115a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33116b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33116b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33116b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33116b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ox oxVar;
        int i12;
        nm0 nm0Var;
        switch (this.f33115a) {
            case 0:
                org.telegram.ui.mx mxVar = this.f33117c;
                mxVar.f28256q0.W();
                mxVar.T();
                return;
            case 1:
                org.telegram.ui.mx mxVar2 = this.f33117c;
                mxVar2.f28263x0.X();
                mxVar2.T();
                return;
            case 2:
                org.telegram.ui.mx mxVar3 = this.f33117c;
                xo0 xo0Var = mxVar3.f28244d0;
                s4.c0 c0Var = mxVar3.f28245e0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((xo0Var.U.a() != 0 && !xo0Var.X) || !xo0Var.W) && (N0 == h - 1 || ((oxVar = xo0Var.U) != null && oxVar.a() != 0 && (i12 = xo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    xo0Var.P();
                }
                mxVar3.T();
                return;
            default:
                org.telegram.ui.mx mxVar4 = this.f33117c;
                zo0 zo0Var = mxVar4.f28252l0;
                if (zo0Var.f27922a0 && !zo0Var.Y && !TextUtils.isEmpty(zo0Var.f27925d0) && (nm0Var = zo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < nm0Var.getChildCount()) {
                            if (nm0Var.getChildAt(i13) instanceof c10) {
                                if (zo0Var.f27922a0 && !zo0Var.Y && !TextUtils.isEmpty(zo0Var.f27925d0)) {
                                    zo0Var.W(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                mxVar4.T();
                return;
        }
    }
}
