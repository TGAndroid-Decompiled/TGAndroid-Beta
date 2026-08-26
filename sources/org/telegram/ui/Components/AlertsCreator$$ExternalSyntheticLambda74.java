package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;

public final class AlertsCreator$$ExternalSyntheticLambda74 implements View.OnClickListener {
    public final int $r8$classId;
    public final int[] f$0;
    public final NumberPicker f$1;
    public final AlertsCreator.ScheduleDatePickerDelegate f$2;
    public final BottomSheet.Builder f$3;

    public AlertsCreator$$ExternalSyntheticLambda74(int[] iArr, NumberPicker numberPicker, AlertsCreator.ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, int i) {
        this.$r8$classId = i;
        this.f$0 = iArr;
        this.f$1 = numberPicker;
        this.f$2 = scheduleDatePickerDelegate;
        this.f$3 = builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createMuteForPickerDialog$190(this.f$0, this.f$1, this.f$2, this.f$3, view);
                break;
            default:
                AlertsCreator.lambda$createAutoDeleteDatePickerDialog$180(this.f$0, this.f$1, this.f$2, this.f$3, view);
                break;
        }
    }
}
