package org.telegram.ui;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class n4 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.fw0, Utilities.Callback2Return, hh.i, org.telegram.ui.Components.ll0, org.telegram.ui.Components.tv0, org.telegram.ui.Components.uv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.ad0, org.telegram.ui.Components.cd0 {
    public final int f35809a;

    public n4(int i10) {
        this.f35809a = i10;
    }

    public static ActionMode.Callback2 c(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public void b(Object obj, float f7) {
        ds dsVar = (ds) obj;
        switch (this.f35809a) {
            case 11:
                dsVar.f33019b = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 12:
            case 14:
            default:
                dsVar.e = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 13:
                dsVar.f33020c = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 15:
                dsVar.d = f7;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35809a) {
            case 0:
                c2Var.dismiss();
                return;
            case 5:
                c2Var.dismiss();
                return;
            case 8:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ds dsVar = (ds) obj;
        switch (this.f35809a) {
            case 10:
                return dsVar.f33019b;
            case 11:
            case 13:
            default:
                return dsVar.e;
            case 12:
                return dsVar.f33020c;
            case 14:
                return dsVar.d;
        }
    }

    @Override
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public String j(int i10) {
        switch (this.f35809a) {
            case 20:
                return hg.k0.h(i10, "");
            case 21:
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
            case 22:
                return String.format("%02d", Integer.valueOf(i10));
            case 23:
            case 24:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
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
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
        }
    }

    @Override
    public void q(org.telegram.ui.Components.ed0 ed0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.e5.f23875a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f35809a) {
            case 18:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f35809a) {
            case 3:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void n() {
    }
}
