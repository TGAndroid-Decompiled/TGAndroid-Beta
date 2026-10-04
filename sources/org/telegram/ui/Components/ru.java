package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
public final class ru implements p.a, GenericProvider, org.telegram.ui.ActionBar.a2, gh.b, cw0, dw0, ImageReceiver.ImageReceiverDelegate, r0.n, LanguageDetector.ExceptionCallback {
    public final int f30511a;

    public ru(int i10) {
        this.f30511a = i10;
    }

    public static BlendMode d() {
        return BlendMode.DST_IN;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f45616b;
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
        switch (this.f30511a) {
            case 5:
                ld0 ld0Var = (ld0) obj;
                ld0Var.f28346f = f7;
                if (!ld0Var.f28352y || ld0Var.F) {
                    ld0Var.f28344c.setStrokeWidth(AndroidUtilities.lerp(ld0Var.v, ld0Var.f28350w, f7));
                    ld0Var.f();
                }
                ld0Var.invalidate();
                return;
            case 7:
                ld0 ld0Var2 = (ld0) obj;
                ld0Var2.f28347n = f7;
                if (!ld0Var2.f28352y || ld0Var2.F) {
                    ld0Var2.f();
                }
                ld0Var2.invalidate();
                return;
            case 9:
                ld0 ld0Var3 = (ld0) obj;
                ld0Var3.f28349s = f7;
                ld0Var3.f();
                return;
            case 13:
                rg0 rg0Var = (rg0) obj;
                WindowManager.LayoutParams layoutParams = rg0Var.f30389c;
                rg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f30387b, rg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    rg0Var.M.c();
                    return;
                }
            case 15:
                rg0 rg0Var2 = (rg0) obj;
                WindowManager.LayoutParams layoutParams2 = rg0Var2.f30389c;
                rg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var2.f30387b, rg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    rg0Var2.N.c();
                    return;
                }
            default:
                pp0 pp0Var = (pp0) obj;
                pp0Var.f29710n = f7;
                pp0Var.invalidate();
                return;
        }
    }

    @Override
    public rc c(yc ycVar) {
        return ycVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        switch (this.f30511a) {
            case 10:
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
        int i11 = this.f30511a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30511a) {
            case 2:
                b2Var.dismiss();
                return;
            case 17:
                b2Var.dismiss();
                return;
            case 18:
                b2Var.dismiss();
                return;
            case 22:
                b2Var.dismiss();
                return;
            case 23:
                b2Var.dismiss();
                return;
            case 24:
                b2Var.dismiss();
                return;
            case 25:
                int i11 = qy0.f30191u0;
                return;
            case 26:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f30511a) {
            case 4:
                return ((ld0) obj).f28346f;
            case 6:
                return ((ld0) obj).f28347n;
            case 8:
                return ((ld0) obj).f28349s;
            case 12:
                return ((rg0) obj).K;
            case 14:
                return ((rg0) obj).L;
            default:
                return ((pp0) obj).f29710n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30511a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f30511a) {
            case 1:
                int i10 = nz.M2;
                break;
            default:
                int i11 = zq0.W0;
                break;
        }
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
