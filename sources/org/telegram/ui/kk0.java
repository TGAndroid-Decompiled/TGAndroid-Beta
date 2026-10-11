package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class kk0 implements org.telegram.ui.Components.ep {
    public final long f39403a;
    public final boolean f39404b;
    public final uk0 f39405c;
    public final boolean d;
    public final int f39406e;
    public final ArrayList f39407f;
    public final NotificationsCustomSettingsActivity h;

    public kk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, uk0 uk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f39403a = j3;
        this.f39404b = z10;
        this.f39405c = uk0Var;
        this.d = z11;
        this.f39406e = i10;
        this.f39407f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33897w;
        uk0 uk0Var = this.f39405c;
        ArrayList arrayList2 = this.f39407f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(uk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33897w.remove(indexOf);
            notificationsCustomSettingsActivity.f33898x.remove(Long.valueOf(uk0Var.d));
        }
        arrayList2.remove(uk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33897w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f39406e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39403a, 0) != this.f39404b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        uk0 uk0Var = this.f39405c;
        sb2.append(uk0Var.d);
        uk0Var.f42673b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + uk0Var.d, 0);
        uk0Var.f42674c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + uk0Var.d, -1);
            if (i11 != -1) {
                uk0Var.f42672a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33897w.add(uk0Var);
            notificationsCustomSettingsActivity.f33898x.put(Long.valueOf(uk0Var.d), uk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33889a.getAdapter().m(this.f39406e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void o() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f39403a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f39403a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.ad.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void p() {
        long j3 = this.f39403a;
        if (j3 != 0) {
            u11 u11Var = new u11(sc.v.f(j3, "dialog_id"), null);
            u11Var.f42353r = new g(this, 28);
            this.h.presentFragment(u11Var);
        }
    }

    @Override
    public final void s() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39403a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.ad.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.ad.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39403a, 0)) {
                o();
            }
            if (org.telegram.ui.Components.ad.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.ad.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f39403a, 0, i10);
            if (org.telegram.ui.Components.ad.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.ad.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
