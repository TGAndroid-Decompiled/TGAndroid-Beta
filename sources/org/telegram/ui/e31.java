package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class e31 implements org.telegram.ui.ActionBar.i6 {
    public boolean f36968a = false;
    public final f31 f36969b;

    public e31(f31 f31Var) {
        this.f36969b = f31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        f31 f31Var = this.f36969b;
        if (i10 == 0 && !this.f36968a) {
            org.telegram.ui.Components.cq cqVar = f31Var.f37615b;
            if (cqVar != null && (arrayList = cqVar.d) != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((org.telegram.ui.Components.dq) obj).f25451c = f31Var.M ? 1 : 0;
                }
            }
            if (!f31Var.Q) {
                org.telegram.ui.Components.cq cqVar2 = f31Var.f37615b;
                for (int i12 = 0; i12 < cqVar2.h(); i12++) {
                    ((org.telegram.ui.Components.dq) cqVar2.d.get(i12)).getClass();
                }
            }
            this.f36968a = true;
        }
        f31Var.E.setColorFilter(new PorterDuffColorFilter(f31Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (f31Var.Q) {
            org.telegram.ui.Components.cq cqVar3 = f31Var.f37615b;
            for (int i13 = 0; i13 < cqVar3.h(); i13++) {
                ((org.telegram.ui.Components.dq) cqVar3.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f36968a) {
            f31Var.Q = false;
            this.f36968a = false;
        }
    }

    @Override
    public final void b() {
    }
}
