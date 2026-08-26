package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

public final class PhonebookShareAlert$$ExternalSyntheticLambda0 implements NestedScrollView.OnScrollChangeListener, AlertsCreator.ScheduleDatePickerDelegate {
    public final PhonebookShareAlert f$0;

    public PhonebookShareAlert$$ExternalSyntheticLambda0(PhonebookShareAlert phonebookShareAlert) {
        this.f$0 = phonebookShareAlert;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        PhonebookShareAlert phonebookShareAlert = this.f$0;
        phonebookShareAlert.delegate.didSelectContact(phonebookShareAlert.currentUser, z, i, 0L);
        phonebookShareAlert.lambda$showGiftOfferSheet$15();
    }

    @Override
    public void onScrollChange(NestedScrollView nestedScrollView) {
        PhonebookShareAlert phonebookShareAlert = this.f$0;
        phonebookShareAlert.updateLayout$1(!phonebookShareAlert.inLayout);
    }
}
