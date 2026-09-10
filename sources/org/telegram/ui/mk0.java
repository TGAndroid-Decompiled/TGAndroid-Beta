package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class mk0 implements org.telegram.ui.Components.to {
    public final long f34991a;
    public final boolean f34992b;
    public final vk0 f34993c;
    public final boolean d;
    public final int e;
    public final ArrayList f34994f;
    public final NotificationsCustomSettingsActivity h;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, vk0 vk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f34991a = j3;
        this.f34992b = z10;
        this.f34993c = vk0Var;
        this.d = z11;
        this.e = i10;
        this.f34994f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f29984w;
        vk0 vk0Var = this.f34993c;
        ArrayList arrayList2 = this.f34994f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(vk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f29984w.remove(indexOf);
            notificationsCustomSettingsActivity.f29985x.remove(Long.valueOf(vk0Var.d));
        }
        arrayList2.remove(vk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f29984w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        lVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        lVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.l lVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f34991a, 0) != this.f34992b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        vk0 vk0Var = this.f34993c;
        sb2.append(vk0Var.d);
        vk0Var.f37580b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + vk0Var.d, 0);
        vk0Var.f37581c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + vk0Var.d, -1);
            if (i11 != -1) {
                vk0Var.f37579a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f29984w.add(vk0Var);
            notificationsCustomSettingsActivity.f29985x.put(Long.valueOf(vk0Var.d), vk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f29977a.getAdapter().m(this.e);
        }
        lVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        lVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f34991a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f34991a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.wc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void o() {
        long j3 = this.f34991a;
        if (j3 != 0) {
            c21 c21Var = new c21(w.f.e(j3, "dialog_id"), null);
            c21Var.f31504r = new g(this, 28);
            this.h.presentFragment(c21Var);
        }
    }

    @Override
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f34991a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.wc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f34991a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.wc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f34991a, 0, i10);
            if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.wc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void l() {
    }
}
