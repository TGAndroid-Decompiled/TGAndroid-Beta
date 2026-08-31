package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class as implements org.telegram.ui.Components.iv0, org.telegram.ui.Components.hv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.uc0, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.wc0 {
    public final int f35238a;

    public as(int i10) {
        this.f35238a = i10;
    }

    @Override
    public void b(Object obj, float f10) {
        cs csVar = (cs) obj;
        switch (this.f35238a) {
            case 0:
                csVar.d = f10;
                if (csVar.getParent() != null) {
                    ((View) csVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                csVar.f35897e = f10;
                if (csVar.getParent() != null) {
                    ((View) csVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f35238a) {
            case 5:
                return l.d.j(i10, "");
            case 6:
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
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
            case 9:
            case 19:
            case 26:
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i12 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i12) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
            case 10:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i13 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i14 = calendar2.get(1);
                if (i14 == i13 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                } else if (i14 == i13) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
                }
            case 11:
                return String.format("%02d", Integer.valueOf(i10));
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 14:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i15 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i15) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 21:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 22:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 23:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i16 = calendar5.get(1);
                calendar5.add(6, i10);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) == i16) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis4) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis4);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis4);
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                boolean z4 = LocaleController.is24HourFormat;
                int i17 = 12;
                if (z4) {
                    i11 = 24;
                } else {
                    i11 = 12;
                }
                int i18 = i10 % i11;
                if (i10 % 12 != 0 || z4) {
                    i17 = i18;
                }
                String format = String.format("%02d", Integer.valueOf(i17));
                if (i10 >= 24) {
                    return LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format);
                }
                return format;
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public float get(Object obj) {
        return ((cs) obj).f35897e;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35238a) {
            case 8:
                d2Var.dismiss();
                return;
            case 19:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void q(org.telegram.ui.Components.yc0 yc0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.z4.f33718a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f35238a) {
            case 3:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }
}
