package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

public final class pv implements MessagesStorage.IntCallback {

    public final int f41434a;

    public final gy f41435b;

    public pv(gy gyVar, int i10) {
        this.f41434a = i10;
        this.f41435b = gyVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41434a) {
            case 0:
                gy gyVar = this.f41435b;
                gyVar.getClass();
                gyVar.Q1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", gyVar.Q1).apply();
                gyVar.k3(false);
                break;
            default:
                gy gyVar2 = this.f41435b;
                gyVar2.getClass();
                gyVar2.Q1 = i10 != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", gyVar2.Q1).commit();
                gyVar2.k3(false);
                break;
        }
    }
}
