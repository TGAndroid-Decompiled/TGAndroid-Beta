package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk0 implements Runnable {
    public final int f35490a;
    public final NotificationsCustomSettingsActivity f35491b;
    public final View f35492c;
    public final int d;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f35490a = i11;
        this.f35491b = notificationsCustomSettingsActivity;
        this.f35492c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35490a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35491b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f35492c;
                if (view instanceof org.telegram.ui.Cells.z8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((qk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.z8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f35491b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f35492c;
                if (view2 instanceof org.telegram.ui.Cells.fa) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((qk0) arrayList2.get(i11)).f36951f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view2;
                    faVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, faVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f35491b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f35492c;
                if (view3 instanceof org.telegram.ui.Cells.fa) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((qk0) arrayList3.get(i12)).f36951f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.fa faVar2 = (org.telegram.ui.Cells.fa) view3;
                    faVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, faVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.l0(true);
                return;
        }
    }
}
