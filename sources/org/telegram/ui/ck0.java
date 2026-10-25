package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ck0 implements ux, org.telegram.ui.ActionBar.b2, g11 {
    public final NotificationsCustomSettingsActivity f38492a;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38492a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(cy cyVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38492a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f35577w.size();
        for (int i11 = 0; i11 < size; i11++) {
            ok0 ok0Var = (ok0) notificationsCustomSettingsActivity.f35577w.get(i11);
            if (notificationsCustomSettingsActivity.f35576s == 3) {
                edit.remove("stories_" + ok0Var.d);
            } else {
                edit.remove("notify2_" + ok0Var.d).remove("custom_" + ok0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(ok0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(ok0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f35577w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((ok0) notificationsCustomSettingsActivity.f35577w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f35577w.clear();
        notificationsCustomSettingsActivity.f35578x.clear();
        notificationsCustomSettingsActivity.m0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void t(ok0 ok0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38492a;
        notificationsCustomSettingsActivity.f35577w.add(0, ok0Var);
        notificationsCustomSettingsActivity.m0(true);
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38492a;
        if (notificationsCustomSettingsActivity.f35576s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((ok0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f35577w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((ok0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f35574n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f42237c = i12;
            if (notificationsCustomSettingsActivity.f35577w == null) {
                notificationsCustomSettingsActivity.f35577w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f35577w.add(obj);
            notificationsCustomSettingsActivity.m0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        h11 h11Var = new h11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        h11Var.f39858s = new ck0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(h11Var, true);
        return true;
    }

    @Override
    public void Y() {
    }
}
