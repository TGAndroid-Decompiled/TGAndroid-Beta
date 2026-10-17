package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ku extends org.telegram.ui.Components.u81 {
    public final nu f38683a;

    public ku(nu nuVar) {
        this.f38683a = nuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        ju juVar = (ju) view;
        juVar.W2 = i10;
        juVar.f38339d3.clear();
        if (juVar.x1(6) + juVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        juVar.f38346k3 = z10;
        juVar.A1();
        juVar.B1(false);
        juVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        nu nuVar = this.f38683a;
        return new ju(nuVar, nuVar.getParentActivity());
    }

    @Override
    public final int e() {
        return 4;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
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
