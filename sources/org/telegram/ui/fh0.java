package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements qw, org.telegram.ui.ActionBar.r1, fx0 {
    public final NotificationsCustomSettingsActivity f45633a;

    public fh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f45633a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f45633a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f41308x.size();
        for (int i10 = 0; i10 < size; i10++) {
            oh0 oh0Var = (oh0) notificationsCustomSettingsActivity.f41308x.get(i10);
            if (notificationsCustomSettingsActivity.f41306s == 3) {
                edit.remove("stories_" + oh0Var.d);
            } else {
                edit.remove("notify2_" + oh0Var.d).remove("custom_" + oh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(oh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(oh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f41308x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((oh0) notificationsCustomSettingsActivity.f41308x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f41308x.clear();
        notificationsCustomSettingsActivity.f41309y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.qs.f24987f0, new Object[0]);
    }

    @Override
    public void t(oh0 oh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f45633a;
        notificationsCustomSettingsActivity.f41308x.add(0, oh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26513a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f45633a;
        if (notificationsCustomSettingsActivity.f41306s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.f41307w;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((oh0) it.next()).d == j3) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f41308x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((oh0) it2.next()).d == j3) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j3;
            obj.f48415e = true;
            Boolean bool = notificationsCustomSettingsActivity.f41304n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f48414c = i11;
            if (notificationsCustomSettingsActivity.f41308x == null) {
                notificationsCustomSettingsActivity.f41308x = new ArrayList();
            }
            notificationsCustomSettingsActivity.f41308x.add(obj);
            notificationsCustomSettingsActivity.q0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j3);
        bundle.putBoolean("exception", true);
        gx0 gx0Var = new gx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        gx0Var.f46137s = new fh0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(gx0Var, true);
        return true;
    }

    @Override
    public void c0() {
    }
}
