package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class bk0 implements ky, org.telegram.ui.ActionBar.z1, m11 {
    public final NotificationsCustomSettingsActivity f32447a;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f32447a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(qy qyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32447a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f31158w.size();
        for (int i11 = 0; i11 < size; i11++) {
            nk0 nk0Var = (nk0) notificationsCustomSettingsActivity.f31158w.get(i11);
            if (notificationsCustomSettingsActivity.f31157s == 3) {
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
        int size2 = notificationsCustomSettingsActivity.f31158w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((nk0) notificationsCustomSettingsActivity.f31158w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f31158w.clear();
        notificationsCustomSettingsActivity.f31159x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32447a;
        if (notificationsCustomSettingsActivity.f31157s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((nk0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f31158w;
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
            Boolean bool = notificationsCustomSettingsActivity.f31155n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f35920c = i12;
            if (notificationsCustomSettingsActivity.f31158w == null) {
                notificationsCustomSettingsActivity.f31158w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f31158w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        n11 n11Var = new n11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        n11Var.f35731r = new bk0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(n11Var, true);
        return true;
    }

    @Override
    public void v(nk0 nk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32447a;
        notificationsCustomSettingsActivity.f31158w.add(0, nk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public void c0() {
    }
}
