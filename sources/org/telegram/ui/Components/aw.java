package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

public final class aw extends xy {
    public final yy d;

    public aw(yy yyVar) {
        super(yyVar, 2);
        this.d = yyVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yy yyVar;
        jg.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (eVar = (yyVar = this.d).f34997f2) == null) {
            return;
        }
        eVar.f(i10, i11);
        yyVar.D();
    }
}
