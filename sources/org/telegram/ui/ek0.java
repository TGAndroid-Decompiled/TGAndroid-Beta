package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ek0 implements xx, org.telegram.ui.ActionBar.b2, i11 {
    public final NotificationsCustomSettingsActivity f38906a;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38906a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38906a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f35604w.size();
        for (int i11 = 0; i11 < size; i11++) {
            qk0 qk0Var = (qk0) notificationsCustomSettingsActivity.f35604w.get(i11);
            if (notificationsCustomSettingsActivity.f35603s == 3) {
                edit.remove("stories_" + qk0Var.d);
            } else {
                edit.remove("notify2_" + qk0Var.d).remove("custom_" + qk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(qk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(qk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f35604w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((qk0) notificationsCustomSettingsActivity.f35604w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f35604w.clear();
        notificationsCustomSettingsActivity.f35605x.clear();
        notificationsCustomSettingsActivity.m0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void t(qk0 qk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38906a;
        notificationsCustomSettingsActivity.f35604w.add(0, qk0Var);
        notificationsCustomSettingsActivity.m0(true);
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38906a;
        if (notificationsCustomSettingsActivity.f35603s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((qk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f35604w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((qk0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f35601n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42741c = i12;
            if (notificationsCustomSettingsActivity.f35604w == null) {
                notificationsCustomSettingsActivity.f35604w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f35604w.add(obj);
            notificationsCustomSettingsActivity.m0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        j11 j11Var = new j11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        j11Var.f40355s = new ek0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(j11Var, true);
        return true;
    }

    @Override
    public void Y() {
    }
}
