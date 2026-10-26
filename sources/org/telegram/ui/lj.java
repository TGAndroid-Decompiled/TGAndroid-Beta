package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class lj implements org.telegram.ui.Components.ap {
    public final un f41290a;

    public lj(un unVar) {
        this.f41290a = unVar;
    }

    @Override
    public final void dismiss() {
        this.f41290a.f44269h0.U(null, null);
    }

    @Override
    public final void n() {
        un unVar = this.f41290a;
        unVar.nc(true);
        org.telegram.ui.Components.wc.A(unVar, unVar.getMessagesController().isDialogMuted(unVar.f44252f6, unVar.b()), unVar.f44388qa).j();
    }

    @Override
    public final void o() {
        un unVar = this.f41290a;
        if (unVar.f44252f6 != 0 && unVar.f44224d4 != 3) {
            if (unVar.f44245f != null) {
                unVar.getMessagesController().putUser(unVar.f44245f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", unVar.f44252f6);
            if (unVar.b() != 0) {
                bundle.putLong("topic_id", unVar.b());
            }
            unVar.presentFragment(new h11(bundle, unVar.f44388qa));
        }
    }

    @Override
    public final void r() {
        int i10;
        un unVar = this.f41290a;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(unVar.f44252f6, unVar.b()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(unVar.f44252f6, unVar.b()), z11).apply();
        if (org.telegram.ui.Components.wc.a(unVar)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.cd(false);
    }

    @Override
    public final void u(int i10) {
        un unVar = this.f41290a;
        if (i10 == 0) {
            if (unVar.getMessagesController().isDialogMuted(unVar.f44252f6, unVar.b())) {
                unVar.nc(true);
            }
            if (org.telegram.ui.Components.wc.a(unVar)) {
                org.telegram.ui.Components.wc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        unVar.getNotificationsController().muteUntil(unVar.f44252f6, unVar.b(), i10);
        if (org.telegram.ui.Components.wc.a(unVar)) {
            org.telegram.ui.Components.wc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
