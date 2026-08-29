package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class mf implements View.OnClickListener {
    public final int f40546a;
    public final tn f40547b;
    public final ArrayList f40548c;

    public mf(tn tnVar, ArrayList arrayList, int i10) {
        this.f40546a = i10;
        this.f40547b = tnVar;
        this.f40548c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40546a) {
            case 0:
                tn tnVar = this.f40547b;
                gi giVar = new gi(tnVar, tnVar, tnVar.getParentActivity(), tnVar.f42746aa, this.f40548c);
                giVar.setCalcMandatoryInsets(tnVar.x9());
                giVar.setDimBehind(false);
                tnVar.A7(false);
                tnVar.showDialog(giVar);
                return;
            default:
                tn tnVar2 = this.f40547b;
                if (tnVar2.getParentActivity() != null && tnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.jv(tnVar2, tnVar2.getParentActivity(), tnVar2.f42746aa, this.f40548c).show();
                    tnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
