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
public final class iw implements GenericProvider, org.telegram.ui.ActionBar.b2, gh.b, tv0, uv0, ImageReceiver.ImageReceiverDelegate, r0.n, LanguageDetector.ExceptionCallback {
    public final int f25237a;

    public iw(int i10) {
        this.f25237a = i10;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f42184b;
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
        switch (this.f25237a) {
            case 4:
                jd0 jd0Var = (jd0) obj;
                jd0Var.f25459f = f7;
                if (!jd0Var.f25465y || jd0Var.F) {
                    jd0Var.f25458c.setStrokeWidth(AndroidUtilities.lerp(jd0Var.v, jd0Var.f25463w, f7));
                    jd0Var.f();
                }
                jd0Var.invalidate();
                return;
            case 6:
                jd0 jd0Var2 = (jd0) obj;
                jd0Var2.f25460n = f7;
                if (!jd0Var2.f25465y || jd0Var2.F) {
                    jd0Var2.f();
                }
                jd0Var2.invalidate();
                return;
            case 8:
                jd0 jd0Var3 = (jd0) obj;
                jd0Var3.f25462s = f7;
                jd0Var3.f();
                return;
            case 12:
                rg0 rg0Var = (rg0) obj;
                WindowManager.LayoutParams layoutParams = rg0Var.f27982c;
                rg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f27980b, rg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    rg0Var.M.c();
                    return;
                }
            case 14:
                rg0 rg0Var2 = (rg0) obj;
                WindowManager.LayoutParams layoutParams2 = rg0Var2.f27982c;
                rg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var2.f27980b, rg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    rg0Var2.N.c();
                    return;
                }
            default:
                lp0 lp0Var = (lp0) obj;
                lp0Var.f26114n = f7;
                lp0Var.invalidate();
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        switch (this.f25237a) {
            case 9:
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
        int i11 = this.f25237a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f25237a) {
            case 1:
                c2Var.dismiss();
                return;
            case 16:
                c2Var.dismiss();
                return;
            case 17:
                c2Var.dismiss();
                return;
            case 21:
                c2Var.dismiss();
                return;
            case 22:
                c2Var.dismiss();
                return;
            case 23:
                c2Var.dismiss();
                return;
            case 24:
                int i11 = hy0.f24930u0;
                return;
            case 25:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f25237a) {
            case 3:
                return ((jd0) obj).f25459f;
            case 5:
                return ((jd0) obj).f25460n;
            case 7:
                return ((jd0) obj).f25462s;
            case 11:
                return ((rg0) obj).K;
            case 13:
                return ((rg0) obj).L;
            case 18:
                return ((lp0) obj).f26114n;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f25237a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f25237a) {
            case 0:
                int i10 = mz.M2;
                break;
            default:
                int i11 = vq0.W0;
                break;
        }
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
