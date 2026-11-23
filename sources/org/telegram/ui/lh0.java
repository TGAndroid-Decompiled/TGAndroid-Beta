package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements ww, org.telegram.ui.ActionBar.q1, ix0 {
    public final NotificationsCustomSettingsActivity f49621a;

    public lh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f49621a = notificationsCustomSettingsActivity;
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
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49621a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f43170x.size();
        for (int i10 = 0; i10 < size; i10++) {
            uh0 uh0Var = (uh0) notificationsCustomSettingsActivity.f43170x.get(i10);
            if (notificationsCustomSettingsActivity.f43168s == 3) {
                edit.remove("stories_" + uh0Var.d);
            } else {
                edit.remove("notify2_" + uh0Var.d).remove("custom_" + uh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(uh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(uh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f43170x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((uh0) notificationsCustomSettingsActivity.f43170x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f43170x.clear();
        notificationsCustomSettingsActivity.f43171y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.ls.f25304f0, new Object[0]);
    }

    @Override
    public void k(uh0 uh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49621a;
        notificationsCustomSettingsActivity.f43170x.add(0, uh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).f27073a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49621a;
        if (notificationsCustomSettingsActivity.f43168s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f43169w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((uh0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f43170x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((uh0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f52575e = true;
            Boolean bool = notificationsCustomSettingsActivity.f43166n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f52574c = i11;
            if (notificationsCustomSettingsActivity.f43170x == null) {
                notificationsCustomSettingsActivity.f43170x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f43170x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        jx0 jx0Var = new jx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        jx0Var.f49131s = new lh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(jx0Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
