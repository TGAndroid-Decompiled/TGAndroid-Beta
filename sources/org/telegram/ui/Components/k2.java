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
public final class k2 implements sc0, org.telegram.ui.ActionBar.c2, y4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, tg.b, gv0, hv0, r0.o {
    public final int f26106a;

    public k2(int i10) {
        this.f26106a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f26106a) {
            case 9:
                MediaController.getInstance().stopRecording(1, z4, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z4, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        return r0.m1.f43129b;
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f26106a) {
            case 19:
                ad0 ad0Var = (ad0) obj;
                ad0Var.f23359f = f10;
                if (!ad0Var.f23365y || ad0Var.C) {
                    ad0Var.f23358c.setStrokeWidth(AndroidUtilities.lerp(ad0Var.v, ad0Var.f23363w, f10));
                    ad0Var.f();
                }
                ad0Var.invalidate();
                return;
            case 21:
                ad0 ad0Var2 = (ad0) obj;
                ad0Var2.f23360n = f10;
                if (!ad0Var2.f23365y || ad0Var2.C) {
                    ad0Var2.f();
                }
                ad0Var2.invalidate();
                return;
            case 23:
                ad0 ad0Var3 = (ad0) obj;
                ad0Var3.f23362s = f10;
                ad0Var3.f();
                return;
            case 27:
                lg0 lg0Var = (lg0) obj;
                WindowManager.LayoutParams layoutParams = lg0Var.f26662c;
                lg0Var.H = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(lg0Var.f26660b, lg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    lg0Var.J.c();
                    return;
                }
            default:
                lg0 lg0Var2 = (lg0) obj;
                WindowManager.LayoutParams layoutParams2 = lg0Var2.f26662c;
                lg0Var2.I = f10;
                layoutParams2.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(lg0Var2.f26660b, lg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    lg0Var2.K.c();
                    return;
                }
        }
    }

    @Override
    public ic c(qc qcVar) {
        return qcVar.k(false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        switch (this.f26106a) {
            case 11:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof gj0) {
                    gj0 gj0Var = (gj0) drawable;
                    gj0Var.N(0);
                    gj0Var.stop();
                    gj0Var.Q(0.0f, false);
                    return;
                }
                return;
            default:
                if (z4 && !z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f26106a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f26106a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return kh.a2.j(i10, "");
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
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
            case 6:
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
            case 7:
                return kh.a2.j(i10, "");
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26106a) {
            case 18:
                return ((ad0) obj).f23359f;
            case 20:
                return ((ad0) obj).f23360n;
            case 22:
                return ((ad0) obj).f23362s;
            case 26:
                return ((lg0) obj).H;
            default:
                return ((lg0) obj).I;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26106a) {
            case 6:
                Pattern pattern = z4.f31230a;
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f26106a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26106a) {
            case 12:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = kz.L2;
                return 0;
        }
    }
}
