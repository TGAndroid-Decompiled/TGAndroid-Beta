package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class lw extends jz {
    public final kz d;

    public lw(kz kzVar) {
        super(kzVar, 2);
        this.d = kzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        kz kzVar;
        ng.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (kzVar = this.d).f26444g2) != null) {
            eVar.f(i10, i11);
            kzVar.C();
        }
    }
}
