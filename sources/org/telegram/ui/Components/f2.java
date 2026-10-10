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
public final class f2 implements rd0, org.telegram.ui.ActionBar.a2, f5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, kw0, lw0 {
    public final int f26258a;

    public f2(int i10) {
        this.f26258a = i10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f26258a) {
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
        ae0 ae0Var = (ae0) obj;
        switch (this.f26258a) {
            case 25:
                ae0Var.f24554f = f7;
                if (!ae0Var.f24560y || ae0Var.F) {
                    ae0Var.f24552c.setStrokeWidth(AndroidUtilities.lerp(ae0Var.v, ae0Var.f24558w, f7));
                    ae0Var.f();
                }
                ae0Var.invalidate();
                return;
            case 26:
            default:
                ae0Var.f24557s = f7;
                ae0Var.f();
                return;
            case 27:
                ae0Var.f24555n = f7;
                if (!ae0Var.f24560y || ae0Var.F) {
                    ae0Var.f();
                }
                ae0Var.invalidate();
                return;
        }
    }

    @Override
    public tc c(ad adVar) {
        return adVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof dk0) {
            dk0 dk0Var = (dk0) drawable;
            dk0Var.P(0);
            dk0Var.stop();
            dk0Var.T(0.0f, false);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26258a) {
            case 2:
                b2Var.dismiss();
                return;
            case 12:
                Pattern pattern = g5.f26609a;
                return;
            case 18:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ae0 ae0Var = (ae0) obj;
        switch (this.f26258a) {
            case 24:
                return ae0Var.f24554f;
            case 25:
            default:
                return ae0Var.f24557s;
            case 26:
                return ae0Var.f24555n;
        }
    }

    @Override
    public String i(int i10) {
        int i11;
        switch (this.f26258a) {
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
                return hg.c.h(i10, "");
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
                return hg.c.h(i10, "");
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26258a) {
            case 19:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = b00.O2;
                return 0;
        }
    }
}
