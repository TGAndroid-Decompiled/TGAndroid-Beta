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
public final class cg implements org.telegram.ui.Components.yl0, fh.d, org.telegram.ui.ActionBar.b2, Utilities.Callback2Return, org.telegram.ui.Components.nw0, org.telegram.ui.Components.ow0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.id0, org.telegram.ui.Components.kd0 {
    public final int f38449a;

    public cg(int i10) {
        this.f38449a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        xr xrVar = (xr) obj;
        switch (this.f38449a) {
            case 5:
                xrVar.f45837b = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 6:
            case 8:
            default:
                xrVar.e = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 7:
                xrVar.f45838c = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                xrVar.d = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String f(int i10) {
        switch (this.f38449a) {
            case 14:
                return ic.a.i(i10, "");
            case 15:
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
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
            case 18:
            default:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 19:
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
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
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
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public float get(Object obj) {
        xr xrVar = (xr) obj;
        switch (this.f38449a) {
            case 4:
                return xrVar.f45837b;
            case 5:
            case 7:
            default:
                return xrVar.e;
            case 6:
                return xrVar.f45838c;
            case 8:
                return xrVar.d;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f38449a) {
            case 2:
                e2Var.dismiss();
                return;
            case 17:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        return Integer.MIN_VALUE;
    }

    @Override
    public void q(org.telegram.ui.Components.md0 md0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.g5.f28420a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f38449a) {
            case 12:
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
