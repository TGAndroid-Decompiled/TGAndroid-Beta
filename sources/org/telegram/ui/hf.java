package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f48389a;
    public final bn f48390b;
    public final ArrayList f48391c;

    public hf(bn bnVar, ArrayList arrayList, int i7) {
        this.f48389a = i7;
        this.f48390b = bnVar;
        this.f48391c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48389a) {
            case 0:
                bn bnVar = this.f48390b;
                wh whVar = new wh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.f48391c);
                boolean V9 = bnVar.V9();
                whVar.f30210i0 = V9;
                whVar.f30217n = V9;
                whVar.f30220p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(whVar);
                return;
            default:
                bn bnVar2 = this.f48390b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.bv(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.f48391c).show();
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
