package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

public final class PhonebookShareAlert$$ExternalSyntheticLambda0 implements AlertsCreator.ScheduleDatePickerDelegate, NestedScrollView.OnScrollChangeListener {
    public final PhonebookShareAlert f$0;

    public PhonebookShareAlert$$ExternalSyntheticLambda0(PhonebookShareAlert phonebookShareAlert) {
        this.f$0 = phonebookShareAlert;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        this.f$0.lambda$new$4(z, i, i2);
    }

    @Override
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        this.f$0.lambda$new$0(nestedScrollView, i, i2, i3, i4);
    }
}
