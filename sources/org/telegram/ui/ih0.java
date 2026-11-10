package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class ih0 implements tw, org.telegram.ui.ActionBar.r1, kx0 {
    public final NotificationsCustomSettingsActivity f46633a;

    public ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f46633a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46633a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f41310x.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh0 rh0Var = (rh0) notificationsCustomSettingsActivity.f41310x.get(i10);
            if (notificationsCustomSettingsActivity.f41308s == 3) {
                edit.remove("stories_" + rh0Var.d);
            } else {
                edit.remove("notify2_" + rh0Var.d).remove("custom_" + rh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(rh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(rh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f41310x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((rh0) notificationsCustomSettingsActivity.f41310x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f41310x.clear();
        notificationsCustomSettingsActivity.f41311y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.qs.f25000f0, new Object[0]);
    }

    @Override
    public void t(rh0 rh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46633a;
        notificationsCustomSettingsActivity.f41310x.add(0, rh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26524a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46633a;
        if (notificationsCustomSettingsActivity.f41308s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f41309w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((rh0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f41310x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((rh0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f49421e = true;
            Boolean bool = notificationsCustomSettingsActivity.f41306n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f49420c = i11;
            if (notificationsCustomSettingsActivity.f41310x == null) {
                notificationsCustomSettingsActivity.f41310x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f41310x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        lx0 lx0Var = new lx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        lx0Var.f47730s = new ih0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(lx0Var, true);
        return true;
    }

    @Override
    public void c0() {
    }
}
