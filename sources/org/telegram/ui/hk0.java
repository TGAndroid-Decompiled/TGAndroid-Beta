package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class hk0 implements my, org.telegram.ui.ActionBar.z1, t11 {
    public final NotificationsCustomSettingsActivity f38500a;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38500a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(sy syVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38500a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33897w.size();
        for (int i11 = 0; i11 < size; i11++) {
            uk0 uk0Var = (uk0) notificationsCustomSettingsActivity.f33897w.get(i11);
            if (notificationsCustomSettingsActivity.f33896s == 3) {
                edit.remove("stories_" + uk0Var.d);
            } else {
                edit.remove("notify2_" + uk0Var.d).remove("custom_" + uk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(uk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(uk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33897w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((uk0) notificationsCustomSettingsActivity.f33897w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33897w.clear();
        notificationsCustomSettingsActivity.f33898x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(uk0 uk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38500a;
        notificationsCustomSettingsActivity.f33897w.add(0, uk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38500a;
        if (notificationsCustomSettingsActivity.f33896s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((uk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33897w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((uk0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f42675e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33894n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42674c = i12;
            if (notificationsCustomSettingsActivity.f33897w == null) {
                notificationsCustomSettingsActivity.f33897w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33897w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        u11 u11Var = new u11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        u11Var.f42353r = new hk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(u11Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
