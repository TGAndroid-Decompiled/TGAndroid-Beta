package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class n91 extends v4.t0 {
    public final int f50146a;
    public final y91 f50147b;

    public n91(y91 y91Var, int i7) {
        this.f50146a = i7;
        this.f50147b = y91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        y91 y91Var;
        dh.g gVar;
        switch (this.f50146a) {
            case 0:
                this.f50147b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (y91Var = this.f50147b).f54097i1) != null) {
                    gVar.f(i7, i10);
                    y91Var.B0();
                    return;
                }
                return;
        }
    }
}
