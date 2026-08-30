package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gp implements org.telegram.ui.ActionBar.k6 {
    public boolean f25228a = false;
    public final kp f25229b;

    public gp(kp kpVar) {
        this.f25229b = kpVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        kp kpVar = this.f25229b;
        ip ipVar = kpVar.h;
        if (f10 == 0.0f && !this.f25228a) {
            if (ipVar != null && (arrayList = ipVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((jp) obj).f26017c = kpVar.K ? 1 : 0;
                }
            }
            if (!kpVar.M) {
                for (int i11 = 0; i11 < ipVar.h(); i11++) {
                    ((jp) ipVar.d.get(i11)).getClass();
                }
            }
            this.f25228a = true;
        }
        gj0 gj0Var = kpVar.C;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        gj0Var.setColorFilter(new PorterDuffColorFilter(kpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        kpVar.setOverlayNavBarColor(kpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        if (kpVar.M) {
            for (int i13 = 0; i13 < ipVar.h(); i13++) {
                ((jp) ipVar.d.get(i13)).getClass();
            }
        }
        if (f10 == 1.0f && this.f25228a) {
            kpVar.M = false;
            this.f25228a = false;
        }
        kpVar.D();
        ah.d dVar = kpVar.W;
        if (dVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = kpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6);
            int k10 = i0.a.k(kpVar.getThemedColor(i12), 76);
            dVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        k6 k6Var = kpVar.X;
        if (k6Var != null) {
            k6Var.setTextColor(kpVar.getThemedColor(i12));
        }
        kpVar.setBackgroundColor(kpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
    }

    @Override
    public final void b() {
    }
}
