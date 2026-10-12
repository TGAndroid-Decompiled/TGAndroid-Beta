package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class np implements View.OnClickListener {
    public final int f28918a;
    public final eq f28919b;

    public np(eq eqVar, int i10) {
        this.f28918a = i10;
        this.f28919b = eqVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28918a) {
            case 0:
                eq eqVar = this.f28919b;
                aj ajVar = eqVar.Y;
                if (ajVar.B0 == ajVar.f24354j0) {
                    eqVar.f25744a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    eqVar.Y.F1();
                    pj pjVar = eqVar.Y.f24378r0;
                    boolean z10 = eqVar.N;
                    bb bbVar = pjVar.v;
                    ((ArrayList) bbVar.f24608e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.f24608e, z10);
                    bbVar.l();
                    return;
                }
                eqVar.f25744a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                aj ajVar2 = eqVar.Y;
                ajVar2.U1(ajVar2.f24354j0);
                return;
            case 1:
                eq eqVar2 = this.f28919b;
                if (eqVar2.x()) {
                    eqVar2.B(true);
                    eqVar2.G(true);
                    return;
                }
                eqVar2.dismiss();
                return;
            case 2:
                eq eqVar3 = this.f28919b;
                if (eqVar3.T == null) {
                    eqVar3.E(!eqVar3.N);
                    return;
                }
                return;
            default:
                this.f28919b.u(false);
                return;
        }
    }
}
