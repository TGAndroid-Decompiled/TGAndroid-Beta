package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class l2 implements qd0, org.telegram.ui.ActionBar.z1, f5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, hh.b, fw0, gw0, r0.o {
    public final int f26911a;

    public l2(int i10) {
        this.f26911a = i10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f26911a) {
            case 10:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f43740b;
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
        switch (this.f26911a) {
            case 20:
                yd0 yd0Var = (yd0) obj;
                yd0Var.f31552f = f7;
                if (!yd0Var.f31558y || yd0Var.F) {
                    yd0Var.f31551c.setStrokeWidth(AndroidUtilities.lerp(yd0Var.v, yd0Var.f31556w, f7));
                    yd0Var.f();
                }
                yd0Var.invalidate();
                return;
            case 21:
            case 23:
            default:
                fh0 fh0Var = (fh0) obj;
                WindowManager.LayoutParams layoutParams = fh0Var.f25040c;
                fh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var.f25038b, fh0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    fh0Var.M.c();
                    return;
                }
            case 22:
                yd0 yd0Var2 = (yd0) obj;
                yd0Var2.f31553n = f7;
                if (!yd0Var2.f31558y || yd0Var2.F) {
                    yd0Var2.f();
                }
                yd0Var2.invalidate();
                return;
            case 24:
                yd0 yd0Var3 = (yd0) obj;
                yd0Var3.f31555s = f7;
                yd0Var3.f();
                return;
        }
    }

    @Override
    public sc c(zc zcVar) {
        return zcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        switch (this.f26911a) {
            case 12:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof yj0) {
                    yj0 yj0Var = (yj0) drawable;
                    yj0Var.P(0);
                    yj0Var.stop();
                    yj0Var.T(0.0f, false);
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
        int i11 = this.f26911a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f26911a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i11) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
                return i2.d.i(i10, "");
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                return String.format("%02d", Integer.valueOf(i10));
            case 6:
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
            case 7:
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
            case 8:
                return i2.d.i(i10, "");
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f26911a) {
            case 7:
                Pattern pattern = g5.f25184a;
                return;
            case 13:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26911a) {
            case 19:
                return ((yd0) obj).f31552f;
            case 21:
                return ((yd0) obj).f31553n;
            case 23:
                return ((yd0) obj).f31555s;
            case 27:
                return ((fh0) obj).K;
            default:
                return ((fh0) obj).L;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f26911a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26911a) {
            case 14:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = wz.O2;
                return 0;
        }
    }
}
