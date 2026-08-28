package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
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
public final class g2 implements xb0, org.telegram.ui.ActionBar.b2, x4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, og.b, nu0, ou0, r0.o {
    public final int f28630a;

    public g2(int i9) {
        this.f28630a = i9;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f28630a) {
            case 10:
                MediaController.getInstance().stopRecording(1, z10, i9, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i9, false, 0L);
                return;
        }
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        return r0.m1.f46928b;
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f28630a) {
            case 20:
                fc0 fc0Var = (fc0) obj;
                fc0Var.f28379f = f10;
                if (!fc0Var.f28385y || fc0Var.B) {
                    fc0Var.f28377c.setStrokeWidth(AndroidUtilities.lerp(fc0Var.v, fc0Var.f28383w, f10));
                    fc0Var.f();
                }
                fc0Var.invalidate();
                return;
            case 21:
            case 23:
            default:
                pf0 pf0Var = (pf0) obj;
                WindowManager.LayoutParams layoutParams = pf0Var.f31627c;
                pf0Var.G = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(pf0Var.f31625b, pf0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    pf0Var.I.c();
                    return;
                }
            case 22:
                fc0 fc0Var2 = (fc0) obj;
                fc0Var2.f28380n = f10;
                if (!fc0Var2.f28385y || fc0Var2.B) {
                    fc0Var2.f();
                }
                fc0Var2.invalidate();
                return;
            case 24:
                fc0 fc0Var3 = (fc0) obj;
                fc0Var3.f28382s = f10;
                fc0Var3.f();
                return;
        }
    }

    @Override
    public gc c(oc ocVar) {
        return ocVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi0 lottieAnimation;
        switch (this.f28630a) {
            case 12:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof mi0) {
                    mi0 mi0Var = (mi0) drawable;
                    mi0Var.N(0);
                    mi0Var.stop();
                    mi0Var.Q(0.0f, false);
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
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        int i10 = this.f28630a;
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f28630a) {
            case 7:
                Pattern pattern = y4.f34847a;
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public String g(int i9) {
        switch (this.f28630a) {
            case 0:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i9);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i10) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
            case 1:
                return String.format("%02d", Integer.valueOf(i9));
            case 2:
                return String.format("%02d", Integer.valueOf(i9));
            case 3:
                return j3.r0.l(i9, "");
            case 4:
                return String.format("%02d", Integer.valueOf(i9));
            case 5:
                return String.format("%02d", Integer.valueOf(i9));
            case 6:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.ShortMessageLifetimeForever);
                }
                if (i9 >= 1 && i9 < 16) {
                    return LocaleController.formatTTLString(i9);
                }
                if (i9 == 16) {
                    return LocaleController.formatTTLString(30);
                }
                if (i9 == 17) {
                    return LocaleController.formatTTLString(60);
                }
                if (i9 == 18) {
                    return LocaleController.formatTTLString(3600);
                }
                if (i9 == 19) {
                    return LocaleController.formatTTLString(86400);
                }
                if (i9 != 20) {
                    return "";
                }
                return LocaleController.formatTTLString(604800);
            case 7:
            default:
                switch (i9) {
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
                return j3.r0.l(i9, "");
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f28630a) {
            case 19:
                return ((fc0) obj).f28379f;
            case 21:
                return ((fc0) obj).f28380n;
            case 23:
                return ((fc0) obj).f28382s;
            case 27:
                return ((pf0) obj).G;
            default:
                return ((pf0) obj).H;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i9 = this.f28630a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f28630a) {
            case 13:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i9 = wy.K2;
                return 0;
        }
    }
}
