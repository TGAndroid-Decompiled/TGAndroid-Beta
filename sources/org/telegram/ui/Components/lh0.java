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
public final class lh0 implements org.telegram.ui.ActionBar.c2, gv0, hv0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, tc0, FlagSecureReason.FlagSecureCondition {
    public final int f26677a;

    public lh0(int i10) {
        this.f26677a = i10;
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f26677a) {
            case 4:
                zo0 zo0Var = (zo0) obj;
                zo0Var.f31444n = f10;
                zo0Var.invalidate();
                return;
            case 15:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj;
                WindowManager.LayoutParams layoutParams = g1Var.f29611c;
                g1Var.N = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(g1Var.f29610b, g1Var.d, layoutParams);
                return;
            default:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) obj;
                WindowManager.LayoutParams layoutParams2 = g1Var2.f29611c;
                g1Var2.O = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(g1Var2.f29610b, g1Var2.d, layoutParams2);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        if (!imageReceiver.canInvertBitmap()) {
            return;
        }
        imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f26677a) {
            case 22:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26677a) {
            case 3:
                return ((zo0) obj).f31444n;
            case 14:
                return ((org.telegram.ui.Components.voip.g1) obj).N;
            default:
                return ((org.telegram.ui.Components.voip.g1) obj).O;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26677a) {
            case 1:
                d2Var.dismiss();
                return;
            case 2:
                d2Var.dismiss();
                return;
            case 3:
            case 4:
            case 5:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                d2Var.dismiss();
                return;
            case 6:
                d2Var.dismiss();
                return;
            case 7:
                d2Var.dismiss();
                return;
            case 8:
                d2Var.dismiss();
                return;
            case 9:
                int i11 = xx0.f30748r0;
                return;
            case 10:
                d2Var.dismiss();
                return;
            case 12:
                d2Var.dismiss();
                return;
            case 18:
                d2Var.dismiss();
                return;
            case 19:
                return;
            case 20:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 21:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26677a) {
            case 5:
                Integer num = (Integer) obj;
                int i10 = lq0.X0;
                return 0;
            case 24:
                Void r82 = (Void) obj;
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 25:
                Void r83 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f10 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
            default:
                Void r84 = (Void) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                return new org.telegram.ui.xg0();
        }
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.f31586y1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
    }
}
