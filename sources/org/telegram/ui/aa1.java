package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class aa1 extends s4.t0 {
    public final int f35893a;
    public final bb1 f35894b;

    public aa1(bb1 bb1Var, int i10) {
        this.f35893a = i10;
        this.f35894b = bb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        bb1 bb1Var;
        ah.h hVar2;
        bb1 bb1Var2;
        ah.h hVar3;
        switch (this.f35893a) {
            case 0:
                bb1 bb1Var3 = this.f35894b;
                if (bb1Var3.f36227r0.size() != bb1Var3.f36229s0.size() && !bb1Var3.f36234w0 && bb1Var3.U.N0() > bb1Var3.X.f37957c0 - 20) {
                    bb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = bb1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    bb1.W(bb1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (bb1Var = this.f35894b).C0) != null) {
                    hVar2.f(i10, i11);
                    bb1.W(bb1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (bb1Var2 = this.f35894b).C0) != null) {
                    hVar3.f(i10, i11);
                    bb1.W(bb1Var2);
                    return;
                }
                return;
        }
    }
}
