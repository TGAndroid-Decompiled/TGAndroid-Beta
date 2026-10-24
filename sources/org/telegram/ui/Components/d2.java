package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class d2 implements kd0, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, b5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, hh.b, ew0, fw0 {
    public final int f25514a;

    public d2(int i10) {
        this.f25514a = i10;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f25514a) {
            case 16:
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
        td0 td0Var = (td0) obj;
        switch (this.f25514a) {
            case 26:
                td0Var.f30799f = f7;
                if (!td0Var.f30805y || td0Var.F) {
                    td0Var.f30798c.setStrokeWidth(AndroidUtilities.lerp(td0Var.v, td0Var.f30803w, f7));
                    td0Var.f();
                }
                td0Var.invalidate();
                return;
            default:
                td0Var.f30800n = f7;
                if (!td0Var.f30805y || td0Var.F) {
                    td0Var.f();
                }
                td0Var.invalidate();
                return;
        }
    }

    @Override
    public oc c(vc vcVar) {
        return vcVar.k(false);
    }

    @Override
    public void d(int i10, View view) {
        ((org.telegram.ui.ActionBar.e1) view).d(i10, i10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof xj0) {
            xj0 xj0Var = (xj0) drawable;
            xj0Var.P(0);
            xj0Var.stop();
            xj0Var.T(0.0f, false);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f25514a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
            case 11:
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
            case 2:
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
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
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
            case 5:
                return String.format("%02d", Integer.valueOf(i10));
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return i2.o1.k(i10, "");
            case 8:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 10:
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
            case 12:
                return i2.o1.k(i10, "");
        }
    }

    @Override
    public int f(View view) {
        org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) view;
        if (e1Var.getTextView() != null) {
            return e1Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f25514a) {
            case 1:
                c2Var.dismiss();
                return;
            case 11:
                Pattern pattern = d5.f25562a;
                return;
            case 19:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        td0 td0Var = (td0) obj;
        switch (this.f25514a) {
            case 25:
                return td0Var.f30799f;
            case 26:
            default:
                return td0Var.f30802s;
            case 27:
                return td0Var.f30800n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f25514a) {
            case 20:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = rz.U2;
                return 0;
        }
    }
}
