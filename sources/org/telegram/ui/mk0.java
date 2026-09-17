package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class mk0 implements org.telegram.ui.Components.oo {
    public final long f35832a;
    public final boolean f35833b;
    public final vk0 f35834c;
    public final boolean d;
    public final int e;
    public final ArrayList f35835f;
    public final NotificationsCustomSettingsActivity h;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, vk0 vk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f35832a = j3;
        this.f35833b = z10;
        this.f35834c = vk0Var;
        this.d = z11;
        this.e = i10;
        this.f35835f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f30885w;
        vk0 vk0Var = this.f35834c;
        ArrayList arrayList2 = this.f35835f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(vk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f30885w.remove(indexOf);
            notificationsCustomSettingsActivity.f30886x.remove(Long.valueOf(vk0Var.d));
        }
        arrayList2.remove(vk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f30885w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f35832a, 0) != this.f35833b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        vk0 vk0Var = this.f35834c;
        sb2.append(vk0Var.d);
        vk0Var.f38465b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + vk0Var.d, 0);
        vk0Var.f38466c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + vk0Var.d, -1);
            if (i11 != -1) {
                vk0Var.f38464a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f30885w.add(vk0Var);
            notificationsCustomSettingsActivity.f30886x.put(Long.valueOf(vk0Var.d), vk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f30878a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f35832a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f35832a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.vc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void o() {
        long j3 = this.f35832a;
        if (j3 != 0) {
            y11 y11Var = new y11(w.f.e(j3, "dialog_id"), null);
            y11Var.f39768r = new g(this, 28);
            this.h.presentFragment(y11Var);
        }
    }

    @Override
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f35832a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f35832a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.vc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f35832a, 0, i10);
            if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.vc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
