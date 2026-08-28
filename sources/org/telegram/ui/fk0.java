package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class fk0 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.xb0, Utilities.Callback2Return, org.telegram.ui.Components.av0, og.b, androidx.car.app.utils.e, h3.f {
    public final int f38304a;

    public fk0(int i9) {
        this.f38304a = i9;
    }

    public static AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f38304a) {
            case 17:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 18:
                int i9 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i9 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i9);
            default:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i10 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i10);
        }
    }

    @Override
    public h3.g c(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.c(android.os.Bundle):h3.g");
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f38304a) {
            case 0:
                c2Var.dismiss();
                return;
            case 1:
            case 5:
            case 8:
            case 13:
            case 14:
            default:
                c2Var.dismiss();
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                return;
            case 3:
                c2Var.dismiss();
                return;
            case 4:
                c2Var.dismiss();
                return;
            case 6:
                c2Var.dismiss();
                return;
            case 7:
                c2Var.dismiss();
                return;
            case 9:
                c2Var.dismiss();
                return;
            case 10:
                c2Var.dismiss();
                return;
            case 11:
                c2Var.dismiss();
                return;
            case 12:
                c2Var.dismiss();
                return;
            case 15:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public String g(int i9) {
        if (i9 == 0) {
            return LocaleController.getString(R.string.AutoLockDisabled);
        }
        if (i9 == 1) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
        }
        if (i9 == 2) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
        }
        if (i9 == 3) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        }
        if (i9 == 4) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0]));
        }
        return "";
    }

    @Override
    public void h(int i9) {
        SharedConfig.proxyRotationTimeout = i9;
        SharedConfig.saveConfig();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return gh.oa.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void m() {
    }
}
