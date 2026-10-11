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
public final class ig implements org.telegram.ui.Components.fm0, org.telegram.ui.ActionBar.z1, Utilities.Callback2Return, org.telegram.ui.Components.lw0, org.telegram.ui.Components.mw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.rd0, org.telegram.ui.Components.td0 {
    public final int f38676a;

    public ig(int i10) {
        this.f38676a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        ds dsVar = (ds) obj;
        switch (this.f38676a) {
            case 4:
                dsVar.f37077b = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 5:
            case 7:
            default:
                dsVar.f37079e = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 6:
                dsVar.f37078c = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                dsVar.d = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f38676a) {
            case 13:
                return hg.c.h(i10, "");
            case 14:
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
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
            case 17:
            case 27:
            default:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 18:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                int i12 = calendar.get(1);
                if (i12 == i11 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else if (i12 == i11) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 22:
                return String.format("%02d", Integer.valueOf(i10));
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                if (calendar3.get(1) == i13) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38676a) {
            case 1:
                a2Var.dismiss();
                return;
            case 16:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ds dsVar = (ds) obj;
        switch (this.f38676a) {
            case 3:
                return dsVar.f37077b;
            case 4:
            case 6:
            default:
                return dsVar.f37079e;
            case 5:
                return dsVar.f37078c;
            case 7:
                return dsVar.d;
        }
    }

    @Override
    public void q(org.telegram.ui.Components.vd0 vd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.g5.f26605a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f38676a) {
            case 11:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
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
