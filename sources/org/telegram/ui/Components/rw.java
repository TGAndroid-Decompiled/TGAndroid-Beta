package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class rw extends mz {
    public final nz d;

    public rw(nz nzVar) {
        super(nzVar, 2);
        this.d = nzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d.f26841j2) != null) {
            hVar.f(i10, i11);
        }
    }
}
