package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class n31 extends s4.r0 {
    public final int f27270a;
    public final y31 f27271b;

    public n31(y31 y31Var, int i10) {
        this.f27270a = i10;
        this.f27271b = y31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27270a) {
            case 0:
                y31 y31Var = this.f27271b;
                if (y31Var.k()) {
                    y31Var.l();
                    return;
                }
                return;
            default:
                y31 y31Var2 = this.f27271b;
                if (y31Var2.k()) {
                    y31Var2.l();
                    return;
                }
                return;
        }
    }
}
