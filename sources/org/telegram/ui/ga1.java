package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ga1 extends s4.r0 {
    public final int f36123a;
    public final hb1 f36124b;

    public ga1(hb1 hb1Var, int i10) {
        this.f36123a = i10;
        this.f36124b = hb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        hb1 hb1Var;
        bh.f fVar2;
        hb1 hb1Var2;
        bh.f fVar3;
        switch (this.f36123a) {
            case 0:
                hb1 hb1Var3 = this.f36124b;
                if (hb1Var3.f36497r0.size() != hb1Var3.f36499s0.size() && !hb1Var3.f36504w0 && hb1Var3.U.N0() > hb1Var3.X.f37949c0 - 20) {
                    hb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = hb1Var3.C0) != null) {
                    fVar.f(i10, i11);
                    hb1.W(hb1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (hb1Var = this.f36124b).C0) != null) {
                    fVar2.f(i10, i11);
                    hb1.W(hb1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (hb1Var2 = this.f36124b).C0) != null) {
                    fVar3.f(i10, i11);
                    hb1.W(hb1Var2);
                    return;
                }
                return;
        }
    }
}
