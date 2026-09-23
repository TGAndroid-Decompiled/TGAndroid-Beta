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
public final class xc0 implements gv0, hv0, ImageReceiver.ImageReceiverDelegate, r0.n, org.telegram.ui.ActionBar.a2, GenericProvider, LanguageDetector.ExceptionCallback {
    public final int f29982a;

    public xc0(int i10) {
        this.f29982a = i10;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f41806b;
    }

    @Override
    public void a(Object obj, float f7) {
        switch (this.f29982a) {
            case 1:
                yc0 yc0Var = (yc0) obj;
                yc0Var.f30213f = f7;
                if (!yc0Var.f30219y || yc0Var.F) {
                    yc0Var.f30212c.setStrokeWidth(AndroidUtilities.lerp(yc0Var.v, yc0Var.f30217w, f7));
                    yc0Var.f();
                }
                yc0Var.invalidate();
                return;
            case 3:
                yc0 yc0Var2 = (yc0) obj;
                yc0Var2.f30214n = f7;
                if (!yc0Var2.f30219y || yc0Var2.F) {
                    yc0Var2.f();
                }
                yc0Var2.invalidate();
                return;
            case 5:
                yc0 yc0Var3 = (yc0) obj;
                yc0Var3.f30216s = f7;
                yc0Var3.f();
                return;
            case 9:
                eg0 eg0Var = (eg0) obj;
                WindowManager.LayoutParams layoutParams = eg0Var.f23666c;
                eg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.f23664b, eg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    eg0Var.M.c();
                    return;
                }
            case 11:
                eg0 eg0Var2 = (eg0) obj;
                WindowManager.LayoutParams layoutParams2 = eg0Var2.f23666c;
                eg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var2.f23664b, eg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    eg0Var2.N.c();
                    return;
                }
            case 16:
                wo0 wo0Var = (wo0) obj;
                wo0Var.f29769n = f7;
                wo0Var.invalidate();
                return;
            case 27:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var.f28980c;
                j1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.f28979b, j1Var.d, layoutParams3);
                return;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams4 = j1Var2.f28980c;
                j1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.f28979b, j1Var2.d, layoutParams4);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
        switch (this.f29982a) {
            case 6:
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
        int i11 = this.f29982a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29982a) {
            case 13:
                b2Var.dismiss();
                return;
            case 14:
                b2Var.dismiss();
                return;
            case 15:
            case 16:
            case 17:
            default:
                b2Var.dismiss();
                return;
            case 18:
                b2Var.dismiss();
                return;
            case 19:
                b2Var.dismiss();
                return;
            case 20:
                b2Var.dismiss();
                return;
            case 21:
                int i11 = ux0.f28565u0;
                return;
            case 22:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f29982a) {
            case 0:
                return ((yc0) obj).f30213f;
            case 2:
                return ((yc0) obj).f30214n;
            case 4:
                return ((yc0) obj).f30216s;
            case 8:
                return ((eg0) obj).K;
            case 10:
                return ((eg0) obj).L;
            case 15:
                return ((wo0) obj).f29769n;
            case 26:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f29982a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = hq0.f24772a1;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
