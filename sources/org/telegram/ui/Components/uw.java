package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class uw extends qz {
    public final rz d;

    public uw(rz rzVar) {
        super(rzVar, 2);
        this.d = rzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d.f30333j2) != null) {
            fVar.f(i10, i11);
        }
    }
}
