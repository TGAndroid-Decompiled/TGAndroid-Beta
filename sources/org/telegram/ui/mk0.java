package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class mk0 implements org.telegram.ui.Components.gp {
    public final long f40083a;
    public final boolean f40084b;
    public final wk0 f40085c;
    public final boolean d;
    public final int f40086e;
    public final ArrayList f40087f;
    public final NotificationsCustomSettingsActivity h;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, wk0 wk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f40083a = j3;
        this.f40084b = z10;
        this.f40085c = wk0Var;
        this.d = z11;
        this.f40086e = i10;
        this.f40087f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33672w;
        wk0 wk0Var = this.f40085c;
        ArrayList arrayList2 = this.f40087f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(wk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33672w.remove(indexOf);
            notificationsCustomSettingsActivity.f33673x.remove(Long.valueOf(wk0Var.d));
        }
        arrayList2.remove(wk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33672w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f40086e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.i(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f40083a, 0) != this.f40084b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        wk0 wk0Var = this.f40085c;
        sb2.append(wk0Var.d);
        wk0Var.f43555b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + wk0Var.d, 0);
        wk0Var.f43556c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + wk0Var.d, -1);
            if (i11 != -1) {
                wk0Var.f43554a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33672w.add(wk0Var);
            notificationsCustomSettingsActivity.f33673x.put(Long.valueOf(wk0Var.d), wk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33664a.getAdapter().m(this.f40086e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.i(true);
    }

    @Override
    public final void k() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f40083a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f40083a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.zc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void l() {
        long j3 = this.f40083a;
        if (j3 != 0) {
            x11 x11Var = new x11(sc.v.f(j3, "dialog_id"), null);
            x11Var.f43721r = new g(this, 28);
            this.h.presentFragment(x11Var);
        }
    }

    @Override
    public final void q() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f40083a, 0);
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
    public final void t(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f40083a, 0)) {
                k();
            }
            if (org.telegram.ui.Components.zc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.zc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f40083a, 0, i10);
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
    public final void j() {
    }
}
