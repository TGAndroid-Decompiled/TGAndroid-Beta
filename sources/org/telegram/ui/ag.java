package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f32026a;
    public final zn f32027b;
    public final ArrayList f32028c;

    public ag(zn znVar, ArrayList arrayList, int i10) {
        this.f32026a = i10;
        this.f32027b = znVar;
        this.f32028c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32026a) {
            case 0:
                zn znVar = this.f32027b;
                oi oiVar = new oi(znVar, znVar, znVar.getParentActivity(), znVar.f40261ea, this.f32028c);
                oiVar.setCalcMandatoryInsets(znVar.x9());
                oiVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(oiVar);
                return;
            default:
                zn znVar2 = this.f32027b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(znVar2, znVar2.getParentActivity(), znVar2.f40261ea, this.f32028c).show();
                    znVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
