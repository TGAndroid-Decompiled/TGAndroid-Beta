package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class c31 implements org.telegram.ui.ActionBar.j6 {
    public boolean f32657a = false;
    public final d31 f32658b;

    public c31(d31 d31Var) {
        this.f32658b = d31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        d31 d31Var = this.f32658b;
        if (f7 == 0.0f && !this.f32657a) {
            org.telegram.ui.Components.kp kpVar = d31Var.f32906b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).f25996c = d31Var.M ? 1 : 0;
                }
            }
            if (!d31Var.Q) {
                org.telegram.ui.Components.kp kpVar2 = d31Var.f32906b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.f32657a = true;
        }
        d31Var.E.setColorFilter(new PorterDuffColorFilter(d31Var.d.getThemedColor(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN));
        if (d31Var.Q) {
            org.telegram.ui.Components.kp kpVar3 = d31Var.f32906b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f32657a) {
            d31Var.Q = false;
            this.f32657a = false;
        }
    }

    @Override
    public final void b() {
    }
}
