package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class hw extends ez {
    public final fz d;

    public hw(fz fzVar) {
        super(fzVar, 2);
        this.d = fzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fz fzVar;
        lg.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (fzVar = this.d).f28595f2) != null) {
            eVar.f(i10, i11);
            fzVar.C();
        }
    }
}
