package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class oj implements org.telegram.ui.Components.po {
    public final xn f35893a;

    public oj(xn xnVar) {
        this.f35893a = xnVar;
    }

    @Override
    public final void dismiss() {
        this.f35893a.f39396h0.M(null, null);
    }

    @Override
    public final void n() {
        xn xnVar = this.f35893a;
        xnVar.bc(true);
        org.telegram.ui.Components.xc.A(xnVar, xnVar.getMessagesController().isDialogMuted(xnVar.T5, xnVar.d()), xnVar.f39370ea).j();
    }

    @Override
    public final void o() {
        xn xnVar = this.f35893a;
        if (xnVar.T5 != 0 && xnVar.R3 != 3) {
            if (xnVar.f39372f != null) {
                xnVar.getMessagesController().putUser(xnVar.f39372f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", xnVar.T5);
            if (xnVar.d() != 0) {
                bundle.putLong("topic_id", xnVar.d());
            }
            xnVar.presentFragment(new p11(bundle, xnVar.f39370ea));
        }
    }

    @Override
    public final void r() {
        int i10;
        xn xnVar = this.f35893a;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
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
    public final void t(int i10) {
        xn xnVar = this.f35893a;
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
    public final void l() {
    }
}
