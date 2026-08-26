package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

public final class AlertsCreator$$ExternalSyntheticLambda70 implements Runnable {
    public final NumberPicker f$0;
    public final int f$1;
    public final NumberPicker f$2;
    public final NumberPicker f$3;
    public final int f$4;
    public final int f$5;
    public final int f$6;

    public AlertsCreator$$ExternalSyntheticLambda70(NumberPicker numberPicker, int i, NumberPicker numberPicker2, NumberPicker numberPicker3, int i2, int i3, int i4) {
        this.f$0 = numberPicker;
        this.f$1 = i;
        this.f$2 = numberPicker2;
        this.f$3 = numberPicker3;
        this.f$4 = i2;
        this.f$5 = i3;
        this.f$6 = i4;
    }

    @Override
    public final void run() {
        NumberPicker numberPicker = this.f$0;
        int value = numberPicker.getValue();
        int i = this.f$1;
        NumberPicker numberPicker2 = this.f$2;
        NumberPicker numberPicker3 = this.f$3;
        if (value == i) {
            numberPicker2.setMinValue(1);
            try {
                numberPicker2.setMaxValue(YearMonth.of(2024, numberPicker3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                numberPicker2.setMaxValue(31);
            }
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(11);
            return;
        }
        if (numberPicker.getValue() != this.f$4) {
            numberPicker2.setMinValue(1);
            try {
                numberPicker2.setMaxValue(YearMonth.of(numberPicker.getValue(), numberPicker3.getValue() + 1).lengthOfMonth());
            } catch (Exception e2) {
                FileLog.e(e2);
                numberPicker2.setMaxValue(31);
            }
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(11);
            return;
        }
        numberPicker3.setMinValue(0);
        int i2 = this.f$5;
        numberPicker3.setMaxValue(i2);
        if (numberPicker3.getValue() == i2) {
            numberPicker2.setMinValue(1);
            numberPicker2.setMaxValue(this.f$6);
            return;
        }
        numberPicker2.setMinValue(1);
        try {
            numberPicker2.setMaxValue(YearMonth.of(numberPicker.getValue(), numberPicker3.getValue() + 1).lengthOfMonth());
        } catch (Exception e3) {
            FileLog.e(e3);
            numberPicker2.setMaxValue(31);
        }
    }
}
