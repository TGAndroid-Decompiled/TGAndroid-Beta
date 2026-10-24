package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lu extends org.telegram.ui.Components.d91 {
    public final ou f39380a;

    public lu(ou ouVar) {
        this.f39380a = ouVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        ku kuVar = (ku) view;
        kuVar.Z2 = i10;
        kuVar.f39042g3.clear();
        if (kuVar.C1(6) + kuVar.E1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kuVar.f39049n3 = z10;
        kuVar.F1();
        kuVar.G1(false);
        kuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        ou ouVar = this.f39380a;
        return new ku(ouVar, ouVar.getParentActivity());
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
