package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ip implements org.telegram.ui.ActionBar.k6 {
    public boolean f27231a = false;
    public final lp f27232b;

    public ip(lp lpVar) {
        this.f27232b = lpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        lp lpVar = this.f27232b;
        jp jpVar = lpVar.h;
        if (f7 == 0.0f && !this.f27231a) {
            if (jpVar != null && (arrayList = jpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((kp) obj).f27884c = lpVar.N ? 1 : 0;
                }
            }
            if (!lpVar.P) {
                for (int i11 = 0; i11 < jpVar.h(); i11++) {
                    ((kp) jpVar.d.get(i11)).getClass();
                }
            }
            this.f27231a = true;
        }
        xi0 xi0Var = lpVar.F;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        xi0Var.setColorFilter(new PorterDuffColorFilter(lpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        lpVar.setOverlayNavBarColor(lpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7));
        if (lpVar.P) {
            for (int i13 = 0; i13 < jpVar.h(); i13++) {
                ((kp) jpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f27231a) {
            lpVar.P = false;
            this.f27231a = false;
        }
        lpVar.D();
        ah.w wVar = lpVar.Z;
        if (wVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = lpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6);
            int k10 = i0.a.k(lpVar.getThemedColor(i12), 76);
            wVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        q6 q6Var = lpVar.f28255a0;
        if (q6Var != null) {
            q6Var.setTextColor(lpVar.getThemedColor(i12));
        }
        lpVar.setBackgroundColor(lpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5));
    }

    @Override
    public final void b() {
    }
}
