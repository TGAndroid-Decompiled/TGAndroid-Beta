package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.sr {
    public final int f48001a;
    public final Object f48002b;

    public na(Object obj, int i7) {
        this.f48001a = i7;
        this.f48002b = obj;
    }

    @Override
    public final void a(int i7) {
        pq0 pq0Var;
        int i10 = this.f48001a;
        Object obj = this.f48002b;
        switch (i10) {
            case 0:
                ((mb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (pq0Var = photoViewer.f41381e0) != null && i7 > 0) {
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
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f41713d1));
                return;
            default:
                v91 v91Var = ((c91) obj).f44728a;
                if (i7 == 0) {
                    v91Var.S0(false);
                    return;
                } else {
                    v91Var.finishFragment();
                    return;
                }
        }
    }
}
