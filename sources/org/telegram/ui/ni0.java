package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class ni0 implements org.telegram.ui.Components.fo {
    public final long f39951a;
    public final boolean f39952b;
    public final ui0 f39953c;
    public final boolean d;
    public final int e;
    public final ArrayList f39954f;
    public final NotificationsCustomSettingsActivity h;

    public ni0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, ui0 ui0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f39951a = j10;
        this.f39952b = z10;
        this.f39953c = ui0Var;
        this.d = z11;
        this.e = i10;
        this.f39954f = arrayList;
    }

    @Override
    public final void E(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().q2(this.f39951a, 0, null)) {
                v();
            }
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.f39951a, i10, 0);
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.i5 i5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33405x;
        ui0 ui0Var = this.f39953c;
        ArrayList arrayList2 = this.f39954f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(ui0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33405x.remove(indexOf);
            notificationsCustomSettingsActivity.f33406y.remove(Long.valueOf(ui0Var.d));
        }
        arrayList2.remove(ui0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33405x) {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.h0();
        } else {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.i5 i5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().q2(this.f39951a, 0, null) != this.f39952b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        ui0 ui0Var = this.f39953c;
        sb2.append(ui0Var.d);
        ui0Var.f42148b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + ui0Var.d, 0);
        ui0Var.f42149c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + ui0Var.d, -1);
            if (i11 != -1) {
                ui0Var.f42147a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33405x.add(ui0Var);
            notificationsCustomSettingsActivity.f33406y.put(Long.valueOf(ui0Var.d), ui0Var);
            notificationsCustomSettingsActivity.p0(true);
        } else {
            notificationsCustomSettingsActivity.f33397a.getAdapter().g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    @Override
    public final void v() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j10 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.f39951a, j10, !notificationsCustomSettingsActivity.getMessagesController().q2(this.f39951a, j10, null));
        org.telegram.ui.Components.cc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().q2(this.f39951a, j10, null), null).j();
        b();
    }

    @Override
    public final void x() {
        long j10 = this.f39951a;
        if (j10 != 0) {
            uy0 uy0Var = new uy0(org.telegram.ui.Cells.f1.k(j10, "dialog_id"), null);
            uy0Var.f42549s = new e(this, 25);
            this.h.presentFragment(uy0Var);
        }
    }

    @Override
    public final void y() {
        int i10;
        String v = org.telegram.messenger.ot.v(this.f39951a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void n() {
    }
}
