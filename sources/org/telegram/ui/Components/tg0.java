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
public final class tg0 implements bw0, cw0, org.telegram.ui.ActionBar.a2, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, kd0, FlagSecureReason.FlagSecureCondition {
    public final int f30505a;

    public tg0(int i10) {
        this.f30505a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f30505a) {
            case 1:
                zg0 zg0Var = (zg0) obj;
                WindowManager.LayoutParams layoutParams = zg0Var.f32934c;
                zg0Var.L = f7;
                layoutParams.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(zg0Var.f32932b, zg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    zg0Var.N.c();
                    return;
                }
            case 6:
                sp0 sp0Var = (sp0) obj;
                sp0Var.f30302n = f7;
                sp0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams2 = h1Var.f31495c;
                h1Var.Q = f7;
                layoutParams2.x = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var.f31494b, h1Var.d, layoutParams2);
                return;
            default:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams3 = h1Var2.f31495c;
                h1Var2.R = f7;
                layoutParams3.y = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var2.f31494b, h1Var2.d, layoutParams3);
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
        switch (this.f30505a) {
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30505a) {
            case 3:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 10:
                b2Var.dismiss();
                return;
            case 11:
                int i11 = py0.f29416u0;
                return;
            case 12:
                b2Var.dismiss();
                return;
            case 14:
                b2Var.dismiss();
                return;
            case 20:
                b2Var.dismiss();
                return;
            case 21:
                return;
            case 22:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f30505a) {
            case 0:
                return ((zg0) obj).L;
            case 5:
                return ((sp0) obj).f30302n;
            case 16:
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
        switch (this.f30505a) {
            case 7:
                Integer num = (Integer) obj;
                int i10 = er0.f25976b1;
                return 0;
            case 26:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 27:
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
                Pattern pattern = LaunchActivity.C1;
                return new org.telegram.ui.mg0();
        }
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.C1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
