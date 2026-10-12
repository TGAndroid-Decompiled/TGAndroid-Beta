package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class jk0 implements py, org.telegram.ui.ActionBar.z1, w11 {
    public final NotificationsCustomSettingsActivity f39239a;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39239a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(vy vyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39239a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33674w.size();
        for (int i11 = 0; i11 < size; i11++) {
            wk0 wk0Var = (wk0) notificationsCustomSettingsActivity.f33674w.get(i11);
            if (notificationsCustomSettingsActivity.f33673s == 3) {
                edit.remove("stories_" + wk0Var.d);
            } else {
                edit.remove("notify2_" + wk0Var.d).remove("custom_" + wk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(wk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(wk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33674w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((wk0) notificationsCustomSettingsActivity.f33674w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33674w.clear();
        notificationsCustomSettingsActivity.f33675x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(wk0 wk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39239a;
        notificationsCustomSettingsActivity.f33674w.add(0, wk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39239a;
        if (notificationsCustomSettingsActivity.f33673s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((wk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33674w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((wk0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f43562e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33671n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f43561c = i12;
            if (notificationsCustomSettingsActivity.f33674w == null) {
                notificationsCustomSettingsActivity.f33674w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33674w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        x11 x11Var = new x11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        x11Var.f43726r = new jk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(x11Var, true);
        return true;
    }

    @Override
    public void b0() {
    }
}
