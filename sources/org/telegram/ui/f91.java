package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class f91 extends f2.z0 {
    public final int f34199a;
    public final ga1 f34200b;

    public f91(ga1 ga1Var, int i10) {
        this.f34199a = i10;
        this.f34200b = ga1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        ga1 ga1Var;
        ng.e eVar2;
        ga1 ga1Var2;
        ng.e eVar3;
        switch (this.f34199a) {
            case 0:
                ga1 ga1Var3 = this.f34200b;
                if (ga1Var3.f34545o0.size() != ga1Var3.f34546p0.size() && !ga1Var3.f34552t0 && ga1Var3.R.N0() > ga1Var3.U.Z - 20) {
                    ga1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = ga1Var3.f34561z0) != null) {
                    eVar.f(i10, i11);
                    ga1.W(ga1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (ga1Var = this.f34200b).f34561z0) != null) {
                    eVar2.f(i10, i11);
                    ga1.W(ga1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (ga1Var2 = this.f34200b).f34561z0) != null) {
                    eVar3.f(i10, i11);
                    ga1.W(ga1Var2);
                    return;
                }
                return;
        }
    }
}
