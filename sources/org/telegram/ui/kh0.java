package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements ww, org.telegram.ui.ActionBar.r1, ix0 {
    public final NotificationsCustomSettingsActivity f49273a;

    public kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f49273a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49273a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f43125x.size();
        for (int i10 = 0; i10 < size; i10++) {
            th0 th0Var = (th0) notificationsCustomSettingsActivity.f43125x.get(i10);
            if (notificationsCustomSettingsActivity.f43123s == 3) {
                edit.remove("stories_" + th0Var.d);
            } else {
                edit.remove("notify2_" + th0Var.d).remove("custom_" + th0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(th0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(th0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f43125x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((th0) notificationsCustomSettingsActivity.f43125x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f43125x.clear();
        notificationsCustomSettingsActivity.f43126y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.ks.f25112f0, new Object[0]);
    }

    @Override
    public void k(th0 th0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49273a;
        notificationsCustomSettingsActivity.f43125x.add(0, th0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26847a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49273a;
        if (notificationsCustomSettingsActivity.f43123s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f43124w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((th0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f43125x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((th0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f52290e = true;
            Boolean bool = notificationsCustomSettingsActivity.f43121n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f52289c = i11;
            if (notificationsCustomSettingsActivity.f43125x == null) {
                notificationsCustomSettingsActivity.f43125x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f43125x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        jx0 jx0Var = new jx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        jx0Var.f49117s = new kh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(jx0Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
