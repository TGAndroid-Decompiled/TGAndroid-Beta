package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class fx extends a00 {
    public final b00 d;

    public fx(b00 b00Var) {
        super(b00Var, 2);
        this.d = b00Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d.f24713j2) != null) {
            hVar.f(i10, i11);
        }
    }
}
