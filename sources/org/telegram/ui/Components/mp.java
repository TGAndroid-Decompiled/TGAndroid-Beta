package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class mp implements org.telegram.ui.ActionBar.i6 {
    public boolean f26346a = false;
    public final pp f26347b;

    public mp(pp ppVar) {
        this.f26347b = ppVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        pp ppVar = this.f26347b;
        np npVar = ppVar.h;
        if (f7 == 0.0f && !this.f26346a) {
            if (npVar != null && (arrayList = npVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((op) obj).f27162c = ppVar.N ? 1 : 0;
                }
            }
            if (!ppVar.P) {
                for (int i11 = 0; i11 < npVar.h(); i11++) {
                    ((op) npVar.d.get(i11)).getClass();
                }
            }
            this.f26346a = true;
        }
        lj0 lj0Var = ppVar.F;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        lj0Var.setColorFilter(new PorterDuffColorFilter(ppVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        ppVar.setOverlayNavBarColor(ppVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19020a7));
        if (ppVar.P) {
            for (int i13 = 0; i13 < npVar.h(); i13++) {
                ((op) npVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f26346a) {
            ppVar.P = false;
            this.f26346a = false;
        }
        ppVar.E();
        ci.m6 m6Var = ppVar.Z;
        if (m6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = ppVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6);
            int k10 = i0.a.k(ppVar.getThemedColor(i12), 76);
            m6Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        p6 p6Var = ppVar.f27423a0;
        if (p6Var != null) {
            p6Var.setTextColor(ppVar.getThemedColor(i12));
        }
        ppVar.setBackgroundColor(ppVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19146h5));
    }

    @Override
    public final void b() {
    }
}
