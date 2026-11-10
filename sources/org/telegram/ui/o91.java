package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class o91 extends v4.s0 {
    public final int f48474a;
    public final z91 f48475b;

    public o91(z91 z91Var, int i7) {
        this.f48474a = i7;
        this.f48475b = z91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        z91 z91Var;
        dh.g gVar;
        switch (this.f48474a) {
            case 0:
                this.f48475b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (z91Var = this.f48475b).f52361g1) != null) {
                    gVar.f(i7, i10);
                    z91Var.B0();
                    return;
                }
                return;
        }
    }
}
