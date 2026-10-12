package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ca1 extends s4.t0 {
    public final int f36387a;
    public final db1 f36388b;

    public ca1(db1 db1Var, int i10) {
        this.f36387a = i10;
        this.f36388b = db1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        db1 db1Var;
        ah.h hVar2;
        db1 db1Var2;
        ah.h hVar3;
        switch (this.f36387a) {
            case 0:
                db1 db1Var3 = this.f36388b;
                if (db1Var3.f36747r0.size() != db1Var3.f36749s0.size() && !db1Var3.f36754w0 && db1Var3.U.N0() > db1Var3.X.f38826c0 - 20) {
                    db1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = db1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    db1.W(db1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (db1Var = this.f36388b).C0) != null) {
                    hVar2.f(i10, i11);
                    db1.W(db1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (db1Var2 = this.f36388b).C0) != null) {
                    hVar3.f(i10, i11);
                    db1.W(db1Var2);
                    return;
                }
                return;
        }
    }
}
