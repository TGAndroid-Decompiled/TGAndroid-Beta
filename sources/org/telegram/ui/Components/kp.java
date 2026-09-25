package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class kp implements org.telegram.ui.ActionBar.i6 {
    public boolean f25849a = false;
    public final np f25850b;

    public kp(np npVar) {
        this.f25850b = npVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        np npVar = this.f25850b;
        lp lpVar = npVar.h;
        if (f7 == 0.0f && !this.f25849a) {
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((mp) obj).f26567c = npVar.N ? 1 : 0;
                }
            }
            if (!npVar.P) {
                for (int i11 = 0; i11 < lpVar.h(); i11++) {
                    ((mp) lpVar.d.get(i11)).getClass();
                }
            }
            this.f25849a = true;
        }
        ij0 ij0Var = npVar.F;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        ij0Var.setColorFilter(new PorterDuffColorFilter(npVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        npVar.setOverlayNavBarColor(npVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19004a7));
        if (npVar.P) {
            for (int i13 = 0; i13 < lpVar.h(); i13++) {
                ((mp) lpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f25849a) {
            npVar.P = false;
            this.f25849a = false;
        }
        npVar.E();
        ci.m6 m6Var = npVar.Z;
        if (m6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = npVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6);
            int k10 = i0.a.k(npVar.getThemedColor(i12), 76);
            m6Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        p6 p6Var = npVar.f26753a0;
        if (p6Var != null) {
            p6Var.setTextColor(npVar.getThemedColor(i12));
        }
        npVar.setBackgroundColor(npVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5));
    }

    @Override
    public final void b() {
    }
}
