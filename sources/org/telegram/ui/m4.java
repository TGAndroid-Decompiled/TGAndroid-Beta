package org.telegram.ui;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class m4 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ow0, Utilities.Callback2Return, org.telegram.ui.Components.yv0, hh.i, org.telegram.ui.Components.ll0, org.telegram.ui.Components.cw0, org.telegram.ui.Components.dw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.cd0, org.telegram.ui.Components.ed0 {
    public final int f38413a;

    public m4(int i10) {
        this.f38413a = i10;
    }

    public static ActionMode.Callback2 c(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public void b(Object obj, float f7) {
        es esVar = (es) obj;
        switch (this.f38413a) {
            case 12:
                esVar.f36079b = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    return;
                }
                return;
            case 13:
            case 15:
            default:
                esVar.f36081e = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    return;
                }
                return;
            case 14:
                esVar.f36080c = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    return;
                }
                return;
            case 16:
                esVar.d = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f38413a) {
            case 21:
                return hg.c.h(i10, "");
            case 22:
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
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
            case 25:
            default:
                Calendar calendar = Calendar.getInstance();
                calendar.set(5, 1);
                calendar.set(2, i10);
                return calendar.getDisplayName(2, 1, Locale.getDefault());
            case 26:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i11 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis = calendar2.getTimeInMillis();
                int i12 = calendar2.get(1);
                if (i12 == i11 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else if (i12 == i11) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38413a) {
            case 0:
                b2Var.dismiss();
                return;
            case 5:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        es esVar = (es) obj;
        switch (this.f38413a) {
            case 11:
                return esVar.f36079b;
            case 12:
            case 14:
            default:
                return esVar.f36081e;
            case 13:
                return esVar.f36080c;
            case 15:
                return esVar.d;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c1.c(recyclerView);
    }

    @Override
    public RecyclerView i(View view) {
        return ((ge) view).f36603a;
    }

    @Override
    public void j(int i10) {
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
    public void k(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void n(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c1.b(recyclerView);
    }

    @Override
    public void q(org.telegram.ui.Components.gd0 gd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.e5.f25919a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f38413a) {
            case 19:
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
        switch (this.f38413a) {
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
    public void l() {
    }
}
