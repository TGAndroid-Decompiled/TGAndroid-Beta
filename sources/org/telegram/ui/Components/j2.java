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
public final class j2 implements zc0, org.telegram.ui.ActionBar.a2, d5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, sv0, tv0, r0.n {
    public final int f25122a;

    public j2(int i10) {
        this.f25122a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f25122a) {
            case 10:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        return r0.m1.f42108b;
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
        switch (this.f25122a) {
            case 20:
                id0 id0Var = (id0) obj;
                id0Var.f24938f = f7;
                if (!id0Var.f24944y || id0Var.F) {
                    id0Var.f24937c.setStrokeWidth(AndroidUtilities.lerp(id0Var.v, id0Var.f24942w, f7));
                    id0Var.f();
                }
                id0Var.invalidate();
                return;
            case 21:
            case 23:
            default:
                pg0 pg0Var = (pg0) obj;
                WindowManager.LayoutParams layoutParams = pg0Var.f27214c;
                pg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(pg0Var.f27212b, pg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    pg0Var.M.c();
                    return;
                }
            case 22:
                id0 id0Var2 = (id0) obj;
                id0Var2.f24939n = f7;
                if (!id0Var2.f24944y || id0Var2.F) {
                    id0Var2.f();
                }
                id0Var2.invalidate();
                return;
            case 24:
                id0 id0Var3 = (id0) obj;
                id0Var3.f24941s = f7;
                id0Var3.f();
                return;
        }
    }

    @Override
    public qc c(xc xcVar) {
        return xcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ij0 lottieAnimation;
        switch (this.f25122a) {
            case 12:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof ij0) {
                    ij0 ij0Var = (ij0) drawable;
                    ij0Var.P(0);
                    ij0Var.stop();
                    ij0Var.T(0.0f, false);
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
        int i11 = this.f25122a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25122a) {
            case 7:
                Pattern pattern = e5.f23785a;
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f25122a) {
            case 19:
                return ((id0) obj).f24938f;
            case 21:
                return ((id0) obj).f24939n;
            case 23:
                return ((id0) obj).f24941s;
            case 27:
                return ((pg0) obj).K;
            default:
                return ((pg0) obj).L;
        }
    }

    @Override
    public String j(int i10) {
        switch (this.f25122a) {
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
                return hg.k0.h(i10, "");
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
                return hg.k0.h(i10, "");
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f25122a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f25122a) {
            case 13:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = kz.O2;
                return 0;
        }
    }
}
