package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ih0 implements Runnable {
    public final int f46668a;
    public final NotificationsCustomSettingsActivity f46669b;
    public final View f46670c;
    public final int d;

    public ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
        this.f46668a = i10;
        this.f46669b = notificationsCustomSettingsActivity;
        this.f46670c = view;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f46668a;
        int i10 = this.d;
        View view = this.f46670c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f46669b;
        switch (i7) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.t8) {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((mh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.t8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.id.M0(2131748989, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.w9) {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((mh0) arrayList2.get(i10)).f47882f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.c(org.telegram.messenger.id.M0(2131747098, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, w9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (view instanceof org.telegram.ui.Cells.w9) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((mh0) arrayList3.get(i10)).f47882f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view;
                    w9Var2.c(org.telegram.messenger.id.M0(2131747906, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, w9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
