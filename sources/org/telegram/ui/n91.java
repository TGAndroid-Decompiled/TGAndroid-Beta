package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class n91 extends v4.s0 {
    public final int f48135a;
    public final y91 f48136b;

    public n91(y91 y91Var, int i7) {
        this.f48135a = i7;
        this.f48136b = y91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        y91 y91Var;
        dh.g gVar;
        switch (this.f48135a) {
            case 0:
                this.f48136b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (y91Var = this.f48136b).f52031g1) != null) {
                    gVar.f(i7, i10);
                    y91Var.B0();
                    return;
                }
                return;
        }
    }
}
