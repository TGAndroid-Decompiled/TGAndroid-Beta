package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vp0 extends s4.s0 {
    public final int f29793a;
    public final uq0 f29794b;

    public vp0(uq0 uq0Var, int i10) {
        this.f29793a = i10;
        this.f29794b = uq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        tb tbVar;
        switch (this.f29793a) {
            case 0:
                if (i11 != 0) {
                    uq0 uq0Var = this.f29794b;
                    uq0.s0(uq0Var);
                    uq0Var.f28823q0 = uq0Var.f28822p0;
                    return;
                }
                return;
            case 1:
                uq0 uq0Var2 = this.f29794b;
                if (i11 != 0) {
                    uq0.s0(uq0Var2);
                    uq0Var2.f28823q0 = uq0Var2.f28822p0;
                }
                pc pcVar = pc.f27245w;
                if (pcVar != null && (tbVar = pcVar.e) != null && (tbVar.getParent() instanceof View) && ((View) pc.f27245w.e.getParent()).getParent() == uq0Var2.f28831w) {
                    pc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = uq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    uq0.A0(uq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    uq0 uq0Var3 = this.f29794b;
                    uq0.s0(uq0Var3);
                    uq0Var3.f28823q0 = uq0Var3.f28822p0;
                    return;
                }
                return;
        }
    }
}
