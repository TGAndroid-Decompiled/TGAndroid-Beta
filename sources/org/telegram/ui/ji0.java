package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class ji0 implements tx, org.telegram.ui.ActionBar.u1, sy0 {
    public final NotificationsCustomSettingsActivity f38399a;

    public ji0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38399a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38399a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33412x.size();
        for (int i11 = 0; i11 < size; i11++) {
            si0 si0Var = (si0) notificationsCustomSettingsActivity.f33412x.get(i11);
            if (notificationsCustomSettingsActivity.f33410s == 3) {
                edit.remove("stories_" + si0Var.d);
            } else {
                edit.remove("notify2_" + si0Var.d).remove("custom_" + si0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(si0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(si0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33412x.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((si0) notificationsCustomSettingsActivity.f33412x.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33412x.clear();
        notificationsCustomSettingsActivity.f33413y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.at.f14704f0, new Object[0]);
    }

    @Override
    public void w(si0 si0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38399a;
        notificationsCustomSettingsActivity.f33412x.add(0, si0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12 = 0;
        long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38399a;
        if (notificationsCustomSettingsActivity.f33410s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f33411w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((si0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33412x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((si0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33408n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f41378c = i12;
            if (notificationsCustomSettingsActivity.f33412x == null) {
                notificationsCustomSettingsActivity.f33412x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33412x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        ty0 ty0Var = new ty0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        ty0Var.f41749s = new ji0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(ty0Var, true);
        return true;
    }

    @Override
    public void b0() {
    }
}
