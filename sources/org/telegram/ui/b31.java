package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class b31 implements org.telegram.ui.ActionBar.i6 {
    public boolean f36251a = false;
    public final c31 f36252b;

    public b31(c31 c31Var) {
        this.f36252b = c31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        c31 c31Var = this.f36252b;
        if (i10 == 0 && !this.f36251a) {
            org.telegram.ui.Components.aq aqVar = c31Var.f36536b;
            if (aqVar != null && (arrayList = aqVar.d) != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((org.telegram.ui.Components.bq) obj).f25004c = c31Var.M ? 1 : 0;
                }
            }
            if (!c31Var.Q) {
                org.telegram.ui.Components.aq aqVar2 = c31Var.f36536b;
                for (int i12 = 0; i12 < aqVar2.h(); i12++) {
                    ((org.telegram.ui.Components.bq) aqVar2.d.get(i12)).getClass();
                }
            }
            this.f36251a = true;
        }
        c31Var.E.setColorFilter(new PorterDuffColorFilter(c31Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (c31Var.Q) {
            org.telegram.ui.Components.aq aqVar3 = c31Var.f36536b;
            for (int i13 = 0; i13 < aqVar3.h(); i13++) {
                ((org.telegram.ui.Components.bq) aqVar3.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f36251a) {
            c31Var.Q = false;
            this.f36251a = false;
        }
    }

    @Override
    public final void b() {
    }
}
