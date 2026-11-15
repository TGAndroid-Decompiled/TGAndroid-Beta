package org.telegram.ui;

import android.graphics.RectF;
public final class na implements org.telegram.messenger.pr {
    public final int f49527a;
    public final Object f49528b;

    public na(Object obj, int i7) {
        this.f49527a = i7;
        this.f49528b = obj;
    }

    @Override
    public final void a(int i7) {
        oq0 oq0Var;
        int i10 = this.f49527a;
        Object obj = this.f49528b;
        switch (i10) {
            case 0:
                ((lb) obj).Z0(true);
                return;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.E != null && (oq0Var = photoViewer.f42763f0) != null && i7 > 0) {
                    org.telegram.ui.Components.cc.F(oq0Var, true).j();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                if (i7 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f43094e1));
                return;
            default:
                u91 u91Var = ((a91) obj).f44974a;
                if (i7 == 0) {
                    u91Var.S0(false);
                    return;
                } else {
                    u91Var.finishFragment();
                    return;
                }
        }
    }
}
