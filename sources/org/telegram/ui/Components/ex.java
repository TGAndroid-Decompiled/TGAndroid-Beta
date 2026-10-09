package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ex extends zz {
    public final a00 d;

    public ex(a00 a00Var) {
        super(a00Var, 2);
        this.d = a00Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d.f24425j2) != null) {
            hVar.f(i10, i11);
        }
    }
}
