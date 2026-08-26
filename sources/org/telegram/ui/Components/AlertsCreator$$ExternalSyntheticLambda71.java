package org.telegram.ui.Components;

public final class AlertsCreator$$ExternalSyntheticLambda71 implements NumberPicker.Formatter {
    public final int $r8$classId;
    public final int[] f$0;

    public AlertsCreator$$ExternalSyntheticLambda71(int i, int[] iArr) {
        this.$r8$classId = i;
        this.f$0 = iArr;
    }

    @Override
    public final String format(int i) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$createMuteForPickerDialog$187(this.f$0, i);
            default:
                return AlertsCreator.lambda$createAutoDeleteDatePickerDialog$177(this.f$0, i);
        }
    }
}
