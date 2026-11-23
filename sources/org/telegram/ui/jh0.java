package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements vw, org.telegram.ui.ActionBar.q1, gx0 {
    public final NotificationsCustomSettingsActivity f49127a;

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f49127a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49127a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f43245x.size();
        for (int i10 = 0; i10 < size; i10++) {
            sh0 sh0Var = (sh0) notificationsCustomSettingsActivity.f43245x.get(i10);
            if (notificationsCustomSettingsActivity.f43243s == 3) {
                edit.remove("stories_" + sh0Var.d);
            } else {
                edit.remove("notify2_" + sh0Var.d).remove("custom_" + sh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(sh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(sh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f43245x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((sh0) notificationsCustomSettingsActivity.f43245x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f43245x.clear();
        notificationsCustomSettingsActivity.f43246y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.ks.f25209f0, new Object[0]);
    }

    @Override
    public void n(sh0 sh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49127a;
        notificationsCustomSettingsActivity.f43245x.add(0, sh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26946a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49127a;
        if (notificationsCustomSettingsActivity.f43243s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f43244w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((sh0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f43245x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((sh0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f52089e = true;
            Boolean bool = notificationsCustomSettingsActivity.f43241n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f52088c = i11;
            if (notificationsCustomSettingsActivity.f43245x == null) {
                notificationsCustomSettingsActivity.f43245x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f43245x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        hx0 hx0Var = new hx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        hx0Var.f48653s = new jh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(hx0Var, true);
        return true;
    }

    @Override
    public void Q() {
    }
}
