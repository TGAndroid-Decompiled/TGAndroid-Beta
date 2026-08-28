package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class mv implements MessagesStorage.IntCallback {
    public final int f40536a;
    public final dy f40537b;

    public mv(dy dyVar, int i9) {
        this.f40536a = i9;
        this.f40537b = dyVar;
    }

    @Override
    public final void run(int i9) {
        boolean z10;
        boolean z11;
        switch (this.f40536a) {
            case 0:
                dy dyVar = this.f40537b;
                dyVar.getClass();
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dyVar.Q1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", dyVar.Q1).apply();
                dyVar.k3(false);
                return;
            default:
                dy dyVar2 = this.f40537b;
                dyVar2.getClass();
                if (i9 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dyVar2.Q1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", dyVar2.Q1).commit();
                dyVar2.k3(false);
                return;
        }
    }
}
