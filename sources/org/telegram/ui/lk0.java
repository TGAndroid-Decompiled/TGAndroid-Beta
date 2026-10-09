package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class lk0 implements org.telegram.ui.Components.ep {
    public final long f39621a;
    public final boolean f39622b;
    public final vk0 f39623c;
    public final boolean d;
    public final int f39624e;
    public final ArrayList f39625f;
    public final NotificationsCustomSettingsActivity h;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, vk0 vk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f39621a = j3;
        this.f39622b = z10;
        this.f39623c = vk0Var;
        this.d = z11;
        this.f39624e = i10;
        this.f39625f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33835w;
        vk0 vk0Var = this.f39623c;
        ArrayList arrayList2 = this.f39625f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(vk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33835w.remove(indexOf);
            notificationsCustomSettingsActivity.f33836x.remove(Long.valueOf(vk0Var.d));
        }
        arrayList2.remove(vk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33835w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f39624e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39621a, 0) != this.f39622b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        vk0 vk0Var = this.f39623c;
        sb2.append(vk0Var.d);
        vk0Var.f42894b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + vk0Var.d, 0);
        vk0Var.f42895c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + vk0Var.d, -1);
            if (i11 != -1) {
                vk0Var.f42893a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33835w.add(vk0Var);
            notificationsCustomSettingsActivity.f33836x.put(Long.valueOf(vk0Var.d), vk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33827a.getAdapter().m(this.f39624e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void o() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f39621a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f39621a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.ad.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void p() {
        long j3 = this.f39621a;
        if (j3 != 0) {
            v11 v11Var = new v11(sc.v.f(j3, "dialog_id"), null);
            v11Var.f42609r = new g(this, 28);
            this.h.presentFragment(v11Var);
        }
    }

    @Override
    public final void s() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39621a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount;
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
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39621a, 0)) {
                o();
            }
            if (org.telegram.ui.Components.ad.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.ad.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f39621a, 0, i10);
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
