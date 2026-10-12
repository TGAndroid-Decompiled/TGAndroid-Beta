package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class j31 implements org.telegram.ui.ActionBar.h6 {
    public boolean f37250a = false;
    public final k31 f37251b;

    public j31(k31 k31Var) {
        this.f37251b = k31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        k31 k31Var = this.f37251b;
        if (i10 == 0 && !this.f37250a) {
            org.telegram.ui.Components.xp xpVar = k31Var.f37504b;
            if (xpVar != null && (arrayList = xpVar.d) != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((org.telegram.ui.Components.yp) obj).f31670c = k31Var.M ? 1 : 0;
                }
            }
            if (!k31Var.Q) {
                org.telegram.ui.Components.xp xpVar2 = k31Var.f37504b;
                for (int i12 = 0; i12 < xpVar2.h(); i12++) {
                    ((org.telegram.ui.Components.yp) xpVar2.d.get(i12)).getClass();
                }
            }
            this.f37250a = true;
        }
        k31Var.E.setColorFilter(new PorterDuffColorFilter(k31Var.d.getThemedColor(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN));
        if (k31Var.Q) {
            org.telegram.ui.Components.xp xpVar3 = k31Var.f37504b;
            for (int i13 = 0; i13 < xpVar3.h(); i13++) {
                ((org.telegram.ui.Components.yp) xpVar3.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f37250a) {
            k31Var.Q = false;
            this.f37250a = false;
        }
    }

    @Override
    public final void b() {
    }
}
