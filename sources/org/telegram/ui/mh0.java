package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class mh0 implements Runnable {
    public final int f49879a;
    public final NotificationsCustomSettingsActivity f49880b;
    public final View f49881c;
    public final int d;

    public mh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
        this.f49879a = i10;
        this.f49880b = notificationsCustomSettingsActivity;
        this.f49881c = view;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f49879a;
        int i10 = this.d;
        View view = this.f49881c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f49880b;
        switch (i7) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.u8) {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((qh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.u8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.gd.N0(2131748796, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.x9) {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((qh0) arrayList2.get(i10)).f51282f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.c(org.telegram.messenger.gd.N0(2131746904, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, x9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.x9) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((qh0) arrayList3.get(i10)).f51282f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                    x9Var2.c(org.telegram.messenger.gd.N0(2131747712, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, x9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
