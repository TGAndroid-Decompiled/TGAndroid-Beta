package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class jk0 implements qy, org.telegram.ui.ActionBar.b2, x11 {
    public final NotificationsCustomSettingsActivity f34899a;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f34899a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(wy wyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34899a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f30885w.size();
        for (int i11 = 0; i11 < size; i11++) {
            vk0 vk0Var = (vk0) notificationsCustomSettingsActivity.f30885w.get(i11);
            if (notificationsCustomSettingsActivity.f30884s == 3) {
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
        int size2 = notificationsCustomSettingsActivity.f30885w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((vk0) notificationsCustomSettingsActivity.f30885w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f30885w.clear();
        notificationsCustomSettingsActivity.f30886x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34899a;
        if (notificationsCustomSettingsActivity.f30884s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((vk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f30885w;
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
            Boolean bool = notificationsCustomSettingsActivity.f30882n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f38466c = i12;
            if (notificationsCustomSettingsActivity.f30885w == null) {
                notificationsCustomSettingsActivity.f30885w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f30885w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        y11 y11Var = new y11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        y11Var.f39768r = new jk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(y11Var, true);
        return true;
    }

    @Override
    public void v(vk0 vk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34899a;
        notificationsCustomSettingsActivity.f30885w.add(0, vk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public void c0() {
    }
}
