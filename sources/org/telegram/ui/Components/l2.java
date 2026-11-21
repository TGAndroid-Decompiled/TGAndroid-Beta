package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class l2 implements pb0, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6, a5, org.telegram.messenger.jc, org.telegram.messenger.cb, org.telegram.messenger.i9, p.a, ih.b, vt0, wt0 {
    public final int f37069a;

    public l2(int i7) {
        this.f37069a = i7;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f37069a) {
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
        yb0 yb0Var = (yb0) obj;
        switch (this.f37069a) {
            case 26:
                yb0Var.f42387f = f10;
                if (!yb0Var.E || yb0Var.G) {
                    yb0Var.f42385c.setStrokeWidth(org.telegram.messenger.g0.T1(yb0Var.f42391w, yb0Var.f42392x, f10));
                    yb0Var.f();
                }
                yb0Var.invalidate();
                return;
            default:
                yb0Var.f42388n = f10;
                if (!yb0Var.E || yb0Var.G) {
                    yb0Var.f();
                }
                yb0Var.invalidate();
                return;
        }
    }

    @Override
    public void d(int i7, View view) {
        ((org.telegram.ui.ActionBar.y0) view).d(i7, i7);
    }

    @Override
    public int f(View view) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) view;
        if (y0Var.getTextView() != null) {
            return y0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public float get(Object obj) {
        yb0 yb0Var = (yb0) obj;
        switch (this.f37069a) {
            case 25:
                return yb0Var.f42387f;
            case 26:
            default:
                return yb0Var.f42390s;
            case 27:
                return yb0Var.f42388n;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f37069a) {
            case 1:
                t1Var.dismiss();
                return;
            case 5:
                Pattern pattern = c5.f34019a;
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public String i(int i7) {
        int i10;
        switch (this.f37069a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i7));
            case 1:
            case 5:
            default:
                return String.format("%02d", Integer.valueOf(i7));
            case 2:
                boolean z10 = org.telegram.messenger.gd.f24243c0;
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
                    return org.telegram.messenger.gd.a0(null, null, 2131752735, format);
                }
                return format;
            case 3:
                return String.format("%02d", Integer.valueOf(i7));
            case 4:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131745165, null);
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
                        return org.telegram.messenger.gd.N0(2131748893, null);
                    case 1:
                        return org.telegram.messenger.gd.N0(2131750817, null);
                    case 2:
                        return org.telegram.messenger.gd.N0(2131748490, null);
                    case 3:
                        return org.telegram.messenger.gd.N0(2131754170, null);
                    case 4:
                        return org.telegram.messenger.gd.N0(2131748469, null);
                    case 5:
                        return org.telegram.messenger.gd.N0(2131748871, null);
                    case 6:
                        return org.telegram.messenger.gd.N0(2131748873, null);
                    case 7:
                        return org.telegram.messenger.gd.N0(2131753892, null);
                    case 8:
                        return org.telegram.messenger.gd.N0(2131745369, null);
                    case 9:
                        return org.telegram.messenger.gd.N0(2131747636, null);
                    case 10:
                        return org.telegram.messenger.gd.N0(2131747641, null);
                    default:
                        return org.telegram.messenger.gd.N0(2131751593, null);
                }
            case 8:
                return i5.c.i(i7, "");
            case 9:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.gd.N0(2131748893, null);
                    case 1:
                        return org.telegram.messenger.gd.N0(2131750817, null);
                    case 2:
                        return org.telegram.messenger.gd.N0(2131748490, null);
                    case 3:
                        return org.telegram.messenger.gd.N0(2131754170, null);
                    case 4:
                        return org.telegram.messenger.gd.N0(2131748469, null);
                    case 5:
                        return org.telegram.messenger.gd.N0(2131748871, null);
                    case 6:
                        return org.telegram.messenger.gd.N0(2131748873, null);
                    case 7:
                        return org.telegram.messenger.gd.N0(2131753892, null);
                    case 8:
                        return org.telegram.messenger.gd.N0(2131745369, null);
                    case 9:
                        return org.telegram.messenger.gd.N0(2131747636, null);
                    case 10:
                        return org.telegram.messenger.gd.N0(2131747641, null);
                    default:
                        return org.telegram.messenger.gd.N0(2131751593, null);
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
        switch (this.f37069a) {
            case 21:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i7 = ty.V2;
                return 0;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof oh0) {
            oh0 oh0Var = (oh0) t6;
            oh0Var.P(0);
            oh0Var.stop();
            oh0Var.T(false, 0.0f);
        }
    }

    @Override
    public void onClick() {
        int i7 = ml.G0;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
