package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ro0 extends s4.s0 {
    public final int f30052a;
    public final pp0 f30053b;

    public ro0(pp0 pp0Var, int i10) {
        this.f30052a = i10;
        this.f30053b = pp0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bb bbVar;
        switch (this.f30052a) {
            case 0:
                pp0 pp0Var = this.f30053b;
                if (i11 != 0) {
                    pp0.I0(pp0Var);
                    pp0Var.f29476i2 = pp0Var.f29474h2;
                }
                wb wbVar = wb.f32194w;
                if (wbVar != null && (bbVar = wbVar.e) != null && (bbVar.getParent() instanceof View) && ((View) wb.f32194w.e.getParent()).getParent() == pp0Var.f29496t1) {
                    wb.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    pp0 pp0Var2 = this.f30053b;
                    pp0.I0(pp0Var2);
                    pp0Var2.f29476i2 = pp0Var2.f29474h2;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    pp0 pp0Var3 = this.f30053b;
                    pp0.I0(pp0Var3);
                    pp0Var3.f29476i2 = pp0Var3.f29474h2;
                    return;
                }
                return;
        }
    }
}
