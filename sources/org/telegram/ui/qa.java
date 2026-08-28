package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class qa implements MessagesStorage.IntCallback {
    public final int f41730a;
    public final Object f41731b;

    public qa(Object obj, int i9) {
        this.f41730a = i9;
        this.f41731b = obj;
    }

    @Override
    public final void run(int i9) {
        tt0 tt0Var;
        int i10 = this.f41730a;
        Object obj = this.f41731b;
        switch (i10) {
            case 0:
                ((pb) obj).V0(true);
                return;
            case 1:
                qn qnVar = ((cn) obj).f37236a;
                if (i9 > 0 && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.oc.a0(qnVar).m(org.telegram.ui.Components.nc.E, i9, 0, 0, qnVar.f41848aa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).k0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f35797y != null && (tt0Var = photoViewer.f35580a0) != null && i9 > 0) {
                    org.telegram.ui.Components.oc.F(tt0Var, true).j();
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i9 == 1) {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.F1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f35920a1));
                return;
            default:
                we1 we1Var = ((ae1) obj).f36468a;
                if (i9 == 0) {
                    we1Var.O0(false);
                    return;
                } else {
                    we1Var.finishFragment();
                    return;
                }
        }
    }
}
