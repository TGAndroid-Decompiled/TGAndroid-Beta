package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tq0 extends s4.t0 {
    public final int f30946a;
    public final sr0 f30947b;

    public tq0(sr0 sr0Var, int i10) {
        this.f30946a = i10;
        this.f30947b = sr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        wb wbVar;
        switch (this.f30946a) {
            case 0:
                if (i11 != 0) {
                    sr0 sr0Var = this.f30947b;
                    sr0.t0(sr0Var);
                    sr0Var.f30650q0 = sr0Var.f30649p0;
                    return;
                }
                return;
            case 1:
                sr0 sr0Var2 = this.f30947b;
                if (i11 != 0) {
                    sr0.t0(sr0Var2);
                    sr0Var2.f30650q0 = sr0Var2.f30649p0;
                }
                sc scVar = sc.f30532w;
                if (scVar != null && (wbVar = scVar.f30536e) != null && (wbVar.getParent() instanceof View) && ((View) sc.f30532w.f30536e.getParent()).getParent() == sr0Var2.f30658w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = sr0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    sr0.B0(sr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    sr0 sr0Var3 = this.f30947b;
                    sr0.t0(sr0Var3);
                    sr0Var3.f30650q0 = sr0Var3.f30649p0;
                    return;
                }
                return;
        }
    }
}
