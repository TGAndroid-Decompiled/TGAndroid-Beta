package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iu extends org.telegram.ui.Components.w81 {
    public final lu f38117a;

    public iu(lu luVar) {
        this.f38117a = luVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        hu huVar = (hu) view;
        huVar.W2 = i10;
        huVar.f37796d3.clear();
        if (huVar.x1(6) + huVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        huVar.f37803k3 = z10;
        huVar.A1();
        huVar.B1(false);
        huVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        lu luVar = this.f38117a;
        return new hu(luVar, luVar.getParentActivity());
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
