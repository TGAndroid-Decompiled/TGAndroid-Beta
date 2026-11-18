package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class k2 implements ob0, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, z4, org.telegram.messenger.jc, org.telegram.messenger.cb, org.telegram.messenger.i9, p.a, ih.b, st0, tt0 {
    public final int f36641a;

    public k2(int i7) {
        this.f36641a = i7;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f36641a) {
            case 16:
                MediaController.B().B0(1, i7, z10, false);
                return;
            default:
                MediaController.B().B0(1, i7, z10, false);
                return;
        }
    }

    @Override
    public gc a(lc lcVar) {
        return lcVar.k(false);
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
        xb0 xb0Var = (xb0) obj;
        switch (this.f36641a) {
            case 26:
                xb0Var.f41966f = f10;
                if (!xb0Var.E || xb0Var.G) {
                    xb0Var.f41964c.setStrokeWidth(org.telegram.messenger.g0.T1(xb0Var.f41970w, xb0Var.f41971x, f10));
                    xb0Var.f();
                }
                xb0Var.invalidate();
                return;
            default:
                xb0Var.f41967n = f10;
                if (!xb0Var.E || xb0Var.G) {
                    xb0Var.f();
                }
                xb0Var.invalidate();
                return;
        }
    }

    @Override
    public void d(int i7, View view) {
        ((org.telegram.ui.ActionBar.z0) view).d(i7, i7);
    }

    @Override
    public int f(View view) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) view;
        if (z0Var.getTextView() != null) {
            return z0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public float get(Object obj) {
        xb0 xb0Var = (xb0) obj;
        switch (this.f36641a) {
            case 25:
                return xb0Var.f41966f;
            case 26:
            default:
                return xb0Var.f41969s;
            case 27:
                return xb0Var.f41967n;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f36641a) {
            case 1:
                u1Var.dismiss();
                return;
            case 5:
                Pattern pattern = b5.f33529a;
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public String i(int i7) {
        int i10;
        switch (this.f36641a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i7));
            case 1:
            case 5:
            default:
                return String.format("%02d", Integer.valueOf(i7));
            case 2:
                boolean z10 = org.telegram.messenger.gd.f24215c0;
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
                    return org.telegram.messenger.gd.a0(null, null, 2131752736, format);
                }
                return format;
            case 3:
                return String.format("%02d", Integer.valueOf(i7));
            case 4:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.M0(2131745166, null);
                }
                if (i7 >= 1 && i7 < 16) {
                    return org.telegram.messenger.gd.c0(i7);
                }
                if (i7 == 16) {
                    return org.telegram.messenger.gd.c0(30);
                }
                if (i7 == 17) {
                    return org.telegram.messenger.gd.c0(60);
                }
                if (i7 == 18) {
                    return org.telegram.messenger.gd.c0(3600);
                }
                if (i7 == 19) {
                    return org.telegram.messenger.gd.c0(86400);
                }
                if (i7 != 20) {
                    return "";
                }
                return org.telegram.messenger.gd.c0(604800);
            case 6:
                return i5.c.i(i7, "");
            case 7:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.gd.M0(2131748894, null);
                    case 1:
                        return org.telegram.messenger.gd.M0(2131750818, null);
                    case 2:
                        return org.telegram.messenger.gd.M0(2131748491, null);
                    case 3:
                        return org.telegram.messenger.gd.M0(2131754171, null);
                    case 4:
                        return org.telegram.messenger.gd.M0(2131748470, null);
                    case 5:
                        return org.telegram.messenger.gd.M0(2131748872, null);
                    case 6:
                        return org.telegram.messenger.gd.M0(2131748874, null);
                    case 7:
                        return org.telegram.messenger.gd.M0(2131753893, null);
                    case 8:
                        return org.telegram.messenger.gd.M0(2131745370, null);
                    case 9:
                        return org.telegram.messenger.gd.M0(2131747637, null);
                    case 10:
                        return org.telegram.messenger.gd.M0(2131747642, null);
                    default:
                        return org.telegram.messenger.gd.M0(2131751594, null);
                }
            case 8:
                return i5.c.i(i7, "");
            case 9:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.gd.M0(2131748894, null);
                    case 1:
                        return org.telegram.messenger.gd.M0(2131750818, null);
                    case 2:
                        return org.telegram.messenger.gd.M0(2131748491, null);
                    case 3:
                        return org.telegram.messenger.gd.M0(2131754171, null);
                    case 4:
                        return org.telegram.messenger.gd.M0(2131748470, null);
                    case 5:
                        return org.telegram.messenger.gd.M0(2131748872, null);
                    case 6:
                        return org.telegram.messenger.gd.M0(2131748874, null);
                    case 7:
                        return org.telegram.messenger.gd.M0(2131753893, null);
                    case 8:
                        return org.telegram.messenger.gd.M0(2131745370, null);
                    case 9:
                        return org.telegram.messenger.gd.M0(2131747637, null);
                    case 10:
                        return org.telegram.messenger.gd.M0(2131747642, null);
                    default:
                        return org.telegram.messenger.gd.M0(2131751594, null);
                }
            case 10:
                return String.format("%02d", Integer.valueOf(i7));
            case 11:
                return i5.c.i(i7, "");
            case 12:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public Object m(Object obj) {
        switch (this.f36641a) {
            case 21:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i7 = ry.V2;
                return 0;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof mh0) {
            mh0 mh0Var = (mh0) t6;
            mh0Var.P(0);
            mh0Var.stop();
            mh0Var.T(false, 0.0f);
        }
    }

    @Override
    public void onClick() {
        int i7 = kl.G0;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
