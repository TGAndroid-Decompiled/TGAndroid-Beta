package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class q2 implements zc0, org.telegram.ui.ActionBar.c2, c5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, fh.b, qv0, rv0, r0.n {
    public final int f26306a;

    public q2(int i10) {
        this.f26306a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f26306a) {
            case 6:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f41073b;
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
        switch (this.f26306a) {
            case 16:
                hd0 hd0Var = (hd0) obj;
                hd0Var.f23600f = f7;
                if (!hd0Var.f23606y || hd0Var.F) {
                    hd0Var.f23599c.setStrokeWidth(AndroidUtilities.lerp(hd0Var.v, hd0Var.f23604w, f7));
                    hd0Var.f();
                }
                hd0Var.invalidate();
                return;
            case 18:
                hd0 hd0Var2 = (hd0) obj;
                hd0Var2.f23601n = f7;
                if (!hd0Var2.f23606y || hd0Var2.F) {
                    hd0Var2.f();
                }
                hd0Var2.invalidate();
                return;
            case 20:
                hd0 hd0Var3 = (hd0) obj;
                hd0Var3.f23603s = f7;
                hd0Var3.f();
                return;
            case 24:
                og0 og0Var = (og0) obj;
                WindowManager.LayoutParams layoutParams = og0Var.f25786c;
                og0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var.f25784b, og0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    og0Var.M.c();
                    return;
                }
            default:
                og0 og0Var2 = (og0) obj;
                WindowManager.LayoutParams layoutParams2 = og0Var2.f25786c;
                og0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var2.f25784b, og0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    og0Var2.N.c();
                    return;
                }
        }
    }

    @Override
    public pc c(wc wcVar) {
        return wcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hj0 lottieAnimation;
        switch (this.f26306a) {
            case 8:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof hj0) {
                    hj0 hj0Var = (hj0) drawable;
                    hj0Var.P(0);
                    hj0Var.stop();
                    hj0Var.S(0.0f, false);
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
        int i11 = this.f26306a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26306a) {
            case 3:
                Pattern pattern = d5.f22289a;
                return;
            case 13:
                d2Var.dismiss();
                return;
            case 28:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26306a) {
            case 15:
                return ((hd0) obj).f23600f;
            case 17:
                return ((hd0) obj).f23601n;
            case 19:
                return ((hd0) obj).f23603s;
            case 23:
                return ((og0) obj).K;
            default:
                return ((og0) obj).L;
        }
    }

    @Override
    public String k(int i10) {
        switch (this.f26306a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
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
            case 3:
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
            case 4:
                return hc.b.j(i10, "");
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f26306a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26306a) {
            case 9:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = rz.O2;
                return 0;
        }
    }
}
