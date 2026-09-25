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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yg0;
import yh.w7;
public final class e1 implements rv0, sv0, org.telegram.ui.ActionBar.z1, ad0, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, dw0 {
    public final int f29336a;

    public e1(int i10) {
        this.f29336a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        k1 k1Var = (k1) obj;
        WindowManager.LayoutParams layoutParams = k1Var.f29425c;
        k1Var.R = f7;
        layoutParams.y = (int) f7;
        AndroidUtilities.updateViewLayout(k1Var.f29424b, k1Var.d, layoutParams);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29336a) {
            case 2:
                a2Var.dismiss();
                return;
            case 3:
                return;
            case 4:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 5:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 13:
                a2Var.dismiss();
                return;
            case 15:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 16:
                a2Var.dismiss();
                return;
            case 17:
                a2Var.dismiss();
                return;
            case 19:
                a2Var.dismiss();
                return;
            case 20:
                a2Var.dismiss();
                return;
            case 26:
                a2Var.dismiss();
                return;
            case 27:
                a2Var.dismiss();
                return;
            case 28:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
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
        switch (this.f29336a) {
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
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
        switch (this.f29336a) {
            case 8:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(h6.w0(null, h6.f19060d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 9:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.B1;
                return new yg0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return w7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
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

    private final void a(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
    }
}
