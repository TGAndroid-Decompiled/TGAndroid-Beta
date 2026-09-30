package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class oj implements org.telegram.ui.Components.ro {
    public final wn f36396a;

    public oj(wn wnVar) {
        this.f36396a = wnVar;
    }

    @Override
    public final void dismiss() {
        this.f36396a.f39588h0.M(null, null);
    }

    @Override
    public final void n() {
        wn wnVar = this.f36396a;
        wnVar.bc(true);
        org.telegram.ui.Components.yc.A(wnVar, wnVar.getMessagesController().isDialogMuted(wnVar.T5, wnVar.d()), wnVar.f39562ea).j();
    }

    @Override
    public final void o() {
        wn wnVar = this.f36396a;
        if (wnVar.T5 != 0 && wnVar.R3 != 3) {
            if (wnVar.f39564f != null) {
                wnVar.getMessagesController().putUser(wnVar.f39564f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wnVar.T5);
            if (wnVar.d() != 0) {
                bundle.putLong("topic_id", wnVar.d());
            }
            wnVar.presentFragment(new n11(bundle, wnVar.f39562ea));
        }
    }

    @Override
    public final void r() {
        int i10;
        wn wnVar = this.f36396a;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.T5, wnVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.T5, wnVar.d()), z11).apply();
        if (org.telegram.ui.Components.yc.a(wnVar)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, wnVar, wnVar.getResourceProvider()).j();
        }
        wnVar.Pc(false);
    }

    @Override
    public final void u(int i10) {
        wn wnVar = this.f36396a;
        if (i10 == 0) {
            if (wnVar.getMessagesController().isDialogMuted(wnVar.T5, wnVar.d())) {
                wnVar.bc(true);
            }
            if (org.telegram.ui.Components.yc.a(wnVar)) {
                org.telegram.ui.Components.yc.z(wnVar, 4, i10, wnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        wnVar.getNotificationsController().muteUntil(wnVar.T5, wnVar.d(), i10);
        if (org.telegram.ui.Components.yc.a(wnVar)) {
            org.telegram.ui.Components.yc.z(wnVar, 5, i10, wnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
