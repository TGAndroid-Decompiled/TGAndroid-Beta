package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qn0 extends v4.s0 {
    public final int f37359a;
    public final mo0 f37360b;

    public qn0(mo0 mo0Var, int i7) {
        this.f37359a = i7;
        this.f37360b = mo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        fb fbVar;
        switch (this.f37359a) {
            case 0:
                mo0 mo0Var = this.f37360b;
                if (i10 != 0) {
                    mo0.I0(mo0Var);
                    mo0Var.f36037l2 = mo0Var.f36036k2;
                }
                bc bcVar = bc.f32195w;
                if (bcVar != null && (fbVar = bcVar.f32199e) != null && (fbVar.getParent() instanceof View) && ((View) bc.f32195w.f32199e.getParent()).getParent() == mo0Var.f36057w1) {
                    bc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    mo0 mo0Var2 = this.f37360b;
                    mo0.I0(mo0Var2);
                    mo0Var2.f36037l2 = mo0Var2.f36036k2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    mo0 mo0Var3 = this.f37360b;
                    mo0.I0(mo0Var3);
                    mo0Var3.f36037l2 = mo0Var3.f36036k2;
                    return;
                }
                return;
        }
    }
}
