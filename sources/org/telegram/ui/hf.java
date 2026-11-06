package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f46362a;
    public final an f46363b;
    public final ArrayList f46364c;

    public hf(an anVar, ArrayList arrayList, int i7) {
        this.f46362a = i7;
        this.f46363b = anVar;
        this.f46364c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46362a) {
            case 0:
                an anVar = this.f46363b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.f44022xa, this.f46364c);
                boolean T9 = anVar.T9();
                xhVar.f28632h0 = T9;
                xhVar.f28637n = T9;
                xhVar.f28639o0 = false;
                anVar.O7(false);
                anVar.showDialog(xhVar);
                return;
            default:
                an anVar2 = this.f46363b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.qu(anVar2, anVar2.getParentActivity(), anVar2.f44022xa, this.f46364c).show();
                    anVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
