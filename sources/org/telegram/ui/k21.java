package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class k21 implements org.telegram.ui.ActionBar.k6 {
    public boolean f35553a = false;
    public final l21 f35554b;

    public k21(l21 l21Var) {
        this.f35554b = l21Var;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        l21 l21Var = this.f35554b;
        if (f10 == 0.0f && !this.f35553a) {
            org.telegram.ui.Components.ip ipVar = l21Var.f35890b;
            if (ipVar != null && (arrayList = ipVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.jp) obj).f26017c = l21Var.J ? 1 : 0;
                }
            }
            if (!l21Var.N) {
                org.telegram.ui.Components.ip ipVar2 = l21Var.f35890b;
                for (int i11 = 0; i11 < ipVar2.h(); i11++) {
                    ((org.telegram.ui.Components.jp) ipVar2.d.get(i11)).getClass();
                }
            }
            this.f35553a = true;
        }
        l21Var.B.setColorFilter(new PorterDuffColorFilter(l21Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (l21Var.N) {
            org.telegram.ui.Components.ip ipVar3 = l21Var.f35890b;
            for (int i12 = 0; i12 < ipVar3.h(); i12++) {
                ((org.telegram.ui.Components.jp) ipVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f35553a) {
            l21Var.N = false;
            this.f35553a = false;
        }
    }

    @Override
    public final void b() {
    }
}
