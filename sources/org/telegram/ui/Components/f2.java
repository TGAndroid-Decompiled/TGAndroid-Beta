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
public final class f2 implements id0, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.c7, org.telegram.ui.ActionBar.d7, e5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, ih.b, nw0, ow0 {
    public final int f28038a;

    public f2(int i10) {
        this.f28038a = i10;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f28038a) {
            case 20:
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
        rd0 rd0Var = (rd0) obj;
        rd0Var.f32230f = f7;
        if (!rd0Var.f32236y || rd0Var.F) {
            rd0Var.f32229c.setStrokeWidth(AndroidUtilities.lerp(rd0Var.v, rd0Var.f32234w, f7));
            rd0Var.f();
        }
        rd0Var.invalidate();
    }

    @Override
    public qc c(wc wcVar) {
        return wcVar.k(false);
    }

    @Override
    public void d(int i10, View view) {
        ((org.telegram.ui.ActionBar.g1) view).d(i10, i10);
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
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public int e(View view) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) view;
        if (g1Var.getTextView() != null) {
            return g1Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public String f(int i10) {
        int i11;
        switch (this.f28038a) {
            case 0:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 1:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 2:
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
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
            case 15:
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
            case 6:
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
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
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
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                return ic.a.i(i10, "");
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
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
            case 16:
                return ic.a.i(i10, "");
        }
    }

    @Override
    public float get(Object obj) {
        return ((rd0) obj).f32230f;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f28038a) {
            case 5:
                e2Var.dismiss();
                return;
            case 15:
                Pattern pattern = g5.f28418a;
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f28038a) {
            case 24:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = sz.S2;
                return 0;
        }
    }
}
