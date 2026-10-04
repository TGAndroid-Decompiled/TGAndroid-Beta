package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class mp implements org.telegram.ui.ActionBar.j6 {
    public boolean f28672a = false;
    public final pp f28673b;

    public mp(pp ppVar) {
        this.f28673b = ppVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        pp ppVar = this.f28673b;
        np npVar = ppVar.h;
        if (f7 == 0.0f && !this.f28672a) {
            if (npVar != null && (arrayList = npVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((op) obj).f29424c = ppVar.N ? 1 : 0;
                }
            }
            if (!ppVar.P) {
                for (int i11 = 0; i11 < npVar.h(); i11++) {
                    ((op) npVar.d.get(i11)).getClass();
                }
            }
            this.f28672a = true;
        }
        kj0 kj0Var = ppVar.F;
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        kj0Var.setColorFilter(new PorterDuffColorFilter(ppVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        ppVar.setOverlayNavBarColor(ppVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20761a7));
        if (ppVar.P) {
            for (int i13 = 0; i13 < npVar.h(); i13++) {
                ((op) npVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f28672a) {
            ppVar.P = false;
            this.f28672a = false;
        }
        ppVar.C();
        ci.m6 m6Var = ppVar.Z;
        if (m6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = ppVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20817d6);
            int k10 = i0.a.k(ppVar.getThemedColor(i12), 76);
            m6Var.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        p6 p6Var = ppVar.f29681a0;
        if (p6Var != null) {
            p6Var.setTextColor(ppVar.getThemedColor(i12));
        }
        ppVar.setBackgroundColor(ppVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20889h5));
    }

    @Override
    public final void b() {
    }
}
