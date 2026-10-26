package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iu extends org.telegram.ui.Components.m91 {
    public final lu f40352a;

    public iu(lu luVar) {
        this.f40352a = luVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        hu huVar = (hu) view;
        huVar.f40071g3 = i10;
        huVar.f40078n3.clear();
        if (huVar.C1(6) + huVar.E1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        huVar.f40085u3 = z10;
        huVar.F1();
        huVar.G1(false);
        huVar.v0(0);
    }

    @Override
    public final View d(int i10) {
        lu luVar = this.f40352a;
        hu huVar = new hu(luVar, luVar.getParentActivity());
        luVar.e.add(huVar);
        return huVar;
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
