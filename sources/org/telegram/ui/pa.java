package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class pa implements MessagesStorage.IntCallback {
    public final int f41343a;
    public final Object f41344b;

    public pa(Object obj, int i10) {
        this.f41343a = i10;
        this.f41344b = obj;
    }

    @Override
    public final void run(int i10) {
        rt0 rt0Var;
        int i11 = this.f41343a;
        Object obj = this.f41344b;
        switch (i11) {
            case 0:
                ((ob) obj).V0(true);
                return;
            case 1:
                tn tnVar = ((fn) obj).f38212a;
                if (i10 > 0 && tnVar.getParentActivity() != null && tnVar.fragmentView != null) {
                    org.telegram.ui.Components.tc.a0(tnVar).m(org.telegram.ui.Components.sc.E, i10, 0, 0, tnVar.f42746aa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f35864y != null && (rt0Var = photoViewer.f35647a0) != null && i10 > 0) {
                    org.telegram.ui.Components.tc.F(rt0Var, true).j();
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 == 1) {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.F1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f35986a1));
                return;
            default:
                ze1 ze1Var = ((ce1) obj).f37090a;
                if (i10 == 0) {
                    ze1Var.O0(false);
                    return;
                } else {
                    ze1Var.finishFragment();
                    return;
                }
        }
    }
}
