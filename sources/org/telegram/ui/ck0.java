package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class ck0 implements org.telegram.ui.Components.mo {
    public final long f35820a;
    public final boolean f35821b;
    public final lk0 f35822c;
    public final boolean d;
    public final int f35823e;
    public final ArrayList f35824f;
    public final NotificationsCustomSettingsActivity h;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z4, lk0 lk0Var, boolean z10, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f35820a = j10;
        this.f35821b = z4;
        this.f35822c = lk0Var;
        this.d = z10;
        this.f35823e = i10;
        this.f35824f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f34192w;
        lk0 lk0Var = this.f35822c;
        ArrayList arrayList2 = this.f35824f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(lk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f34192w.remove(indexOf);
            notificationsCustomSettingsActivity.f34193x.remove(Long.valueOf(lk0Var.d));
        }
        arrayList2.remove(lk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f34192w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f35823e);
        }
        kVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f35820a, 0) != this.f35821b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb = new StringBuilder("custom_");
        lk0 lk0Var = this.f35822c;
        sb.append(lk0Var.d);
        lk0Var.f38687b = notificationsSettings.getBoolean(sb.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + lk0Var.d, 0);
        lk0Var.f38688c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + lk0Var.d, -1);
            if (i11 != -1) {
                lk0Var.f38686a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f34192w.add(lk0Var);
            notificationsCustomSettingsActivity.f34193x.put(Long.valueOf(lk0Var.d), lk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f34184a.getAdapter().m(this.f35823e);
        }
        kVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void k() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f35820a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f35820a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.qc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void o() {
        long j10 = this.f35820a;
        if (j10 != 0) {
            k11 k11Var = new k11(l.d.g(j10, "dialog_id"), null);
            k11Var.f38165r = new h(this, 28);
            this.h.presentFragment(k11Var);
        }
    }

    @Override
    public final void u() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f35820a, 0);
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
    public final void v(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f35820a, 0)) {
                k();
            }
            if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.qc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f35820a, 0, i10);
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
    public final void j() {
    }
}
