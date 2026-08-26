package org.telegram.ui.Components;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

public final class AlertsCreator$$ExternalSyntheticLambda131 implements ListenerSet.Event, NumberPicker.Formatter {
    public final int $r8$classId;
    public final int f$0;

    public AlertsCreator$$ExternalSyntheticLambda131(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$createBirthdayPickerDialog$147(this.f$0, i);
            default:
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$251(this.f$0, i);
        }
    }

    @Override
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRepeatModeChanged(this.f$0);
    }
}
