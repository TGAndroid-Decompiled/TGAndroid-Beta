package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class bw extends vy {
    public final wy d;

    public bw(wy wyVar) {
        super(wyVar, 2);
        this.d = wyVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        wy wyVar;
        ig.e eVar;
        super.b(recyclerView, i9, i10);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (wyVar = this.d).f34404f2) != null) {
            eVar.f(i9, i10);
            wyVar.C();
        }
    }
}
