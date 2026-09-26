package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
public final class ga0 implements org.telegram.ui.ActionBar.z1, gh.b, sv0, tv0, ImageReceiver.ImageReceiverDelegate, r0.n, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f24445a;

    public ga0(int i10) {
        this.f24445a = i10;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f42138b;
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f24445a) {
            case 3:
                kd0 kd0Var = (kd0) obj;
                kd0Var.f25703f = f7;
                if (!kd0Var.f25709y || kd0Var.F) {
                    kd0Var.f25702c.setStrokeWidth(AndroidUtilities.lerp(kd0Var.v, kd0Var.f25707w, f7));
                    kd0Var.f();
                }
                kd0Var.invalidate();
                return;
            case 5:
                kd0 kd0Var2 = (kd0) obj;
                kd0Var2.f25704n = f7;
                if (!kd0Var2.f25709y || kd0Var2.F) {
                    kd0Var2.f();
                }
                kd0Var2.invalidate();
                return;
            case 7:
                kd0 kd0Var3 = (kd0) obj;
                kd0Var3.f25706s = f7;
                kd0Var3.f();
                return;
            case 11:
                pg0 pg0Var = (pg0) obj;
                WindowManager.LayoutParams layoutParams = pg0Var.f27358c;
                pg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(pg0Var.f27356b, pg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    pg0Var.M.c();
                    return;
                }
            case 13:
                pg0 pg0Var2 = (pg0) obj;
                WindowManager.LayoutParams layoutParams2 = pg0Var2.f27358c;
                pg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(pg0Var2.f27356b, pg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    pg0Var2.N.c();
                    return;
                }
            case 18:
                kp0 kp0Var = (kp0) obj;
                kp0Var.f25773n = f7;
                kp0Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29341c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f29340b, k1Var.d, layoutParams3);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        jj0 lottieAnimation;
        switch (this.f24445a) {
            case 8:
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
        int i11 = this.f24445a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24445a) {
            case 0:
                a2Var.dismiss();
                return;
            case 15:
                a2Var.dismiss();
                return;
            case 16:
                a2Var.dismiss();
                return;
            case 20:
                a2Var.dismiss();
                return;
            case 21:
                a2Var.dismiss();
                return;
            case 22:
                a2Var.dismiss();
                return;
            case 23:
                int i11 = gy0.f24597u0;
                return;
            case 24:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f24445a) {
            case 2:
                return ((kd0) obj).f25703f;
            case 4:
                return ((kd0) obj).f25704n;
            case 6:
                return ((kd0) obj).f25706s;
            case 10:
                return ((pg0) obj).K;
            case 12:
                return ((pg0) obj).L;
            case 17:
                return ((kp0) obj).f25773n;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24445a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = vq0.f29714a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
