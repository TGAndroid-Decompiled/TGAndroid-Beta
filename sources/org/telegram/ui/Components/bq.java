package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class bq implements org.telegram.ui.ActionBar.i6 {
    public boolean f24715a = false;
    public final eq f24716b;

    public bq(eq eqVar) {
        this.f24716b = eqVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        eq eqVar = this.f24716b;
        cq cqVar = eqVar.h;
        if (f7 == 0.0f && !this.f24715a) {
            if (cqVar != null && (arrayList = cqVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((dq) obj).f25448c = eqVar.N ? 1 : 0;
                }
            }
            if (!eqVar.P) {
                for (int i11 = 0; i11 < cqVar.h(); i11++) {
                    ((dq) cqVar.d.get(i11)).getClass();
                }
            }
            this.f24715a = true;
        }
        fk0 fk0Var = eqVar.F;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        fk0Var.setColorFilter(new PorterDuffColorFilter(eqVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        eqVar.setOverlayNavBarColor(eqVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7));
        if (eqVar.P) {
            for (int i13 = 0; i13 < cqVar.h(); i13++) {
                ((dq) cqVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f24715a) {
            eqVar.P = false;
            this.f24715a = false;
        }
        eqVar.F();
        ci.m6 m6Var = eqVar.Z;
        if (m6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = eqVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6);
            int k10 = i0.a.k(eqVar.getThemedColor(i12), 76);
            m6Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        r6 r6Var = eqVar.f25744a0;
        if (r6Var != null) {
            r6Var.setTextColor(eqVar.getThemedColor(i12));
        }
        eqVar.setBackgroundColor(eqVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20630h5));
    }

    @Override
    public final void b() {
    }
}
