package org.telegram.ui.Components;

public final class AlertsCreator$$ExternalSyntheticLambda47 implements NumberPicker.OnValueChangeListener {
    public final int $r8$classId;
    public final NumberPicker f$0;
    public final NumberPicker f$1;
    public final NumberPicker f$2;

    public AlertsCreator$$ExternalSyntheticLambda47(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i) {
        this.$r8$classId = i;
        this.f$0 = numberPicker;
        this.f$1 = numberPicker2;
        this.f$2 = numberPicker3;
    }

    @Override
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.checkScheduleDate(null, null, 0, this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                AlertsCreator.updateDayPicker(this.f$0, this.f$1, this.f$2);
                break;
            case 2:
                AlertsCreator.updateDayPicker(this.f$0, this.f$1, this.f$2);
                break;
            default:
                AlertsCreator.checkScheduleDate(null, null, 0, this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
