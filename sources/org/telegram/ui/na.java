package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.nr {
    public final int f50276a;
    public final Object f50277b;

    public na(Object obj, int i7) {
        this.f50276a = i7;
        this.f50277b = obj;
    }

    @Override
    public final void a(int i7) {
        qq0 qq0Var;
        int i10 = this.f50276a;
        Object obj = this.f50277b;
        switch (i10) {
            case 0:
                ((lb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.E != null && (qq0Var = photoViewer.f43334f0) != null && i7 > 0) {
                    org.telegram.ui.Components.kc.F(qq0Var, true).j();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                if (i7 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f43666e1));
                return;
            default:
                w91 w91Var = ((c91) obj).f46748a;
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
