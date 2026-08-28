package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class zo implements org.telegram.ui.ActionBar.g6 {
    public boolean f35346a = false;
    public final cp f35347b;

    public zo(cp cpVar) {
        this.f35347b = cpVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        cp cpVar = this.f35347b;
        ap apVar = cpVar.h;
        if (f10 == 0.0f && !this.f35346a) {
            if (apVar != null && (arrayList = apVar.d) != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((bp) obj).f27263c = cpVar.J ? 1 : 0;
                }
            }
            if (!cpVar.L) {
                for (int i10 = 0; i10 < apVar.h(); i10++) {
                    ((bp) apVar.d.get(i10)).getClass();
                }
            }
            this.f35346a = true;
        }
        mi0 mi0Var = cpVar.B;
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        mi0Var.setColorFilter(new PorterDuffColorFilter(cpVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        cpVar.setOverlayNavBarColor(cpVar.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        if (cpVar.L) {
            for (int i12 = 0; i12 < apVar.h(); i12++) {
                ((bp) apVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f35346a) {
            cpVar.L = false;
            this.f35346a = false;
        }
        cpVar.D();
        fh.v vVar = cpVar.V;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = cpVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6);
            int k10 = i0.a.k(cpVar.getThemedColor(i11), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        j6 j6Var = cpVar.W;
        if (j6Var != null) {
            j6Var.setTextColor(cpVar.getThemedColor(i11));
        }
        cpVar.setBackgroundColor(cpVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
    }

    @Override
    public final void b() {
    }
}
