package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bo0 extends s4.s0 {
    public final int f23098a;
    public final org.telegram.ui.ty f23099b;
    public final org.telegram.ui.ay f23100c;

    public bo0(org.telegram.ui.ay ayVar, org.telegram.ui.ty tyVar, int i10) {
        this.f23098a = i10;
        this.f23100c = ayVar;
        this.f23099b = tyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f23098a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23099b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23099b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23099b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23099b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.dy dyVar;
        int i12;
        yl0 yl0Var;
        switch (this.f23098a) {
            case 0:
                org.telegram.ui.ay ayVar = this.f23100c;
                ayVar.f26508p0.V();
                ayVar.T();
                return;
            case 1:
                org.telegram.ui.ay ayVar2 = this.f23100c;
                ayVar2.f26515w0.W();
                ayVar2.T();
                return;
            case 2:
                org.telegram.ui.ay ayVar3 = this.f23100c;
                fo0 fo0Var = ayVar3.f26496c0;
                s4.c0 c0Var = ayVar3.f26497d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((fo0Var.U.a() != 0 && !fo0Var.X) || !fo0Var.W) && (N0 == h - 1 || ((dyVar = fo0Var.U) != null && dyVar.a() != 0 && (i12 = fo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    fo0Var.Q();
                }
                ayVar3.T();
                return;
            default:
                org.telegram.ui.ay ayVar4 = this.f23100c;
                ho0 ho0Var = ayVar4.f26504k0;
                if (ho0Var.Y && !ho0Var.W && !TextUtils.isEmpty(ho0Var.f29781b0) && (yl0Var = ho0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < yl0Var.getChildCount()) {
                            if (yl0Var.getChildAt(i13) instanceof v00) {
                                if (ho0Var.Y && !ho0Var.W && !TextUtils.isEmpty(ho0Var.f29781b0)) {
                                    ho0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                ayVar4.T();
                return;
        }
    }
}
