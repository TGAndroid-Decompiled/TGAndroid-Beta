package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kk0 implements oy, org.telegram.ui.ActionBar.a2, x11 {
    public final NotificationsCustomSettingsActivity f38111a;

    public kk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38111a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38111a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33508w.size();
        for (int i11 = 0; i11 < size; i11++) {
            wk0 wk0Var = (wk0) notificationsCustomSettingsActivity.f33508w.get(i11);
            if (notificationsCustomSettingsActivity.f33507s == 3) {
                edit.remove("stories_" + wk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + wk0Var.d);
                remove.remove("custom_" + wk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(wk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(wk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33508w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((wk0) notificationsCustomSettingsActivity.f33508w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33508w.clear();
        notificationsCustomSettingsActivity.f33509x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38111a;
        if (notificationsCustomSettingsActivity.f33507s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((wk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33508w;
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
            obj.f42455e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33505n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42454c = i12;
            if (notificationsCustomSettingsActivity.f33508w == null) {
                notificationsCustomSettingsActivity.f33508w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33508w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        y11 y11Var = new y11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        y11Var.f42984r = new kk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(y11Var, true);
        return true;
    }

    @Override
    public void v(wk0 wk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38111a;
        notificationsCustomSettingsActivity.f33508w.add(0, wk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public void b0() {
    }
}
