package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class hp0 extends s4.s0 {
    public final int f34257a;
    public final np0 f34258b;

    public hp0(np0 np0Var, int i10) {
        this.f34258b = np0Var;
        this.f34257a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.k5 k5Var;
        ah.h hVar;
        np0 np0Var = this.f34258b;
        tp0 tp0Var = np0Var.f35932p0;
        if (i11 != 0) {
            tp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = tp0Var.f38156f0) != null) {
            hVar.f(i10, i11);
        }
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J != null && np0Var.c()) {
                np0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f34257a == 1) {
            k5Var = tp0Var.f38151c;
        } else {
            k5Var = tp0Var.f38149b;
        }
        if (k5Var != null && np0Var.c()) {
            k5Var.a();
        }
    }
}
