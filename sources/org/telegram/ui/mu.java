package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mu extends org.telegram.ui.Components.q71 {
    public final pu f40635a;

    public mu(pu puVar) {
        this.f40635a = puVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        lu luVar = (lu) view;
        luVar.U2 = i10;
        luVar.f40280b3.clear();
        if (luVar.w1(6) + luVar.y1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        luVar.f40286i3 = z10;
        luVar.z1();
        luVar.A1(false);
        luVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        pu puVar = this.f40635a;
        return new lu(puVar, puVar.getParentActivity());
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
