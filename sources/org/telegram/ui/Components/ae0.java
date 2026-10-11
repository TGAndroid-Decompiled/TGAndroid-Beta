package org.telegram.ui.Components;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessagesController;
public final class ae0 implements lw0, mw0, ImageReceiver.ImageReceiverDelegate, r0.n, org.telegram.ui.ActionBar.z1, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f24508a;

    public ae0(int i10) {
        this.f24508a = i10;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.f46866b;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f24508a) {
            case 1:
                be0 be0Var = (be0) obj;
                be0Var.f24932s = f7;
                be0Var.f();
                return;
            case 5:
                ih0 ih0Var = (ih0) obj;
                WindowManager.LayoutParams layoutParams = ih0Var.f27330c;
                ih0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ih0Var.f27328b, ih0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    ih0Var.M.c();
                    return;
                }
            case 7:
                ih0 ih0Var2 = (ih0) obj;
                WindowManager.LayoutParams layoutParams2 = ih0Var2.f27330c;
                ih0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ih0Var2.f27328b, ih0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    ih0Var2.N.c();
                    return;
                }
            case 12:
                dq0 dq0Var = (dq0) obj;
                dq0Var.f25664n = f7;
                dq0Var.invalidate();
                return;
            case 23:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f32060c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f32059b, k1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams4 = k1Var2.f32060c;
                k1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var2.f32059b, k1Var2.d, layoutParams4);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ek0 lottieAnimation;
        switch (this.f24508a) {
            case 2:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    return;
                }
                return;
            default:
                if (imageReceiver.canInvertBitmap()) {
                    imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f24508a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24508a) {
            case 9:
                a2Var.dismiss();
                return;
            case 10:
                a2Var.dismiss();
                return;
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 14:
                a2Var.dismiss();
                return;
            case 15:
                a2Var.dismiss();
                return;
            case 16:
                a2Var.dismiss();
                return;
            case 17:
                int i11 = zy0.f33687u0;
                return;
            case 18:
                a2Var.dismiss();
                return;
            case 20:
                a2Var.dismiss();
                return;
            case 26:
                a2Var.dismiss();
                return;
            case 27:
                return;
            case 28:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f24508a) {
            case 0:
                return ((be0) obj).f24932s;
            case 4:
                return ((ih0) obj).K;
            case 6:
                return ((ih0) obj).L;
            case 11:
                return ((dq0) obj).f25664n;
            case 22:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).R;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24508a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = or0.f29474a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
    }
}
