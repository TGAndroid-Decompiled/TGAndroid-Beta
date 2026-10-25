package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class kp implements org.telegram.ui.ActionBar.g7 {
    public boolean f29951a = false;
    public final yp f29952b;

    public kp(yp ypVar) {
        this.f29952b = ypVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        yp ypVar = this.f29952b;
        wp wpVar = ypVar.h;
        if (f7 == 0.0f && !this.f29951a) {
            if (wpVar != null && (arrayList = wpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xp) obj).f34792c = ypVar.M ? 1 : 0;
                }
            }
            if (!ypVar.O) {
                for (int i11 = 0; i11 < wpVar.h(); i11++) {
                    ((xp) wpVar.d.get(i11)).getClass();
                }
            }
            this.f29951a = true;
        }
        xj0 xj0Var = ypVar.E;
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = ypVar.getThemedColor(i12);
        ypVar.f35101j0 = themedColor;
        xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        ypVar.setOverlayNavBarColor(ypVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
        if (ypVar.O) {
            for (int i13 = 0; i13 < wpVar.h(); i13++) {
                ((xp) wpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f29951a) {
            ypVar.O = false;
            this.f29951a = false;
        }
        ypVar.K();
        bh.p pVar = ypVar.Y;
        if (pVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor2 = ypVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6);
            int o10 = i0.a.o(ypVar.getThemedColor(i12), 76);
            pVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor2, o10, o10));
        }
        s6 s6Var = ypVar.Z;
        if (s6Var != null) {
            s6Var.setTextColor(ypVar.getThemedColor(i12));
        }
        int themedColor3 = ypVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
        ypVar.f35102k0 = themedColor3;
        ypVar.setBackgroundColor(themedColor3);
    }

    @Override
    public final void b() {
        this.f29952b.x();
    }
}
