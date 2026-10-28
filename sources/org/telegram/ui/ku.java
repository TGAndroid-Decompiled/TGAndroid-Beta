package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ku extends org.telegram.ui.Components.n91 {
    public final nu f40916a;

    public ku(nu nuVar) {
        this.f40916a = nuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        ju juVar = (ju) view;
        juVar.f40597g3 = i10;
        juVar.f40604n3.clear();
        if (juVar.C1(6) + juVar.E1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        juVar.f40611u3 = z10;
        juVar.F1();
        juVar.G1(false);
        juVar.v0(0);
    }

    @Override
    public final View d(int i10) {
        nu nuVar = this.f40916a;
        ju juVar = new ju(nuVar, nuVar.getParentActivity());
        nuVar.e.add(juVar);
        return juVar;
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
