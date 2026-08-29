package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pj0 implements yx, org.telegram.ui.ActionBar.b2, s01 {
    public final NotificationsCustomSettingsActivity f41428a;

    public pj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41428a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41428a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f35618w.size();
        for (int i11 = 0; i11 < size; i11++) {
            bk0 bk0Var = (bk0) notificationsCustomSettingsActivity.f35618w.get(i11);
            if (notificationsCustomSettingsActivity.f35617s == 3) {
                edit.remove("stories_" + bk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + bk0Var.d);
                remove.remove("custom_" + bk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(bk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(bk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f35618w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((bk0) notificationsCustomSettingsActivity.f35618w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f35618w.clear();
        notificationsCustomSettingsActivity.f35619x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void m(bk0 bk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41428a;
        notificationsCustomSettingsActivity.f35618w.add(0, bk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41428a;
        if (notificationsCustomSettingsActivity.f35617s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((bk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f35618w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((bk0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.f36822e = true;
            Boolean bool = notificationsCustomSettingsActivity.f35615n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f36821c = i12;
            if (notificationsCustomSettingsActivity.f35618w == null) {
                notificationsCustomSettingsActivity.f35618w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f35618w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        t01 t01Var = new t01(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        t01Var.f42517r = new pj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(t01Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
