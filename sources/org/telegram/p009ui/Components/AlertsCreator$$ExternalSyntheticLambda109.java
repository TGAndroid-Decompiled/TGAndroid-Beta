package org.telegram.p009ui.Components;

import org.telegram.messenger.C0890R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.Components.NumberPicker;

public final class AlertsCreator$$ExternalSyntheticLambda109 implements NumberPicker.Formatter {
    public static final AlertsCreator$$ExternalSyntheticLambda109 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda109();

    private AlertsCreator$$ExternalSyntheticLambda109() {
    }

    @Override
    public final String format(int i) {
        String string;
        string = LocaleController.getString("NotificationsFrequencyDivider", C0890R.string.NotificationsFrequencyDivider);
        return string;
    }
}
