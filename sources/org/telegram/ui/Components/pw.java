package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class pw extends kz {
    public final lz d;

    public pw(lz lzVar) {
        super(lzVar, 2);
        this.d = lzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d.f26259j2) != null) {
            hVar.f(i10, i11);
        }
    }
}
