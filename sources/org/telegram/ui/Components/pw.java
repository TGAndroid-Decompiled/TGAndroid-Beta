package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class pw extends jz {
    public final kz d;

    public pw(kz kzVar) {
        super(kzVar, 2);
        this.d = kzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        kz kzVar;
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = (kzVar = this.d).f27983j2) != null) {
            fVar.f(i10, i11);
            kzVar.C();
        }
    }
}
