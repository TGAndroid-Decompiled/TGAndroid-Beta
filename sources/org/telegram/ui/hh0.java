package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class hh0 implements sw, org.telegram.ui.ActionBar.q1, ex0 {
    public final NotificationsCustomSettingsActivity f47712a;

    public hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f47712a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void d(qh0 qh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f47712a;
        notificationsCustomSettingsActivity.f42680x.add(0, qh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f47712a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f42680x.size();
        for (int i10 = 0; i10 < size; i10++) {
            qh0 qh0Var = (qh0) notificationsCustomSettingsActivity.f42680x.get(i10);
            if (notificationsCustomSettingsActivity.f42678s == 3) {
                edit.remove("stories_" + qh0Var.d);
            } else {
                edit.remove("notify2_" + qh0Var.d).remove("custom_" + qh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(qh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(qh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f42680x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((qh0) notificationsCustomSettingsActivity.f42680x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f42680x.clear();
        notificationsCustomSettingsActivity.f42681y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.ns.f25492f0, new Object[0]);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).f26860a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f47712a;
        if (notificationsCustomSettingsActivity.f42678s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f42679w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((qh0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f42680x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((qh0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f50625e = true;
            Boolean bool = notificationsCustomSettingsActivity.f42676n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f50624c = i11;
            if (notificationsCustomSettingsActivity.f42680x == null) {
                notificationsCustomSettingsActivity.f42680x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f42680x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        fx0 fx0Var = new fx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        fx0Var.f47228s = new hh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(fx0Var, true);
        return true;
    }

    @Override
    public void b0() {
    }
}
