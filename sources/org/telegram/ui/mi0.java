package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class mi0 implements Runnable {
    public final int f39708a;
    public final NotificationsCustomSettingsActivity f39709b;
    public final View f39710c;
    public final int d;

    public mi0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f39708a = i11;
        this.f39709b = notificationsCustomSettingsActivity;
        this.f39710c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39708a;
        int i11 = this.d;
        View view = this.f39710c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39709b;
        switch (i10) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.v8) {
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        ((qi0) arrayList.get(i11)).h = notificationsCustomSettingsActivity.j0();
                    }
                    ((org.telegram.ui.Cells.v8) view).b(notificationsCustomSettingsActivity.j0(), org.telegram.messenger.cd.L0(2131748999, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.x9) {
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((qi0) arrayList2.get(i11)).f40993f = notificationsCustomSettingsActivity.k0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.c(org.telegram.messenger.cd.L0(2131747113, "PopupNotification"), notificationsCustomSettingsActivity.k0(), true, x9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.x9) {
                    if (i11 >= 0 && i11 < arrayList3.size()) {
                        ((qi0) arrayList3.get(i11)).f40993f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                    x9Var2.c(org.telegram.messenger.cd.L0(2131747922, "NotificationsImportance"), notificationsCustomSettingsActivity.l0(), true, x9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
        }
    }
}
