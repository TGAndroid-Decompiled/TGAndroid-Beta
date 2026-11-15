package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class jh0 implements org.telegram.ui.Components.ho {
    public final long f48355a;
    public final boolean f48356b;
    public final qh0 f48357c;
    public final boolean d;
    public final int f48358e;
    public final ArrayList f48359f;
    public final NotificationsCustomSettingsActivity h;

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, qh0 qh0Var, boolean z11, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f48355a = j3;
        this.f48356b = z10;
        this.f48357c = qh0Var;
        this.d = z11;
        this.f48358e = i7;
        this.f48359f = arrayList;
    }

    @Override
    public final void F() {
        long j3 = this.f48355a;
        if (j3 != 0) {
            fx0 fx0Var = new fx0(a8.p0.j(j3, "dialog_id"), null);
            fx0Var.f47228s = new f(this, 26);
            this.h.presentFragment(fx0Var);
        }
    }

    @Override
    public final void J() {
        int i7;
        String v = org.telegram.messenger.at.v(this.f48355a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.e2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).f25270e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f48355a, 0, null)) {
                u();
            }
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f48355a, i7, 0);
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.w4 w4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f42680x;
        qh0 qh0Var = this.f48357c;
        ArrayList arrayList2 = this.f48359f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(qh0Var)) >= 0) {
            notificationsCustomSettingsActivity.f42680x.remove(indexOf);
            notificationsCustomSettingsActivity.f42681y.remove(Long.valueOf(qh0Var.d));
        }
        arrayList2.remove(qh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f42680x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.f48358e);
        }
        w4Var = ((org.telegram.ui.ActionBar.e2) notificationsCustomSettingsActivity).simpleActionBar;
        w4Var.m(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.w4 w4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.f48355a, 0, null) != this.f48356b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        qh0 qh0Var = this.f48357c;
        sb2.append(qh0Var.d);
        qh0Var.f50623b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + qh0Var.d, 0);
        qh0Var.f50624c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + qh0Var.d, -1);
            if (i10 != -1) {
                qh0Var.f50622a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f42680x.add(qh0Var);
            notificationsCustomSettingsActivity.f42681y.put(Long.valueOf(qh0Var.d), qh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.f42671a.getAdapter().g(this.f48358e);
        }
        w4Var = ((org.telegram.ui.ActionBar.e2) notificationsCustomSettingsActivity).simpleActionBar;
        w4Var.m(true);
    }

    @Override
    public final void u() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f48355a, j3, !notificationsCustomSettingsActivity.getMessagesController().r2(this.f48355a, j3, null));
        org.telegram.ui.Components.cc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.f48355a, j3, null), null).j();
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void t() {
    }
}
