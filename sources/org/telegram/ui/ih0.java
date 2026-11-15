package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ih0 implements Runnable {
    public final int f48045a;
    public final NotificationsCustomSettingsActivity f48046b;
    public final View f48047c;
    public final int d;

    public ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
        this.f48045a = i10;
        this.f48046b = notificationsCustomSettingsActivity;
        this.f48047c = view;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f48045a;
        int i10 = this.d;
        View view = this.f48047c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f48046b;
        switch (i7) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((mh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.s8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.hd.M0(2131748989, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.v9) {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((mh0) arrayList2.get(i10)).f49231f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.c(org.telegram.messenger.hd.M0(2131747098, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, v9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.v9) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((mh0) arrayList3.get(i10)).f49231f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view;
                    v9Var2.c(org.telegram.messenger.hd.M0(2131747906, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, v9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
