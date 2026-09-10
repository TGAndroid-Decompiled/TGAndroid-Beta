package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class jk0 implements qy, org.telegram.ui.ActionBar.c2, b21 {
    public final NotificationsCustomSettingsActivity f34128a;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f34128a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34128a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f29984w.size();
        for (int i11 = 0; i11 < size; i11++) {
            vk0 vk0Var = (vk0) notificationsCustomSettingsActivity.f29984w.get(i11);
            if (notificationsCustomSettingsActivity.f29983s == 3) {
                edit.remove("stories_" + vk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + vk0Var.d);
                remove.remove("custom_" + vk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(vk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(vk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f29984w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((vk0) notificationsCustomSettingsActivity.f29984w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f29984w.clear();
        notificationsCustomSettingsActivity.f29985x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void u(vk0 vk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34128a;
        notificationsCustomSettingsActivity.f29984w.add(0, vk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34128a;
        if (notificationsCustomSettingsActivity.f29983s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((vk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f29984w;
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
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f29981n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f37581c = i12;
            if (notificationsCustomSettingsActivity.f29984w == null) {
                notificationsCustomSettingsActivity.f29984w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f29984w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        c21 c21Var = new c21(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        c21Var.f31504r = new jk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(c21Var, true);
        return true;
    }

    @Override
    public void Z() {
    }
}
