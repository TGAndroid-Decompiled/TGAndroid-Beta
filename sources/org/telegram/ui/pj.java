package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class pj implements org.telegram.ui.Components.ro {
    public final yn f39509a;

    public pj(yn ynVar) {
        this.f39509a = ynVar;
    }

    @Override
    public final void dismiss() {
        this.f39509a.f43328f0.M(null, null);
    }

    @Override
    public final void k() {
        yn ynVar = this.f39509a;
        ynVar.ac(true);
        org.telegram.ui.Components.yc.A(ynVar, ynVar.getMessagesController().isDialogMuted(ynVar.R5, ynVar.d()), ynVar.f43300ca).j();
    }

    @Override
    public final void l() {
        yn ynVar = this.f39509a;
        if (ynVar.R5 != 0 && ynVar.P3 != 3) {
            if (ynVar.f43327f != null) {
                ynVar.getMessagesController().putUser(ynVar.f43327f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", ynVar.R5);
            if (ynVar.d() != 0) {
                bundle.putLong("topic_id", ynVar.d());
            }
            ynVar.presentFragment(new p11(bundle, ynVar.f43300ca));
        }
    }

    @Override
    public final void r() {
        int i10;
        yn ynVar = this.f39509a;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(ynVar.R5, ynVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(ynVar.R5, ynVar.d()), z11).apply();
        if (org.telegram.ui.Components.yc.a(ynVar)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, ynVar, ynVar.getResourceProvider()).j();
        }
        ynVar.Oc(false);
    }

    @Override
    public final void t(int i10) {
        yn ynVar = this.f39509a;
        if (i10 == 0) {
            if (ynVar.getMessagesController().isDialogMuted(ynVar.R5, ynVar.d())) {
                ynVar.ac(true);
            }
            if (org.telegram.ui.Components.yc.a(ynVar)) {
                org.telegram.ui.Components.yc.z(ynVar, 4, i10, ynVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        ynVar.getNotificationsController().muteUntil(ynVar.R5, ynVar.d(), i10);
        if (org.telegram.ui.Components.yc.a(ynVar)) {
            org.telegram.ui.Components.yc.z(ynVar, 5, i10, ynVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
