package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f35921a;
    public final zn f35922b;
    public final ArrayList f35923c;

    public ag(zn znVar, ArrayList arrayList, int i10) {
        this.f35921a = i10;
        this.f35922b = znVar;
        this.f35923c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35921a) {
            case 0:
                zn znVar = this.f35922b;
                qi qiVar = new qi(znVar, znVar, znVar.getParentActivity(), znVar.f44763ea, this.f35923c);
                qiVar.setCalcMandatoryInsets(znVar.C9());
                qiVar.setDimBehind(false);
                znVar.D7(false);
                znVar.showDialog(qiVar);
                return;
            default:
                zn znVar2 = this.f35922b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.iw(znVar2, znVar2.getParentActivity(), znVar2.f44763ea, this.f35923c).show();
                    znVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
