package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class qj implements org.telegram.ui.Components.qo {
    public final xn f36758a;

    public qj(xn xnVar) {
        this.f36758a = xnVar;
    }

    @Override
    public final void dismiss() {
        this.f36758a.f39777h0.M(null, null);
    }

    @Override
    public final void n() {
        xn xnVar = this.f36758a;
        xnVar.bc(true);
        org.telegram.ui.Components.xc.A(xnVar, xnVar.getMessagesController().isDialogMuted(xnVar.T5, xnVar.d()), xnVar.f39750ea).j();
    }

    @Override
    public final void p() {
        xn xnVar = this.f36758a;
        if (xnVar.T5 != 0 && xnVar.R3 != 3) {
            if (xnVar.f39752f != null) {
                xnVar.getMessagesController().putUser(xnVar.f39752f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", xnVar.T5);
            if (xnVar.d() != 0) {
                bundle.putLong("topic_id", xnVar.d());
            }
            xnVar.presentFragment(new p11(bundle, xnVar.f39750ea));
        }
    }

    @Override
    public final void s() {
        int i10;
        xn xnVar = this.f36758a;
        i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.T5, xnVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.T5, xnVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(xnVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, xnVar, xnVar.getResourceProvider()).j();
        }
        xnVar.Pc(false);
    }

    @Override
    public final void u(int i10) {
        xn xnVar = this.f36758a;
        if (i10 == 0) {
            if (xnVar.getMessagesController().isDialogMuted(xnVar.T5, xnVar.d())) {
                xnVar.bc(true);
            }
            if (org.telegram.ui.Components.xc.a(xnVar)) {
                org.telegram.ui.Components.xc.z(xnVar, 4, i10, xnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        xnVar.getNotificationsController().muteUntil(xnVar.T5, xnVar.d(), i10);
        if (org.telegram.ui.Components.xc.a(xnVar)) {
            org.telegram.ui.Components.xc.z(xnVar, 5, i10, xnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
