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
public final class fa0 implements org.telegram.ui.ActionBar.z1, gh.b, rv0, sv0, ImageReceiver.ImageReceiverDelegate, r0.n, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f24125a;

    public fa0(int i10) {
        this.f24125a = i10;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f42140b;
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
        switch (this.f24125a) {
            case 3:
                jd0 jd0Var = (jd0) obj;
                jd0Var.f25398f = f7;
                if (!jd0Var.f25404y || jd0Var.F) {
                    jd0Var.f25397c.setStrokeWidth(AndroidUtilities.lerp(jd0Var.v, jd0Var.f25402w, f7));
                    jd0Var.f();
                }
                jd0Var.invalidate();
                return;
            case 5:
                jd0 jd0Var2 = (jd0) obj;
                jd0Var2.f25399n = f7;
                if (!jd0Var2.f25404y || jd0Var2.F) {
                    jd0Var2.f();
                }
                jd0Var2.invalidate();
                return;
            case 7:
                jd0 jd0Var3 = (jd0) obj;
                jd0Var3.f25401s = f7;
                jd0Var3.f();
                return;
            case 11:
                og0 og0Var = (og0) obj;
                WindowManager.LayoutParams layoutParams = og0Var.f27052c;
                og0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var.f27050b, og0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    og0Var.M.c();
                    return;
                }
            case 13:
                og0 og0Var2 = (og0) obj;
                WindowManager.LayoutParams layoutParams2 = og0Var2.f27052c;
                og0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var2.f27050b, og0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    og0Var2.N.c();
                    return;
                }
            case 18:
                jp0 jp0Var = (jp0) obj;
                jp0Var.f25467n = f7;
                jp0Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29425c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f29424b, k1Var.d, layoutParams3);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ij0 lottieAnimation;
        switch (this.f24125a) {
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
        int i11 = this.f24125a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24125a) {
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
                int i11 = fy0.f24285u0;
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
        switch (this.f24125a) {
            case 2:
                return ((jd0) obj).f25398f;
            case 4:
                return ((jd0) obj).f25399n;
            case 6:
                return ((jd0) obj).f25401s;
            case 10:
                return ((og0) obj).K;
            case 12:
                return ((og0) obj).L;
            case 17:
                return ((jp0) obj).f25467n;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24125a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = uq0.f28873a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
