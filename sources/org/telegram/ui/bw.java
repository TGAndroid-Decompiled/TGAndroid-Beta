package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class bw implements MessagesStorage.IntCallback {
    public final int f31422a;
    public final wy f31423b;

    public bw(wy wyVar, int i10) {
        this.f31422a = i10;
        this.f31423b = wyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f31422a) {
            case 0:
                wy wyVar = this.f31423b;
                wyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", wyVar.U1).apply();
                wyVar.k3(false);
                return;
            default:
                wy wyVar2 = this.f31423b;
                wyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", wyVar2.U1).commit();
                wyVar2.k3(false);
                return;
        }
    }
}
