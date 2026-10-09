package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class nq0 extends s4.t0 {
    public final int f29257a;
    public final mr0 f29258b;

    public nq0(mr0 mr0Var, int i10) {
        this.f29257a = i10;
        this.f29258b = mr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        xb xbVar;
        switch (this.f29257a) {
            case 0:
                if (i11 != 0) {
                    mr0 mr0Var = this.f29258b;
                    mr0.t0(mr0Var);
                    mr0Var.f28913q0 = mr0Var.f28912p0;
                    return;
                }
                return;
            case 1:
                mr0 mr0Var2 = this.f29258b;
                if (i11 != 0) {
                    mr0.t0(mr0Var2);
                    mr0Var2.f28913q0 = mr0Var2.f28912p0;
                }
                tc tcVar = tc.f31122w;
                if (tcVar != null && (xbVar = tcVar.f31126e) != null && (xbVar.getParent() instanceof View) && ((View) tc.f31122w.f31126e.getParent()).getParent() == mr0Var2.f28921w) {
                    tc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = mr0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    mr0.B0(mr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    mr0 mr0Var3 = this.f29258b;
                    mr0.t0(mr0Var3);
                    mr0Var3.f28913q0 = mr0Var3.f28912p0;
                    return;
                }
                return;
        }
    }
}
