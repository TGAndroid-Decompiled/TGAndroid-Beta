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
public final class k2 implements tc0, org.telegram.ui.ActionBar.c2, y4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, tg.b, gv0, hv0, r0.o {
    public final int f26145a;

    public k2(int i10) {
        this.f26145a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f26145a) {
            case 9:
                MediaController.getInstance().stopRecording(1, z4, i10, false, 0L);
                return;
            default:
                MediaController.getInstance().stopRecording(1, z4, i10, false, 0L);
                return;
        }
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return r0.m1.f43153b;
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
        switch (this.f26145a) {
            case 19:
                bd0 bd0Var = (bd0) obj;
                bd0Var.f23649f = f10;
                if (!bd0Var.f23655y || bd0Var.C) {
                    bd0Var.f23648c.setStrokeWidth(AndroidUtilities.lerp(bd0Var.v, bd0Var.f23653w, f10));
                    bd0Var.f();
                }
                bd0Var.invalidate();
                return;
            case 21:
                bd0 bd0Var2 = (bd0) obj;
                bd0Var2.f23650n = f10;
                if (!bd0Var2.f23655y || bd0Var2.C) {
                    bd0Var2.f();
                }
                bd0Var2.invalidate();
                return;
            case 23:
                bd0 bd0Var3 = (bd0) obj;
                bd0Var3.f23652s = f10;
                bd0Var3.f();
                return;
            case 27:
                mg0 mg0Var = (mg0) obj;
                WindowManager.LayoutParams layoutParams = mg0Var.f27041c;
                mg0Var.H = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(mg0Var.f27039b, mg0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    mg0Var.J.c();
                    return;
                }
            default:
                mg0 mg0Var2 = (mg0) obj;
                WindowManager.LayoutParams layoutParams2 = mg0Var2.f27041c;
                mg0Var2.I = f10;
                layoutParams2.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(mg0Var2.f27039b, mg0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    mg0Var2.K.c();
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
        switch (this.f26145a) {
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
        int i11 = this.f26145a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f26145a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return kf.k0.j(i10, "");
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
                return kf.k0.j(i10, "");
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f26145a) {
            case 18:
                return ((bd0) obj).f23649f;
            case 20:
                return ((bd0) obj).f23650n;
            case 22:
                return ((bd0) obj).f23652s;
            case 26:
                return ((mg0) obj).H;
            default:
                return ((mg0) obj).I;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26145a) {
            case 6:
                Pattern pattern = z4.f31242a;
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f26145a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f26145a) {
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
