package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

public final class pf implements View.OnClickListener {

    public final int f41338a;

    public final rn f41339b;

    public final ArrayList f41340c;

    public pf(rn rnVar, ArrayList arrayList, int i10) {
        this.f41338a = i10;
        this.f41339b = rnVar;
        this.f41340c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41338a) {
            case 0:
                rn rnVar = this.f41339b;
                fi fiVar = new fi(rnVar, rnVar, rnVar.getParentActivity(), rnVar.f41983aa, this.f41340c);
                fiVar.setCalcMandatoryInsets(rnVar.x9());
                fiVar.setDimBehind(false);
                rnVar.A7(false);
                rnVar.showDialog(fiVar);
                break;
            default:
                rn rnVar2 = this.f41339b;
                if (rnVar2.getParentActivity() != null && rnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.cv(rnVar2, rnVar2.getParentActivity(), rnVar2.f41983aa, this.f41340c).show();
                    rnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
