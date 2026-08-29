package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class xo0 implements GenericProvider, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, yu0, zu0, mc0, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return {
    public final int f34814a;

    public xo0(int i10) {
        this.f34814a = i10;
    }

    @Override
    public void b(Object obj, float f9) {
        org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
        switch (this.f34814a) {
            case 10:
                WindowManager.LayoutParams layoutParams = h1Var.f33733c;
                h1Var.M = f9;
                layoutParams.x = (int) f9;
                AndroidUtilities.updateViewLayout(h1Var.f33732b, h1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = h1Var.f33733c;
                h1Var.N = f9;
                layoutParams2.y = (int) f9;
                AndroidUtilities.updateViewLayout(h1Var.f33732b, h1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (!imageReceiver.canInvertBitmap()) {
            return;
        }
        imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f34814a) {
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34814a) {
            case 1:
                c2Var.dismiss();
                return;
            case 2:
                c2Var.dismiss();
                return;
            case 3:
                c2Var.dismiss();
                return;
            case 4:
                int i11 = nx0.f31167q0;
                return;
            case 5:
                c2Var.dismiss();
                return;
            case 7:
                c2Var.dismiss();
                return;
            case 13:
                c2Var.dismiss();
                return;
            case 14:
                return;
            case 15:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 16:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 24:
                c2Var.dismiss();
                return;
            case 26:
                Drawable[] drawableArr = PhotoViewer.P8;
                return;
            case 27:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
        switch (this.f34814a) {
            case 9:
                return h1Var.M;
            default:
                return h1Var.N;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f34814a) {
            case 0:
                Integer num = (Integer) obj;
                int i10 = dq0.W0;
                return 0;
            case 19:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 20:
                Void r83 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f9 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f9, f9, f9, paint2);
                return createBitmap2;
            default:
                Void r84 = (Void) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                return new org.telegram.ui.ng0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return jh.ia.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.f35560x1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
