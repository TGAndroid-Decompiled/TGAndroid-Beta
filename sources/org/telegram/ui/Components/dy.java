package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class dy extends zz {
    public final a00 d;

    public dy(a00 a00Var) {
        super(a00Var, 1);
        this.d = a00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f24411f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        a00 a00Var = this.d;
        zy zyVar = a00Var.S;
        zx zxVar = a00Var.Q;
        a00Var.U(zxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = a00Var.f24425j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (zyVar != null && a00Var.P.getAdapter() == zyVar) {
            zy zyVar2 = zyVar.f33681x.f33403a;
            if (!zyVar2.F.V.F && !zyVar2.E) {
                if (zxVar.N0() + 20 > zyVar.h()) {
                    yy yyVar = zyVar.f33681x;
                    Objects.requireNonNull(yyVar);
                    AndroidUtilities.runOnUIThread(new hx(yyVar, 1));
                }
            }
        }
    }
}
