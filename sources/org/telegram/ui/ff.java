package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ff implements View.OnClickListener {
    public final int f47131a;
    public final an f47132b;
    public final ArrayList f47133c;

    public ff(an anVar, ArrayList arrayList, int i7) {
        this.f47131a = i7;
        this.f47132b = anVar;
        this.f47133c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47131a) {
            case 0:
                an anVar = this.f47132b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.Aa, this.f47133c);
                boolean V9 = anVar.V9();
                xhVar.f29700i0 = V9;
                xhVar.f29707n = V9;
                xhVar.f29710p0 = false;
                anVar.P7(false);
                anVar.showDialog(xhVar);
                return;
            default:
                an anVar2 = this.f47132b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wu(anVar2, anVar2.getParentActivity(), anVar2.Aa, this.f47133c).show();
                    anVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
