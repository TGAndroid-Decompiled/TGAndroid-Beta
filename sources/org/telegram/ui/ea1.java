package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ea1 extends s4.s0 {
    public final int f32138a;
    public final fb1 f32139b;

    public ea1(fb1 fb1Var, int i10) {
        this.f32138a = i10;
        this.f32139b = fb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        fb1 fb1Var;
        zg.e eVar2;
        fb1 fb1Var2;
        zg.e eVar3;
        switch (this.f32138a) {
            case 0:
                fb1 fb1Var3 = this.f32139b;
                if (fb1Var3.f32762r0.size() != fb1Var3.f32764s0.size() && !fb1Var3.f32769w0 && fb1Var3.U.N0() > fb1Var3.X.f34315c0 - 20) {
                    fb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = fb1Var3.C0) != null) {
                    eVar.f(i10, i11);
                    fb1.W(fb1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (fb1Var = this.f32139b).C0) != null) {
                    eVar2.f(i10, i11);
                    fb1.W(fb1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (fb1Var2 = this.f32139b).C0) != null) {
                    eVar3.f(i10, i11);
                    fb1.W(fb1Var2);
                    return;
                }
                return;
        }
    }
}
