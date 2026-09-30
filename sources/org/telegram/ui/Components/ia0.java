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
public final class ia0 implements org.telegram.ui.ActionBar.z1, gh.b, uv0, vv0, ImageReceiver.ImageReceiverDelegate, r0.n, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f25055a;

    public ia0(int i10) {
        this.f25055a = i10;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f42244b;
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
        switch (this.f25055a) {
            case 3:
                md0 md0Var = (md0) obj;
                md0Var.f26266f = f7;
                if (!md0Var.f26272y || md0Var.F) {
                    md0Var.f26265c.setStrokeWidth(AndroidUtilities.lerp(md0Var.v, md0Var.f26270w, f7));
                    md0Var.f();
                }
                md0Var.invalidate();
                return;
            case 5:
                md0 md0Var2 = (md0) obj;
                md0Var2.f26267n = f7;
                if (!md0Var2.f26272y || md0Var2.F) {
                    md0Var2.f();
                }
                md0Var2.invalidate();
                return;
            case 7:
                md0 md0Var3 = (md0) obj;
                md0Var3.f26269s = f7;
                md0Var3.f();
                return;
            case 11:
                rg0 rg0Var = (rg0) obj;
                WindowManager.LayoutParams layoutParams = rg0Var.f27992c;
                rg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f27990b, rg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    rg0Var.M.c();
                    return;
                }
            case 13:
                rg0 rg0Var2 = (rg0) obj;
                WindowManager.LayoutParams layoutParams2 = rg0Var2.f27992c;
                rg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var2.f27990b, rg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    rg0Var2.N.c();
                    return;
                }
            case 18:
                mp0 mp0Var = (mp0) obj;
                mp0Var.f26352n = f7;
                mp0Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29342c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.f29341b, k1Var.d, layoutParams3);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        lj0 lottieAnimation;
        switch (this.f25055a) {
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
        int i11 = this.f25055a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25055a) {
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
                int i11 = iy0.f25210u0;
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
        switch (this.f25055a) {
            case 2:
                return ((md0) obj).f26266f;
            case 4:
                return ((md0) obj).f26267n;
            case 6:
                return ((md0) obj).f26269s;
            case 10:
                return ((rg0) obj).K;
            case 12:
                return ((rg0) obj).L;
            case 17:
                return ((mp0) obj).f26352n;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f25055a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = xq0.f30453a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
