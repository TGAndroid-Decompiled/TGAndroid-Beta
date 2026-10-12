package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ax extends vz {
    public final wz d;

    public ax(wz wzVar) {
        super(wzVar, 2);
        this.d = wzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d.f31037j2) != null) {
            fVar.f(i10, i11);
        }
    }
}
