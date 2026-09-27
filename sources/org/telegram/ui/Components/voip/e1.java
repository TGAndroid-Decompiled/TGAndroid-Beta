package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bh0;
import yh.v7;
public final class e1 implements uv0, tv0, org.telegram.ui.ActionBar.b2, ad0, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, fw0 {
    public final int f29278a;

    public e1(int i10) {
        this.f29278a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        k1 k1Var = (k1) obj;
        switch (this.f29278a) {
            case 0:
                WindowManager.LayoutParams layoutParams = k1Var.f29367c;
                k1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f29366b, k1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = k1Var.f29367c;
                k1Var.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f29366b, k1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29278a) {
            case 3:
                c2Var.dismiss();
                return;
            case 4:
                return;
            case 5:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 6:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 14:
                c2Var.dismiss();
                return;
            case 16:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 17:
                c2Var.dismiss();
                return;
            case 18:
                c2Var.dismiss();
                return;
            case 20:
                c2Var.dismiss();
                return;
            case 21:
                c2Var.dismiss();
                return;
            case 27:
                c2Var.dismiss();
                return;
            case 28:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        return ((k1) obj).R;
    }

    @Override
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public String j(int i10) {
        switch (this.f29278a) {
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
                return String.format("%02d", Integer.valueOf(i10));
            default:
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
                if (i10 == 4) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0]));
                }
                return "";
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r82 = (Void) obj;
        switch (this.f29278a) {
            case 9:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(i6.w0(null, i6.f19057d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 10:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.B1;
                return new bh0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return v7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.B1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override
    public void n() {
    }

    private final void a(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
