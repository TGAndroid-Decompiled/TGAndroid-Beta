package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.WindowManager;
import bi.dd;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.d7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rg0;
public final class c1 implements pw0, ow0, org.telegram.ui.ActionBar.b2, jd0, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, zw0, c7, d7 {
    public final int f33859a;

    public c1(int i10) {
        this.f33859a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        i1 i1Var = (i1) obj;
        switch (this.f33859a) {
            case 0:
                WindowManager.LayoutParams layoutParams = i1Var.f33953c;
                i1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(i1Var.f33952b, i1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = i1Var.f33953c;
                i1Var.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(i1Var.f33952b, i1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void d(int i10, View view) {
        org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) view;
        ShapeDrawable shapeDrawable = f3Var.f36574e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i10);
            f3Var.f36574e0.invalidateSelf();
        }
    }

    @Override
    public int e(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f3) view).f36574e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public String f(int i10) {
        switch (this.f33859a) {
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
    public float get(Object obj) {
        return ((i1) obj).R;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33859a) {
            case 3:
                e2Var.dismiss();
                return;
            case 4:
                return;
            case 5:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 6:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 13:
                e2Var.dismiss();
                return;
            case 15:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 16:
                e2Var.dismiss();
                return;
            case 17:
                e2Var.dismiss();
                return;
            case 19:
                int i11 = ProfileActivity.R6;
                e2Var.dismiss();
                return;
            case 20:
                e2Var.dismiss();
                return;
            case 26:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public Object provide(Object obj) {
        Void r82 = (Void) obj;
        switch (this.f33859a) {
            case 9:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(y6.x0(null, y6.f23357d6, false));
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
                Pattern pattern = LaunchActivity.D1;
                return new rg0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return dd.W0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.D1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override
    public void m() {
    }

    private final void a(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
    }
}
