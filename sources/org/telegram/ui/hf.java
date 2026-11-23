package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f48387a;
    public final bn f48388b;
    public final ArrayList f48389c;

    public hf(bn bnVar, ArrayList arrayList, int i7) {
        this.f48387a = i7;
        this.f48388b = bnVar;
        this.f48389c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48387a) {
            case 0:
                bn bnVar = this.f48388b;
                xh xhVar = new xh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.f48389c);
                boolean V9 = bnVar.V9();
                xhVar.f30194i0 = V9;
                xhVar.f30201n = V9;
                xhVar.f30204p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(xhVar);
                return;
            default:
                bn bnVar2 = this.f48388b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ev(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.f48389c).show();
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
