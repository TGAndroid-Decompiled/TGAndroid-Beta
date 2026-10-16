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
public final class co0 implements org.telegram.ui.ActionBar.z1, fw0, gw0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, qd0, FlagSecureReason.FlagSecureCondition {
    public final int f23837a;

    public co0(int i10) {
        this.f23837a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f23837a) {
            case 3:
                xp0 xp0Var = (xp0) obj;
                xp0Var.f30990n = f7;
                xp0Var.invalidate();
                return;
            case 14:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams = h1Var.f29882c;
                h1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var.f29881b, h1Var.d, layoutParams);
                return;
            default:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams2 = h1Var2.f29882c;
                h1Var2.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var2.f29881b, h1Var2.d, layoutParams2);
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
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f23837a) {
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
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
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f23837a) {
            case 0:
                a2Var.dismiss();
                return;
            case 1:
                a2Var.dismiss();
                return;
            case 5:
                a2Var.dismiss();
                return;
            case 6:
                a2Var.dismiss();
                return;
            case 7:
                a2Var.dismiss();
                return;
            case 8:
                int i11 = uy0.f29487u0;
                return;
            case 9:
                a2Var.dismiss();
                return;
            case 11:
                a2Var.dismiss();
                return;
            case 17:
                a2Var.dismiss();
                return;
            case 18:
                return;
            case 19:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 20:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 27:
                a2Var.dismiss();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f23837a) {
            case 2:
                return ((xp0) obj).f30990n;
            case 13:
                return ((org.telegram.ui.Components.voip.h1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.h1) obj).R;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f23837a) {
            case 4:
                Integer num = (Integer) obj;
                int i10 = ir0.f25739a1;
                return 0;
            case 23:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 24:
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
                return new org.telegram.ui.jh0();
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

    private final void a(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
    }
}
