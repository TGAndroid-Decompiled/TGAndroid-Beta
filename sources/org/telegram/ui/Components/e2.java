package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class e2 implements org.telegram.ui.ActionBar.q1, eb0, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6, r4, org.telegram.messenger.kc, org.telegram.messenger.db, org.telegram.messenger.j9, p.a, ih.b, kt0, lt0 {
    public final int f34151a;

    public e2(int i7) {
        this.f34151a = i7;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof ch0) {
            ch0 ch0Var = (ch0) t6;
            ch0Var.P(0);
            ch0Var.stop();
            ch0Var.T(false, 0.0f);
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f34151a) {
            case 15:
                MediaController.B().B0(1, i7, z10, false);
                return;
            default:
                MediaController.B().B0(1, i7, z10, false);
                return;
        }
    }

    @Override
    public xb a(cc ccVar) {
        return ccVar.k(false);
    }

    @Override
    public Object b(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void c(Object obj, float f10) {
        mb0 mb0Var = (mb0) obj;
        switch (this.f34151a) {
            case 25:
                mb0Var.f37188f = f10;
                if (!mb0Var.E || mb0Var.G) {
                    mb0Var.f37186c.setStrokeWidth(org.telegram.messenger.g0.T1(mb0Var.f37192w, mb0Var.f37193x, f10));
                    mb0Var.f();
                }
                mb0Var.invalidate();
                return;
            case 26:
            default:
                mb0Var.f37191s = f10;
                mb0Var.f();
                return;
            case 27:
                mb0Var.f37189n = f10;
                if (!mb0Var.E || mb0Var.G) {
                    mb0Var.f();
                }
                mb0Var.invalidate();
                return;
        }
    }

    @Override
    public String e(int i7) {
        int i10;
        switch (this.f34151a) {
            case 1:
                boolean z10 = org.telegram.messenger.hd.f24106c0;
                int i11 = 12;
                if (z10) {
                    i10 = 24;
                } else {
                    i10 = 12;
                }
                int i12 = i7 % i10;
                if (i7 % 12 != 0 || z10) {
                    i11 = i12;
                }
                String format = String.format("%02d", Integer.valueOf(i11));
                if (i7 >= 24) {
                    return org.telegram.messenger.hd.a0(null, null, 2131752747, format);
                }
                return format;
            case 2:
                return String.format("%02d", Integer.valueOf(i7));
            case 3:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131745361, null);
                }
                if (i7 >= 1 && i7 < 16) {
                    return org.telegram.messenger.hd.c0(i7);
                }
                if (i7 == 16) {
                    return org.telegram.messenger.hd.c0(30);
                }
                if (i7 == 17) {
                    return org.telegram.messenger.hd.c0(60);
                }
                if (i7 == 18) {
                    return org.telegram.messenger.hd.c0(3600);
                }
                if (i7 == 19) {
                    return org.telegram.messenger.hd.c0(86400);
                }
                if (i7 != 20) {
                    return "";
                }
                return org.telegram.messenger.hd.c0(604800);
            case 4:
            default:
                return String.format("%02d", Integer.valueOf(i7));
            case 5:
                return i5.c.i(i7, "");
            case 6:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.hd.M0(2131749086, null);
                    case 1:
                        return org.telegram.messenger.hd.M0(2131750829, null);
                    case 2:
                        return org.telegram.messenger.hd.M0(2131748683, null);
                    case 3:
                        return org.telegram.messenger.hd.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.hd.M0(2131748662, null);
                    case 5:
                        return org.telegram.messenger.hd.M0(2131749064, null);
                    case 6:
                        return org.telegram.messenger.hd.M0(2131749066, null);
                    case 7:
                        return org.telegram.messenger.hd.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.hd.M0(2131745565, null);
                    case 9:
                        return org.telegram.messenger.hd.M0(2131747830, null);
                    case 10:
                        return org.telegram.messenger.hd.M0(2131747835, null);
                    default:
                        return org.telegram.messenger.hd.M0(2131751605, null);
                }
            case 7:
                return i5.c.i(i7, "");
            case 8:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.hd.M0(2131749086, null);
                    case 1:
                        return org.telegram.messenger.hd.M0(2131750829, null);
                    case 2:
                        return org.telegram.messenger.hd.M0(2131748683, null);
                    case 3:
                        return org.telegram.messenger.hd.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.hd.M0(2131748662, null);
                    case 5:
                        return org.telegram.messenger.hd.M0(2131749064, null);
                    case 6:
                        return org.telegram.messenger.hd.M0(2131749066, null);
                    case 7:
                        return org.telegram.messenger.hd.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.hd.M0(2131745565, null);
                    case 9:
                        return org.telegram.messenger.hd.M0(2131747830, null);
                    case 10:
                        return org.telegram.messenger.hd.M0(2131747835, null);
                    default:
                        return org.telegram.messenger.hd.M0(2131751605, null);
                }
            case 9:
                return String.format("%02d", Integer.valueOf(i7));
            case 10:
                return i5.c.i(i7, "");
            case 11:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public void f(int i7, View view) {
        ((org.telegram.ui.ActionBar.z0) view).d(i7, i7);
    }

    @Override
    public int g(View view) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) view;
        if (z0Var.getTextView() != null) {
            return z0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public float get(Object obj) {
        mb0 mb0Var = (mb0) obj;
        switch (this.f34151a) {
            case 24:
                return mb0Var.f37188f;
            case 25:
            default:
                return mb0Var.f37191s;
            case 26:
                return mb0Var.f37189n;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f34151a) {
            case 0:
                t1Var.dismiss();
                return;
            case 4:
                Pattern pattern = t4.f39505a;
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public Object o(Object obj) {
        switch (this.f34151a) {
            case 20:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i7 = ly.V2;
                return 0;
        }
    }

    @Override
    public void onClick() {
        int i7 = dl.G0;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
