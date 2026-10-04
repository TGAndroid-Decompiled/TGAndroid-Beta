package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class fk0 implements oy, org.telegram.ui.ActionBar.a2, o11 {
    public final NotificationsCustomSettingsActivity f36340a;

    public fk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f36340a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36340a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33825w.size();
        for (int i11 = 0; i11 < size; i11++) {
            rk0 rk0Var = (rk0) notificationsCustomSettingsActivity.f33825w.get(i11);
            if (notificationsCustomSettingsActivity.f33824s == 3) {
                edit.remove("stories_" + rk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + rk0Var.d);
                remove.remove("custom_" + rk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(rk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(rk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33825w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((rk0) notificationsCustomSettingsActivity.f33825w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33825w.clear();
        notificationsCustomSettingsActivity.f33826x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36340a;
        if (notificationsCustomSettingsActivity.f33824s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((rk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33825w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((rk0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f40155e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33822n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f40154c = i12;
            if (notificationsCustomSettingsActivity.f33825w == null) {
                notificationsCustomSettingsActivity.f33825w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33825w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        p11 p11Var = new p11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        p11Var.f39319r = new fk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(p11Var, true);
        return true;
    }

    @Override
    public void v(rk0 rk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36340a;
        notificationsCustomSettingsActivity.f33825w.add(0, rk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public void d0() {
    }
}
