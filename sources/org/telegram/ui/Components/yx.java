package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class yx extends vz {
    public final wz d;

    public yx(wz wzVar) {
        super(wzVar, 1);
        this.d = wzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f30716f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        wz wzVar = this.d;
        vy vyVar = wzVar.S;
        vx vxVar = wzVar.Q;
        wzVar.U(vxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = wzVar.f30730j2) != null) {
            fVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (vyVar != null && wzVar.P.getAdapter() == vyVar) {
            vy vyVar2 = vyVar.f30346x.f29486a;
            if (!vyVar2.F.V.F && !vyVar2.E) {
                if (vxVar.N0() + 20 > vyVar.h()) {
                    uy uyVar = vyVar.f30346x;
                    Objects.requireNonNull(uyVar);
                    AndroidUtilities.runOnUIThread(new dx(uyVar, 1));
                }
            }
        }
    }
}
