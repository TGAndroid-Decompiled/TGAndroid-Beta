package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class dh0 implements org.telegram.ui.Components.wn {
    public final long f44710a;
    public final boolean f44711b;
    public final lh0 f44712c;
    public final boolean d;
    public final int f44713e;
    public final ArrayList f44714f;
    public final NotificationsCustomSettingsActivity h;

    public dh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, lh0 lh0Var, boolean z11, int i3, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f44710a = j10;
        this.f44711b = z10;
        this.f44712c = lh0Var;
        this.d = z11;
        this.f44713e = i3;
        this.f44714f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.y4 y4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f41341x;
        lh0 lh0Var = this.f44712c;
        ArrayList arrayList2 = this.f44714f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(lh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f41341x.remove(indexOf);
            notificationsCustomSettingsActivity.f41342y.remove(Long.valueOf(lh0Var.d));
        }
        arrayList2.remove(lh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f41341x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f44713e);
        }
        y4Var = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.y4 y4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f44710a, 0, null) != this.f44711b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        lh0 lh0Var = this.f44712c;
        sb2.append(lh0Var.d);
        lh0Var.f47338b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i3 = notificationsSettings.getInt("notify2_" + lh0Var.d, 0);
        lh0Var.f47339c = i3;
        if (i3 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + lh0Var.d, -1);
            if (i10 != -1) {
                lh0Var.f47337a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f41341x.add(lh0Var);
            notificationsCustomSettingsActivity.f41342y.put(Long.valueOf(lh0Var.d), lh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f41332a.getAdapter().g(this.f44713e);
        }
        y4Var = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    @Override
    public final void q() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j10 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f44710a, j10, !notificationsCustomSettingsActivity.getMessagesController().r2(this.f44710a, j10, null));
        org.telegram.ui.Components.fc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.f44710a, j10, null), null).j();
        b();
    }

    @Override
    public final void t() {
        long j10 = this.f44710a;
        if (j10 != 0) {
            yw0 yw0Var = new yw0(a1.g.j(j10, "dialog_id"), null);
            yw0Var.f52429s = new f(this, 26);
            this.h.presentFragment(yw0Var);
        }
    }

    @Override
    public final void v() {
        int i3;
        String v = org.telegram.messenger.us.v(this.f44710a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i3 = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).f22989d7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.fc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void z(int i3) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i3 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f44710a, 0, null)) {
                q();
            }
            if (org.telegram.ui.Components.fc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.fc.z(notificationsCustomSettingsActivity, 4, i3, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f44710a, i3, 0);
            if (org.telegram.ui.Components.fc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.fc.z(notificationsCustomSettingsActivity, 5, i3, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void p() {
    }
}
