package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class hk0 implements oy, org.telegram.ui.ActionBar.a2, w11 {
    public final NotificationsCustomSettingsActivity f34318a;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f34318a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34318a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f30868w.size();
        for (int i11 = 0; i11 < size; i11++) {
            tk0 tk0Var = (tk0) notificationsCustomSettingsActivity.f30868w.get(i11);
            if (notificationsCustomSettingsActivity.f30867s == 3) {
                edit.remove("stories_" + tk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + tk0Var.d);
                remove.remove("custom_" + tk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(tk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(tk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f30868w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((tk0) notificationsCustomSettingsActivity.f30868w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f30868w.clear();
        notificationsCustomSettingsActivity.f30869x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34318a;
        if (notificationsCustomSettingsActivity.f30867s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((tk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f30868w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((tk0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f30865n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f37693c = i12;
            if (notificationsCustomSettingsActivity.f30868w == null) {
                notificationsCustomSettingsActivity.f30868w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f30868w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        x11 x11Var = new x11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        x11Var.f39468r = new hk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(x11Var, true);
        return true;
    }

    @Override
    public void v(tk0 tk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f34318a;
        notificationsCustomSettingsActivity.f30868w.add(0, tk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public void c0() {
    }
}
