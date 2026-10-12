package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class eg implements View.OnClickListener {
    public final int f37086a;
    public final eo f37087b;
    public final ArrayList f37088c;

    public eg(eo eoVar, ArrayList arrayList, int i10) {
        this.f37086a = i10;
        this.f37087b = eoVar;
        this.f37088c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37086a) {
            case 0:
                eo eoVar = this.f37087b;
                ui uiVar = new ui(eoVar, eoVar, eoVar.getParentActivity(), eoVar.f37251ea, this.f37088c);
                uiVar.setCalcMandatoryInsets(eoVar.C9());
                uiVar.setDimBehind(false);
                eoVar.D7(false);
                eoVar.showDialog(uiVar);
                return;
            default:
                eo eoVar2 = this.f37087b;
                if (eoVar2.getParentActivity() != null && eoVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.lw(eoVar2, eoVar2.getParentActivity(), eoVar2.f37251ea, this.f37088c).show();
                    eoVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
