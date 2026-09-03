package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class m91 extends f2.a1 {
    public final int f38894a;
    public final na1 f38895b;

    public m91(na1 na1Var, int i10) {
        this.f38894a = i10;
        this.f38895b = na1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        na1 na1Var;
        og.e eVar2;
        na1 na1Var2;
        og.e eVar3;
        switch (this.f38894a) {
            case 0:
                na1 na1Var3 = this.f38895b;
                if (na1Var3.f39267o0.size() != na1Var3.f39268p0.size() && !na1Var3.f39274t0 && na1Var3.R.N0() > na1Var3.U.Z - 20) {
                    na1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = na1Var3.f39283z0) != null) {
                    eVar.f(i10, i11);
                    na1.W(na1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (na1Var = this.f38895b).f39283z0) != null) {
                    eVar2.f(i10, i11);
                    na1.W(na1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (na1Var2 = this.f38895b).f39283z0) != null) {
                    eVar3.f(i10, i11);
                    na1.W(na1Var2);
                    return;
                }
                return;
        }
    }
}
