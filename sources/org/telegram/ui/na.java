package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.sr {
    public final int f48137a;
    public final Object f48138b;

    public na(Object obj, int i7) {
        this.f48137a = i7;
        this.f48138b = obj;
    }

    @Override
    public final void a(int i7) {
        rq0 rq0Var;
        int i10 = this.f48137a;
        Object obj = this.f48138b;
        switch (i10) {
            case 0:
                ((mb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (rq0Var = photoViewer.f41391e0) != null && i7 > 0) {
                    org.telegram.ui.Components.hc.F(rq0Var, true).j();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                if (i7 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.I1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f41723d1));
                return;
            default:
                y91 y91Var = ((e91) obj).f45342a;
                if (i7 == 0) {
                    y91Var.S0(false);
                    return;
                } else {
                    y91Var.finishFragment();
                    return;
                }
        }
    }
}
