package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lu extends org.telegram.ui.Components.e71 {
    public final ou f40231a;

    public lu(ou ouVar) {
        this.f40231a = ouVar;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        boolean z10;
        ku kuVar = (ku) view;
        kuVar.U2 = i9;
        kuVar.f39921b3.clear();
        if (kuVar.w1(6) + kuVar.y1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kuVar.f39928i3 = z10;
        kuVar.z1();
        kuVar.A1(false);
        kuVar.u0(0);
    }

    @Override
    public final View d(int i9) {
        ou ouVar = this.f40231a;
        return new ku(ouVar, ouVar.getParentActivity());
    }

    @Override
    public final int e() {
        return 4;
    }

    @Override
    public final CharSequence g(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return "";
                    }
                    return LocaleController.getString(R.string.NetworkUsageRoamingTab);
                }
                return LocaleController.getString(R.string.NetworkUsageWiFiTab);
            }
            return LocaleController.getString(R.string.NetworkUsageMobileTab);
        }
        return LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
