package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class n91 extends f2.z0 {
    public final int f36432a;
    public final oa1 f36433b;

    public n91(oa1 oa1Var, int i10) {
        this.f36432a = i10;
        this.f36433b = oa1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        oa1 oa1Var;
        ng.e eVar2;
        oa1 oa1Var2;
        ng.e eVar3;
        switch (this.f36432a) {
            case 0:
                oa1 oa1Var3 = this.f36433b;
                if (oa1Var3.f36729o0.size() != oa1Var3.f36730p0.size() && !oa1Var3.f36736t0 && oa1Var3.R.N0() > oa1Var3.U.Z - 20) {
                    oa1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = oa1Var3.f36745z0) != null) {
                    eVar.f(i10, i11);
                    oa1.W(oa1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (oa1Var = this.f36433b).f36745z0) != null) {
                    eVar2.f(i10, i11);
                    oa1.W(oa1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (oa1Var2 = this.f36433b).f36745z0) != null) {
                    eVar3.f(i10, i11);
                    oa1.W(oa1Var2);
                    return;
                }
                return;
        }
    }
}
