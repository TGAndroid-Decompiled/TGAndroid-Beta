package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e20 implements org.telegram.ui.Components.kd0 {
    public final int f36528a;
    public final long f36529b;
    public final Calendar f36530c;
    public final int d;

    public e20(long j10, Calendar calendar, int i10, int i11) {
        this.f36528a = i11;
        this.f36529b = j10;
        this.f36530c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f36528a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f36529b;
                Calendar calendar = this.f36530c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j10) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.f36529b;
                Calendar calendar2 = this.f36530c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j11);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
