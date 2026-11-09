package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class hf implements View.OnClickListener {
    public final int f46303a;
    public final cn f46304b;
    public final ArrayList f46305c;

    public hf(cn cnVar, ArrayList arrayList, int i7) {
        this.f46303a = i7;
        this.f46304b = cnVar;
        this.f46305c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46303a) {
            case 0:
                cn cnVar = this.f46304b;
                zh zhVar = new zh(cnVar, cnVar, cnVar.getParentActivity(), cnVar.f44709za, this.f46305c);
                boolean U9 = cnVar.U9();
                zhVar.f28640h0 = U9;
                zhVar.f28645n = U9;
                zhVar.f28647o0 = false;
                cnVar.P7(false);
                cnVar.showDialog(zhVar);
                return;
            default:
                cn cnVar2 = this.f46304b;
                if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ru(cnVar2, cnVar2.getParentActivity(), cnVar2.f44709za, this.f46305c).show();
                    cnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
