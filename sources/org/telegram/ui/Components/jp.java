package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class jp implements org.telegram.ui.ActionBar.k6 {
    public boolean f25427a = false;
    public final mp f25428b;

    public jp(mp mpVar) {
        this.f25428b = mpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        mp mpVar = this.f25428b;
        kp kpVar = mpVar.h;
        if (f7 == 0.0f && !this.f25427a) {
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lp) obj).f26157c = mpVar.N ? 1 : 0;
                }
            }
            if (!mpVar.P) {
                for (int i11 = 0; i11 < kpVar.h(); i11++) {
                    ((lp) kpVar.d.get(i11)).getClass();
                }
            }
            this.f25427a = true;
        }
        kj0 kj0Var = mpVar.F;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        kj0Var.setColorFilter(new PorterDuffColorFilter(mpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        mpVar.setOverlayNavBarColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19053a7));
        if (mpVar.P) {
            for (int i13 = 0; i13 < kpVar.h(); i13++) {
                ((lp) kpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f25427a) {
            mpVar.P = false;
            this.f25427a = false;
        }
        mpVar.D();
        ci.n6 n6Var = mpVar.Z;
        if (n6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6);
            int k10 = i0.a.k(mpVar.getThemedColor(i12), 76);
            n6Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        o6 o6Var = mpVar.f26495a0;
        if (o6Var != null) {
            o6Var.setTextColor(mpVar.getThemedColor(i12));
        }
        mpVar.setBackgroundColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5));
    }

    @Override
    public final void b() {
    }
}
