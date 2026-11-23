package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class lh0 implements org.telegram.ui.Components.no {
    public final long f49762a;
    public final boolean f49763b;
    public final sh0 f49764c;
    public final boolean d;
    public final int f49765e;
    public final ArrayList f49766f;
    public final NotificationsCustomSettingsActivity h;

    public lh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, sh0 sh0Var, boolean z11, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f49762a = j3;
        this.f49763b = z10;
        this.f49764c = sh0Var;
        this.d = z11;
        this.f49765e = i7;
        this.f49766f = arrayList;
    }

    @Override
    public final void J() {
        int i7;
        String v = org.telegram.messenger.xs.v(this.f49762a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25753g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.kc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.kc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void Q(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().u2(this.f49762a, 0, null)) {
                v();
            }
            if (org.telegram.ui.Components.kc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.kc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f49762a, i7, 0);
            if (org.telegram.ui.Components.kc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.kc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.z4 z4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f43245x;
        sh0 sh0Var = this.f49764c;
        ArrayList arrayList2 = this.f49766f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(sh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f43245x.remove(indexOf);
            notificationsCustomSettingsActivity.f43246y.remove(Long.valueOf(sh0Var.d));
        }
        arrayList2.remove(sh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f43245x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f49765e);
        }
        z4Var = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.o(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.z4 z4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().u2(this.f49762a, 0, null) != this.f49763b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        sh0 sh0Var = this.f49764c;
        sb2.append(sh0Var.d);
        sh0Var.f52087b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + sh0Var.d, 0);
        sh0Var.f52088c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + sh0Var.d, -1);
            if (i10 != -1) {
                sh0Var.f52086a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f43245x.add(sh0Var);
            notificationsCustomSettingsActivity.f43246y.put(Long.valueOf(sh0Var.d), sh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f43236a.getAdapter().g(this.f49765e);
        }
        z4Var = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.o(true);
    }

    @Override
    public final void v() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f49762a, j3, !notificationsCustomSettingsActivity.getMessagesController().u2(this.f49762a, j3, null));
        org.telegram.ui.Components.kc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().u2(this.f49762a, j3, null), null).j();
        b();
    }

    @Override
    public final void y() {
        long j3 = this.f49762a;
        if (j3 != 0) {
            hx0 hx0Var = new hx0(a8.p0.j(j3, "dialog_id"), null);
            hx0Var.f48653s = new f(this, 26);
            this.h.presentFragment(hx0Var);
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void u() {
    }
}
