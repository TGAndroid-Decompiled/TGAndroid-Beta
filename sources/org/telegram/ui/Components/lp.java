package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class lp implements View.OnClickListener {
    public final int f28538a;
    public final cq f28539b;

    public lp(cq cqVar, int i10) {
        this.f28538a = i10;
        this.f28539b = cqVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28538a) {
            case 0:
                cq cqVar = this.f28539b;
                yi yiVar = cqVar.Y;
                if (yiVar.B0 == yiVar.f33240j0) {
                    cqVar.f25461a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    cqVar.Y.F1();
                    nj njVar = cqVar.Y.f33264r0;
                    boolean z10 = cqVar.N;
                    cb cbVar = njVar.v;
                    ((ArrayList) cbVar.f25319e).clear();
                    WallpapersListActivity.z0((ArrayList) cbVar.f25319e, z10);
                    cbVar.l();
                    return;
                }
                cqVar.f25461a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                yi yiVar2 = cqVar.Y;
                yiVar2.U1(yiVar2.f33240j0);
                return;
            case 1:
                cq cqVar2 = this.f28539b;
                if (cqVar2.x()) {
                    cqVar2.C(true);
                    cqVar2.G(true);
                    return;
                }
                cqVar2.dismiss();
                return;
            case 2:
                cq cqVar3 = this.f28539b;
                if (cqVar3.T == null) {
                    cqVar3.E(!cqVar3.N);
                    return;
                }
                return;
            default:
                this.f28539b.u(false);
                return;
        }
    }
}
