package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class wp implements org.telegram.ui.ActionBar.h6 {
    public boolean f30619a = false;
    public final zp f30620b;

    public wp(zp zpVar) {
        this.f30620b = zpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        zp zpVar = this.f30620b;
        xp xpVar = zpVar.h;
        if (f7 == 0.0f && !this.f30619a) {
            if (xpVar != null && (arrayList = xpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yp) obj).f31347c = zpVar.N ? 1 : 0;
                }
            }
            if (!zpVar.P) {
                for (int i11 = 0; i11 < xpVar.h(); i11++) {
                    ((yp) xpVar.d.get(i11)).getClass();
                }
            }
            this.f30619a = true;
        }
        yj0 yj0Var = zpVar.F;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        yj0Var.setColorFilter(new PorterDuffColorFilter(zpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        zpVar.setOverlayNavBarColor(zpVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
        if (zpVar.P) {
            for (int i13 = 0; i13 < xpVar.h(); i13++) {
                ((yp) xpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f30619a) {
            zpVar.P = false;
            this.f30619a = false;
        }
        zpVar.F();
        ah.v vVar = zpVar.Z;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = zpVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6);
            int k10 = i0.a.k(zpVar.getThemedColor(i12), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        s6 s6Var = zpVar.f31643a0;
        if (s6Var != null) {
            s6Var.setTextColor(zpVar.getThemedColor(i12));
        }
        zpVar.setBackgroundColor(zpVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
    }

    @Override
    public final void b() {
    }
}
