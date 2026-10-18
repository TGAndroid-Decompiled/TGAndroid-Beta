package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class mj implements org.telegram.ui.Components.yo {
    public final sn f39186a;

    public mj(sn snVar) {
        this.f39186a = snVar;
    }

    @Override
    public final void dismiss() {
        this.f39186a.f41219h0.M(null, null);
    }

    @Override
    public final void n() {
        sn snVar = this.f39186a;
        snVar.fc(true);
        org.telegram.ui.Components.xc.A(snVar, snVar.getMessagesController().isDialogMuted(snVar.T5, snVar.d()), snVar.f41191ea).j();
    }

    @Override
    public final void p() {
        sn snVar = this.f39186a;
        if (snVar.T5 != 0 && snVar.R3 != 3) {
            if (snVar.f41194f != null) {
                snVar.getMessagesController().putUser(snVar.f41194f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", snVar.T5);
            if (snVar.d() != 0) {
                bundle.putLong("topic_id", snVar.d());
            }
            snVar.presentFragment(new b11(bundle, snVar.f41191ea));
        }
    }

    @Override
    public final void t() {
        int i10;
        sn snVar = this.f39186a;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.T5, snVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.T5, snVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, snVar, snVar.getResourceProvider()).j();
        }
        snVar.Tc(false);
    }

    @Override
    public final void y(int i10) {
        sn snVar = this.f39186a;
        if (i10 == 0) {
            if (snVar.getMessagesController().isDialogMuted(snVar.T5, snVar.d())) {
                snVar.fc(true);
            }
            if (org.telegram.ui.Components.xc.a(snVar)) {
                org.telegram.ui.Components.xc.z(snVar, 4, i10, snVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        snVar.getNotificationsController().muteUntil(snVar.T5, snVar.d(), i10);
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.z(snVar, 5, i10, snVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
