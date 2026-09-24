package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends kz {
    public final lz d;

    public ox(lz lzVar) {
        super(lzVar, 1);
        this.d = lzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f26238f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        lz lzVar = this.d;
        ly lyVar = lzVar.S;
        lx lxVar = lzVar.Q;
        lzVar.U(lxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = lzVar.f26252j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (lyVar != null && lzVar.P.getAdapter() == lyVar) {
            ly lyVar2 = lyVar.f26218x.f25897a;
            if (!lyVar2.F.V.F && !lyVar2.E) {
                if (lxVar.N0() + 20 > lyVar.h()) {
                    ky kyVar = lyVar.f26218x;
                    Objects.requireNonNull(kyVar);
                    AndroidUtilities.runOnUIThread(new tw(kyVar, 1));
                }
            }
        }
    }
}
