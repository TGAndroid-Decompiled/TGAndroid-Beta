package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f48352a;
    public final bn f48353b;
    public final ArrayList f48354c;

    public hf(bn bnVar, ArrayList arrayList, int i7) {
        this.f48352a = i7;
        this.f48353b = bnVar;
        this.f48354c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48352a) {
            case 0:
                bn bnVar = this.f48353b;
                wh whVar = new wh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.f48354c);
                boolean V9 = bnVar.V9();
                whVar.f30160i0 = V9;
                whVar.f30167n = V9;
                whVar.f30170p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(whVar);
                return;
            default:
                bn bnVar2 = this.f48353b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.dv(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.f48354c).show();
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
