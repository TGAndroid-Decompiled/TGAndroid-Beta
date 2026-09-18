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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.LaunchActivity;
public final class jg0 implements tv0, org.telegram.ui.ActionBar.a2, sv0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, zc0, FlagSecureReason.FlagSecureCondition {
    public final int f25329a;

    public jg0(int i10) {
        this.f25329a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f25329a) {
            case 0:
                pg0 pg0Var = (pg0) obj;
                WindowManager.LayoutParams layoutParams = pg0Var.f27214c;
                pg0Var.L = f7;
                layoutParams.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(pg0Var.f27212b, pg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    pg0Var.N.c();
                    return;
                }
            case 5:
                kp0 kp0Var = (kp0) obj;
                kp0Var.f25773n = f7;
                kp0Var.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams2 = j1Var.f29305c;
                j1Var.Q = f7;
                layoutParams2.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.f29304b, j1Var.d, layoutParams2);
                return;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var2.f29305c;
                j1Var2.R = f7;
                layoutParams3.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.f29304b, j1Var2.d, layoutParams3);
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
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25329a) {
            case 2:
                b2Var.dismiss();
                return;
            case 3:
                b2Var.dismiss();
                return;
            case 4:
            case 5:
            case 6:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 7:
                b2Var.dismiss();
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 10:
                int i11 = hy0.f24751u0;
                return;
            case 11:
                b2Var.dismiss();
                return;
            case 13:
                b2Var.dismiss();
                return;
            case 19:
                b2Var.dismiss();
                return;
            case 20:
                return;
            case 21:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f25329a) {
            case 4:
                return ((kp0) obj).f25773n;
            case 15:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override
    public String j(int i10) {
        switch (this.f25329a) {
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f25329a) {
            case 6:
                Integer num = (Integer) obj;
                int i10 = vq0.f29711a1;
                return 0;
            case 25:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 26:
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

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
