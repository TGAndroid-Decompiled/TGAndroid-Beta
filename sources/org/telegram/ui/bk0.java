package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class bk0 implements ly, org.telegram.ui.ActionBar.a2, o11 {
    public final NotificationsCustomSettingsActivity f32139a;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f32139a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32139a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f30842w.size();
        for (int i11 = 0; i11 < size; i11++) {
            nk0 nk0Var = (nk0) notificationsCustomSettingsActivity.f30842w.get(i11);
            if (notificationsCustomSettingsActivity.f30841s == 3) {
                edit.remove("stories_" + nk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + nk0Var.d);
                remove.remove("custom_" + nk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(nk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(nk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f30842w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((nk0) notificationsCustomSettingsActivity.f30842w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f30842w.clear();
        notificationsCustomSettingsActivity.f30843x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32139a;
        if (notificationsCustomSettingsActivity.f30841s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((nk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f30842w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((nk0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f30839n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f35548c = i12;
            if (notificationsCustomSettingsActivity.f30842w == null) {
                notificationsCustomSettingsActivity.f30842w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f30842w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        p11 p11Var = new p11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        p11Var.f36004r = new bk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(p11Var, true);
        return true;
    }

    @Override
    public void v(nk0 nk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32139a;
        notificationsCustomSettingsActivity.f30842w.add(0, nk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public void c0() {
    }
}
