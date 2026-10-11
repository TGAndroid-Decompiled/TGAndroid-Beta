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
public final class zd0 implements kw0, lw0, ImageReceiver.ImageReceiverDelegate, r0.n, org.telegram.ui.ActionBar.z1, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f33613a;

    public zd0(int i10) {
        this.f33613a = i10;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.f46900b;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f33613a) {
            case 1:
                ae0 ae0Var = (ae0) obj;
                ae0Var.f24583s = f7;
                ae0Var.f();
                return;
            case 5:
                hh0 hh0Var = (hh0) obj;
                WindowManager.LayoutParams layoutParams = hh0Var.f27106c;
                hh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(hh0Var.f27104b, hh0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    hh0Var.M.c();
                    return;
                }
            case 7:
                hh0 hh0Var2 = (hh0) obj;
                WindowManager.LayoutParams layoutParams2 = hh0Var2.f27106c;
                hh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(hh0Var2.f27104b, hh0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    hh0Var2.N.c();
                    return;
                }
            case 12:
                cq0 cq0Var = (cq0) obj;
                cq0Var.f25445n = f7;
                cq0Var.invalidate();
                return;
            case 23:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f32124c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f32123b, k1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams4 = k1Var2.f32124c;
                k1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var2.f32123b, k1Var2.d, layoutParams4);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        dk0 lottieAnimation;
        switch (this.f33613a) {
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
        int i11 = this.f33613a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33613a) {
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
                int i11 = yy0.f33473u0;
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
        switch (this.f33613a) {
            case 0:
                return ((ae0) obj).f24583s;
            case 4:
                return ((hh0) obj).K;
            case 6:
                return ((hh0) obj).L;
            case 11:
                return ((cq0) obj).f25445n;
            case 22:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).R;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f33613a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = nr0.f29231a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
    }
}
