package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class m21 implements org.telegram.ui.ActionBar.l6 {
    public boolean f38950a = false;
    public final n21 f38951b;

    public m21(n21 n21Var) {
        this.f38951b = n21Var;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        n21 n21Var = this.f38951b;
        if (f10 == 0.0f && !this.f38950a) {
            org.telegram.ui.Components.kp kpVar = n21Var.f39270b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).f28798c = n21Var.J ? 1 : 0;
                }
            }
            if (!n21Var.N) {
                org.telegram.ui.Components.kp kpVar2 = n21Var.f39270b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.f38950a = true;
        }
        n21Var.B.setColorFilter(new PorterDuffColorFilter(n21Var.d.getThemedColor(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN));
        if (n21Var.N) {
            org.telegram.ui.Components.kp kpVar3 = n21Var.f39270b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f38950a) {
            n21Var.N = false;
            this.f38950a = false;
        }
    }

    @Override
    public final void b() {
    }
}
