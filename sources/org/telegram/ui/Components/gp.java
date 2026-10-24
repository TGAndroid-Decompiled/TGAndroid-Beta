package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gp implements org.telegram.ui.ActionBar.s6 {
    public boolean f26739a = false;
    public final up f26740b;

    public gp(up upVar) {
        this.f26740b = upVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        up upVar = this.f26740b;
        sp spVar = upVar.h;
        if (f7 == 0.0f && !this.f26739a) {
            if (spVar != null && (arrayList = spVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((tp) obj).f30873c = upVar.M ? 1 : 0;
                }
            }
            if (!upVar.O) {
                for (int i11 = 0; i11 < spVar.h(); i11++) {
                    ((tp) spVar.d.get(i11)).getClass();
                }
            }
            this.f26739a = true;
        }
        xj0 xj0Var = upVar.E;
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = upVar.getThemedColor(i12);
        upVar.f31186j0 = themedColor;
        xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        upVar.setOverlayNavBarColor(upVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7));
        if (upVar.O) {
            for (int i13 = 0; i13 < spVar.h(); i13++) {
                ((tp) spVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f26739a) {
            upVar.O = false;
            this.f26739a = false;
        }
        upVar.K();
        ah.v vVar = upVar.Y;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor2 = upVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6);
            int o10 = i0.a.o(upVar.getThemedColor(i12), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor2, o10, o10));
        }
        o6 o6Var = upVar.Z;
        if (o6Var != null) {
            o6Var.setTextColor(upVar.getThemedColor(i12));
        }
        int themedColor3 = upVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        upVar.f31187k0 = themedColor3;
        upVar.setBackgroundColor(themedColor3);
    }

    @Override
    public final void b() {
        this.f26740b.y();
    }
}
