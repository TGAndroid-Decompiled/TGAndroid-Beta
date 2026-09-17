package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class jp implements org.telegram.ui.ActionBar.k6 {
    public boolean f25397a = false;
    public final mp f25398b;

    public jp(mp mpVar) {
        this.f25398b = mpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        mp mpVar = this.f25398b;
        kp kpVar = mpVar.h;
        if (f7 == 0.0f && !this.f25397a) {
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lp) obj).f25956c = mpVar.N ? 1 : 0;
                }
            }
            if (!mpVar.P) {
                for (int i11 = 0; i11 < kpVar.h(); i11++) {
                    ((lp) kpVar.d.get(i11)).getClass();
                }
            }
            this.f25397a = true;
        }
        yi0 yi0Var = mpVar.F;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        yi0Var.setColorFilter(new PorterDuffColorFilter(mpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        mpVar.setOverlayNavBarColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7));
        if (mpVar.P) {
            for (int i13 = 0; i13 < kpVar.h(); i13++) {
                ((lp) kpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f25397a) {
            mpVar.P = false;
            this.f25397a = false;
        }
        mpVar.E();
        ci.n6 n6Var = mpVar.Z;
        if (n6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6);
            int k10 = i0.a.k(mpVar.getThemedColor(i12), 76);
            n6Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        n6 n6Var2 = mpVar.f26220a0;
        if (n6Var2 != null) {
            n6Var2.setTextColor(mpVar.getThemedColor(i12));
        }
        mpVar.setBackgroundColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5));
    }

    @Override
    public final void b() {
    }
}
