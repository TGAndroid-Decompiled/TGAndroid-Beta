package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class hk0 implements org.telegram.ui.Components.ap {
    public final long f39925a;
    public final boolean f39926b;
    public final qk0 f39927c;
    public final boolean d;
    public final int e;
    public final ArrayList f39928f;
    public final NotificationsCustomSettingsActivity h;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, qk0 qk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f39925a = j10;
        this.f39926b = z10;
        this.f39927c = qk0Var;
        this.d = z11;
        this.e = i10;
        this.f39928f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.r5 r5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f35604w;
        qk0 qk0Var = this.f39927c;
        ArrayList arrayList2 = this.f39928f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(qk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f35604w.remove(indexOf);
            notificationsCustomSettingsActivity.f35605x.remove(Long.valueOf(qk0Var.d));
        }
        arrayList2.remove(qk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f35604w) {
            notificationsCustomSettingsActivity.m0(true);
            notificationsCustomSettingsActivity.e0();
        } else {
            notificationsCustomSettingsActivity.m0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        r5Var = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).simpleActionBar;
        r5Var.f(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.r5 r5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39925a, 0) != this.f39926b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        qk0 qk0Var = this.f39927c;
        sb2.append(qk0Var.d);
        qk0Var.f42740b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + qk0Var.d, 0);
        qk0Var.f42741c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + qk0Var.d, -1);
            if (i11 != -1) {
                qk0Var.f42739a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f35604w.add(qk0Var);
            notificationsCustomSettingsActivity.f35605x.put(Long.valueOf(qk0Var.d), qk0Var);
            notificationsCustomSettingsActivity.m0(true);
        } else {
            notificationsCustomSettingsActivity.f35597a.getAdapter().m(this.e);
        }
        r5Var = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).simpleActionBar;
        r5Var.f(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f39925a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f39925a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.wc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void o() {
        long j10 = this.f39925a;
        if (j10 != 0) {
            j11 j11Var = new j11(a1.g.h(j10, "dialog_id"), null);
            j11Var.f40355s = new f(this, 28);
            this.h.presentFragment(j11Var);
        }
    }

    @Override
    public final void s() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39925a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void w(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f39925a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.wc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f39925a, 0, i10);
            if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.wc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
