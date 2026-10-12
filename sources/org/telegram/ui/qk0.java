package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class qk0 implements org.telegram.ui.Components.bp {
    public final long f39488a;
    public final boolean f39489b;
    public final al0 f39490c;
    public final boolean d;
    public final int e;
    public final ArrayList f39491f;
    public final NotificationsCustomSettingsActivity h;

    public qk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, al0 al0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f39488a = j10;
        this.f39489b = z10;
        this.f39490c = al0Var;
        this.d = z11;
        this.e = i10;
        this.f39491f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f32160w;
        al0 al0Var = this.f39490c;
        ArrayList arrayList2 = this.f39491f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(al0Var)) >= 0) {
            notificationsCustomSettingsActivity.f32160w.remove(indexOf);
            notificationsCustomSettingsActivity.f32161x.remove(Long.valueOf(al0Var.d));
        }
        arrayList2.remove(al0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f32160w) {
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
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39488a, 0) != this.f39489b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        al0 al0Var = this.f39490c;
        sb2.append(al0Var.d);
        al0Var.f34274b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + al0Var.d, 0);
        al0Var.f34275c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + al0Var.d, -1);
            if (i11 != -1) {
                al0Var.f34273a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f32160w.add(al0Var);
            notificationsCustomSettingsActivity.f32161x.put(Long.valueOf(al0Var.d), al0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f32153a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f39488a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f39488a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.zc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void p() {
        long j10 = this.f39488a;
        if (j10 != 0) {
            c21 c21Var = new c21(t8.b.e(j10, "dialog_id"), null);
            c21Var.f34712r = new g(this, 28);
            this.h.presentFragment(c21Var);
        }
    }

    @Override
    public final void s() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39488a, 0);
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
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39488a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.zc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.zc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f39488a, 0, i10);
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
