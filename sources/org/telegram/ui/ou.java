package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ou extends org.telegram.ui.Components.g71 {

    public final ru f41168a;

    public ou(ru ruVar) {
        this.f41168a = ruVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        nu nuVar = (nu) view;
        nuVar.U2 = i10;
        nuVar.f40930b3.clear();
        nuVar.f40937i3 = nuVar.w1(6) + nuVar.y1(6) <= 0;
        nuVar.z1();
        nuVar.A1(false);
        nuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        ru ruVar = this.f41168a;
        return new nu(ruVar, ruVar.getParentActivity());
    }

    @Override
    public final int e() {
        return 4;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.NetworkUsageAllTab);
        }
        if (i10 == 1) {
            return LocaleController.getString(R.string.NetworkUsageMobileTab);
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab);
        }
        return LocaleController.getString(R.string.NetworkUsageWiFiTab);
    }
}
