package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

public final class hj implements org.telegram.ui.Components.bo {

    public final rn f38849a;

    public hj(rn rnVar) {
        this.f38849a = rnVar;
    }

    @Override
    public final void dismiss() {
        this.f38849a.f42013d0.M(null, null);
    }

    @Override
    public final void m() {
        rn rnVar = this.f38849a;
        rnVar.bc(true);
        org.telegram.ui.Components.mc.A(rnVar, rnVar.getMessagesController().isDialogMuted(rnVar.P5, rnVar.b()), rnVar.f41983aa).j();
    }

    @Override
    public final void o() {
        rn rnVar = this.f38849a;
        if (rnVar.P5 == 0 || rnVar.N3 == 3) {
            return;
        }
        if (rnVar.f42039f != null) {
            rnVar.getMessagesController().putUser(rnVar.f42039f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", rnVar.P5);
        if (rnVar.b() != 0) {
            bundle.putLong("topic_id", rnVar.b());
        }
        rnVar.presentFragment(new t01(bundle, rnVar.f41983aa));
    }

    @Override
    public final void u() {
        rn rnVar = this.f38849a;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(rnVar.P5, rnVar.b()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(rnVar.P5, rnVar.b()), z11).apply();
        if (org.telegram.ui.Components.mc.a(rnVar)) {
            org.telegram.ui.Components.mc.S(z10 ? 1 : 0, rnVar, rnVar.getResourceProvider()).j();
        }
        rnVar.Pc(false);
    }

    @Override
    public final void v(int i10) {
        rn rnVar = this.f38849a;
        if (i10 != 0) {
            rnVar.getNotificationsController().muteUntil(rnVar.P5, rnVar.b(), i10);
            if (org.telegram.ui.Components.mc.a(rnVar)) {
                org.telegram.ui.Components.mc.z(rnVar, 5, i10, rnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (rnVar.getMessagesController().isDialogMuted(rnVar.P5, rnVar.b())) {
            rnVar.bc(true);
        }
        if (org.telegram.ui.Components.mc.a(rnVar)) {
            org.telegram.ui.Components.mc.z(rnVar, 4, i10, rnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void k() {
    }
}
