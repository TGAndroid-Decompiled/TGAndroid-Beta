package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f35965a;
    public final zn f35966b;
    public final ArrayList f35967c;

    public ag(zn znVar, ArrayList arrayList, int i10) {
        this.f35965a = i10;
        this.f35966b = znVar;
        this.f35967c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35965a) {
            case 0:
                zn znVar = this.f35966b;
                qi qiVar = new qi(znVar, znVar, znVar.getParentActivity(), znVar.f44807ea, this.f35967c);
                qiVar.setCalcMandatoryInsets(znVar.C9());
                qiVar.setDimBehind(false);
                znVar.D7(false);
                znVar.showDialog(qiVar);
                return;
            default:
                zn znVar2 = this.f35966b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.jw(znVar2, znVar2.getParentActivity(), znVar2.f44807ea, this.f35967c).show();
                    znVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
