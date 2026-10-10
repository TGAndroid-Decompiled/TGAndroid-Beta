package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class lp implements View.OnClickListener {
    public final int f28479a;
    public final cq f28480b;

    public lp(cq cqVar, int i10) {
        this.f28479a = i10;
        this.f28480b = cqVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28479a) {
            case 0:
                cq cqVar = this.f28480b;
                yi yiVar = cqVar.Y;
                if (yiVar.B0 == yiVar.f33247j0) {
                    cqVar.f25360a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    cqVar.Y.F1();
                    nj njVar = cqVar.Y.f33271r0;
                    boolean z10 = cqVar.N;
                    cb cbVar = njVar.v;
                    ((ArrayList) cbVar.f25261e).clear();
                    WallpapersListActivity.z0((ArrayList) cbVar.f25261e, z10);
                    cbVar.l();
                    return;
                }
                cqVar.f25360a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                yi yiVar2 = cqVar.Y;
                yiVar2.U1(yiVar2.f33247j0);
                return;
            case 1:
                cq cqVar2 = this.f28480b;
                if (cqVar2.x()) {
                    cqVar2.C(true);
                    cqVar2.G(true);
                    return;
                }
                cqVar2.dismiss();
                return;
            case 2:
                cq cqVar3 = this.f28480b;
                if (cqVar3.T == null) {
                    cqVar3.E(!cqVar3.N);
                    return;
                }
                return;
            default:
                this.f28480b.u(false);
                return;
        }
    }
}
