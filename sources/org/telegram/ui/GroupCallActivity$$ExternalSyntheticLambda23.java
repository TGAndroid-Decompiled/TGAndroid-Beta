package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.NumberPicker;

public final class GroupCallActivity$$ExternalSyntheticLambda23 implements NumberPicker.Formatter {
    public final int $r8$classId;
    public final long f$0;
    public final Calendar f$1;
    public final int f$2;

    public GroupCallActivity$$ExternalSyntheticLambda23(long j, Calendar calendar, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = j;
        this.f$1 = calendar;
        this.f$2 = i;
    }

    @Override
    public final String format(int i) {
        switch (this.$r8$classId) {
            case 0:
                if (i == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j = (((long) i) * 86400000) + this.f$0;
                Calendar calendar = this.f$1;
                calendar.setTimeInMillis(j);
                if (calendar.get(1) != this.f$2) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(j);
                }
                return LocaleController.getInstance().getFormatterWeek().format(j) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j);
            default:
                if (i == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j2 = (((long) i) * 86400000) + this.f$0;
                Calendar calendar2 = this.f$1;
                calendar2.setTimeInMillis(j2);
                return calendar2.get(1) == this.f$2 ? LocaleController.getInstance().getFormatterScheduleDay().format(j2) : LocaleController.getInstance().getFormatterScheduleYear().format(j2);
        }
    }
}
