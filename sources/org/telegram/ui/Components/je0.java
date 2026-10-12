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
public final class je0 implements ImageReceiver.ImageReceiverDelegate, r0.n, pw0, qw0, org.telegram.ui.ActionBar.z1, GenericProvider, LanguageDetector.ExceptionCallback, ud0 {
    public final int f27482a;

    public je0(int i10) {
        this.f27482a = i10;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.f46999b;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f27482a) {
            case 3:
                jh0 jh0Var = (jh0) obj;
                WindowManager.LayoutParams layoutParams = jh0Var.f27502c;
                jh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(jh0Var.f27500b, jh0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    jh0Var.M.c();
                    return;
                }
            case 5:
                jh0 jh0Var2 = (jh0) obj;
                WindowManager.LayoutParams layoutParams2 = jh0Var2.f27502c;
                jh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(jh0Var2.f27500b, jh0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    jh0Var2.N.c();
                    return;
                }
            case 10:
                hq0 hq0Var = (hq0) obj;
                hq0Var.f26872n = f7;
                hq0Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f31746c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f31745b, k1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams4 = k1Var2.f31746c;
                k1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var2.f31745b, k1Var2.d, layoutParams4);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fk0 lottieAnimation;
        switch (this.f27482a) {
            case 0:
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
        int i11 = this.f27482a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f27482a) {
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27482a) {
            case 7:
                a2Var.dismiss();
                return;
            case 8:
                a2Var.dismiss();
                return;
            case 9:
            case 10:
            case 11:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 12:
                a2Var.dismiss();
                return;
            case 13:
                a2Var.dismiss();
                return;
            case 14:
                a2Var.dismiss();
                return;
            case 15:
                int i11 = dz0.f25481u0;
                return;
            case 16:
                a2Var.dismiss();
                return;
            case 18:
                a2Var.dismiss();
                return;
            case 24:
                a2Var.dismiss();
                return;
            case 25:
                return;
            case 26:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f27482a) {
            case 2:
                return ((jh0) obj).K;
            case 4:
                return ((jh0) obj).L;
            case 9:
                return ((hq0) obj).f26872n;
            case 20:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).R;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f27482a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = sr0.f30631a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
    }
}
