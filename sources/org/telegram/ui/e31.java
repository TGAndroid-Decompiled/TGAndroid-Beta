package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class e31 implements org.telegram.ui.ActionBar.k6 {
    public boolean f33276a = false;
    public final f31 f33277b;

    public e31(f31 f31Var) {
        this.f33277b = f31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        f31 f31Var = this.f33277b;
        if (f7 == 0.0f && !this.f33276a) {
            org.telegram.ui.Components.kp kpVar = f31Var.f33528b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).f25956c = f31Var.M ? 1 : 0;
                }
            }
            if (!f31Var.Q) {
                org.telegram.ui.Components.kp kpVar2 = f31Var.f33528b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.f33276a = true;
        }
        f31Var.E.setColorFilter(new PorterDuffColorFilter(f31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (f31Var.Q) {
            org.telegram.ui.Components.kp kpVar3 = f31Var.f33528b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f33276a) {
            f31Var.Q = false;
            this.f33276a = false;
        }
    }

    @Override
    public final void b() {
    }
}
