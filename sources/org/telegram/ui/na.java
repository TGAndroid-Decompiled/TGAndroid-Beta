package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.sr {
    public final int f48008a;
    public final Object f48009b;

    public na(Object obj, int i7) {
        this.f48008a = i7;
        this.f48009b = obj;
    }

    @Override
    public final void a(int i7) {
        pq0 pq0Var;
        int i10 = this.f48008a;
        Object obj = this.f48009b;
        switch (i10) {
            case 0:
                ((mb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (pq0Var = photoViewer.f41384e0) != null && i7 > 0) {
                    org.telegram.ui.Components.hc.F(pq0Var, true).j();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                if (i7 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.I1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f41716d1));
                return;
            default:
                w91 w91Var = ((d91) obj).f45033a;
                if (i7 == 0) {
                    w91Var.S0(false);
                    return;
                } else {
                    w91Var.finishFragment();
                    return;
                }
        }
    }
}
