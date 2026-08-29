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
public final class r2 implements mc0, org.telegram.ui.ActionBar.b2, b5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, rg.b, yu0, zu0, r0.o {
    public final int f32163a;

    public r2(int i10) {
        this.f32163a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f32163a) {
            case 4:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return r0.m1.f46842b;
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void b(Object obj, float f9) {
        switch (this.f32163a) {
            case 14:
                uc0 uc0Var = (uc0) obj;
                uc0Var.f33198f = f9;
                if (!uc0Var.f33204y || uc0Var.B) {
                    uc0Var.f33196c.setStrokeWidth(AndroidUtilities.lerp(uc0Var.v, uc0Var.f33202w, f9));
                    uc0Var.f();
                }
                uc0Var.invalidate();
                return;
            case 16:
                uc0 uc0Var2 = (uc0) obj;
                uc0Var2.f33199n = f9;
                if (!uc0Var2.f33204y || uc0Var2.B) {
                    uc0Var2.f();
                }
                uc0Var2.invalidate();
                return;
            case 18:
                uc0 uc0Var3 = (uc0) obj;
                uc0Var3.f33201s = f9;
                uc0Var3.f();
                return;
            case 22:
                bg0 bg0Var = (bg0) obj;
                WindowManager.LayoutParams layoutParams = bg0Var.f27081c;
                bg0Var.G = f9;
                layoutParams.x = (int) f9;
                try {
                    AndroidUtilities.updateViewLayout(bg0Var.f27079b, bg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    bg0Var.I.c();
                    return;
                }
            case 24:
                bg0 bg0Var2 = (bg0) obj;
                WindowManager.LayoutParams layoutParams2 = bg0Var2.f27081c;
                bg0Var2.H = f9;
                layoutParams2.y = (int) f9;
                try {
                    AndroidUtilities.updateViewLayout(bg0Var2.f27079b, bg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    bg0Var2.J.c();
                    return;
                }
            default:
                qo0 qo0Var = (qo0) obj;
                qo0Var.f32022n = f9;
                qo0Var.invalidate();
                return;
        }
    }

    @Override
    public mc c(tc tcVar) {
        return tcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        switch (this.f32163a) {
            case 6:
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
        int i11 = this.f32163a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f32163a) {
            case 0:
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
                if (i10 == 20) {
                    return LocaleController.formatTTLString(604800);
                }
                return "";
            case 1:
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
            case 2:
                return j7.l1.k(i10, "");
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32163a) {
            case 1:
                Pattern pattern = c5.f27308a;
                return;
            case 11:
                c2Var.dismiss();
                return;
            case 26:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f32163a) {
            case 13:
                return ((uc0) obj).f33198f;
            case 15:
                return ((uc0) obj).f33199n;
            case 17:
                return ((uc0) obj).f33201s;
            case 21:
                return ((bg0) obj).G;
            case 23:
                return ((bg0) obj).H;
            default:
                return ((qo0) obj).f32022n;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f32163a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f32163a) {
            case 7:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = fz.K2;
                return 0;
        }
    }
}
