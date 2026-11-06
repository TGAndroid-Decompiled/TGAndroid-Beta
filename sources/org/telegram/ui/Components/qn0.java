package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qn0 extends v4.s0 {
    public final int f37364a;
    public final mo0 f37365b;

    public qn0(mo0 mo0Var, int i7) {
        this.f37364a = i7;
        this.f37365b = mo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gb gbVar;
        switch (this.f37364a) {
            case 0:
                mo0 mo0Var = this.f37365b;
                if (i10 != 0) {
                    mo0.I0(mo0Var);
                    mo0Var.f36016i2 = mo0Var.f36014h2;
                }
                cc ccVar = cc.f32506w;
                if (ccVar != null && (gbVar = ccVar.f32510e) != null && (gbVar.getParent() instanceof View) && ((View) cc.f32506w.f32510e.getParent()).getParent() == mo0Var.f36035t1) {
                    cc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    mo0 mo0Var2 = this.f37365b;
                    mo0.I0(mo0Var2);
                    mo0Var2.f36016i2 = mo0Var2.f36014h2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    mo0 mo0Var3 = this.f37365b;
                    mo0.I0(mo0Var3);
                    mo0Var3.f36016i2 = mo0Var3.f36014h2;
                    return;
                }
                return;
        }
    }
}
