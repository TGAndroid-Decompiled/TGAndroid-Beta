package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 implements Runnable {
    public final int f38902a;
    public final NotificationsCustomSettingsActivity f38903b;
    public final View f38904c;
    public final int d;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f38902a = i11;
        this.f38903b = notificationsCustomSettingsActivity;
        this.f38904c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38902a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38903b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f38904c;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((ik0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.g0();
                    }
                    ((org.telegram.ui.Cells.c9) view).b(notificationsCustomSettingsActivity.g0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.m0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f38903b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f38904c;
                if (view2 instanceof org.telegram.ui.Cells.ga) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((ik0) arrayList2.get(i11)).f40257f = notificationsCustomSettingsActivity2.h0();
                    }
                    org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view2;
                    gaVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.h0(), true, gaVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.m0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f38903b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f38904c;
                if (view3 instanceof org.telegram.ui.Cells.ga) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((ik0) arrayList3.get(i12)).f40257f = notificationsCustomSettingsActivity3.i0();
                    }
                    org.telegram.ui.Cells.ga gaVar2 = (org.telegram.ui.Cells.ga) view3;
                    gaVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.i0(), true, gaVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.m0(true);
                return;
        }
    }
}
