package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ck0 implements Runnable {
    public final int f32365a;
    public final NotificationsCustomSettingsActivity f32366b;
    public final View f32367c;
    public final int d;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f32365a = i11;
        this.f32366b = notificationsCustomSettingsActivity;
        this.f32367c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f32365a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f32366b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f32367c;
                if (view instanceof org.telegram.ui.Cells.z8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((hk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.z8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f32366b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f32367c;
                if (view2 instanceof org.telegram.ui.Cells.fa) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((hk0) arrayList2.get(i11)).f33877f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view2;
                    faVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, faVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f32366b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f32367c;
                if (view3 instanceof org.telegram.ui.Cells.fa) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((hk0) arrayList3.get(i12)).f33877f = notificationsCustomSettingsActivity3.h0();
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
