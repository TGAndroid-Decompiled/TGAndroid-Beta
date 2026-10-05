package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class ik0 implements org.telegram.ui.Components.ro {
    public final long f37443a;
    public final boolean f37444b;
    public final rk0 f37445c;
    public final boolean d;
    public final int f37446e;
    public final ArrayList f37447f;
    public final NotificationsCustomSettingsActivity h;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, rk0 rk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f37443a = j3;
        this.f37444b = z10;
        this.f37445c = rk0Var;
        this.d = z11;
        this.f37446e = i10;
        this.f37447f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33845w;
        rk0 rk0Var = this.f37445c;
        ArrayList arrayList2 = this.f37447f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(rk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33845w.remove(indexOf);
            notificationsCustomSettingsActivity.f33846x.remove(Long.valueOf(rk0Var.d));
        }
        arrayList2.remove(rk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33845w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f37446e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f37443a, 0) != this.f37444b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        rk0 rk0Var = this.f37445c;
        sb2.append(rk0Var.d);
        rk0Var.f40134b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + rk0Var.d, 0);
        rk0Var.f40135c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + rk0Var.d, -1);
            if (i11 != -1) {
                rk0Var.f40133a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33845w.add(rk0Var);
            notificationsCustomSettingsActivity.f33846x.put(Long.valueOf(rk0Var.d), rk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33837a.getAdapter().m(this.f37446e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void k() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f37443a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f37443a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.yc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void l() {
        long j3 = this.f37443a;
        if (j3 != 0) {
            p11 p11Var = new p11(sa.e.f(j3, "dialog_id"), null);
            p11Var.f39337s = new g(this, 28);
            this.h.presentFragment(p11Var);
        }
    }

    @Override
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f37443a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.yc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f37443a, 0)) {
                k();
            }
            if (org.telegram.ui.Components.yc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.yc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f37443a, 0, i10);
            if (org.telegram.ui.Components.yc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.yc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void j() {
    }
}
