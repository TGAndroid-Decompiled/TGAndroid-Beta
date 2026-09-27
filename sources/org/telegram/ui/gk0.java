package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class gk0 implements org.telegram.ui.Components.qo {
    public final long f33969a;
    public final boolean f33970b;
    public final pk0 f33971c;
    public final boolean d;
    public final int e;
    public final ArrayList f33972f;
    public final NotificationsCustomSettingsActivity h;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, pk0 pk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f33969a = j3;
        this.f33970b = z10;
        this.f33971c = pk0Var;
        this.d = z11;
        this.e = i10;
        this.f33972f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f31159w;
        pk0 pk0Var = this.f33971c;
        ArrayList arrayList2 = this.f33972f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(pk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f31159w.remove(indexOf);
            notificationsCustomSettingsActivity.f31160x.remove(Long.valueOf(pk0Var.d));
        }
        arrayList2.remove(pk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f31159w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        lVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        lVar.i(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.l lVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f33969a, 0) != this.f33970b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        pk0 pk0Var = this.f33971c;
        sb2.append(pk0Var.d);
        pk0Var.f36500b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + pk0Var.d, 0);
        pk0Var.f36501c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + pk0Var.d, -1);
            if (i11 != -1) {
                pk0Var.f36499a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f31159w.add(pk0Var);
            notificationsCustomSettingsActivity.f31160x.put(Long.valueOf(pk0Var.d), pk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f31152a.getAdapter().m(this.e);
        }
        lVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        lVar.i(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f33969a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f33969a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void p() {
        long j3 = this.f33969a;
        if (j3 != 0) {
            p11 p11Var = new p11(v7.k0.e(j3, "dialog_id"), null);
            p11Var.f36297r = new g(this, 28);
            this.h.presentFragment(p11Var);
        }
    }

    @Override
    public final void s() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f33969a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void u(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f33969a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f33969a, 0, i10);
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
