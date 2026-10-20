package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ww extends sz {
    public final tz d;

    public ww(tz tzVar) {
        super(tzVar, 2);
        this.d = tzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d.f30745j2) != null) {
            fVar.f(i10, i11);
        }
    }
}
