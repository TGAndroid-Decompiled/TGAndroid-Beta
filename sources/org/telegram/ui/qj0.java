package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qj0 implements Runnable {
    public final int f41738a;
    public final NotificationsCustomSettingsActivity f41739b;
    public final View f41740c;
    public final int d;

    public qj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f41738a = i11;
        this.f41739b = notificationsCustomSettingsActivity;
        this.f41740c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f41738a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41739b;
                ArrayList arrayList = notificationsCustomSettingsActivity.E;
                View view = this.f41740c;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((vj0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.s8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f41739b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.E;
                View view2 = this.f41740c;
                if (view2 instanceof org.telegram.ui.Cells.y9) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((vj0) arrayList2.get(i11)).f43612f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view2;
                    y9Var.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, y9Var.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f41739b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.E;
                View view3 = this.f41740c;
                if (view3 instanceof org.telegram.ui.Cells.y9) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((vj0) arrayList3.get(i12)).f43612f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.y9 y9Var2 = (org.telegram.ui.Cells.y9) view3;
                    y9Var2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, y9Var2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.l0(true);
                return;
        }
    }
}
