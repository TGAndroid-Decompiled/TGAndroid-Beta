package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class d31 implements org.telegram.ui.ActionBar.k6 {
    public boolean f32938a = false;
    public final e31 f32939b;

    public d31(e31 e31Var) {
        this.f32939b = e31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        e31 e31Var = this.f32939b;
        if (f7 == 0.0f && !this.f32938a) {
            org.telegram.ui.Components.kp kpVar = e31Var.f33230b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).f26157c = e31Var.M ? 1 : 0;
                }
            }
            if (!e31Var.Q) {
                org.telegram.ui.Components.kp kpVar2 = e31Var.f33230b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.f32938a = true;
        }
        e31Var.E.setColorFilter(new PorterDuffColorFilter(e31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (e31Var.Q) {
            org.telegram.ui.Components.kp kpVar3 = e31Var.f33230b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f32938a) {
            e31Var.Q = false;
            this.f32938a = false;
        }
    }

    @Override
    public final void b() {
    }
}
