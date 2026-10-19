package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class kj implements org.telegram.ui.Components.yo {
    public final qn f38616a;

    public kj(qn qnVar) {
        this.f38616a = qnVar;
    }

    @Override
    public final void dismiss() {
        this.f38616a.f40695h0.M(null, null);
    }

    @Override
    public final void n() {
        qn qnVar = this.f38616a;
        qnVar.fc(true);
        org.telegram.ui.Components.xc.A(qnVar, qnVar.getMessagesController().isDialogMuted(qnVar.T5, qnVar.d()), qnVar.f40667ea).j();
    }

    @Override
    public final void o() {
        qn qnVar = this.f38616a;
        if (qnVar.T5 != 0 && qnVar.R3 != 3) {
            if (qnVar.f40670f != null) {
                qnVar.getMessagesController().putUser(qnVar.f40670f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", qnVar.T5);
            if (qnVar.d() != 0) {
                bundle.putLong("topic_id", qnVar.d());
            }
            qnVar.presentFragment(new z01(bundle, qnVar.f40667ea));
        }
    }

    @Override
    public final void t() {
        int i10;
        qn qnVar = this.f38616a;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.T5, qnVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.T5, qnVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(qnVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, qnVar, qnVar.getResourceProvider()).j();
        }
        qnVar.Tc(false);
    }

    @Override
    public final void x(int i10) {
        qn qnVar = this.f38616a;
        if (i10 == 0) {
            if (qnVar.getMessagesController().isDialogMuted(qnVar.T5, qnVar.d())) {
                qnVar.fc(true);
            }
            if (org.telegram.ui.Components.xc.a(qnVar)) {
                org.telegram.ui.Components.xc.z(qnVar, 4, i10, qnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        qnVar.getNotificationsController().muteUntil(qnVar.T5, qnVar.d(), i10);
        if (org.telegram.ui.Components.xc.a(qnVar)) {
            org.telegram.ui.Components.xc.z(qnVar, 5, i10, qnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
