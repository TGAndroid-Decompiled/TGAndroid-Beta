package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ow extends jz {
    public final kz d;

    public ow(kz kzVar) {
        super(kzVar, 2);
        this.d = kzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.d.f25736j2) != null) {
            iVar.f(i10, i11);
        }
    }
}
