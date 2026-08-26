package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

public final class SwipeGestureSettingsView$$ExternalSyntheticLambda0 implements NumberPicker.Formatter, NumberPicker.OnValueChangeListener {
    public final SwipeGestureSettingsView f$0;

    @Override
    public String format(int i) {
        return this.f$0.strings[i];
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        SwipeGestureSettingsView swipeGestureSettingsView = this.f$0;
        swipeGestureSettingsView.swapIcons();
        SharedConfig.updateChatListSwipeSetting(i);
        swipeGestureSettingsView.invalidate();
        try {
            numberPicker.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
