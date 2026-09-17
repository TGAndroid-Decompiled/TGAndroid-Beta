package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class if1 extends s4.s0 {
    public final int f34557a;
    public final fg1 f34558b;

    public if1(fg1 fg1Var, int i10) {
        this.f34557a = i10;
        this.f34558b = fg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        fg1 fg1Var;
        ah.i iVar;
        switch (this.f34557a) {
            case 0:
                fg1 fg1Var2 = this.f34558b;
                int L0 = fg1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 L = recyclerView.L(L0);
                    boolean z11 = false;
                    if (L != null) {
                        i12 = L.f42697a.getTop();
                    } else {
                        i12 = 0;
                    }
                    if (L0 == 0) {
                        int i13 = 0 - i12;
                        if (i12 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Math.abs(i13);
                    } else if (L0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fg1Var2.G0((z10 || !fg1Var2.K) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f34558b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar = (fg1Var = this.f34558b).f33651f1) != null) {
                    iVar.f(i10, i11);
                    fg1Var.x0();
                    return;
                }
                return;
        }
    }
}
