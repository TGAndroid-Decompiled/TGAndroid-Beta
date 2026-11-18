package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class nh0 implements org.telegram.ui.Components.oo {
    public final long f50184a;
    public final boolean f50185b;
    public final uh0 f50186c;
    public final boolean d;
    public final int f50187e;
    public final ArrayList f50188f;
    public final NotificationsCustomSettingsActivity h;

    public nh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, uh0 uh0Var, boolean z11, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f50184a = j3;
        this.f50185b = z10;
        this.f50186c = uh0Var;
        this.d = z11;
        this.f50187e = i7;
        this.f50188f = arrayList;
    }

    @Override
    public final void B(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().u2(this.f50184a, 0, null)) {
                s();
            }
            if (org.telegram.ui.Components.lc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.lc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f50184a, i7, 0);
            if (org.telegram.ui.Components.lc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.lc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.a5 a5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f43125x;
        uh0 uh0Var = this.f50186c;
        ArrayList arrayList2 = this.f50188f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(uh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f43125x.remove(indexOf);
            notificationsCustomSettingsActivity.f43126y.remove(Long.valueOf(uh0Var.d));
        }
        arrayList2.remove(uh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f43125x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f50187e);
        }
        a5Var = ((org.telegram.ui.ActionBar.h2) notificationsCustomSettingsActivity).simpleActionBar;
        a5Var.o(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.a5 a5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().u2(this.f50184a, 0, null) != this.f50185b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        uh0 uh0Var = this.f50186c;
        sb2.append(uh0Var.d);
        uh0Var.f52552b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + uh0Var.d, 0);
        uh0Var.f52553c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + uh0Var.d, -1);
            if (i10 != -1) {
                uh0Var.f52551a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f43125x.add(uh0Var);
            notificationsCustomSettingsActivity.f43126y.put(Long.valueOf(uh0Var.d), uh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f43116a.getAdapter().g(this.f50187e);
        }
        a5Var = ((org.telegram.ui.ActionBar.h2) notificationsCustomSettingsActivity).simpleActionBar;
        a5Var.o(true);
    }

    @Override
    public final void s() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f50184a, j3, !notificationsCustomSettingsActivity.getMessagesController().u2(this.f50184a, j3, null));
        org.telegram.ui.Components.lc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().u2(this.f50184a, j3, null), null).j();
        b();
    }

    @Override
    public final void u() {
        long j3 = this.f50184a;
        if (j3 != 0) {
            jx0 jx0Var = new jx0(a8.p0.j(j3, "dialog_id"), null);
            jx0Var.f49094s = new f(this, 26);
            this.h.presentFragment(jx0Var);
        }
    }

    @Override
    public final void w() {
        int i7;
        String v = org.telegram.messenger.xs.v(this.f50184a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.h2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25658g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.lc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void p() {
    }
}
