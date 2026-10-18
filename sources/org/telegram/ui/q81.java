package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class q81 extends s4.r0 {
    public final int f40342a;
    public final r91 f40343b;

    public q81(r91 r91Var, int i10) {
        this.f40342a = i10;
        this.f40343b = r91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        r91 r91Var;
        bh.f fVar2;
        r91 r91Var2;
        bh.f fVar3;
        switch (this.f40342a) {
            case 0:
                r91 r91Var3 = this.f40343b;
                if (r91Var3.f40684r0.size() != r91Var3.f40686s0.size() && !r91Var3.f40691w0 && r91Var3.U.N0() > r91Var3.X.f42454c0 - 20) {
                    r91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = r91Var3.C0) != null) {
                    fVar.f(i10, i11);
                    r91.W(r91Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (r91Var = this.f40343b).C0) != null) {
                    fVar2.f(i10, i11);
                    r91.W(r91Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (r91Var2 = this.f40343b).C0) != null) {
                    fVar3.f(i10, i11);
                    r91.W(r91Var2);
                    return;
                }
                return;
        }
    }
}
