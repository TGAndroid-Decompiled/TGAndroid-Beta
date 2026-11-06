package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class hh0 implements org.telegram.ui.Components.xn {
    public final long f46361a;
    public final boolean f46362b;
    public final oh0 f46363c;
    public final boolean d;
    public final int f46364e;
    public final ArrayList f46365f;
    public final NotificationsCustomSettingsActivity h;

    public hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z9, oh0 oh0Var, boolean z10, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f46361a = j3;
        this.f46362b = z9;
        this.f46363c = oh0Var;
        this.d = z10;
        this.f46364e = i7;
        this.f46365f = arrayList;
    }

    @Override
    public final void L() {
        int i7;
        String v = org.telegram.messenger.dt.v(this.f46361a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24749d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z10).apply();
        if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f46361a, 0, null)) {
                p();
            }
            if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.hc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f46361a, i7, 0);
            if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.hc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.y4 y4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f41284x;
        oh0 oh0Var = this.f46363c;
        ArrayList arrayList2 = this.f46365f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(oh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f41284x.remove(indexOf);
            notificationsCustomSettingsActivity.f41285y.remove(Long.valueOf(oh0Var.d));
        }
        arrayList2.remove(oh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f41284x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f46364e);
        }
        y4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.y4 y4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f46361a, 0, null) != this.f46362b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        oh0 oh0Var = this.f46363c;
        sb2.append(oh0Var.d);
        oh0Var.f48385b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + oh0Var.d, 0);
        oh0Var.f48386c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + oh0Var.d, -1);
            if (i10 != -1) {
                oh0Var.f48384a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f41284x.add(oh0Var);
            notificationsCustomSettingsActivity.f41285y.put(Long.valueOf(oh0Var.d), oh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f41275a.getAdapter().g(this.f46364e);
        }
        y4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    @Override
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f46361a, j3, !notificationsCustomSettingsActivity.getMessagesController().r2(this.f46361a, j3, null));
        org.telegram.ui.Components.hc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.f46361a, j3, null), null).j();
        b();
    }

    @Override
    public final void y() {
        long j3 = this.f46361a;
        if (j3 != 0) {
            gx0 gx0Var = new gx0(a8.p0.j(j3, "dialog_id"), null);
            gx0Var.f46118s = new f(this, 26);
            this.h.presentFragment(gx0Var);
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void n() {
    }
}
