package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class lp implements View.OnClickListener {
    public final int f28555a;
    public final cq f28556b;

    public lp(cq cqVar, int i10) {
        this.f28555a = i10;
        this.f28556b = cqVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28555a) {
            case 0:
                cq cqVar = this.f28556b;
                yi yiVar = cqVar.Y;
                if (yiVar.B0 == yiVar.f33301j0) {
                    cqVar.f25422a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    cqVar.Y.F1();
                    nj njVar = cqVar.Y.f33325r0;
                    boolean z10 = cqVar.N;
                    bb bbVar = njVar.v;
                    ((ArrayList) bbVar.f24967e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.f24967e, z10);
                    bbVar.l();
                    return;
                }
                cqVar.f25422a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                yi yiVar2 = cqVar.Y;
                yiVar2.U1(yiVar2.f33301j0);
                return;
            case 1:
                cq cqVar2 = this.f28556b;
                if (cqVar2.x()) {
                    cqVar2.C(true);
                    cqVar2.G(true);
                    return;
                }
                cqVar2.dismiss();
                return;
            case 2:
                cq cqVar3 = this.f28556b;
                if (cqVar3.T == null) {
                    cqVar3.E(!cqVar3.N);
                    return;
                }
                return;
            default:
                this.f28556b.u(false);
                return;
        }
    }
}
