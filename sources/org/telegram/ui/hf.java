package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f48340a;
    public final bn f48341b;
    public final ArrayList f48342c;

    public hf(bn bnVar, ArrayList arrayList, int i7) {
        this.f48340a = i7;
        this.f48341b = bnVar;
        this.f48342c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48340a) {
            case 0:
                bn bnVar = this.f48341b;
                wh whVar = new wh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.f48342c);
                boolean V9 = bnVar.V9();
                whVar.f30208i0 = V9;
                whVar.f30215n = V9;
                whVar.f30218p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(whVar);
                return;
            default:
                bn bnVar2 = this.f48341b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.bv(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.f48342c).show();
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
