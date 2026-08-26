package org.telegram.ui.Components;

import java.util.Calendar;

public final class AlertsCreator$$ExternalSyntheticLambda95 implements NumberPicker.OnValueChangeListener {
    public final int $r8$classId;
    public final NumberPicker f$1;
    public final NumberPicker f$2;
    public final NumberPicker f$3;

    public AlertsCreator$$ExternalSyntheticLambda95(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i) {
        this.$r8$classId = i;
        this.f$1 = numberPicker;
        this.f$2 = numberPicker2;
        this.f$3 = numberPicker3;
    }

    @Override
    public final void onValueChange(NumberPicker numberPicker, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.checkCalendarDate(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                Calendar calendar = Calendar.getInstance();
                calendar.set(2, this.f$2.getValue());
                calendar.set(1, this.f$3.getValue());
                NumberPicker numberPicker2 = this.f$1;
                numberPicker2.setMinValue(1);
                numberPicker2.setMaxValue(calendar.getActualMaximum(5));
                break;
            default:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(2, this.f$2.getValue());
                calendar2.set(1, this.f$3.getValue());
                NumberPicker numberPicker3 = this.f$1;
                numberPicker3.setMinValue(1);
                numberPicker3.setMaxValue(calendar2.getActualMaximum(5));
                break;
        }
    }
}
