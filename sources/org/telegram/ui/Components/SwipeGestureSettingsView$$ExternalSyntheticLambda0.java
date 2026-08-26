package org.telegram.ui.Components;

public final class SwipeGestureSettingsView$$ExternalSyntheticLambda0 implements NumberPicker.Formatter, NumberPicker.OnValueChangeListener {
    public final SwipeGestureSettingsView f$0;

    public SwipeGestureSettingsView$$ExternalSyntheticLambda0(SwipeGestureSettingsView swipeGestureSettingsView) {
        this.f$0 = swipeGestureSettingsView;
    }

    @Override
    public String format(int i) {
        return this.f$0.lambda$new$0(i);
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.f$0.lambda$new$1(numberPicker, i, i2);
    }
}
