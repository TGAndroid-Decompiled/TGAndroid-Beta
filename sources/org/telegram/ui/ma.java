package org.telegram.ui;

import android.graphics.RectF;
public final class ma implements org.telegram.messenger.kr {
    public final int f47626a;
    public final Object f47627b;

    public ma(Object obj, int i3) {
        this.f47626a = i3;
        this.f47627b = obj;
    }

    @Override
    public final void a(int i3) {
        gq0 gq0Var;
        int i10 = this.f47626a;
        Object obj = this.f47627b;
        switch (i10) {
            case 0:
                ((kb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.E != null && (gq0Var = photoViewer.f41420f0) != null && i3 > 0) {
                    org.telegram.ui.Components.fc.F(gq0Var, true).j();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.T6;
                if (i3 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f41751e1));
                return;
            default:
                m91 m91Var = ((t81) obj).f49739a;
                if (i3 == 0) {
                    m91Var.S0(false);
                    return;
                } else {
                    m91Var.finishFragment();
                    return;
                }
        }
    }
}
