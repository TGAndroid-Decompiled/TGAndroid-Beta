package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class i2 implements bd0, org.telegram.ui.ActionBar.a2, c5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, tv0, uv0, r0.n {
    public final int f24946a;

    public i2(int i10) {
        this.f24946a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f24946a) {
            case 12:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return r0.l1.f42174b;
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
        kd0 kd0Var = (kd0) obj;
        switch (this.f24946a) {
            case 22:
                kd0Var.f25675f = f7;
                if (!kd0Var.f25681y || kd0Var.F) {
                    kd0Var.f25674c.setStrokeWidth(AndroidUtilities.lerp(kd0Var.v, kd0Var.f25679w, f7));
                    kd0Var.f();
                }
                kd0Var.invalidate();
                return;
            case 23:
            default:
                kd0Var.f25678s = f7;
                kd0Var.f();
                return;
            case 24:
                kd0Var.f25676n = f7;
                if (!kd0Var.f25681y || kd0Var.F) {
                    kd0Var.f();
                }
                kd0Var.invalidate();
                return;
        }
    }

    @Override
    public pc c(xc xcVar) {
        return xcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        switch (this.f24946a) {
            case 14:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof kj0) {
                    kj0 kj0Var = (kj0) drawable;
                    kj0Var.P(0);
                    kj0Var.stop();
                    kj0Var.T(0.0f, false);
                    return;
                }
                return;
            default:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f24946a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f24946a) {
            case 0:
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
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
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
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                return hg.k0.h(i10, "");
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
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
            case 9:
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
            case 10:
                return hg.k0.h(i10, "");
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f24946a) {
            case 21:
                return ((kd0) obj).f25675f;
            case 22:
            case 24:
            default:
                return ((rg0) obj).K;
            case 23:
                return ((kd0) obj).f25676n;
            case 25:
                return ((kd0) obj).f25678s;
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24946a) {
            case 9:
                Pattern pattern = d5.f23562a;
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24946a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f24946a) {
            case 15:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = kz.O2;
                return 0;
        }
    }
}
