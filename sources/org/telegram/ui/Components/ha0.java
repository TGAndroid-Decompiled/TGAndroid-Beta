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
public final class ha0 implements org.telegram.ui.ActionBar.z1, gh.b, tv0, uv0, ImageReceiver.ImageReceiverDelegate, r0.n, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f24756a;

    public ha0(int i10) {
        this.f24756a = i10;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f42141b;
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
        switch (this.f24756a) {
            case 3:
                ld0 ld0Var = (ld0) obj;
                ld0Var.f25964f = f7;
                if (!ld0Var.f25970y || ld0Var.F) {
                    ld0Var.f25963c.setStrokeWidth(AndroidUtilities.lerp(ld0Var.v, ld0Var.f25968w, f7));
                    ld0Var.f();
                }
                ld0Var.invalidate();
                return;
            case 5:
                ld0 ld0Var2 = (ld0) obj;
                ld0Var2.f25965n = f7;
                if (!ld0Var2.f25970y || ld0Var2.F) {
                    ld0Var2.f();
                }
                ld0Var2.invalidate();
                return;
            case 7:
                ld0 ld0Var3 = (ld0) obj;
                ld0Var3.f25967s = f7;
                ld0Var3.f();
                return;
            case 11:
                qg0 qg0Var = (qg0) obj;
                WindowManager.LayoutParams layoutParams = qg0Var.f27687c;
                qg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(qg0Var.f27685b, qg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    qg0Var.M.c();
                    return;
                }
            case 13:
                qg0 qg0Var2 = (qg0) obj;
                WindowManager.LayoutParams layoutParams2 = qg0Var2.f27687c;
                qg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(qg0Var2.f27685b, qg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    qg0Var2.N.c();
                    return;
                }
            case 18:
                lp0 lp0Var = (lp0) obj;
                lp0Var.f26050n = f7;
                lp0Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29336c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f29335b, k1Var.d, layoutParams3);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        switch (this.f24756a) {
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
        int i11 = this.f24756a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24756a) {
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
                int i11 = hy0.f24895u0;
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
        switch (this.f24756a) {
            case 2:
                return ((ld0) obj).f25964f;
            case 4:
                return ((ld0) obj).f25965n;
            case 6:
                return ((ld0) obj).f25967s;
            case 10:
                return ((qg0) obj).K;
            case 12:
                return ((qg0) obj).L;
            case 17:
                return ((lp0) obj).f26050n;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24756a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = wq0.f30117a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
