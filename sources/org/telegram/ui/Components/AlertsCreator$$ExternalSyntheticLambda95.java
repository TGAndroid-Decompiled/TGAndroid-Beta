package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;

public final class AlertsCreator$$ExternalSyntheticLambda95 implements View.OnClickListener {
    public final int $r8$classId;
    public final BottomSheet[] f$0;

    public AlertsCreator$$ExternalSyntheticLambda95(BottomSheet[] bottomSheetArr, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createTimePickerDialog$112(this.f$0, view);
                break;
            case 1:
                AlertsCreator.lambda$createTimezonePickerDialog$104(this.f$0, view);
                break;
            case 2:
                AlertsCreator.lambda$createCustomPicker$265(this.f$0, view);
                break;
            case 3:
                InviteLinkBottomSheet.lambda$showSubscriptionSheet$9(this.f$0, view);
                break;
            default:
                TranslateButton.lambda$showCocoonAlert$16(this.f$0, view);
                break;
        }
    }
}
