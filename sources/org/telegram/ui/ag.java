package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f32050a;
    public final zn f32051b;
    public final ArrayList f32052c;

    public ag(zn znVar, ArrayList arrayList, int i10) {
        this.f32050a = i10;
        this.f32051b = znVar;
        this.f32052c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32050a) {
            case 0:
                zn znVar = this.f32051b;
                oi oiVar = new oi(znVar, znVar, znVar.getParentActivity(), znVar.f40303ea, this.f32052c);
                oiVar.setCalcMandatoryInsets(znVar.x9());
                oiVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(oiVar);
                return;
            default:
                zn znVar2 = this.f32051b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(znVar2, znVar2.getParentActivity(), znVar2.f40303ea, this.f32052c).show();
                    znVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
