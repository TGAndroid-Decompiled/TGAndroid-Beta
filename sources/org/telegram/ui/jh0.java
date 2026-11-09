package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class jh0 implements org.telegram.ui.Components.xn {
    public final long f46967a;
    public final boolean f46968b;
    public final qh0 f46969c;
    public final boolean d;
    public final int f46970e;
    public final ArrayList f46971f;
    public final NotificationsCustomSettingsActivity h;

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z9, qh0 qh0Var, boolean z10, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f46967a = j3;
        this.f46968b = z9;
        this.f46969c = qh0Var;
        this.d = z10;
        this.f46970e = i7;
        this.f46971f = arrayList;
    }

    @Override
    public final void L() {
        int i7;
        String v = org.telegram.messenger.dt.v(this.f46967a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24764d7;
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
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f46967a, 0, null)) {
                p();
            }
            if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.hc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f46967a, i7, 0);
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
        ArrayList arrayList = notificationsCustomSettingsActivity.f41319x;
        qh0 qh0Var = this.f46969c;
        ArrayList arrayList2 = this.f46971f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(qh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f41319x.remove(indexOf);
            notificationsCustomSettingsActivity.f41320y.remove(Long.valueOf(qh0Var.d));
        }
        arrayList2.remove(qh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f41319x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f46970e);
        }
        y4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.k(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.y4 y4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f46967a, 0, null) != this.f46968b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        qh0 qh0Var = this.f46969c;
        sb2.append(qh0Var.d);
        qh0Var.f49060b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + qh0Var.d, 0);
        qh0Var.f49061c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + qh0Var.d, -1);
            if (i10 != -1) {
                qh0Var.f49059a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f41319x.add(qh0Var);
            notificationsCustomSettingsActivity.f41320y.put(Long.valueOf(qh0Var.d), qh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f41310a.getAdapter().g(this.f46970e);
        }
        y4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.k(true);
    }

    @Override
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f46967a, j3, !notificationsCustomSettingsActivity.getMessagesController().r2(this.f46967a, j3, null));
        org.telegram.ui.Components.hc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.f46967a, j3, null), null).j();
        b();
    }

    @Override
    public final void y() {
        long j3 = this.f46967a;
        if (j3 != 0) {
            kx0 kx0Var = new kx0(a8.p0.j(j3, "dialog_id"), null);
            kx0Var.f47406s = new f(this, 26);
            this.h.presentFragment(kx0Var);
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void n() {
    }
}
