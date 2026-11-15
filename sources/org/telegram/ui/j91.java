package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class j91 extends v4.t0 {
    public final int f48282a;
    public final u91 f48283b;

    public j91(u91 u91Var, int i7) {
        this.f48282a = i7;
        this.f48283b = u91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        u91 u91Var;
        dh.g gVar;
        switch (this.f48282a) {
            case 0:
                this.f48283b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (u91Var = this.f48283b).f51854h1) != null) {
                    gVar.f(i7, i10);
                    u91Var.B0();
                    return;
                }
                return;
        }
    }
}
