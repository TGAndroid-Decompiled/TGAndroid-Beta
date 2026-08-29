package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class ij implements org.telegram.ui.Components.io {
    public final tn f39279a;

    public ij(tn tnVar) {
        this.f39279a = tnVar;
    }

    @Override
    public final void dismiss() {
        this.f39279a.f42775d0.M(null, null);
    }

    @Override
    public final void k() {
        tn tnVar = this.f39279a;
        tnVar.bc(true);
        org.telegram.ui.Components.tc.A(tnVar, tnVar.getMessagesController().isDialogMuted(tnVar.P5, tnVar.b()), tnVar.f42746aa).j();
    }

    @Override
    public final void l() {
        tn tnVar = this.f39279a;
        if (tnVar.P5 != 0 && tnVar.N3 != 3) {
            if (tnVar.f42801f != null) {
                tnVar.getMessagesController().putUser(tnVar.f42801f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", tnVar.P5);
            if (tnVar.b() != 0) {
                bundle.putLong("topic_id", tnVar.b());
            }
            tnVar.presentFragment(new t01(bundle, tnVar.f42746aa));
        }
    }

    @Override
    public final void u() {
        int i10;
        tn tnVar = this.f39279a;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(tnVar.P5, tnVar.b()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(tnVar.P5, tnVar.b()), z11).apply();
        if (org.telegram.ui.Components.tc.a(tnVar)) {
            org.telegram.ui.Components.tc.S(z10 ? 1 : 0, tnVar, tnVar.getResourceProvider()).j();
        }
        tnVar.Pc(false);
    }

    @Override
    public final void w(int i10) {
        tn tnVar = this.f39279a;
        if (i10 == 0) {
            if (tnVar.getMessagesController().isDialogMuted(tnVar.P5, tnVar.b())) {
                tnVar.bc(true);
            }
            if (org.telegram.ui.Components.tc.a(tnVar)) {
                org.telegram.ui.Components.tc.z(tnVar, 4, i10, tnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        tnVar.getNotificationsController().muteUntil(tnVar.P5, tnVar.b(), i10);
        if (org.telegram.ui.Components.tc.a(tnVar)) {
            org.telegram.ui.Components.tc.z(tnVar, 5, i10, tnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
