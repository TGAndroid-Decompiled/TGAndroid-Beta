package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class aw implements MessagesStorage.IntCallback {
    public final int f35984a;
    public final vy f35985b;

    public aw(vy vyVar, int i10) {
        this.f35984a = i10;
        this.f35985b = vyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f35984a) {
            case 0:
                vy vyVar = this.f35985b;
                vyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", vyVar.U1).apply();
                vyVar.h3(false);
                return;
            default:
                vy vyVar2 = this.f35985b;
                vyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", vyVar2.U1).commit();
                vyVar2.h3(false);
                return;
        }
    }
}
