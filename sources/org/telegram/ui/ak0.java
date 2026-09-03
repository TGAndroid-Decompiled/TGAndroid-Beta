package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ak0 implements Runnable {
    public final int f35208a;
    public final NotificationsCustomSettingsActivity f35209b;
    public final View f35210c;
    public final int d;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f35208a = i11;
        this.f35209b = notificationsCustomSettingsActivity;
        this.f35210c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35208a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f35209b;
                ArrayList arrayList = notificationsCustomSettingsActivity.F;
                View view = this.f35210c;
                if (view instanceof org.telegram.ui.Cells.u8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((fk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.u8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f35209b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.F;
                View view2 = this.f35210c;
                if (view2 instanceof org.telegram.ui.Cells.aa) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((fk0) arrayList2.get(i11)).f36810f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view2;
                    aaVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, aaVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f35209b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.F;
                View view3 = this.f35210c;
                if (view3 instanceof org.telegram.ui.Cells.aa) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((fk0) arrayList3.get(i12)).f36810f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.aa aaVar2 = (org.telegram.ui.Cells.aa) view3;
                    aaVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, aaVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.l0(true);
                return;
        }
    }
}
