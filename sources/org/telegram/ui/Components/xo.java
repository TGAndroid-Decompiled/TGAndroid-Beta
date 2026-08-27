package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class xo implements org.telegram.ui.ActionBar.h6 {

    public boolean f34661a = false;

    public final ap f34662b;

    public xo(ap apVar) {
        this.f34662b = apVar;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        ap apVar = this.f34662b;
        yo yoVar = apVar.h;
        if (f10 == 0.0f && !this.f34661a) {
            if (yoVar != null && (arrayList = yoVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zo) obj).f35318c = apVar.J ? 1 : 0;
                }
            }
            if (!apVar.L) {
                for (int i11 = 0; i11 < yoVar.h(); i11++) {
                    ((zo) yoVar.d.get(i11)).getClass();
                }
            }
            this.f34661a = true;
        }
        oi0 oi0Var = apVar.B;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        oi0Var.setColorFilter(new PorterDuffColorFilter(apVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        apVar.setOverlayNavBarColor(apVar.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        if (apVar.L) {
            for (int i13 = 0; i13 < yoVar.h(); i13++) {
                ((zo) yoVar.d.get(i13)).getClass();
            }
        }
        if (f10 == 1.0f && this.f34661a) {
            apVar.L = false;
            this.f34661a = false;
        }
        apVar.E();
        ag.y1 y1Var = apVar.V;
        if (y1Var != null) {
            int iDp = AndroidUtilities.dp(0.0f);
            int themedColor = apVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6);
            int iK = i0.b.k(apVar.getThemedColor(i12), 76);
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, themedColor, iK, iK));
        }
        j6 j6Var = apVar.W;
        if (j6Var != null) {
            j6Var.setTextColor(apVar.getThemedColor(i12));
        }
        apVar.setBackgroundColor(apVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
    }

    @Override
    public final void b() {
    }
}
