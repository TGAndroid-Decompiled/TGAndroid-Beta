package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

public final class c2 implements bc0, org.telegram.ui.ActionBar.a2, x4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, pg.b, qu0, ru0 {

    public final int f27289a;

    public c2(int i10) {
        this.f27289a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f27289a) {
            case 15:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override
    public void b(Object obj, float f10) {
        jc0 jc0Var = (jc0) obj;
        switch (this.f27289a) {
            case 25:
                jc0Var.f29668f = f10;
                if (!jc0Var.f29674y || jc0Var.B) {
                    jc0Var.f29666c.setStrokeWidth(AndroidUtilities.lerp(jc0Var.v, jc0Var.f29672w, f10));
                    jc0Var.f();
                }
                jc0Var.invalidate();
                break;
            case 26:
            default:
                jc0Var.f29671s = f10;
                jc0Var.f();
                break;
            case 27:
                jc0Var.f29669n = f10;
                if (!jc0Var.f29674y || jc0Var.B) {
                    jc0Var.f();
                }
                jc0Var.invalidate();
                break;
        }
    }

    @Override
    public ec c(mc mcVar) {
        return mcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof oi0) {
            oi0 oi0Var = (oi0) drawable;
            oi0Var.N(0);
            oi0Var.stop();
            oi0Var.Q(0.0f, false);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27289a) {
            case 2:
                b2Var.dismiss();
                break;
            case 12:
                Pattern pattern = y4.f34802a;
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public String g(int i10) {
        switch (this.f27289a) {
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
                String str = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, str) : str;
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
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
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
                return i0.a.k(i10, "");
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
                return i10 == 20 ? LocaleController.formatTTLString(604800) : "";
            case 13:
                return i0.a.k(i10, "");
        }
    }

    @Override
    public float get(Object obj) {
        jc0 jc0Var = (jc0) obj;
        switch (this.f27289a) {
            case 24:
                return jc0Var.f29668f;
            case 25:
            default:
                return jc0Var.f29671s;
            case 26:
                return jc0Var.f29669n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f27289a) {
            case 18:
                return CheckBoxBase.I;
            default:
                int i10 = yy.K2;
                return 0;
        }
    }
}
