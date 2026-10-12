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
public final class f2 implements ud0, org.telegram.ui.ActionBar.z1, f5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, pw0, qw0 {
    public final int f25845a;

    public f2(int i10) {
        this.f25845a = i10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f25845a) {
            case 15:
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
        de0 de0Var = (de0) obj;
        switch (this.f25845a) {
            case 25:
                de0Var.f25331f = f7;
                if (!de0Var.f25337y || de0Var.F) {
                    de0Var.f25329c.setStrokeWidth(AndroidUtilities.lerp(de0Var.v, de0Var.f25335w, f7));
                    de0Var.f();
                }
                de0Var.invalidate();
                return;
            case 26:
            default:
                de0Var.f25334s = f7;
                de0Var.f();
                return;
            case 27:
                de0Var.f25332n = f7;
                if (!de0Var.f25337y || de0Var.F) {
                    de0Var.f();
                }
                de0Var.invalidate();
                return;
        }
    }

    @Override
    public sc c(zc zcVar) {
        return zcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof fk0) {
            fk0 fk0Var = (fk0) drawable;
            fk0Var.P(0);
            fk0Var.stop();
            fk0Var.T(0.0f, false);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f25845a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
            case 12:
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
            case 3:
                boolean z10 = LocaleController.is24HourFormat;
                int i12 = 12;
                if (z10) {
                    i11 = 24;
                } else {
                    i11 = 12;
                }
                int i13 = i10 % i11;
                if (i10 % 12 != 0 || z10) {
                    i12 = i13;
                }
                String format = String.format("%02d", Integer.valueOf(i12));
                if (i10 >= 24) {
                    return LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format);
                }
                return format;
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i14 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i14) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
                return hg.c.i(i10, "");
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
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
            case 13:
                return hg.c.i(i10, "");
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25845a) {
            case 2:
                a2Var.dismiss();
                return;
            case 12:
                Pattern pattern = g5.f26278a;
                return;
            case 18:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        de0 de0Var = (de0) obj;
        switch (this.f25845a) {
            case 24:
                return de0Var.f25331f;
            case 25:
            default:
                return de0Var.f25334s;
            case 26:
                return de0Var.f25332n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f25845a) {
            case 19:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = d00.O2;
                return 0;
        }
    }
}
