package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f35919a;
    public final zn f35920b;
    public final ArrayList f35921c;

    public ag(zn znVar, ArrayList arrayList, int i10) {
        this.f35919a = i10;
        this.f35920b = znVar;
        this.f35921c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35919a) {
            case 0:
                zn znVar = this.f35920b;
                qi qiVar = new qi(znVar, znVar, znVar.getParentActivity(), znVar.f44761ea, this.f35921c);
                qiVar.setCalcMandatoryInsets(znVar.C9());
                qiVar.setDimBehind(false);
                znVar.D7(false);
                znVar.showDialog(qiVar);
                return;
            default:
                zn znVar2 = this.f35920b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.iw(znVar2, znVar2.getParentActivity(), znVar2.f44761ea, this.f35921c).show();
                    znVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
