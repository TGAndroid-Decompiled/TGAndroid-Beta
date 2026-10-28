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
public final class rd0 implements ow0, pw0, ImageReceiver.ImageReceiverDelegate, fh.d, r0.n, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.c7, org.telegram.ui.ActionBar.d7, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f32235a;

    public rd0(int i10) {
        this.f32235a = i10;
    }

    public static BlendMode a() {
        return BlendMode.DST_IN;
    }

    public static BlendMode c() {
        return BlendMode.SRC_OVER;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return r0.k1.f47152b;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f32235a) {
            case 1:
                sd0 sd0Var = (sd0) obj;
                sd0Var.f32569n = f7;
                if (!sd0Var.f32574y || sd0Var.F) {
                    sd0Var.f();
                }
                sd0Var.invalidate();
                return;
            case 3:
                sd0 sd0Var2 = (sd0) obj;
                sd0Var2.f32571s = f7;
                sd0Var2.f();
                return;
            case 8:
                dh0 dh0Var = (dh0) obj;
                WindowManager.LayoutParams layoutParams = dh0Var.f27449c;
                dh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var.f27447b, dh0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    dh0Var.M.c();
                    return;
                }
            case 10:
                dh0 dh0Var2 = (dh0) obj;
                WindowManager.LayoutParams layoutParams2 = dh0Var2.f27449c;
                dh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var2.f27447b, dh0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    dh0Var2.N.c();
                    return;
                }
            default:
                dq0 dq0Var = (dq0) obj;
                dq0Var.f27526n = f7;
                dq0Var.invalidate();
                return;
        }
    }

    @Override
    public void d(int i10, View view) {
        ((bp0) view).setTextColor(i10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        switch (this.f32235a) {
            case 4:
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
        int i11 = this.f32235a;
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public int e(View view) {
        return ((bp0) view).v;
    }

    @Override
    public float get(Object obj) {
        switch (this.f32235a) {
            case 0:
                return ((sd0) obj).f32569n;
            case 2:
                return ((sd0) obj).f32571s;
            case 7:
                return ((dh0) obj).K;
            case 9:
                return ((dh0) obj).L;
            default:
                return ((dq0) obj).f27526n;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f32235a) {
            case 12:
                e2Var.dismiss();
                return;
            case 13:
                e2Var.dismiss();
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                e2Var.dismiss();
                return;
            case 19:
                e2Var.dismiss();
                return;
            case 20:
                e2Var.dismiss();
                return;
            case 21:
                e2Var.dismiss();
                return;
            case 22:
                int i11 = dz0.f27577w0;
                return;
            case 23:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        Bitmap bitmap = ai.a0.f1420a;
        return (((int) a1.g.C(ai.w1.f1965b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f32235a;
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = nr0.Z0;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
