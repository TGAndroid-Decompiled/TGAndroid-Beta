package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class li0 implements org.telegram.ui.Components.fo {
    public final long f39285a;
    public final boolean f39286b;
    public final si0 f39287c;
    public final boolean d;
    public final int e;
    public final ArrayList f39288f;
    public final NotificationsCustomSettingsActivity h;

    public li0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, si0 si0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f39285a = j10;
        this.f39286b = z10;
        this.f39287c = si0Var;
        this.d = z11;
        this.e = i10;
        this.f39288f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.i5 i5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33412x;
        si0 si0Var = this.f39287c;
        ArrayList arrayList2 = this.f39288f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(si0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33412x.remove(indexOf);
            notificationsCustomSettingsActivity.f33413y.remove(Long.valueOf(si0Var.d));
        }
        arrayList2.remove(si0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33412x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.i5 i5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().q2(this.f39285a, 0, null) != this.f39286b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        si0 si0Var = this.f39287c;
        sb2.append(si0Var.d);
        si0Var.f41377b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + si0Var.d, 0);
        si0Var.f41378c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + si0Var.d, -1);
            if (i11 != -1) {
                si0Var.f41376a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33412x.add(si0Var);
            notificationsCustomSettingsActivity.f33413y.put(Long.valueOf(si0Var.d), si0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f33404a.getAdapter().g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    @Override
    public final void s() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j10 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f39285a, j10, !notificationsCustomSettingsActivity.getMessagesController().q2(this.f39285a, j10, null));
        org.telegram.ui.Components.cc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().q2(this.f39285a, j10, null), null).j();
        b();
    }

    @Override
    public final void v() {
        long j10 = this.f39285a;
        if (j10 != 0) {
            ty0 ty0Var = new ty0(org.telegram.ui.Cells.f1.k(j10, "dialog_id"), null);
            ty0Var.f41749s = new e(this, 26);
            this.h.presentFragment(ty0Var);
        }
    }

    @Override
    public final void x() {
        int i10;
        String v = org.telegram.messenger.pt.v(this.f39285a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void y(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().q2(this.f39285a, 0, null)) {
                s();
            }
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f39285a, i10, 0);
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void n() {
    }
}
