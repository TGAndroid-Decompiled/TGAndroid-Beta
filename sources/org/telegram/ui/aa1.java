package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class aa1 extends s4.s0 {
    public final int f32022a;
    public final bb1 f32023b;

    public aa1(bb1 bb1Var, int i10) {
        this.f32022a = i10;
        this.f32023b = bb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        bb1 bb1Var;
        ah.i iVar2;
        bb1 bb1Var2;
        ah.i iVar3;
        switch (this.f32022a) {
            case 0:
                bb1 bb1Var3 = this.f32023b;
                if (bb1Var3.f32335r0.size() != bb1Var3.f32337s0.size() && !bb1Var3.f32342w0 && bb1Var3.U.N0() > bb1Var3.X.f33846c0 - 20) {
                    bb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = bb1Var3.C0) != null) {
                    iVar.f(i10, i11);
                    bb1.W(bb1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = (bb1Var = this.f32023b).C0) != null) {
                    iVar2.f(i10, i11);
                    bb1.W(bb1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = (bb1Var2 = this.f32023b).C0) != null) {
                    iVar3.f(i10, i11);
                    bb1.W(bb1Var2);
                    return;
                }
                return;
        }
    }
}
