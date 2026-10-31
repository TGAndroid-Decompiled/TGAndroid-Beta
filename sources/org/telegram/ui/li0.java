package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class li0 implements ux, org.telegram.ui.ActionBar.u1, ty0 {
    public final NotificationsCustomSettingsActivity f39248a;

    public li0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39248a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39248a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33405x.size();
        for (int i11 = 0; i11 < size; i11++) {
            ui0 ui0Var = (ui0) notificationsCustomSettingsActivity.f33405x.get(i11);
            if (notificationsCustomSettingsActivity.f33403s == 3) {
                edit.remove("stories_" + ui0Var.d);
            } else {
                edit.remove("notify2_" + ui0Var.d).remove("custom_" + ui0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(ui0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(ui0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33405x.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((ui0) notificationsCustomSettingsActivity.f33405x.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33405x.clear();
        notificationsCustomSettingsActivity.f33406y.clear();
        notificationsCustomSettingsActivity.p0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.zs.f19608f0, new Object[0]);
    }

    @Override
    public void w(ui0 ui0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39248a;
        notificationsCustomSettingsActivity.f33405x.add(0, ui0Var);
        notificationsCustomSettingsActivity.p0(true);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12 = 0;
        long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39248a;
        if (notificationsCustomSettingsActivity.f33403s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f33404w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((ui0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33405x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((ui0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33401n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42149c = i12;
            if (notificationsCustomSettingsActivity.f33405x == null) {
                notificationsCustomSettingsActivity.f33405x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33405x.add(obj);
            notificationsCustomSettingsActivity.p0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        uy0 uy0Var = new uy0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        uy0Var.f42549s = new li0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(uy0Var, true);
        return true;
    }

    @Override
    public void b0() {
    }
}
