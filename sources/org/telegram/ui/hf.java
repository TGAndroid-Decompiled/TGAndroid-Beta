package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f48383a;
    public final bn f48384b;
    public final ArrayList f48385c;

    public hf(bn bnVar, ArrayList arrayList, int i7) {
        this.f48383a = i7;
        this.f48384b = bnVar;
        this.f48385c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48383a) {
            case 0:
                bn bnVar = this.f48384b;
                xh xhVar = new xh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.f48385c);
                boolean V9 = bnVar.V9();
                xhVar.f30191i0 = V9;
                xhVar.f30198n = V9;
                xhVar.f30201p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(xhVar);
                return;
            default:
                bn bnVar2 = this.f48384b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ev(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.f48385c).show();
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
