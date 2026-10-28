package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class lp implements org.telegram.ui.ActionBar.g7 {
    public boolean f30278a = false;
    public final zp f30279b;

    public lp(zp zpVar) {
        this.f30279b = zpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        zp zpVar = this.f30279b;
        xp xpVar = zpVar.h;
        if (f7 == 0.0f && !this.f30278a) {
            if (xpVar != null && (arrayList = xpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yp) obj).f35126c = zpVar.M ? 1 : 0;
                }
            }
            if (!zpVar.O) {
                for (int i11 = 0; i11 < xpVar.h(); i11++) {
                    ((yp) xpVar.d.get(i11)).getClass();
                }
            }
            this.f30278a = true;
        }
        yj0 yj0Var = zpVar.E;
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = zpVar.getThemedColor(i12);
        zpVar.f35420j0 = themedColor;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        zpVar.setOverlayNavBarColor(zpVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7));
        if (zpVar.O) {
            for (int i13 = 0; i13 < xpVar.h(); i13++) {
                ((yp) xpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f30278a) {
            zpVar.O = false;
            this.f30278a = false;
        }
        zpVar.K();
        bh.p pVar = zpVar.Y;
        if (pVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor2 = zpVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
            int o10 = i0.a.o(zpVar.getThemedColor(i12), 76);
            pVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor2, o10, o10));
        }
        s6 s6Var = zpVar.Z;
        if (s6Var != null) {
            s6Var.setTextColor(zpVar.getThemedColor(i12));
        }
        int themedColor3 = zpVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
        zpVar.f35421k0 = themedColor3;
        zpVar.setBackgroundColor(themedColor3);
    }

    @Override
    public final void b() {
        this.f30279b.x();
    }
}
