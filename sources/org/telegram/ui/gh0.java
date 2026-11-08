package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class gh0 implements Runnable {
    public final int f46007a;
    public final NotificationsCustomSettingsActivity f46008b;
    public final View f46009c;
    public final int d;

    public gh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
        this.f46007a = i10;
        this.f46008b = notificationsCustomSettingsActivity;
        this.f46009c = view;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f46007a;
        int i10 = this.d;
        View view = this.f46009c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46008b;
        switch (i7) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.t8) {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((kh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.t8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.id.M0(2131748990, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.w9) {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((kh0) arrayList2.get(i10)).f47198f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.c(org.telegram.messenger.id.M0(2131747099, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, w9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.w9) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((kh0) arrayList3.get(i10)).f47198f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view;
                    w9Var2.c(org.telegram.messenger.id.M0(2131747907, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, w9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
