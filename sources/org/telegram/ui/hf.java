package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f46363a;
    public final an f46364b;
    public final ArrayList f46365c;

    public hf(an anVar, ArrayList arrayList, int i7) {
        this.f46363a = i7;
        this.f46364b = anVar;
        this.f46365c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46363a) {
            case 0:
                an anVar = this.f46364b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.f44023xa, this.f46365c);
                boolean T9 = anVar.T9();
                xhVar.f28631h0 = T9;
                xhVar.f28636n = T9;
                xhVar.f28638o0 = false;
                anVar.O7(false);
                anVar.showDialog(xhVar);
                return;
            default:
                an anVar2 = this.f46364b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.qu(anVar2, anVar2.getParentActivity(), anVar2.f44023xa, this.f46365c).show();
                    anVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
