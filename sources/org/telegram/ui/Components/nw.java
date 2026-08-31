package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class nw extends lz {
    public final mz d;

    public nw(mz mzVar) {
        super(mzVar, 2);
        this.d = mzVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mz mzVar;
        og.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (mzVar = this.d).f29287g2) != null) {
            eVar.f(i10, i11);
            mzVar.C();
        }
    }
}
