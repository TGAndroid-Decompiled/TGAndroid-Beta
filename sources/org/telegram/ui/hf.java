package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f46361a;
    public final an f46362b;
    public final ArrayList f46363c;

    public hf(an anVar, ArrayList arrayList, int i7) {
        this.f46361a = i7;
        this.f46362b = anVar;
        this.f46363c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46361a) {
            case 0:
                an anVar = this.f46362b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.f44028xa, this.f46363c);
                boolean T9 = anVar.T9();
                xhVar.f28635h0 = T9;
                xhVar.f28640n = T9;
                xhVar.f28642o0 = false;
                anVar.O7(false);
                anVar.showDialog(xhVar);
                return;
            default:
                an anVar2 = this.f46362b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ru(anVar2, anVar2.getParentActivity(), anVar2.f44028xa, this.f46363c).show();
                    anVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
