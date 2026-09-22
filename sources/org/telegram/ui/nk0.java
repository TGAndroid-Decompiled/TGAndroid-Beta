package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class nk0 implements org.telegram.ui.Components.oo {
    public final long f36065a;
    public final boolean f36066b;
    public final wk0 f36067c;
    public final boolean d;
    public final int e;
    public final ArrayList f36068f;
    public final NotificationsCustomSettingsActivity h;

    public nk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, wk0 wk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f36065a = j3;
        this.f36066b = z10;
        this.f36067c = wk0Var;
        this.d = z11;
        this.e = i10;
        this.f36068f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f31176w;
        wk0 wk0Var = this.f36067c;
        ArrayList arrayList2 = this.f36068f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(wk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f31176w.remove(indexOf);
            notificationsCustomSettingsActivity.f31177x.remove(Long.valueOf(wk0Var.d));
        }
        arrayList2.remove(wk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f31176w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f36065a, 0) != this.f36066b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        wk0 wk0Var = this.f36067c;
        sb2.append(wk0Var.d);
        wk0Var.f39199b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + wk0Var.d, 0);
        wk0Var.f39200c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + wk0Var.d, -1);
            if (i11 != -1) {
                wk0Var.f39198a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f31176w.add(wk0Var);
            notificationsCustomSettingsActivity.f31177x.put(Long.valueOf(wk0Var.d), wk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f31169a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f36065a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f36065a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void o() {
        long j3 = this.f36065a;
        if (j3 != 0) {
            w11 w11Var = new w11(v7.j0.e(j3, "dialog_id"), null);
            w11Var.f38672r = new g(this, 28);
            this.h.presentFragment(w11Var);
        }
    }

    @Override
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f36065a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount;
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
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f36065a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f36065a, 0, i10);
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
    public final void k() {
    }
}
