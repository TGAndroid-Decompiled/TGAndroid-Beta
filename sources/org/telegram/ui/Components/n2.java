package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class n2 implements qd0, org.telegram.ui.ActionBar.z1, f5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, hh.b, fw0, gw0, r0.n {
    public final int f27263a;

    public n2(int i10) {
        this.f27263a = i10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f27263a) {
            case 8:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f43496b;
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
        switch (this.f27263a) {
            case 18:
                yd0 yd0Var = (yd0) obj;
                yd0Var.f31226f = f7;
                if (!yd0Var.f31232y || yd0Var.F) {
                    yd0Var.f31225c.setStrokeWidth(AndroidUtilities.lerp(yd0Var.v, yd0Var.f31230w, f7));
                    yd0Var.f();
                }
                yd0Var.invalidate();
                return;
            case 20:
                yd0 yd0Var2 = (yd0) obj;
                yd0Var2.f31227n = f7;
                if (!yd0Var2.f31232y || yd0Var2.F) {
                    yd0Var2.f();
                }
                yd0Var2.invalidate();
                return;
            case 22:
                yd0 yd0Var3 = (yd0) obj;
                yd0Var3.f31229s = f7;
                yd0Var3.f();
                return;
            case 26:
                fh0 fh0Var = (fh0) obj;
                WindowManager.LayoutParams layoutParams = fh0Var.f24738c;
                fh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var.f24736b, fh0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    fh0Var.M.c();
                    return;
                }
            default:
                fh0 fh0Var2 = (fh0) obj;
                WindowManager.LayoutParams layoutParams2 = fh0Var2.f24738c;
                fh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var2.f24736b, fh0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    fh0Var2.N.c();
                    return;
                }
        }
    }

    @Override
    public sc c(zc zcVar) {
        return zcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        switch (this.f27263a) {
            case 10:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof yj0) {
                    yj0 yj0Var = (yj0) drawable;
                    yj0Var.P(0);
                    yj0Var.stop();
                    yj0Var.T(0.0f, false);
                    return;
                }
                return;
            default:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f27263a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f27263a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return i2.d.j(i10, "");
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.ShortMessageLifetimeForever);
                }
                if (i10 >= 1 && i10 < 16) {
                    return LocaleController.formatTTLString(i10);
                }
                if (i10 == 16) {
                    return LocaleController.formatTTLString(30);
                }
                if (i10 == 17) {
                    return LocaleController.formatTTLString(60);
                }
                if (i10 == 18) {
                    return LocaleController.formatTTLString(3600);
                }
                if (i10 == 19) {
                    return LocaleController.formatTTLString(86400);
                }
                if (i10 != 20) {
                    return "";
                }
                return LocaleController.formatTTLString(604800);
            case 5:
            default:
                switch (i10) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 6:
                return i2.d.j(i10, "");
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27263a) {
            case 5:
                Pattern pattern = g5.f24879a;
                return;
            case 11:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f27263a) {
            case 17:
                return ((yd0) obj).f31226f;
            case 19:
                return ((yd0) obj).f31227n;
            case 21:
                return ((yd0) obj).f31229s;
            case 25:
                return ((fh0) obj).K;
            default:
                return ((fh0) obj).L;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f27263a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f27263a) {
            case 12:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = wz.O2;
                return 0;
        }
    }
}
