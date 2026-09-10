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
public final class gp0 implements qv0, rv0, GenericProvider, org.telegram.ui.ActionBar.c2, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, zc0, FlagSecureReason.FlagSecureCondition {
    public final int f23397a;

    public gp0(int i10) {
        this.f23397a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f23397a) {
            case 1:
                hp0 hp0Var = (hp0) obj;
                hp0Var.f23745n = f7;
                hp0Var.invalidate();
                return;
            case 12:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) obj;
                WindowManager.LayoutParams layoutParams = i1Var.f28173c;
                i1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(i1Var.f28172b, i1Var.d, layoutParams);
                return;
            default:
                org.telegram.ui.Components.voip.i1 i1Var2 = (org.telegram.ui.Components.voip.i1) obj;
                WindowManager.LayoutParams layoutParams2 = i1Var2.f28173c;
                i1Var2.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(i1Var2.f28172b, i1Var2.d, layoutParams2);
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
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f23397a) {
            case 3:
                d2Var.dismiss();
                return;
            case 4:
                d2Var.dismiss();
                return;
            case 5:
                d2Var.dismiss();
                return;
            case 6:
                int i11 = hy0.f23802u0;
                return;
            case 7:
                d2Var.dismiss();
                return;
            case 9:
                d2Var.dismiss();
                return;
            case 15:
                d2Var.dismiss();
                return;
            case 16:
                return;
            case 17:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 18:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 26:
                d2Var.dismiss();
                return;
            case 28:
                Drawable[] drawableArr = PhotoViewer.T8;
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f23397a) {
            case 0:
                return ((hp0) obj).f23745n;
            case 11:
                return ((org.telegram.ui.Components.voip.i1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.i1) obj).R;
        }
    }

    @Override
    public String k(int i10) {
        switch (this.f23397a) {
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
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
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f23397a) {
            case 2:
                Integer num = (Integer) obj;
                int i10 = sq0.f27165a1;
                return 0;
            case 21:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 22:
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
                return new org.telegram.ui.fh0();
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

    private final void a(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
    }
}
