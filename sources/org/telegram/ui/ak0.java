package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class ak0 implements org.telegram.ui.Components.ko {
    public final long f32659a;
    public final boolean f32660b;
    public final jk0 f32661c;
    public final boolean d;
    public final int e;
    public final ArrayList f32662f;
    public final NotificationsCustomSettingsActivity h;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z4, jk0 jk0Var, boolean z10, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f32659a = j10;
        this.f32660b = z4;
        this.f32661c = jk0Var;
        this.d = z10;
        this.e = i10;
        this.f32662f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f31669w;
        jk0 jk0Var = this.f32661c;
        ArrayList arrayList2 = this.f32662f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(jk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f31669w.remove(indexOf);
            notificationsCustomSettingsActivity.f31670x.remove(Long.valueOf(jk0Var.d));
        }
        arrayList2.remove(jk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f31669w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f32659a, 0) != this.f32660b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb = new StringBuilder("custom_");
        jk0 jk0Var = this.f32661c;
        sb.append(jk0Var.d);
        jk0Var.f35369b = notificationsSettings.getBoolean(sb.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + jk0Var.d, 0);
        jk0Var.f35370c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + jk0Var.d, -1);
            if (i11 != -1) {
                jk0Var.f35368a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f31669w.add(jk0Var);
            notificationsCustomSettingsActivity.f31670x.put(Long.valueOf(jk0Var.d), jk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f31662a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void r() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f32659a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f32659a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.qc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void s() {
        long j10 = this.f32659a;
        if (j10 != 0) {
            e11 e11Var = new e11(kh.a2.g(j10, "dialog_id"), null);
            e11Var.f33856r = new h(this, 28);
            this.h.presentFragment(e11Var);
        }
    }

    @Override
    public final void v() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f32659a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z10 = !z4 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z10).apply();
        if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f32659a, 0)) {
                r();
            }
            if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.qc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f32659a, 0, i10);
            if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.qc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void o() {
    }
}
