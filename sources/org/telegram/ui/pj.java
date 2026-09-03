package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class pj implements org.telegram.ui.Components.jo {
    public final zn f37173a;

    public pj(zn znVar) {
        this.f37173a = znVar;
    }

    @Override
    public final void dismiss() {
        this.f37173a.f40563e0.M(null, null);
    }

    @Override
    public final void k() {
        zn znVar = this.f37173a;
        znVar.bc(true);
        org.telegram.ui.Components.qc.A(znVar, znVar.getMessagesController().isDialogMuted(znVar.Q5, znVar.d()), znVar.f40534ba).j();
    }

    @Override
    public final void l() {
        zn znVar = this.f37173a;
        if (znVar.Q5 != 0 && znVar.O3 != 3) {
            if (znVar.f40575f != null) {
                znVar.getMessagesController().putUser(znVar.f40575f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", znVar.Q5);
            if (znVar.d() != 0) {
                bundle.putLong("topic_id", znVar.d());
            }
            znVar.presentFragment(new l11(bundle, znVar.f40534ba));
        }
    }

    @Override
    public final void o() {
        int i10;
        zn znVar = this.f37173a;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.Q5, znVar.d()), true);
        boolean z10 = !z4 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.Q5, znVar.d()), z10).apply();
        if (org.telegram.ui.Components.qc.a(znVar)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, znVar, znVar.getResourceProvider()).j();
        }
        znVar.Pc(false);
    }

    @Override
    public final void s(int i10) {
        zn znVar = this.f37173a;
        if (i10 == 0) {
            if (znVar.getMessagesController().isDialogMuted(znVar.Q5, znVar.d())) {
                znVar.bc(true);
            }
            if (org.telegram.ui.Components.qc.a(znVar)) {
                org.telegram.ui.Components.qc.z(znVar, 4, i10, znVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        znVar.getNotificationsController().muteUntil(znVar.Q5, znVar.d(), i10);
        if (org.telegram.ui.Components.qc.a(znVar)) {
            org.telegram.ui.Components.qc.z(znVar, 5, i10, znVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
