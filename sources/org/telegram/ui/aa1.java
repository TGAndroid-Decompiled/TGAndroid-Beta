package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class aa1 extends s4.s0 {
    public final int f34367a;
    public final bb1 f34368b;

    public aa1(bb1 bb1Var, int i10) {
        this.f34367a = i10;
        this.f34368b = bb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        bb1 bb1Var;
        bh.f fVar2;
        bb1 bb1Var2;
        bh.f fVar3;
        switch (this.f34367a) {
            case 0:
                bb1 bb1Var3 = this.f34368b;
                if (bb1Var3.f34713r0.size() != bb1Var3.f34715s0.size() && !bb1Var3.f34720w0 && bb1Var3.U.N0() > bb1Var3.X.f36611c0 - 20) {
                    bb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = bb1Var3.C0) != null) {
                    fVar.f(i10, i11);
                    bb1.W(bb1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (bb1Var = this.f34368b).C0) != null) {
                    fVar2.f(i10, i11);
                    bb1.W(bb1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (bb1Var2 = this.f34368b).C0) != null) {
                    fVar3.f(i10, i11);
                    bb1.W(bb1Var2);
                    return;
                }
                return;
        }
    }
}
