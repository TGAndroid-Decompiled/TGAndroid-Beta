package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class dp implements org.telegram.ui.ActionBar.h6 {
    public boolean f27822a = false;
    public final gp f27823b;

    public dp(gp gpVar) {
        this.f27823b = gpVar;
    }

    @Override
    public final void a(float f9) {
        ArrayList arrayList;
        gp gpVar = this.f27823b;
        ep epVar = gpVar.h;
        if (f9 == 0.0f && !this.f27822a) {
            if (epVar != null && (arrayList = epVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((fp) obj).f28514c = gpVar.J ? 1 : 0;
                }
            }
            if (!gpVar.L) {
                for (int i11 = 0; i11 < epVar.h(); i11++) {
                    ((fp) epVar.d.get(i11)).getClass();
                }
            }
            this.f27822a = true;
        }
        xi0 xi0Var = gpVar.B;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        xi0Var.setColorFilter(new PorterDuffColorFilter(gpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        gpVar.setOverlayNavBarColor(gpVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        if (gpVar.L) {
            for (int i13 = 0; i13 < epVar.h(); i13++) {
                ((fp) epVar.d.get(i13)).getClass();
            }
        }
        if (f9 == 1.0f && this.f27822a) {
            gpVar.L = false;
            this.f27822a = false;
        }
        gpVar.D();
        bg.d1 d1Var = gpVar.V;
        if (d1Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = gpVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6);
            int k9 = i0.a.k(gpVar.getThemedColor(i12), 76);
            d1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor, k9, k9));
        }
        o6 o6Var = gpVar.W;
        if (o6Var != null) {
            o6Var.setTextColor(gpVar.getThemedColor(i12));
        }
        gpVar.setBackgroundColor(gpVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
    }

    @Override
    public final void b() {
    }
}
