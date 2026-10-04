package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk0 implements Runnable {
    public final int f36670a;
    public final NotificationsCustomSettingsActivity f36671b;
    public final View f36672c;
    public final int d;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f36670a = i11;
        this.f36671b = notificationsCustomSettingsActivity;
        this.f36672c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f36670a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36671b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f36672c;
                if (view instanceof org.telegram.ui.Cells.y8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((lk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.y8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f36671b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f36672c;
                if (view2 instanceof org.telegram.ui.Cells.ea) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((lk0) arrayList2.get(i11)).f38287f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view2;
                    eaVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, eaVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f36671b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f36672c;
                if (view3 instanceof org.telegram.ui.Cells.ea) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((lk0) arrayList3.get(i12)).f38287f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view3;
                    eaVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, eaVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.l0(true);
                return;
        }
    }
}
