package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements nw, org.telegram.ui.ActionBar.p1, xw0 {
    public final NotificationsCustomSettingsActivity f44046a;

    public bh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f44046a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44046a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f41341x.size();
        for (int i10 = 0; i10 < size; i10++) {
            lh0 lh0Var = (lh0) notificationsCustomSettingsActivity.f41341x.get(i10);
            if (notificationsCustomSettingsActivity.f41339s == 3) {
                edit.remove("stories_" + lh0Var.d);
            } else {
                edit.remove("notify2_" + lh0Var.d).remove("custom_" + lh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(lh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(lh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f41341x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((lh0) notificationsCustomSettingsActivity.f41341x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f41341x.clear();
        notificationsCustomSettingsActivity.f41342y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.hs.f23225f0, new Object[0]);
    }

    @Override
    public void l(lh0 lh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44046a;
        notificationsCustomSettingsActivity.f41341x.add(0, lh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11 = 0;
        long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44046a;
        if (notificationsCustomSettingsActivity.f41339s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f41340w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((lh0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f41341x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((lh0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.f47340e = true;
            Boolean bool = notificationsCustomSettingsActivity.f41337n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f47339c = i11;
            if (notificationsCustomSettingsActivity.f41341x == null) {
                notificationsCustomSettingsActivity.f41341x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f41341x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        yw0 yw0Var = new yw0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        yw0Var.f52429s = new bh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(yw0Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
