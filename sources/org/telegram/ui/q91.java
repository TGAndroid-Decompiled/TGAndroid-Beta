package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class q91 extends s4.s0 {
    public final int f36333a;
    public final ra1 f36334b;

    public q91(ra1 ra1Var, int i10) {
        this.f36333a = i10;
        this.f36334b = ra1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ra1 ra1Var;
        ah.h hVar2;
        ra1 ra1Var2;
        ah.h hVar3;
        switch (this.f36333a) {
            case 0:
                ra1 ra1Var3 = this.f36334b;
                if (ra1Var3.f36774r0.size() != ra1Var3.f36776s0.size() && !ra1Var3.f36781w0 && ra1Var3.U.N0() > ra1Var3.X.f38570c0 - 20) {
                    ra1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = ra1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    ra1.W(ra1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (ra1Var = this.f36334b).C0) != null) {
                    hVar2.f(i10, i11);
                    ra1.W(ra1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (ra1Var2 = this.f36334b).C0) != null) {
                    hVar3.f(i10, i11);
                    ra1.W(ra1Var2);
                    return;
                }
                return;
        }
    }
}
