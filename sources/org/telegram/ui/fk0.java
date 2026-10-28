package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fk0 implements Runnable {
    public final int f39393a;
    public final NotificationsCustomSettingsActivity f39394b;
    public final View f39395c;
    public final int d;

    public fk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f39393a = i11;
        this.f39394b = notificationsCustomSettingsActivity;
        this.f39395c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39393a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39394b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f39395c;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((kk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.g0();
                    }
                    ((org.telegram.ui.Cells.c9) view).b(notificationsCustomSettingsActivity.g0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.m0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f39394b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f39395c;
                if (view2 instanceof org.telegram.ui.Cells.ga) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((kk0) arrayList2.get(i11)).f40820f = notificationsCustomSettingsActivity2.h0();
                    }
                    org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view2;
                    gaVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.h0(), true, gaVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.m0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f39394b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f39395c;
                if (view3 instanceof org.telegram.ui.Cells.ga) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((kk0) arrayList3.get(i12)).f40820f = notificationsCustomSettingsActivity3.i0();
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
