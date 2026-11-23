package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class l91 extends v4.u0 {
    public final int f49658a;
    public final w91 f49659b;

    public l91(w91 w91Var, int i7) {
        this.f49658a = i7;
        this.f49659b = w91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        w91 w91Var;
        dh.g gVar;
        switch (this.f49658a) {
            case 0:
                this.f49659b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (w91Var = this.f49659b).f53238i1) != null) {
                    gVar.f(i7, i10);
                    w91Var.B0();
                    return;
                }
                return;
        }
    }
}
