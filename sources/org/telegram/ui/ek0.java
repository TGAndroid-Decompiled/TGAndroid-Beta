package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class ek0 implements org.telegram.ui.Components.po {
    public final long f32962a;
    public final boolean f32963b;
    public final nk0 f32964c;
    public final boolean d;
    public final int e;
    public final ArrayList f32965f;
    public final NotificationsCustomSettingsActivity h;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, nk0 nk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f32962a = j3;
        this.f32963b = z10;
        this.f32964c = nk0Var;
        this.d = z11;
        this.e = i10;
        this.f32965f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f30842w;
        nk0 nk0Var = this.f32964c;
        ArrayList arrayList2 = this.f32965f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(nk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f30842w.remove(indexOf);
            notificationsCustomSettingsActivity.f30843x.remove(Long.valueOf(nk0Var.d));
        }
        arrayList2.remove(nk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f30842w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f32962a, 0) != this.f32963b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        nk0 nk0Var = this.f32964c;
        sb2.append(nk0Var.d);
        nk0Var.f35547b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + nk0Var.d, 0);
        nk0Var.f35548c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + nk0Var.d, -1);
            if (i11 != -1) {
                nk0Var.f35546a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f30842w.add(nk0Var);
            notificationsCustomSettingsActivity.f30843x.put(Long.valueOf(nk0Var.d), nk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f30835a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.f32962a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f32962a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override
    public final void o() {
        long j3 = this.f32962a;
        if (j3 != 0) {
            p11 p11Var = new p11(w.c.e(j3, "dialog_id"), null);
            p11Var.f36004r = new g(this, 28);
            this.h.presentFragment(p11Var);
        }
    }

    @Override
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f32962a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f32962a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f32962a, 0, i10);
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void l() {
    }
}
