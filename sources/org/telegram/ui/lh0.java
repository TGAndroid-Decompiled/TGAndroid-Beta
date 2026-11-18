package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class lh0 implements Runnable {
    public final int f49605a;
    public final NotificationsCustomSettingsActivity f49606b;
    public final View f49607c;
    public final int d;

    public lh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
        this.f49605a = i10;
        this.f49606b = notificationsCustomSettingsActivity;
        this.f49607c = view;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f49605a;
        int i10 = this.d;
        View view = this.f49607c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49606b;
        switch (i7) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.t8) {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((ph0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.t8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.gd.M0(2131748797, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.w9) {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((ph0) arrayList2.get(i10)).f50914f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.c(org.telegram.messenger.gd.M0(2131746905, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, w9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.w9) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((ph0) arrayList3.get(i10)).f50914f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view;
                    w9Var2.c(org.telegram.messenger.gd.M0(2131747713, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, w9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
