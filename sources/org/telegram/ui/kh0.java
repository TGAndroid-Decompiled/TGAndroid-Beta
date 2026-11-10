package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class kh0 implements org.telegram.ui.Components.wn {
    public final long f47304a;
    public final boolean f47305b;
    public final rh0 f47306c;
    public final boolean d;
    public final int f47307e;
    public final ArrayList f47308f;
    public final NotificationsCustomSettingsActivity h;

    public kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z9, rh0 rh0Var, boolean z10, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f47304a = j3;
        this.f47305b = z9;
        this.f47306c = rh0Var;
        this.d = z10;
        this.f47307e = i7;
        this.f47308f = arrayList;
    }

    @Override
    public final void L() {
        int i7;
        String v = org.telegram.messenger.dt.v(this.f47304a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24768d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z10).apply();
        if (org.telegram.ui.Components.gc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.gc.S(z9 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f47304a, 0, null)) {
                p();
            }
            if (org.telegram.ui.Components.gc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.gc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f47304a, i7, 0);
            if (org.telegram.ui.Components.gc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.gc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
        ArrayList arrayList = notificationsCustomSettingsActivity.f41310x;
        rh0 rh0Var = this.f47306c;
        ArrayList arrayList2 = this.f47308f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(rh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f41310x.remove(indexOf);
            notificationsCustomSettingsActivity.f41311y.remove(Long.valueOf(rh0Var.d));
        }
        arrayList2.remove(rh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f41310x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f47307e);
        }
        z4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.l(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.z4 z4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f47304a, 0, null) != this.f47305b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        rh0 rh0Var = this.f47306c;
        sb2.append(rh0Var.d);
        rh0Var.f49419b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + rh0Var.d, 0);
        rh0Var.f49420c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + rh0Var.d, -1);
            if (i10 != -1) {
                rh0Var.f49418a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f41310x.add(rh0Var);
            notificationsCustomSettingsActivity.f41311y.put(Long.valueOf(rh0Var.d), rh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f41301a.getAdapter().g(this.f47307e);
        }
        z4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.l(true);
    }

    @Override
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f47304a, j3, !notificationsCustomSettingsActivity.getMessagesController().r2(this.f47304a, j3, null));
        org.telegram.ui.Components.gc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.f47304a, j3, null), null).j();
        b();
    }

    @Override
    public final void y() {
        long j3 = this.f47304a;
        if (j3 != 0) {
            lx0 lx0Var = new lx0(a8.p0.j(j3, "dialog_id"), null);
            lx0Var.f47730s = new f(this, 26);
            this.h.presentFragment(lx0Var);
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void n() {
    }
}
