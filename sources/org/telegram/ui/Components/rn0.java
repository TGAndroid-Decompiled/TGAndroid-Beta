package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rn0 extends v4.s0 {
    public final int f37771a;
    public final no0 f37772b;

    public rn0(no0 no0Var, int i7) {
        this.f37771a = i7;
        this.f37772b = no0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gb gbVar;
        switch (this.f37771a) {
            case 0:
                no0 no0Var = this.f37772b;
                if (i10 != 0) {
                    no0.I0(no0Var);
                    no0Var.f36438i2 = no0Var.f36436h2;
                }
                cc ccVar = cc.f32619w;
                if (ccVar != null && (gbVar = ccVar.f32623e) != null && (gbVar.getParent() instanceof View) && ((View) cc.f32619w.f32623e.getParent()).getParent() == no0Var.f36457t1) {
                    cc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    no0 no0Var2 = this.f37772b;
                    no0.I0(no0Var2);
                    no0Var2.f36438i2 = no0Var2.f36436h2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    no0 no0Var3 = this.f37772b;
                    no0.I0(no0Var3);
                    no0Var3.f36438i2 = no0Var3.f36436h2;
                    return;
                }
                return;
        }
    }
}
