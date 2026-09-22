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
public final class o2 implements qc0, org.telegram.ui.ActionBar.a2, b5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, gv0, hv0, r0.n {
    public final int f26654a;

    public o2(int i10) {
        this.f26654a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f26654a) {
            case 7:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.f41850b;
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
        switch (this.f26654a) {
            case 17:
                yc0 yc0Var = (yc0) obj;
                yc0Var.f30210f = f7;
                if (!yc0Var.f30216y || yc0Var.F) {
                    yc0Var.f30209c.setStrokeWidth(AndroidUtilities.lerp(yc0Var.v, yc0Var.f30214w, f7));
                    yc0Var.f();
                }
                yc0Var.invalidate();
                return;
            case 19:
                yc0 yc0Var2 = (yc0) obj;
                yc0Var2.f30211n = f7;
                if (!yc0Var2.f30216y || yc0Var2.F) {
                    yc0Var2.f();
                }
                yc0Var2.invalidate();
                return;
            case 21:
                yc0 yc0Var3 = (yc0) obj;
                yc0Var3.f30213s = f7;
                yc0Var3.f();
                return;
            case 25:
                eg0 eg0Var = (eg0) obj;
                WindowManager.LayoutParams layoutParams = eg0Var.f23640c;
                eg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.f23638b, eg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    eg0Var.M.c();
                    return;
                }
            default:
                eg0 eg0Var2 = (eg0) obj;
                WindowManager.LayoutParams layoutParams2 = eg0Var2.f23640c;
                eg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var2.f23638b, eg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    eg0Var2.N.c();
                    return;
                }
        }
    }

    @Override
    public oc c(vc vcVar) {
        return vcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        switch (this.f26654a) {
            case 9:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof xi0) {
                    xi0 xi0Var = (xi0) drawable;
                    xi0Var.P(0);
                    xi0Var.stop();
                    xi0Var.T(0.0f, false);
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
        int i11 = this.f26654a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f26654a) {
            case 0:
                return hg.c.i(i10, "");
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
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
            case 4:
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
            case 5:
                return hg.c.i(i10, "");
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26654a) {
            case 4:
                Pattern pattern = c5.f22944a;
                return;
            case 14:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26654a) {
            case 16:
                return ((yc0) obj).f30210f;
            case 18:
                return ((yc0) obj).f30211n;
            case 20:
                return ((yc0) obj).f30213s;
            case 24:
                return ((eg0) obj).K;
            default:
                return ((eg0) obj).L;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f26654a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26654a) {
            case 10:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = kz.O2;
                return 0;
        }
    }
}
