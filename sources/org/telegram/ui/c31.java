package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class c31 implements org.telegram.ui.ActionBar.j6 {
    public boolean f36505a = false;
    public final d31 f36506b;

    public c31(d31 d31Var) {
        this.f36506b = d31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        d31 d31Var = this.f36506b;
        if (i10 == 0 && !this.f36505a) {
            org.telegram.ui.Components.aq aqVar = d31Var.f36821b;
            if (aqVar != null && (arrayList = aqVar.d) != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((org.telegram.ui.Components.bq) obj).f25084c = d31Var.M ? 1 : 0;
                }
            }
            if (!d31Var.Q) {
                org.telegram.ui.Components.aq aqVar2 = d31Var.f36821b;
                for (int i12 = 0; i12 < aqVar2.h(); i12++) {
                    ((org.telegram.ui.Components.bq) aqVar2.d.get(i12)).getClass();
                }
            }
            this.f36505a = true;
        }
        d31Var.E.setColorFilter(new PorterDuffColorFilter(d31Var.d.getThemedColor(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN));
        if (d31Var.Q) {
            org.telegram.ui.Components.aq aqVar3 = d31Var.f36821b;
            for (int i13 = 0; i13 < aqVar3.h(); i13++) {
                ((org.telegram.ui.Components.bq) aqVar3.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f36505a) {
            d31Var.Q = false;
            this.f36505a = false;
        }
    }

    @Override
    public final void b() {
    }
}
