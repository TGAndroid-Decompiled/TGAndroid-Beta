package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qn0 extends v4.s0 {
    public final int f37479a;
    public final mo0 f37480b;

    public qn0(mo0 mo0Var, int i7) {
        this.f37479a = i7;
        this.f37480b = mo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gb gbVar;
        switch (this.f37479a) {
            case 0:
                mo0 mo0Var = this.f37480b;
                if (i10 != 0) {
                    mo0.I0(mo0Var);
                    mo0Var.f36062i2 = mo0Var.f36060h2;
                }
                cc ccVar = cc.f32515w;
                if (ccVar != null && (gbVar = ccVar.f32519e) != null && (gbVar.getParent() instanceof View) && ((View) cc.f32515w.f32519e.getParent()).getParent() == mo0Var.f36081t1) {
                    cc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    mo0 mo0Var2 = this.f37480b;
                    mo0.I0(mo0Var2);
                    mo0Var2.f36062i2 = mo0Var2.f36060h2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    mo0 mo0Var3 = this.f37480b;
                    mo0.I0(mo0Var3);
                    mo0Var3.f36062i2 = mo0Var3.f36060h2;
                    return;
                }
                return;
        }
    }
}
