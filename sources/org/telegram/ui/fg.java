package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class fg implements View.OnClickListener {
    public final int f35525a;
    public final fo f35526b;
    public final ArrayList f35527c;

    public fg(fo foVar, ArrayList arrayList, int i10) {
        this.f35525a = i10;
        this.f35526b = foVar;
        this.f35527c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35525a) {
            case 0:
                fo foVar = this.f35526b;
                ui uiVar = new ui(foVar, foVar, foVar.getParentActivity(), foVar.f35633ea, this.f35527c);
                uiVar.setCalcMandatoryInsets(foVar.C9());
                uiVar.setDimBehind(false);
                foVar.D7(false);
                foVar.showDialog(uiVar);
                return;
            default:
                fo foVar2 = this.f35526b;
                if (foVar2.getParentActivity() != null && foVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ew(foVar2, foVar2.getParentActivity(), foVar2.f35633ea, this.f35527c).show();
                    foVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
