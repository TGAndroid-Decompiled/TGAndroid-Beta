package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class j70 implements GenericProvider, FlagSecureReason.FlagSecureCondition, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.bc0, Utilities.Callback2Return, org.telegram.ui.Components.cv0, z8.d, pg.b {

    public final int f39278a;

    public j70(int i10) {
        this.f39278a = i10;
    }

    public static AudioRecordingConfiguration b(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f39278a) {
            case 23:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                bitmapStackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return bitmapStackBlurBitmapWithScaleFactor;
            case 24:
                int iAverageBitmapColor = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    iAverageBitmapColor = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(iAverageBitmapColor);
            default:
                int iAverageBitmapColor2 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    iAverageBitmapColor2 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(iAverageBitmapColor2);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39278a) {
            case 5:
                b2Var.dismiss();
                break;
            case 6:
            case 10:
            case 13:
            case 18:
            case 19:
            case 20:
            default:
                b2Var.dismiss();
                break;
            case 7:
                Drawable[] drawableArr = PhotoViewer.P8;
                break;
            case 8:
                b2Var.dismiss();
                break;
            case 9:
                b2Var.dismiss();
                break;
            case 11:
                b2Var.dismiss();
                break;
            case 12:
                b2Var.dismiss();
                break;
            case 14:
                b2Var.dismiss();
                break;
            case 15:
                b2Var.dismiss();
                break;
            case 16:
                b2Var.dismiss();
                break;
            case 17:
                b2Var.dismiss();
                break;
            case 21:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public String g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.AutoLockDisabled);
        }
        if (i10 == 1) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
        }
        if (i10 == 2) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
        }
        if (i10 == 3) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        }
        return i10 == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
    }

    @Override
    public void j(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f39278a) {
            case 0:
                int iDp = AndroidUtilities.dp(150.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), iDp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f, iDp / 2.0f, paint);
                return bitmapCreateBitmap;
            case 1:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int iDp2 = AndroidUtilities.dp(150.0f);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iDp2, iDp2, Bitmap.Config.ARGB_8888);
                float f10 = iDp2 / 2.0f;
                new Canvas(bitmapCreateBitmap2).drawCircle(f10, f10, f10, paint2);
                return bitmapCreateBitmap2;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                return new qg0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        return ((Integer) obj).intValue() == 0 ? hh.oa.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null) : LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public Object u0(af.h hVar) {
        return TransportRegistrar.lambda$getComponents$0(hVar);
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.f35496x1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override
    public void m() {
    }
}
