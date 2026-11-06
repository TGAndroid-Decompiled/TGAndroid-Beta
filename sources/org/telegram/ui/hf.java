package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f46343a;
    public final an f46344b;
    public final ArrayList f46345c;

    public hf(an anVar, ArrayList arrayList, int i7) {
        this.f46343a = i7;
        this.f46344b = anVar;
        this.f46345c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46343a) {
            case 0:
                an anVar = this.f46344b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.f43998xa, this.f46345c);
                boolean T9 = anVar.T9();
                xhVar.f28631h0 = T9;
                xhVar.f28636n = T9;
                xhVar.f28638o0 = false;
                anVar.O7(false);
                anVar.showDialog(xhVar);
                return;
            default:
                an anVar2 = this.f46344b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.qu(anVar2, anVar2.getParentActivity(), anVar2.f43998xa, this.f46345c).show();
                    anVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
