package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class mk0 implements sy, org.telegram.ui.ActionBar.z1, b21 {
    public final NotificationsCustomSettingsActivity f38024a;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38024a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38024a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f31862w.size();
        for (int i11 = 0; i11 < size; i11++) {
            zk0 zk0Var = (zk0) notificationsCustomSettingsActivity.f31862w.get(i11);
            if (notificationsCustomSettingsActivity.f31861s == 3) {
                edit.remove("stories_" + zk0Var.d);
            } else {
                edit.remove("notify2_" + zk0Var.d).remove("custom_" + zk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(zk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(zk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f31862w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((zk0) notificationsCustomSettingsActivity.f31862w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f31862w.clear();
        notificationsCustomSettingsActivity.f31863x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(zk0 zk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38024a;
        notificationsCustomSettingsActivity.f31862w.add(0, zk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38024a;
        if (notificationsCustomSettingsActivity.f31861s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((zk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f31862w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((zk0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f31859n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42348c = i12;
            if (notificationsCustomSettingsActivity.f31862w == null) {
                notificationsCustomSettingsActivity.f31862w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f31862w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        c21 c21Var = new c21(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        c21Var.f34434r = new mk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(c21Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
