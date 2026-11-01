package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ki0 implements Runnable {
    public final int f38896a;
    public final NotificationsCustomSettingsActivity f38897b;
    public final View f38898c;
    public final int d;

    public ki0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f38896a = i11;
        this.f38897b = notificationsCustomSettingsActivity;
        this.f38898c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f38896a;
        int i11 = this.d;
        View view = this.f38898c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38897b;
        switch (i10) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.v8) {
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        ((oi0) arrayList.get(i11)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.v8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.dd.L0(2131748999, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.x9) {
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((oi0) arrayList2.get(i11)).f40168f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.c(org.telegram.messenger.dd.L0(2131747113, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, x9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.x9) {
                    if (i11 >= 0 && i11 < arrayList3.size()) {
                        ((oi0) arrayList3.get(i11)).f40168f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                    x9Var2.c(org.telegram.messenger.dd.L0(2131747922, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, x9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
