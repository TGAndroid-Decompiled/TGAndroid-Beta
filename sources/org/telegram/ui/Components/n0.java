package org.telegram.ui.Components;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n0 implements mc0, org.telegram.ui.ActionBar.b2, oc0 {
    public final int f30788a;

    public n0(int i10) {
        this.f30788a = i10;
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f30788a) {
            case 0:
                return j7.l1.k(i10, "");
            case 1:
                switch (i10) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
            case 4:
            case 14:
            case 21:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i12 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                int i13 = calendar.get(1);
                if (i13 == i12 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else if (i13 == i12) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i14 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                if (calendar3.get(1) == i14) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 16:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 17:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 18:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i15 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i15) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
                boolean z10 = LocaleController.is24HourFormat;
                int i16 = 12;
                if (z10) {
                    i11 = 24;
                } else {
                    i11 = 12;
                }
                int i17 = i10 % i11;
                if (i10 % 12 != 0 || z10) {
                    i16 = i17;
                }
                String format = String.format("%02d", Integer.valueOf(i16));
                if (i10 >= 24) {
                    return LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format);
                }
                return format;
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i18 = calendar5.get(1);
                calendar5.add(6, i10);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) == i18) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis4) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis4);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis4);
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                return j7.l1.k(i10, "");
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30788a) {
            case 3:
                c2Var.dismiss();
                return;
            case 14:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void q(qc0 qc0Var, int i10) {
        Pattern pattern = c5.f27308a;
    }
}
