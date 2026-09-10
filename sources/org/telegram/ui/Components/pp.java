package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class pp implements org.telegram.ui.ActionBar.k6 {
    public boolean f26226a = false;
    public final sp f26227b;

    public pp(sp spVar) {
        this.f26227b = spVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        sp spVar = this.f26227b;
        qp qpVar = spVar.h;
        if (f7 == 0.0f && !this.f26226a) {
            if (qpVar != null && (arrayList = qpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((rp) obj).f26735c = spVar.N ? 1 : 0;
                }
            }
            if (!spVar.P) {
                for (int i11 = 0; i11 < qpVar.h(); i11++) {
                    ((rp) qpVar.d.get(i11)).getClass();
                }
            }
            this.f26226a = true;
        }
        hj0 hj0Var = spVar.F;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        hj0Var.setColorFilter(new PorterDuffColorFilter(spVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        spVar.setOverlayNavBarColor(spVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        if (spVar.P) {
            for (int i13 = 0; i13 < qpVar.h(); i13++) {
                ((rp) qpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f26226a) {
            spVar.P = false;
            this.f26226a = false;
        }
        spVar.D();
        bi.n7 n7Var = spVar.Z;
        if (n7Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = spVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6);
            int k10 = i0.a.k(spVar.getThemedColor(i12), 76);
            n7Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        o6 o6Var = spVar.f27131a0;
        if (o6Var != null) {
            o6Var.setTextColor(spVar.getThemedColor(i12));
        }
        spVar.setBackgroundColor(spVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
    }

    @Override
    public final void b() {
    }
}
