package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ch0 implements Runnable {
    public final int f44355a;
    public final NotificationsCustomSettingsActivity f44356b;
    public final View f44357c;
    public final int d;

    public ch0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i3, int i10) {
        this.f44355a = i10;
        this.f44356b = notificationsCustomSettingsActivity;
        this.f44357c = view;
        this.d = i3;
    }

    @Override
    public final void run() {
        int i3 = this.f44355a;
        int i10 = this.d;
        View view = this.f44357c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f44356b;
        switch (i3) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((gh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.s8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.bd.M0(2131748997, "LedColor"), true);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.v9) {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((gh0) arrayList2.get(i10)).f45665f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.c(org.telegram.messenger.bd.M0(2131747106, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, v9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (view instanceof org.telegram.ui.Cells.v9) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((gh0) arrayList3.get(i10)).f45665f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view;
                    v9Var2.c(org.telegram.messenger.bd.M0(2131747914, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, v9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
        }
    }
}
