package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f30997a;
    public final eo f30998b;
    public final ArrayList f30999c;

    public ag(eo eoVar, ArrayList arrayList, int i10) {
        this.f30997a = i10;
        this.f30998b = eoVar;
        this.f30999c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30997a) {
            case 0:
                eo eoVar = this.f30998b;
                ri riVar = new ri(eoVar, eoVar, eoVar.getParentActivity(), eoVar.f32316ea, this.f30999c);
                riVar.setCalcMandatoryInsets(eoVar.x9());
                riVar.setDimBehind(false);
                eoVar.A7(false);
                eoVar.showDialog(riVar);
                return;
            default:
                eo eoVar2 = this.f30998b;
                if (eoVar2.getParentActivity() != null && eoVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wv(eoVar2, eoVar2.getParentActivity(), eoVar2.f32316ea, this.f30999c).show();
                    eoVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
