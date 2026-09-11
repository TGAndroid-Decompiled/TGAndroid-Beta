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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class wo0 implements gv0, GenericProvider, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, fv0, rc0, FlagSecureReason.FlagSecureCondition {
    public final int f32304a;

    public wo0(int i10) {
        this.f32304a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f32304a) {
            case 0:
                xo0 xo0Var = (xo0) obj;
                xo0Var.f32640n = f7;
                xo0Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams = h1Var.f31520c;
                h1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var.f31519b, h1Var.d, layoutParams);
                return;
            default:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams2 = h1Var2.f31520c;
                h1Var2.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var2.f31519b, h1Var2.d, layoutParams2);
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
        org.telegram.messenger.g5.a(this, i10, str, drawable);
    }

    @Override
    public String f(int i10) {
        switch (this.f32304a) {
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32304a) {
            case 2:
                b2Var.dismiss();
                return;
            case 3:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 5:
                int i11 = ux0.f30990u0;
                return;
            case 6:
                b2Var.dismiss();
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 14:
                b2Var.dismiss();
                return;
            case 15:
                return;
            case 16:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 17:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 25:
                b2Var.dismiss();
                return;
            case 27:
                Drawable[] drawableArr = PhotoViewer.T8;
                return;
            case 28:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
        switch (this.f32304a) {
            case 10:
                return h1Var.Q;
            default:
                return h1Var.R;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f32304a) {
            case 1:
                Integer num = (Integer) obj;
                int i10 = hq0.f26786a1;
                return 0;
            case 20:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 21:
                Void r83 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Void r84 = (Void) obj;
                Pattern pattern = LaunchActivity.B1;
                return new org.telegram.ui.eh0();
        }
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.B1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
