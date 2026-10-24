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
public final class sd0 implements fw0, ImageReceiver.ImageReceiverDelegate, eh.d, r0.n, ew0, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f30481a;

    public sd0(int i10) {
        this.f30481a = i10;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return r0.k1.f45249b;
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f30481a) {
            case 0:
                td0 td0Var = (td0) obj;
                td0Var.f30802s = f7;
                td0Var.f();
                return;
            case 5:
                ch0 ch0Var = (ch0) obj;
                WindowManager.LayoutParams layoutParams = ch0Var.f25318c;
                ch0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ch0Var.f25316b, ch0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    ch0Var.M.c();
                    return;
                }
            case 7:
                ch0 ch0Var2 = (ch0) obj;
                WindowManager.LayoutParams layoutParams2 = ch0Var2.f25318c;
                ch0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ch0Var2.f25316b, ch0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    ch0Var2.N.c();
                    return;
                }
            case 14:
                wp0 wp0Var = (wp0) obj;
                wp0Var.f32319n = f7;
                wp0Var.invalidate();
                return;
            case 25:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams3 = h1Var.f31600c;
                h1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var.f31599b, h1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams4 = h1Var2.f31600c;
                h1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var2.f31599b, h1Var2.d, layoutParams4);
                return;
        }
    }

    @Override
    public void d(int i10, View view) {
        ((vo0) view).setTextColor(i10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xj0 lottieAnimation;
        switch (this.f30481a) {
            case 1:
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
        int i11 = this.f30481a;
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public int f(View view) {
        return ((vo0) view).v;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30481a) {
            case 9:
                c2Var.dismiss();
                return;
            case 10:
                c2Var.dismiss();
                return;
            case 16:
                c2Var.dismiss();
                return;
            case 17:
                c2Var.dismiss();
                return;
            case 18:
                c2Var.dismiss();
                return;
            case 19:
                int i11 = sy0.f30633w0;
                return;
            case 20:
                c2Var.dismiss();
                return;
            case 22:
                c2Var.dismiss();
                return;
            case 28:
                c2Var.dismiss();
                return;
            default:
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f30481a) {
            case 4:
                return ((ch0) obj).K;
            case 6:
                return ((ch0) obj).L;
            case 13:
                return ((wp0) obj).f32319n;
            case 24:
                return ((org.telegram.ui.Components.voip.h1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.h1) obj).R;
        }
    }

    @Override
    public int i(org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        Bitmap bitmap = zh.t.f52575a;
        return (((int) a1.g.B(zh.d1.f52436b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30481a;
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = hr0.f27117d1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
