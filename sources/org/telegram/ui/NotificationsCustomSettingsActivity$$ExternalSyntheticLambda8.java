package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.Cells.TextSettingsCell;

public final class NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final NotificationsCustomSettingsActivity f$0;
    public final View f$1;
    public final int f$2;

    public NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationsCustomSettingsActivity;
        this.f$1 = view;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f$0;
                notificationsCustomSettingsActivity.getClass();
                View view = this.f$1;
                if (!(view instanceof TextSettingsCell)) {
                    notificationsCustomSettingsActivity.updateRows(true);
                } else {
                    int i = this.f$2;
                    if (i >= 0) {
                        ArrayList arrayList = notificationsCustomSettingsActivity.items;
                        if (i < arrayList.size()) {
                            ((NotificationsCustomSettingsActivity.ItemInner) arrayList.get(i)).text2 = notificationsCustomSettingsActivity.getPriorityOption();
                        }
                    }
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity.getPriorityOption(), true, textSettingsCell.needDivider);
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f$0;
                notificationsCustomSettingsActivity2.getClass();
                View view2 = this.f$1;
                if (!(view2 instanceof TextColorCell)) {
                    notificationsCustomSettingsActivity2.updateRows(true);
                } else {
                    int i2 = this.f$2;
                    if (i2 >= 0) {
                        ArrayList arrayList2 = notificationsCustomSettingsActivity2.items;
                        if (i2 < arrayList2.size()) {
                            ((NotificationsCustomSettingsActivity.ItemInner) arrayList2.get(i2)).color = notificationsCustomSettingsActivity2.getLedColor();
                        }
                    }
                    TextColorCell textColorCell = (TextColorCell) view2;
                    String string = LocaleController.getString("LedColor", R.string.LedColor);
                    int ledColor = notificationsCustomSettingsActivity2.getLedColor();
                    textColorCell.textView.setText(string);
                    textColorCell.needDivider = true;
                    textColorCell.currentColor = ledColor;
                    textColorCell.setWillNotDraw(false);
                    textColorCell.invalidate();
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f$0;
                notificationsCustomSettingsActivity3.getClass();
                View view3 = this.f$1;
                if (!(view3 instanceof TextSettingsCell)) {
                    notificationsCustomSettingsActivity3.updateRows(true);
                } else {
                    int i3 = this.f$2;
                    if (i3 >= 0) {
                        ArrayList arrayList3 = notificationsCustomSettingsActivity3.items;
                        if (i3 < arrayList3.size()) {
                            ((NotificationsCustomSettingsActivity.ItemInner) arrayList3.get(i3)).text2 = notificationsCustomSettingsActivity3.getPopupOption();
                        }
                    }
                    TextSettingsCell textSettingsCell2 = (TextSettingsCell) view3;
                    textSettingsCell2.setTextAndValue(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity3.getPopupOption(), true, textSettingsCell2.needDivider);
                }
                break;
        }
    }
}
