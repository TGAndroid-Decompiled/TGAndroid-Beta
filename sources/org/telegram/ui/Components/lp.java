package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class lp implements org.telegram.ui.ActionBar.i6 {
    public boolean f26057a = false;
    public final op f26058b;

    public lp(op opVar) {
        this.f26058b = opVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        op opVar = this.f26058b;
        mp mpVar = opVar.h;
        if (f7 == 0.0f && !this.f26057a) {
            if (mpVar != null && (arrayList = mpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((np) obj).f26846c = opVar.N ? 1 : 0;
                }
            }
            if (!opVar.P) {
                for (int i11 = 0; i11 < mpVar.h(); i11++) {
                    ((np) mpVar.d.get(i11)).getClass();
                }
            }
            this.f26057a = true;
        }
        kj0 kj0Var = opVar.F;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        kj0Var.setColorFilter(new PorterDuffColorFilter(opVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        opVar.setOverlayNavBarColor(opVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19004a7));
        if (opVar.P) {
            for (int i13 = 0; i13 < mpVar.h(); i13++) {
                ((np) mpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f26057a) {
            opVar.P = false;
            this.f26057a = false;
        }
        opVar.E();
        ci.m6 m6Var = opVar.Z;
        if (m6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = opVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6);
            int k10 = i0.a.k(opVar.getThemedColor(i12), 76);
            m6Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        p6 p6Var = opVar.f27138a0;
        if (p6Var != null) {
            p6Var.setTextColor(opVar.getThemedColor(i12));
        }
        opVar.setBackgroundColor(opVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5));
    }

    @Override
    public final void b() {
    }
}
