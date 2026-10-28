package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class oj implements org.telegram.ui.Components.ap {
    public final wn f42102a;

    public oj(wn wnVar) {
        this.f42102a = wnVar;
    }

    @Override
    public final void dismiss() {
        this.f42102a.f45137h0.U(null, null);
    }

    @Override
    public final void n() {
        wn wnVar = this.f42102a;
        wnVar.rc(true);
        org.telegram.ui.Components.wc.A(wnVar, wnVar.getMessagesController().isDialogMuted(wnVar.f45168j6, wnVar.b()), wnVar.f45309ua).j();
    }

    @Override
    public final void o() {
        wn wnVar = this.f42102a;
        if (wnVar.f45168j6 != 0 && wnVar.f45091d4 != 3) {
            if (wnVar.f45113f != null) {
                wnVar.getMessagesController().putUser(wnVar.f45113f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wnVar.f45168j6);
            if (wnVar.b() != 0) {
                bundle.putLong("topic_id", wnVar.b());
            }
            wnVar.presentFragment(new j11(bundle, wnVar.f45309ua));
        }
    }

    @Override
    public final void s() {
        int i10;
        wn wnVar = this.f42102a;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.f45168j6, wnVar.b()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.f45168j6, wnVar.b()), z11).apply();
        if (org.telegram.ui.Components.wc.a(wnVar)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, wnVar, wnVar.getResourceProvider()).j();
        }
        wnVar.gd(false);
    }

    @Override
    public final void w(int i10) {
        wn wnVar = this.f42102a;
        if (i10 == 0) {
            if (wnVar.getMessagesController().isDialogMuted(wnVar.f45168j6, wnVar.b())) {
                wnVar.rc(true);
            }
            if (org.telegram.ui.Components.wc.a(wnVar)) {
                org.telegram.ui.Components.wc.z(wnVar, 4, i10, wnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        wnVar.getNotificationsController().muteUntil(wnVar.f45168j6, wnVar.b(), i10);
        if (org.telegram.ui.Components.wc.a(wnVar)) {
            org.telegram.ui.Components.wc.z(wnVar, 5, i10, wnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
