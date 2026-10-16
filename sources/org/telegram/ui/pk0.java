package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class pk0 implements org.telegram.ui.Components.bp {
    public final long f38965a;
    public final boolean f38966b;
    public final zk0 f38967c;
    public final boolean d;
    public final int e;
    public final ArrayList f38968f;
    public final NotificationsCustomSettingsActivity h;

    public pk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, zk0 zk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f38965a = j10;
        this.f38966b = z10;
        this.f38967c = zk0Var;
        this.d = z11;
        this.e = i10;
        this.f38968f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f31862w;
        zk0 zk0Var = this.f38967c;
        ArrayList arrayList2 = this.f38968f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(zk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f31862w.remove(indexOf);
            notificationsCustomSettingsActivity.f31863x.remove(Long.valueOf(zk0Var.d));
        }
        arrayList2.remove(zk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f31862w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f38965a, 0) != this.f38966b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        zk0 zk0Var = this.f38967c;
        sb2.append(zk0Var.d);
        zk0Var.f42347b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + zk0Var.d, 0);
        zk0Var.f42348c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + zk0Var.d, -1);
            if (i11 != -1) {
                zk0Var.f42346a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f31862w.add(zk0Var);
            notificationsCustomSettingsActivity.f31863x.put(Long.valueOf(zk0Var.d), zk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f31855a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void o() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f38965a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f38965a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.zc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void p() {
        long j10 = this.f38965a;
        if (j10 != 0) {
            c21 c21Var = new c21(t8.b.e(j10, "dialog_id"), null);
            c21Var.f34434r = new g(this, 28);
            this.h.presentFragment(c21Var);
        }
    }

    @Override
    public final void t() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f38965a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.zc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void y(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f38965a, 0)) {
                o();
            }
            if (org.telegram.ui.Components.zc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.zc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f38965a, 0, i10);
            if (org.telegram.ui.Components.zc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.zc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void m() {
    }
}
