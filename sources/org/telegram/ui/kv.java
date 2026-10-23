package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class kv implements MessagesStorage.IntCallback {
    public final int f38677a;
    public final cy f38678b;

    public kv(cy cyVar, int i10) {
        this.f38677a = i10;
        this.f38678b = cyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f38677a) {
            case 0:
                cy cyVar = this.f38678b;
                cyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", cyVar.U1).apply();
                cyVar.h3(false);
                return;
            default:
                cy cyVar2 = this.f38678b;
                cyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", cyVar2.U1).commit();
                cyVar2.h3(false);
                return;
        }
    }
}
