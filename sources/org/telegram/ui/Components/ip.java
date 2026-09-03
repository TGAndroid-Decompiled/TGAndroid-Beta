package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ip implements org.telegram.ui.ActionBar.l6 {
    public boolean f27878a = false;
    public final mp f27879b;

    public ip(mp mpVar) {
        this.f27879b = mpVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        mp mpVar = this.f27879b;
        kp kpVar = mpVar.h;
        if (f10 == 0.0f && !this.f27878a) {
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lp) obj).f28821c = mpVar.K ? 1 : 0;
                }
            }
            if (!mpVar.M) {
                for (int i11 = 0; i11 < kpVar.h(); i11++) {
                    ((lp) kpVar.d.get(i11)).getClass();
                }
            }
            this.f27878a = true;
        }
        hj0 hj0Var = mpVar.C;
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        hj0Var.setColorFilter(new PorterDuffColorFilter(mpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        mpVar.setOverlayNavBarColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7));
        if (mpVar.M) {
            for (int i13 = 0; i13 < kpVar.h(); i13++) {
                ((lp) kpVar.d.get(i13)).getClass();
            }
        }
        if (f10 == 1.0f && this.f27878a) {
            mpVar.M = false;
            this.f27878a = false;
        }
        mpVar.D();
        ag.l lVar = mpVar.W;
        if (lVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = mpVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6);
            int k10 = i0.a.k(mpVar.getThemedColor(i12), 76);
            lVar.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        k6 k6Var = mpVar.X;
        if (k6Var != null) {
            k6Var.setTextColor(mpVar.getThemedColor(i12));
        }
        mpVar.setBackgroundColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
    }

    @Override
    public final void b() {
    }
}
