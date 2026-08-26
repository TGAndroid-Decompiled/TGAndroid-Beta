package org.telegram.ui.Components;

public final class ProximitySheet$$ExternalSyntheticLambda1 implements NumberPicker.Formatter, NumberPicker.OnValueChangeListener {
    public final int $r8$classId;
    public final ProximitySheet f$0;

    public ProximitySheet$$ExternalSyntheticLambda1(ProximitySheet proximitySheet, int i) {
        this.$r8$classId = i;
        this.f$0 = proximitySheet;
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$new$1(i);
            default:
                return this.f$0.lambda$new$3(i);
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.f$0.lambda$new$2(numberPicker, i, i2);
    }
}
