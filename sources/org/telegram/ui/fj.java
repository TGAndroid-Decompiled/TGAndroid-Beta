package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class fj implements org.telegram.ui.Components.eo {
    public final qn f38301a;

    public fj(qn qnVar) {
        this.f38301a = qnVar;
    }

    @Override
    public final void A(int i9) {
        qn qnVar = this.f38301a;
        if (i9 == 0) {
            if (qnVar.getMessagesController().isDialogMuted(qnVar.P5, qnVar.b())) {
                qnVar.bc(true);
            }
            if (org.telegram.ui.Components.oc.a(qnVar)) {
                org.telegram.ui.Components.oc.z(qnVar, 4, i9, qnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        qnVar.getNotificationsController().muteUntil(qnVar.P5, qnVar.b(), i9);
        if (org.telegram.ui.Components.oc.a(qnVar)) {
            org.telegram.ui.Components.oc.z(qnVar, 5, i9, qnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f38301a.f41878d0.M(null, null);
    }

    @Override
    public final void p() {
        qn qnVar = this.f38301a;
        qnVar.bc(true);
        org.telegram.ui.Components.oc.A(qnVar, qnVar.getMessagesController().isDialogMuted(qnVar.P5, qnVar.b()), qnVar.f41848aa).j();
    }

    @Override
    public final void s() {
        qn qnVar = this.f38301a;
        if (qnVar.P5 != 0 && qnVar.N3 != 3) {
            if (qnVar.f41903f != null) {
                qnVar.getMessagesController().putUser(qnVar.f41903f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", qnVar.P5);
            if (qnVar.b() != 0) {
                bundle.putLong("topic_id", qnVar.b());
            }
            qnVar.presentFragment(new s01(bundle, qnVar.f41848aa));
        }
    }

    @Override
    public final void w() {
        int i9;
        qn qnVar = this.f38301a;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.P5, qnVar.b()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.P5, qnVar.b()), z11).apply();
        if (org.telegram.ui.Components.oc.a(qnVar)) {
            org.telegram.ui.Components.oc.S(z10 ? 1 : 0, qnVar, qnVar.getResourceProvider()).j();
        }
        qnVar.Pc(false);
    }

    @Override
    public final void o() {
    }
}
