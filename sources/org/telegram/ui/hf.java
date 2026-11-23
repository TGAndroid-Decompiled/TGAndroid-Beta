package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f48547a;
    public final bn f48548b;
    public final ArrayList f48549c;

    public hf(bn bnVar, ArrayList arrayList, int i7) {
        this.f48547a = i7;
        this.f48548b = bnVar;
        this.f48549c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48547a) {
            case 0:
                bn bnVar = this.f48548b;
                xh xhVar = new xh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.f48549c);
                boolean V9 = bnVar.V9();
                xhVar.f30244i0 = V9;
                xhVar.f30251n = V9;
                xhVar.f30254p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(xhVar);
                return;
            default:
                bn bnVar2 = this.f48548b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.bv(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.f48549c).show();
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
