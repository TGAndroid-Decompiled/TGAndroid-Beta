package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xp0 extends s4.s0 {
    public final int f30384a;
    public final wq0 f30385b;

    public xp0(wq0 wq0Var, int i10) {
        this.f30384a = i10;
        this.f30385b = wq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        tb tbVar;
        switch (this.f30384a) {
            case 0:
                if (i11 != 0) {
                    wq0 wq0Var = this.f30385b;
                    wq0.s0(wq0Var);
                    wq0Var.f30116q0 = wq0Var.f30115p0;
                    return;
                }
                return;
            case 1:
                wq0 wq0Var2 = this.f30385b;
                if (i11 != 0) {
                    wq0.s0(wq0Var2);
                    wq0Var2.f30116q0 = wq0Var2.f30115p0;
                }
                pc pcVar = pc.f27304w;
                if (pcVar != null && (tbVar = pcVar.e) != null && (tbVar.getParent() instanceof View) && ((View) pc.f27304w.e.getParent()).getParent() == wq0Var2.f30124w) {
                    pc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = wq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    wq0.A0(wq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    wq0 wq0Var3 = this.f30385b;
                    wq0.s0(wq0Var3);
                    wq0Var3.f30116q0 = wq0Var3.f30115p0;
                    return;
                }
                return;
        }
    }
}
