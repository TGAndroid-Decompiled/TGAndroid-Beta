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
public final class lg0 implements uv0, tv0, org.telegram.ui.ActionBar.a2, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, bd0, FlagSecureReason.FlagSecureCondition {
    public final int f26105a;

    public lg0(int i10) {
        this.f26105a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f26105a) {
            case 0:
                rg0 rg0Var = (rg0) obj;
                WindowManager.LayoutParams layoutParams = rg0Var.f27965c;
                rg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f27963b, rg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    rg0Var.M.c();
                    return;
                }
            case 2:
                rg0 rg0Var2 = (rg0) obj;
                WindowManager.LayoutParams layoutParams2 = rg0Var2.f27965c;
                rg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var2.f27963b, rg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    rg0Var2.N.c();
                    return;
                }
            case 7:
                lp0 lp0Var = (lp0) obj;
                lp0Var.f26162n = f7;
                lp0Var.invalidate();
                return;
            case 18:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var.f29374c;
                j1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.f29373b, j1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams4 = j1Var2.f29374c;
                j1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.f29373b, j1Var2.d, layoutParams4);
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
    public String e(int i10) {
        switch (this.f26105a) {
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26105a) {
            case 1:
                return ((rg0) obj).L;
            case 6:
                return ((lp0) obj).f26162n;
            case 17:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26105a) {
            case 4:
                b2Var.dismiss();
                return;
            case 5:
                b2Var.dismiss();
                return;
            case 6:
            case 7:
            case 8:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 10:
                b2Var.dismiss();
                return;
            case 11:
                b2Var.dismiss();
                return;
            case 12:
                int i11 = iy0.f25195u0;
                return;
            case 13:
                b2Var.dismiss();
                return;
            case 15:
                b2Var.dismiss();
                return;
            case 21:
                b2Var.dismiss();
                return;
            case 22:
                return;
            case 23:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26105a) {
            case 8:
                Integer num = (Integer) obj;
                int i10 = wq0.f30096a1;
                return 0;
            case 27:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            default:
                Void r83 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
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
