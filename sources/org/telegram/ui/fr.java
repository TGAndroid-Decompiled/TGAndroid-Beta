package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class fr implements Utilities.Callback2Return, org.telegram.ui.Components.qu0, org.telegram.ui.Components.ru0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.bc0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.dc0 {

    public final int f38195a;

    public fr(int i10) {
        this.f38195a = i10;
    }

    @Override
    public void b(Object obj, float f10) {
        wr wrVar = (wr) obj;
        switch (this.f38195a) {
            case 2:
                wrVar.f44172b = f10;
                if (wrVar.getParent() != null) {
                    ((View) wrVar.getParent()).invalidate();
                }
                break;
            case 3:
            case 5:
            default:
                wrVar.f44174e = f10;
                if (wrVar.getParent() != null) {
                    ((View) wrVar.getParent()).invalidate();
                }
                break;
            case 4:
                wrVar.f44173c = f10;
                if (wrVar.getParent() != null) {
                    ((View) wrVar.getParent()).invalidate();
                }
                break;
            case 6:
                wrVar.d = f10;
                if (wrVar.getParent() != null) {
                    ((View) wrVar.getParent()).invalidate();
                }
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38195a) {
            case 14:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public String g(int i10) {
        switch (this.f38195a) {
            case 11:
                return i0.a.k(i10, "");
            case 12:
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
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
            case 15:
            case 25:
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) != i11) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 16:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i13 = calendar2.get(1);
                if (i13 != i12 || i10 >= 7) {
                    return i13 == i12 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                return calendar4.get(1) == i14 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 27:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 28:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
        }
    }

    @Override
    public float get(Object obj) {
        wr wrVar = (wr) obj;
        switch (this.f38195a) {
            case 1:
                return wrVar.f44172b;
            case 2:
            case 4:
            default:
                return wrVar.f44174e;
            case 3:
                return wrVar.f44173c;
            case 5:
                return wrVar.d;
        }
    }

    @Override
    public void m(org.telegram.ui.Components.fc0 fc0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.y4.f34802a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f38195a) {
            case 9:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
