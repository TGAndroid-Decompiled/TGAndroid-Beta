package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

public final class ax extends xy {
    public final yy d;

    public ax(yy yyVar) {
        super(yyVar, 1);
        this.d = yyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f34980b0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        yy yyVar = this.d;
        wx wxVar = yyVar.O;
        xw xwVar = yyVar.M;
        yyVar.W(xwVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = yyVar.f34997f2) != null) {
            eVar.f(i10, i11);
            yyVar.D();
        }
        super.b(recyclerView, i10, i11);
        if (wxVar == null || yyVar.L.getAdapter() != wxVar) {
            return;
        }
        wx wxVar2 = wxVar.f34361x.f34062a;
        if (wxVar2.B.R.B || wxVar2.A) {
            return;
        }
        if (xwVar.N0() + 20 > wxVar.h()) {
            vx vxVar = wxVar.f34361x;
            Objects.requireNonNull(vxVar);
            AndroidUtilities.runOnUIThread(new dw(vxVar, 1));
        }
    }
}
