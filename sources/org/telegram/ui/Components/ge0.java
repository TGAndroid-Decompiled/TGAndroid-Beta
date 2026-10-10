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
public final class ge0 implements ImageReceiver.ImageReceiverDelegate, r0.n, kw0, lw0, org.telegram.ui.ActionBar.a2, GenericProvider, LanguageDetector.ExceptionCallback, rd0 {
    public final int f26713a;

    public ge0(int i10) {
        this.f26713a = i10;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.f46820b;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f26713a) {
            case 3:
                hh0 hh0Var = (hh0) obj;
                WindowManager.LayoutParams layoutParams = hh0Var.f27016c;
                hh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(hh0Var.f27014b, hh0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    hh0Var.M.c();
                    return;
                }
            case 5:
                hh0 hh0Var2 = (hh0) obj;
                WindowManager.LayoutParams layoutParams2 = hh0Var2.f27016c;
                hh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(hh0Var2.f27014b, hh0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    hh0Var2.N.c();
                    return;
                }
            case 10:
                cq0 cq0Var = (cq0) obj;
                cq0Var.f25383n = f7;
                cq0Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var.f32066c;
                j1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.f32065b, j1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams4 = j1Var2.f32066c;
                j1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.f32065b, j1Var2.d, layoutParams4);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        dk0 lottieAnimation;
        switch (this.f26713a) {
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
        int i11 = this.f26713a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26713a) {
            case 7:
                b2Var.dismiss();
                return;
            case 8:
                b2Var.dismiss();
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
                b2Var.dismiss();
                return;
            case 13:
                b2Var.dismiss();
                return;
            case 14:
                b2Var.dismiss();
                return;
            case 15:
                int i11 = yy0.f33419u0;
                return;
            case 16:
                b2Var.dismiss();
                return;
            case 18:
                b2Var.dismiss();
                return;
            case 24:
                b2Var.dismiss();
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
        switch (this.f26713a) {
            case 2:
                return ((hh0) obj).K;
            case 4:
                return ((hh0) obj).L;
            case 9:
                return ((cq0) obj).f25383n;
            case 20:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override
    public String i(int i10) {
        switch (this.f26713a) {
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f26713a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = nr0.f29189a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
