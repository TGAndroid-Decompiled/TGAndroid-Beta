package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ThemeActivity$$ExternalSyntheticLambda4 implements RecyclerListView.IntReturnCallback, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ThemeActivity f$0;

    public ThemeActivity$$ExternalSyntheticLambda4(ThemeActivity themeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themeActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createNewTheme$16(alertDialog, i);
                break;
            default:
                this.f$0.lambda$updateSunTime$21(alertDialog, i);
                break;
        }
    }

    @Override
    public int run() {
        return this.f$0.lambda$createView$14();
    }
}
