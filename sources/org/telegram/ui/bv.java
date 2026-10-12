package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bv extends org.telegram.ui.Components.c91 {
    public final ev f34631a;

    public bv(ev evVar) {
        this.f34631a = evVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        av avVar = (av) view;
        avVar.W2 = i10;
        avVar.f34349d3.clear();
        if (avVar.x1(6) + avVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        avVar.f34356k3 = z10;
        avVar.A1();
        avVar.B1(false);
        avVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        ev evVar = this.f34631a;
        return new av(evVar, evVar.getParentActivity());
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
