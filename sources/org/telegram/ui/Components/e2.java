package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class e2 implements rd0, org.telegram.ui.ActionBar.z1, f5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, lw0, mw0 {
    public final int f25802a;

    public e2(int i10) {
        this.f25802a = i10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f25802a) {
            case 17:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void b(Object obj, float f7) {
        be0 be0Var = (be0) obj;
        switch (this.f25802a) {
            case 27:
                be0Var.f24929f = f7;
                if (!be0Var.f24935y || be0Var.F) {
                    be0Var.f24927c.setStrokeWidth(AndroidUtilities.lerp(be0Var.v, be0Var.f24933w, f7));
                    be0Var.f();
                }
                be0Var.invalidate();
                return;
            default:
                be0Var.f24930n = f7;
                if (!be0Var.f24935y || be0Var.F) {
                    be0Var.f();
                }
                be0Var.invalidate();
                return;
        }
    }

    @Override
    public sc c(ad adVar) {
        return adVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof ek0) {
            ek0 ek0Var = (ek0) drawable;
            ek0Var.P(0);
            ek0Var.stop();
            ek0Var.T(0.0f, false);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f25802a) {
            case 0:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 1:
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
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
            case 14:
            default:
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
            case 5:
                boolean z10 = LocaleController.is24HourFormat;
                int i13 = 12;
                if (z10) {
                    i11 = 24;
                } else {
                    i11 = 12;
                }
                int i14 = i10 % i11;
                if (i10 % 12 != 0 || z10) {
                    i13 = i14;
                }
                String format = String.format("%02d", Integer.valueOf(i13));
                if (i10 >= 24) {
                    return LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format);
                }
                return format;
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i15 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                if (calendar2.get(1) == i15) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 8:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 10:
                return hg.c.h(i10, "");
            case 11:
                return String.format("%02d", Integer.valueOf(i10));
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.ShortMessageLifetimeForever);
                }
                if (i10 >= 1 && i10 < 16) {
                    return LocaleController.formatTTLString(i10);
                }
                if (i10 == 16) {
                    return LocaleController.formatTTLString(30);
                }
                if (i10 == 17) {
                    return LocaleController.formatTTLString(60);
                }
                if (i10 == 18) {
                    return LocaleController.formatTTLString(3600);
                }
                if (i10 == 19) {
                    return LocaleController.formatTTLString(86400);
                }
                if (i10 != 20) {
                    return "";
                }
                return LocaleController.formatTTLString(604800);
            case 15:
                return hg.c.h(i10, "");
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25802a) {
            case 4:
                a2Var.dismiss();
                return;
            case 14:
                Pattern pattern = g5.f26605a;
                return;
            case 20:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        be0 be0Var = (be0) obj;
        switch (this.f25802a) {
            case 26:
                return be0Var.f24929f;
            default:
                return be0Var.f24930n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f25802a) {
            case 21:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = b00.O2;
                return 0;
        }
    }
}
