package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qn0 extends v4.s0 {
    public final int f37394a;
    public final mo0 f37395b;

    public qn0(mo0 mo0Var, int i7) {
        this.f37394a = i7;
        this.f37395b = mo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gb gbVar;
        switch (this.f37394a) {
            case 0:
                mo0 mo0Var = this.f37395b;
                if (i10 != 0) {
                    mo0.I0(mo0Var);
                    mo0Var.f36044i2 = mo0Var.f36042h2;
                }
                cc ccVar = cc.f32537w;
                if (ccVar != null && (gbVar = ccVar.f32541e) != null && (gbVar.getParent() instanceof View) && ((View) cc.f32537w.f32541e.getParent()).getParent() == mo0Var.f36063t1) {
                    cc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    mo0 mo0Var2 = this.f37395b;
                    mo0.I0(mo0Var2);
                    mo0Var2.f36044i2 = mo0Var2.f36042h2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    mo0 mo0Var3 = this.f37395b;
                    mo0.I0(mo0Var3);
                    mo0Var3.f36044i2 = mo0Var3.f36042h2;
                    return;
                }
                return;
        }
    }
}
