package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f32071a;
    public final zn f32072b;
    public final ArrayList f32073c;

    public ag(zn znVar, ArrayList arrayList, int i10) {
        this.f32071a = i10;
        this.f32072b = znVar;
        this.f32073c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32071a) {
            case 0:
                zn znVar = this.f32072b;
                pi piVar = new pi(znVar, znVar, znVar.getParentActivity(), znVar.f40324ea, this.f32073c);
                piVar.setCalcMandatoryInsets(znVar.x9());
                piVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(piVar);
                return;
            default:
                zn znVar2 = this.f32072b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(znVar2, znVar2.getParentActivity(), znVar2.f40324ea, this.f32073c).show();
                    znVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
