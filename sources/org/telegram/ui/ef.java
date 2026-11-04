package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ef implements View.OnClickListener {
    public final int f44974a;
    public final wm f44975b;
    public final ArrayList f44976c;

    public ef(wm wmVar, ArrayList arrayList, int i3) {
        this.f44974a = i3;
        this.f44975b = wmVar;
        this.f44976c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44974a) {
            case 0:
                wm wmVar = this.f44975b;
                th thVar = new th(wmVar, wmVar, wmVar.getParentActivity(), wmVar.f51557ya, this.f44976c);
                boolean T9 = wmVar.T9();
                thVar.f28604i0 = T9;
                thVar.f28608n = T9;
                thVar.f28611p0 = false;
                wmVar.O7(false);
                wmVar.showDialog(thVar);
                return;
            default:
                wm wmVar2 = this.f44975b;
                if (wmVar2.getParentActivity() != null && wmVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.pu(wmVar2, wmVar2.getParentActivity(), wmVar2.f51557ya, this.f44976c).show();
                    wmVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
