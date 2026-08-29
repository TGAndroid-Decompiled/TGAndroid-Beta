package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class hx extends ez {
    public final fz d;

    public hx(fz fzVar) {
        super(fzVar, 1);
        this.d = fzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f28578b0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        fz fzVar = this.d;
        ey eyVar = fzVar.O;
        ex exVar = fzVar.M;
        fzVar.W(exVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = fzVar.f28595f2) != null) {
            eVar.f(i10, i11);
            fzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (eyVar != null && fzVar.L.getAdapter() == eyVar) {
            ey eyVar2 = eyVar.f28202x.f27885a;
            if (!eyVar2.B.R.B && !eyVar2.A) {
                if (exVar.N0() + 20 > eyVar.h()) {
                    dy dyVar = eyVar.f28202x;
                    Objects.requireNonNull(dyVar);
                    AndroidUtilities.runOnUIThread(new kw(dyVar, 1));
                }
            }
        }
    }
}
