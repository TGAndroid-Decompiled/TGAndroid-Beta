package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class nk0 implements sy, org.telegram.ui.ActionBar.z1, b21 {
    public final NotificationsCustomSettingsActivity f38731a;

    public nk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f38731a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38731a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f32160w.size();
        for (int i11 = 0; i11 < size; i11++) {
            al0 al0Var = (al0) notificationsCustomSettingsActivity.f32160w.get(i11);
            if (notificationsCustomSettingsActivity.f32159s == 3) {
                edit.remove("stories_" + al0Var.d);
            } else {
                edit.remove("notify2_" + al0Var.d).remove("custom_" + al0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(al0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(al0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f32160w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((al0) notificationsCustomSettingsActivity.f32160w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f32160w.clear();
        notificationsCustomSettingsActivity.f32161x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(al0 al0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38731a;
        notificationsCustomSettingsActivity.f32160w.add(0, al0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38731a;
        if (notificationsCustomSettingsActivity.f32159s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((al0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f32160w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((al0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f32157n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f34275c = i12;
            if (notificationsCustomSettingsActivity.f32160w == null) {
                notificationsCustomSettingsActivity.f32160w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f32160w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        c21 c21Var = new c21(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        c21Var.f34712r = new nk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(c21Var, true);
        return true;
    }

    @Override
    public void a0() {
    }
}
