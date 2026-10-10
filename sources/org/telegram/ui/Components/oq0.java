package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oq0 extends s4.t0 {
    public final int f29570a;
    public final nr0 f29571b;

    public oq0(nr0 nr0Var, int i10) {
        this.f29570a = i10;
        this.f29571b = nr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        xb xbVar;
        switch (this.f29570a) {
            case 0:
                if (i11 != 0) {
                    nr0 nr0Var = this.f29571b;
                    nr0.t0(nr0Var);
                    nr0Var.f29210q0 = nr0Var.f29209p0;
                    return;
                }
                return;
            case 1:
                nr0 nr0Var2 = this.f29571b;
                if (i11 != 0) {
                    nr0.t0(nr0Var2);
                    nr0Var2.f29210q0 = nr0Var2.f29209p0;
                }
                tc tcVar = tc.f31088w;
                if (tcVar != null && (xbVar = tcVar.f31092e) != null && (xbVar.getParent() instanceof View) && ((View) tc.f31088w.f31092e.getParent()).getParent() == nr0Var2.f29218w) {
                    tc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = nr0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    nr0.B0(nr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    nr0 nr0Var3 = this.f29571b;
                    nr0.t0(nr0Var3);
                    nr0Var3.f29210q0 = nr0Var3.f29209p0;
                    return;
                }
                return;
        }
    }
}
