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
public final class k2 implements uc0, org.telegram.ui.ActionBar.c2, y4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, ug.b, hv0, iv0, r0.o {
    public final int f28252a;

    public k2(int i10) {
        this.f28252a = i10;
    }

    public static boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f28252a) {
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
        return r0.m1.f46451b;
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
        switch (this.f28252a) {
            case 19:
                cd0 cd0Var = (cd0) obj;
                cd0Var.f25928f = f10;
                if (!cd0Var.f25934y || cd0Var.C) {
                    cd0Var.f25926c.setStrokeWidth(AndroidUtilities.lerp(cd0Var.v, cd0Var.f25932w, f10));
                    cd0Var.f();
                }
                cd0Var.invalidate();
                return;
            case 21:
                cd0 cd0Var2 = (cd0) obj;
                cd0Var2.f25929n = f10;
                if (!cd0Var2.f25934y || cd0Var2.C) {
                    cd0Var2.f();
                }
                cd0Var2.invalidate();
                return;
            case 23:
                cd0 cd0Var3 = (cd0) obj;
                cd0Var3.f25931s = f10;
                cd0Var3.f();
                return;
            case 27:
                ng0 ng0Var = (ng0) obj;
                WindowManager.LayoutParams layoutParams = ng0Var.f29489c;
                ng0Var.H = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(ng0Var.f29487b, ng0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    ng0Var.J.c();
                    return;
                }
            default:
                ng0 ng0Var2 = (ng0) obj;
                WindowManager.LayoutParams layoutParams2 = ng0Var2.f29489c;
                ng0Var2.I = f10;
                layoutParams2.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(ng0Var2.f29487b, ng0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    ng0Var2.K.c();
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
        ij0 lottieAnimation;
        switch (this.f28252a) {
            case 11:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof ij0) {
                    ij0 ij0Var = (ij0) drawable;
                    ij0Var.N(0);
                    ij0Var.stop();
                    ij0Var.Q(0.0f, false);
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
        int i11 = this.f28252a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        switch (this.f28252a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return l.d.j(i10, "");
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
                return l.d.j(i10, "");
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f28252a) {
            case 18:
                return ((cd0) obj).f25928f;
            case 20:
                return ((cd0) obj).f25929n;
            case 22:
                return ((cd0) obj).f25931s;
            case 26:
                return ((ng0) obj).H;
            default:
                return ((ng0) obj).I;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f28252a) {
            case 6:
                Pattern pattern = z4.f33718a;
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f28252a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f28252a) {
            case 12:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i10 = mz.L2;
                return 0;
        }
    }
}
