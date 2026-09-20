package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class es implements org.telegram.ui.Components.rv0, org.telegram.ui.Components.sv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.yc0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ad0 {
    public final int f33393a;

    public es(int i10) {
        this.f33393a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.f33393a) {
            case 1:
                gsVar.f33957c = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
            default:
                gsVar.e = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                gsVar.d = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f33393a) {
            case 8:
                return hg.k0.h(i10, "");
            case 9:
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
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
            case 12:
            case 22:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
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
            case 14:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
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
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 23:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 24:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 25:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 26:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i14) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.f33393a) {
            case 0:
                return gsVar.f33957c;
            case 1:
            default:
                return gsVar.e;
            case 2:
                return gsVar.d;
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33393a) {
            case 11:
                b2Var.dismiss();
                return;
            case 22:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void q(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.d5.f23492a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f33393a) {
            case 6:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }
}
