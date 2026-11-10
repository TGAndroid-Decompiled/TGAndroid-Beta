package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class jf implements View.OnClickListener {
    public final int f46995a;
    public final cn f46996b;
    public final ArrayList f46997c;

    public jf(cn cnVar, ArrayList arrayList, int i7) {
        this.f46995a = i7;
        this.f46996b = cnVar;
        this.f46997c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46995a) {
            case 0:
                cn cnVar = this.f46996b;
                zh zhVar = new zh(cnVar, cnVar, cnVar.getParentActivity(), cnVar.f44750za, this.f46997c);
                boolean U9 = cnVar.U9();
                zhVar.f28688h0 = U9;
                zhVar.f28696n = U9;
                zhVar.f28698o0 = false;
                cnVar.P7(false);
                cnVar.showDialog(zhVar);
                return;
            default:
                cn cnVar2 = this.f46996b;
                if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.qu(cnVar2, cnVar2.getParentActivity(), cnVar2.f44750za, this.f46997c).show();
                    cnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
