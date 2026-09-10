package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sp0 extends s4.s0 {
    public final int f27148a;
    public final sq0 f27149b;

    public sp0(sq0 sq0Var, int i10) {
        this.f27148a = i10;
        this.f27149b = sq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        tb tbVar;
        switch (this.f27148a) {
            case 0:
                if (i11 != 0) {
                    sq0 sq0Var = this.f27149b;
                    sq0.s0(sq0Var);
                    sq0Var.f27185q0 = sq0Var.f27184p0;
                    return;
                }
                return;
            case 1:
                sq0 sq0Var2 = this.f27149b;
                if (i11 != 0) {
                    sq0.s0(sq0Var2);
                    sq0Var2.f27185q0 = sq0Var2.f27184p0;
                }
                pc pcVar = pc.f26074w;
                if (pcVar != null && (tbVar = pcVar.e) != null && (tbVar.getParent() instanceof View) && ((View) pc.f26074w.e.getParent()).getParent() == sq0Var2.f27193w) {
                    pc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = sq0Var2.O0) != null) {
                    eVar.f(i10, i11);
                    sq0.A0(sq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    sq0 sq0Var3 = this.f27149b;
                    sq0.s0(sq0Var3);
                    sq0Var3.f27185q0 = sq0Var3.f27184p0;
                    return;
                }
                return;
        }
    }
}
