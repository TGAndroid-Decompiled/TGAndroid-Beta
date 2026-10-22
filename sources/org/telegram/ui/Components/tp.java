package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class tp implements org.telegram.ui.ActionBar.i6 {
    public boolean f30643a = false;
    public final wp f30644b;

    public tp(wp wpVar) {
        this.f30644b = wpVar;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        wp wpVar = this.f30644b;
        up upVar = wpVar.h;
        if (f7 == 0.0f && !this.f30643a) {
            if (upVar != null && (arrayList = upVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((vp) obj).f31855c = wpVar.N ? 1 : 0;
                }
            }
            if (!wpVar.P) {
                for (int i11 = 0; i11 < upVar.h(); i11++) {
                    ((vp) upVar.d.get(i11)).getClass();
                }
            }
            this.f30643a = true;
        }
        vj0 vj0Var = wpVar.F;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        vj0Var.setColorFilter(new PorterDuffColorFilter(wpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        wpVar.setOverlayNavBarColor(wpVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7));
        if (wpVar.P) {
            for (int i13 = 0; i13 < upVar.h(); i13++) {
                ((vp) upVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.f30643a) {
            wpVar.P = false;
            this.f30643a = false;
        }
        wpVar.E();
        ah.v vVar = wpVar.Z;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = wpVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6);
            int o10 = i0.a.o(wpVar.getThemedColor(i12), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor, o10, o10));
        }
        q6 q6Var = wpVar.f32207a0;
        if (q6Var != null) {
            q6Var.setTextColor(wpVar.getThemedColor(i12));
        }
        wpVar.setBackgroundColor(wpVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21064h5));
    }

    @Override
    public final void b() {
    }
}
