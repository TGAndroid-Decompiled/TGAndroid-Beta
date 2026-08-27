package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

public final class p81 extends f2.b1 {

    public final int f41298a;

    public final q91 f41299b;

    public p81(q91 q91Var, int i10) {
        this.f41298a = i10;
        this.f41299b = q91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        q91 q91Var;
        jg.e eVar2;
        q91 q91Var2;
        jg.e eVar3;
        switch (this.f41298a) {
            case 0:
                q91 q91Var3 = this.f41299b;
                if (q91Var3.f41567n0.size() != q91Var3.f41568o0.size() && !q91Var3.f41574s0 && q91Var3.Q.N0() > q91Var3.T.Y - 20) {
                    q91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = q91Var3.f41583y0) != null) {
                    eVar.f(i10, i11);
                    q91.W(q91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (q91Var = this.f41299b).f41583y0) != null) {
                    eVar2.f(i10, i11);
                    q91.W(q91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (q91Var2 = this.f41299b).f41583y0) != null) {
                    eVar3.f(i10, i11);
                    q91.W(q91Var2);
                    break;
                }
                break;
        }
    }
}
