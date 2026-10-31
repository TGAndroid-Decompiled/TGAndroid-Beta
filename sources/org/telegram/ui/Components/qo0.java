package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qo0 extends s4.s0 {
    public final int f29712a;
    public final op0 f29713b;

    public qo0(op0 op0Var, int i10) {
        this.f29712a = i10;
        this.f29713b = op0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bb bbVar;
        switch (this.f29712a) {
            case 0:
                op0 op0Var = this.f29713b;
                if (i11 != 0) {
                    op0.I0(op0Var);
                    op0Var.f29121i2 = op0Var.f29119h2;
                }
                wb wbVar = wb.f32128w;
                if (wbVar != null && (bbVar = wbVar.e) != null && (bbVar.getParent() instanceof View) && ((View) wb.f32128w.e.getParent()).getParent() == op0Var.f29141t1) {
                    wb.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    op0 op0Var2 = this.f29713b;
                    op0.I0(op0Var2);
                    op0Var2.f29121i2 = op0Var2.f29119h2;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    op0 op0Var3 = this.f29713b;
                    op0.I0(op0Var3);
                    op0Var3.f29121i2 = op0Var3.f29119h2;
                    return;
                }
                return;
        }
    }
}
