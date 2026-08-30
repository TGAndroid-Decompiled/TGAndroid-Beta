package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class nj implements org.telegram.ui.Components.ko {
    public final xn f36675a;

    public nj(xn xnVar) {
        this.f36675a = xnVar;
    }

    @Override
    public final void dismiss() {
        this.f36675a.f39997e0.M(null, null);
    }

    @Override
    public final void r() {
        xn xnVar = this.f36675a;
        xnVar.bc(true);
        org.telegram.ui.Components.qc.A(xnVar, xnVar.getMessagesController().isDialogMuted(xnVar.Q5, xnVar.b()), xnVar.f39968ba).j();
    }

    @Override
    public final void s() {
        xn xnVar = this.f36675a;
        if (xnVar.Q5 != 0 && xnVar.O3 != 3) {
            if (xnVar.f40009f != null) {
                xnVar.getMessagesController().putUser(xnVar.f40009f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", xnVar.Q5);
            if (xnVar.b() != 0) {
                bundle.putLong("topic_id", xnVar.b());
            }
            xnVar.presentFragment(new e11(bundle, xnVar.f39968ba));
        }
    }

    @Override
    public final void v() {
        int i10;
        xn xnVar = this.f36675a;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.Q5, xnVar.b()), true);
        boolean z10 = !z4 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.Q5, xnVar.b()), z10).apply();
        if (org.telegram.ui.Components.qc.a(xnVar)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, xnVar, xnVar.getResourceProvider()).j();
        }
        xnVar.Pc(false);
    }

    @Override
    public final void x(int i10) {
        xn xnVar = this.f36675a;
        if (i10 == 0) {
            if (xnVar.getMessagesController().isDialogMuted(xnVar.Q5, xnVar.b())) {
                xnVar.bc(true);
            }
            if (org.telegram.ui.Components.qc.a(xnVar)) {
                org.telegram.ui.Components.qc.z(xnVar, 4, i10, xnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        xnVar.getNotificationsController().muteUntil(xnVar.Q5, xnVar.b(), i10);
        if (org.telegram.ui.Components.qc.a(xnVar)) {
            org.telegram.ui.Components.qc.z(xnVar, 5, i10, xnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
    }
}
