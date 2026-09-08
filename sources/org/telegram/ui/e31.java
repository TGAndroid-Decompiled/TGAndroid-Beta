package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class e31 implements org.telegram.ui.ActionBar.k6 {
    public boolean f35943a = false;
    public final f31 f35944b;

    public e31(f31 f31Var) {
        this.f35944b = f31Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        f31 f31Var = this.f35944b;
        if (f7 == 0.0f && !this.f35943a) {
            org.telegram.ui.Components.jp jpVar = f31Var.f36278b;
            if (jpVar != null && (arrayList = jpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.kp) obj).f27911c = f31Var.M ? 1 : 0;
                }
            }
            if (!f31Var.Q) {
                org.telegram.ui.Components.jp jpVar2 = f31Var.f36278b;
                for (int i11 = 0; i11 < jpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.kp) jpVar2.d.get(i11)).getClass();
                }
            }
            this.f35943a = true;
        }
        f31Var.E.setColorFilter(new PorterDuffColorFilter(f31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (f31Var.Q) {
            org.telegram.ui.Components.jp jpVar3 = f31Var.f36278b;
            for (int i12 = 0; i12 < jpVar3.h(); i12++) {
                ((org.telegram.ui.Components.kp) jpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f35943a) {
            f31Var.Q = false;
            this.f35943a = false;
        }
    }

    @Override
    public final void b() {
    }
}
