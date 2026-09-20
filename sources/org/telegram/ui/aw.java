package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class aw implements MessagesStorage.IntCallback {
    public final int f32176a;
    public final uy f32177b;

    public aw(uy uyVar, int i10) {
        this.f32176a = i10;
        this.f32177b = uyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f32176a) {
            case 0:
                uy uyVar = this.f32177b;
                uyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", uyVar.U1).apply();
                uyVar.k3(false);
                return;
            default:
                uy uyVar2 = this.f32177b;
                uyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                uyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", uyVar2.U1).commit();
                uyVar2.k3(false);
                return;
        }
    }
}
