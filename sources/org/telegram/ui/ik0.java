package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements ny, org.telegram.ui.ActionBar.a2, u11 {
    public final NotificationsCustomSettingsActivity f38684a;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38684a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38684a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33835w.size();
        for (int i11 = 0; i11 < size; i11++) {
            vk0 vk0Var = (vk0) notificationsCustomSettingsActivity.f33835w.get(i11);
            if (notificationsCustomSettingsActivity.f33834s == 3) {
                edit.remove("stories_" + vk0Var.d);
            } else {
                edit.remove("notify2_" + vk0Var.d).remove("custom_" + vk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(vk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(vk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33835w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((vk0) notificationsCustomSettingsActivity.f33835w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33835w.clear();
        notificationsCustomSettingsActivity.f33836x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(vk0 vk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38684a;
        notificationsCustomSettingsActivity.f33835w.add(0, vk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38684a;
        if (notificationsCustomSettingsActivity.f33834s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((vk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33835w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((vk0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f42894e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33832n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42893c = i12;
            if (notificationsCustomSettingsActivity.f33835w == null) {
                notificationsCustomSettingsActivity.f33835w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33835w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        v11 v11Var = new v11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        v11Var.f42607r = new ik0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(v11Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
