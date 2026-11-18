package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.nr {
    public final int f50137a;
    public final Object f50138b;

    public na(Object obj, int i7) {
        this.f50137a = i7;
        this.f50138b = obj;
    }

    @Override
    public final void a(int i7) {
        qq0 qq0Var;
        int i10 = this.f50137a;
        Object obj = this.f50138b;
        switch (i10) {
            case 0:
                ((lb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.E != null && (qq0Var = photoViewer.f43208f0) != null && i7 > 0) {
                    org.telegram.ui.Components.lc.F(qq0Var, true).j();
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
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f43540e1));
                return;
            default:
                y91 y91Var = ((e91) obj).f47184a;
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
