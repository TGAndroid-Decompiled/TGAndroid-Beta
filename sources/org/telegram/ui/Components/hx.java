package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class hx extends c00 {
    public final d00 d;

    public hx(d00 d00Var) {
        super(d00Var, 2);
        this.d = d00Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d.f25096j2) != null) {
            hVar.f(i10, i11);
        }
    }
}
