package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ey extends a00 {
    public final b00 d;

    public ey(b00 b00Var) {
        super(b00Var, 1);
        this.d = b00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f24741f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        b00 b00Var = this.d;
        az azVar = b00Var.S;
        ay ayVar = b00Var.Q;
        b00Var.U(ayVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = b00Var.f24755j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (azVar != null && b00Var.P.getAdapter() == azVar) {
            az azVar2 = azVar.f24711x.f33750a;
            if (!azVar2.F.V.F && !azVar2.E) {
                if (ayVar.N0() + 20 > azVar.h()) {
                    zy zyVar = azVar.f24711x;
                    Objects.requireNonNull(zyVar);
                    AndroidUtilities.runOnUIThread(new ix(zyVar, 1));
                }
            }
        }
    }
}
