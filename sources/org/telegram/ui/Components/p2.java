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
public final class p2 implements rc0, org.telegram.ui.ActionBar.a2, d5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, hh.b, fv0, gv0, r0.n {
    public final int f29262a;

    public p2(int i10) {
        this.f29262a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f29262a) {
            case 5:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        return r0.l1.f44710b;
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
        switch (this.f29262a) {
            case 15:
                zc0 zc0Var = (zc0) obj;
                zc0Var.f33129f = f7;
                if (!zc0Var.f33135y || zc0Var.F) {
                    zc0Var.f33127c.setStrokeWidth(AndroidUtilities.lerp(zc0Var.v, zc0Var.f33133w, f7));
                    zc0Var.f();
                }
                zc0Var.invalidate();
                return;
            case 17:
                zc0 zc0Var2 = (zc0) obj;
                zc0Var2.f33130n = f7;
                if (!zc0Var2.f33135y || zc0Var2.F) {
                    zc0Var2.f();
                }
                zc0Var2.invalidate();
                return;
            case 19:
                zc0 zc0Var3 = (zc0) obj;
                zc0Var3.f33132s = f7;
                zc0Var3.f();
                return;
            case 23:
                eg0 eg0Var = (eg0) obj;
                WindowManager.LayoutParams layoutParams = eg0Var.f25680c;
                eg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.f25678b, eg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    eg0Var.M.c();
                    return;
                }
            default:
                eg0 eg0Var2 = (eg0) obj;
                WindowManager.LayoutParams layoutParams2 = eg0Var2.f25680c;
                eg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var2.f25678b, eg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    eg0Var2.N.c();
                    return;
                }
        }
    }

    @Override
    public qc c(yc ycVar) {
        return ycVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        switch (this.f29262a) {
            case 7:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof xi0) {
                    xi0 xi0Var = (xi0) drawable;
                    xi0Var.N(0);
                    xi0Var.stop();
                    xi0Var.Q(0.0f, false);
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
        int i11 = this.f29262a;
        org.telegram.messenger.g5.a(this, i10, str, drawable);
    }

    @Override
    public String f(int i10) {
        switch (this.f29262a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
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
            case 2:
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
            case 3:
                return i2.g.i(i10, "");
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29262a) {
            case 2:
                Pattern pattern = e5.f25557a;
                return;
            case 12:
                b2Var.dismiss();
                return;
            case 27:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f29262a) {
            case 14:
                return ((zc0) obj).f33129f;
            case 16:
                return ((zc0) obj).f33130n;
            case 18:
                return ((zc0) obj).f33132s;
            case 22:
                return ((eg0) obj).K;
            case 24:
                return ((eg0) obj).L;
            default:
                return ((xo0) obj).f32640n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f29262a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f29262a) {
            case 8:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = kz.O2;
                return 0;
        }
    }
}
