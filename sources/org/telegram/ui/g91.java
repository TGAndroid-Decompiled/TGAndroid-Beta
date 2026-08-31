package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class g91 extends f2.a1 {
    public final int f37138a;
    public final ha1 f37139b;

    public g91(ha1 ha1Var, int i10) {
        this.f37138a = i10;
        this.f37139b = ha1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        ha1 ha1Var;
        og.e eVar2;
        ha1 ha1Var2;
        og.e eVar3;
        switch (this.f37138a) {
            case 0:
                ha1 ha1Var3 = this.f37139b;
                if (ha1Var3.f37435o0.size() != ha1Var3.f37436p0.size() && !ha1Var3.f37442t0 && ha1Var3.R.N0() > ha1Var3.U.Z - 20) {
                    ha1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = ha1Var3.f37451z0) != null) {
                    eVar.f(i10, i11);
                    ha1.W(ha1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (ha1Var = this.f37139b).f37451z0) != null) {
                    eVar2.f(i10, i11);
                    ha1.W(ha1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (ha1Var2 = this.f37139b).f37451z0) != null) {
                    eVar3.f(i10, i11);
                    ha1.W(ha1Var2);
                    return;
                }
                return;
        }
    }
}
