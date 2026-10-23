package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h20 implements org.telegram.ui.Components.md0 {
    public final int f37714a;
    public final long f37715b;
    public final Calendar f37716c;
    public final int d;

    public h20(long j10, Calendar calendar, int i10, int i11) {
        this.f37714a = i11;
        this.f37715b = j10;
        this.f37716c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f37714a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f37715b;
                Calendar calendar = this.f37716c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j10) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.f37715b;
                Calendar calendar2 = this.f37716c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j11);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
