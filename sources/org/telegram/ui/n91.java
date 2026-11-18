package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class n91 extends v4.u0 {
    public final int f50127a;
    public final y91 f50128b;

    public n91(y91 y91Var, int i7) {
        this.f50127a = i7;
        this.f50128b = y91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        y91 y91Var;
        dh.g gVar;
        switch (this.f50127a) {
            case 0:
                this.f50128b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (y91Var = this.f50128b).f54072i1) != null) {
                    gVar.f(i7, i10);
                    y91Var.B0();
                    return;
                }
                return;
        }
    }
}
