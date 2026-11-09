package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class hh0 implements sw, org.telegram.ui.ActionBar.r1, jx0 {
    public final NotificationsCustomSettingsActivity f46313a;

    public hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f46313a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(yw ywVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46313a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f41319x.size();
        for (int i10 = 0; i10 < size; i10++) {
            qh0 qh0Var = (qh0) notificationsCustomSettingsActivity.f41319x.get(i10);
            if (notificationsCustomSettingsActivity.f41317s == 3) {
                edit.remove("stories_" + qh0Var.d);
            } else {
                edit.remove("notify2_" + qh0Var.d).remove("custom_" + qh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(qh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(qh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f41319x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((qh0) notificationsCustomSettingsActivity.f41319x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f41319x.clear();
        notificationsCustomSettingsActivity.f41320y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.qs.f24996f0, new Object[0]);
    }

    @Override
    public void t(qh0 qh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46313a;
        notificationsCustomSettingsActivity.f41319x.add(0, qh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46313a;
        if (notificationsCustomSettingsActivity.f41317s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f41318w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((qh0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f41319x;
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
            obj.f49062e = true;
            Boolean bool = notificationsCustomSettingsActivity.f41315n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f49061c = i11;
            if (notificationsCustomSettingsActivity.f41319x == null) {
                notificationsCustomSettingsActivity.f41319x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f41319x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        kx0 kx0Var = new kx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        kx0Var.f47406s = new hh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(kx0Var, true);
        return true;
    }

    @Override
    public void c0() {
    }
}
