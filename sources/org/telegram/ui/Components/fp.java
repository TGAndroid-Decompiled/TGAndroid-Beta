package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class fp implements org.telegram.ui.ActionBar.k6 {
    public boolean f24946a = false;
    public final jp f24947b;

    public fp(jp jpVar) {
        this.f24947b = jpVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        jp jpVar = this.f24947b;
        hp hpVar = jpVar.h;
        if (f10 == 0.0f && !this.f24946a) {
            if (hpVar != null && (arrayList = hpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ip) obj).f25751c = jpVar.K ? 1 : 0;
                }
            }
            if (!jpVar.M) {
                for (int i11 = 0; i11 < hpVar.h(); i11++) {
                    ((ip) hpVar.d.get(i11)).getClass();
                }
            }
            this.f24946a = true;
        }
        gj0 gj0Var = jpVar.C;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        gj0Var.setColorFilter(new PorterDuffColorFilter(jpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        jpVar.setOverlayNavBarColor(jpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
        if (jpVar.M) {
            for (int i13 = 0; i13 < hpVar.h(); i13++) {
                ((ip) hpVar.d.get(i13)).getClass();
            }
        }
        if (f10 == 1.0f && this.f24946a) {
            jpVar.M = false;
            this.f24946a = false;
        }
        jpVar.D();
        ah.e eVar = jpVar.W;
        if (eVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = jpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6);
            int k10 = i0.a.k(jpVar.getThemedColor(i12), 76);
            eVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        k6 k6Var = jpVar.X;
        if (k6Var != null) {
            k6Var.setTextColor(jpVar.getThemedColor(i12));
        }
        jpVar.setBackgroundColor(jpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
    }

    @Override
    public final void b() {
    }
}
