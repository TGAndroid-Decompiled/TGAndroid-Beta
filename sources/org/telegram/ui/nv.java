package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class nv implements MessagesStorage.IntCallback {
    public final int f40907a;
    public final fy f40908b;

    public nv(fy fyVar, int i10) {
        this.f40907a = i10;
        this.f40908b = fyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f40907a) {
            case 0:
                fy fyVar = this.f40908b;
                fyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fyVar.Q1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", fyVar.Q1).apply();
                fyVar.k3(false);
                return;
            default:
                fy fyVar2 = this.f40908b;
                fyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fyVar2.Q1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", fyVar2.Q1).commit();
                fyVar2.k3(false);
                return;
        }
    }
}
