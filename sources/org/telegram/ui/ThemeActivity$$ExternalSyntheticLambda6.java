package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.RecyclerListView;

public final class ThemeActivity$$ExternalSyntheticLambda6 implements RecyclerListView.IntReturnCallback, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ThemeActivity f$0;

    public ThemeActivity$$ExternalSyntheticLambda6(ThemeActivity themeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themeActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ThemeActivity themeActivity = this.f$0;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                ThemeActivity themeActivity2 = this.f$0;
                themeActivity2.getClass();
                AlertsCreator.createThemeCreateDialog(themeActivity2, 0, null, null);
                break;
        }
    }

    @Override
    public int run() {
        return this.f$0.sensitiveContentRow;
    }
}
