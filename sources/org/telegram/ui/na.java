package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.sr {
    public final int f48165a;
    public final Object f48166b;

    public na(Object obj, int i7) {
        this.f48165a = i7;
        this.f48166b = obj;
    }

    @Override
    public final void a(int i7) {
        sq0 sq0Var;
        int i10 = this.f48165a;
        Object obj = this.f48166b;
        switch (i10) {
            case 0:
                ((mb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (sq0Var = photoViewer.f41382e0) != null && i7 > 0) {
                    org.telegram.ui.Components.gc.F(sq0Var, true).j();
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
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f41714d1));
                return;
            default:
                z91 z91Var = ((f91) obj).f45663a;
                if (i7 == 0) {
                    z91Var.S0(false);
                    return;
                } else {
                    z91Var.finishFragment();
                    return;
                }
        }
    }
}
