package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class kj implements org.telegram.ui.Components.yo {
    public final sn f38963a;

    public kj(sn snVar) {
        this.f38963a = snVar;
    }

    @Override
    public final void dismiss() {
        this.f38963a.f41537h0.M(null, null);
    }

    @Override
    public final void o() {
        sn snVar = this.f38963a;
        snVar.hc(true);
        org.telegram.ui.Components.xc.A(snVar, snVar.getMessagesController().isDialogMuted(snVar.f41519f6, snVar.d()), snVar.f41654qa).j();
    }

    @Override
    public final void p() {
        sn snVar = this.f38963a;
        if (snVar.f41519f6 != 0 && snVar.f41492d4 != 3) {
            if (snVar.f41512f != null) {
                snVar.getMessagesController().putUser(snVar.f41512f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", snVar.f41519f6);
            if (snVar.d() != 0) {
                bundle.putLong("topic_id", snVar.d());
            }
            snVar.presentFragment(new d11(bundle, snVar.f41654qa));
        }
    }

    @Override
    public final void t() {
        int i10;
        sn snVar = this.f38963a;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.f41519f6, snVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.f41519f6, snVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, snVar, snVar.getResourceProvider()).j();
        }
        snVar.Wc(false);
    }

    @Override
    public final void v(int i10) {
        sn snVar = this.f38963a;
        if (i10 == 0) {
            if (snVar.getMessagesController().isDialogMuted(snVar.f41519f6, snVar.d())) {
                snVar.hc(true);
            }
            if (org.telegram.ui.Components.xc.a(snVar)) {
                org.telegram.ui.Components.xc.z(snVar, 4, i10, snVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        snVar.getNotificationsController().muteUntil(snVar.f41519f6, snVar.d(), i10);
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.z(snVar, 5, i10, snVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
