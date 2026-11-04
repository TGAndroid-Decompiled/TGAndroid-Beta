package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class a3 implements ya0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, r4, org.telegram.messenger.ec, org.telegram.ui.ActionBar.p1, org.telegram.messenger.xa, org.telegram.messenger.e9, p.a, jh.b, it0, jt0, hh.d, r0.m {
    public final int f31714a;

    public a3(int i3) {
        this.f31714a = i3;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
        int i3 = this.f31714a;
    }

    @Override
    public void F0(int i3, Drawable drawable) {
        int i10 = this.f31714a;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f31714a) {
            case 8:
                MediaController.B().B0(1, i3, z10, false);
                return;
            default:
                MediaController.B().B0(1, i3, z10, false);
                return;
        }
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return r0.k1.f54025b;
    }

    @Override
    public ac a(fc fcVar) {
        return fcVar.k(false);
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
        switch (this.f31714a) {
            case 18:
                gb0 gb0Var = (gb0) obj;
                gb0Var.f34036f = f10;
                if (!gb0Var.E || gb0Var.G) {
                    gb0Var.f34034c.setStrokeWidth(org.telegram.messenger.g0.T1(gb0Var.f34040w, gb0Var.f34041x, f10));
                    gb0Var.f();
                }
                gb0Var.invalidate();
                return;
            case 20:
                gb0 gb0Var2 = (gb0) obj;
                gb0Var2.f34037n = f10;
                if (!gb0Var2.E || gb0Var2.G) {
                    gb0Var2.f();
                }
                gb0Var2.invalidate();
                return;
            case 22:
                gb0 gb0Var3 = (gb0) obj;
                gb0Var3.f34039s = f10;
                gb0Var3.f();
                return;
            case 27:
                ie0 ie0Var = (ie0) obj;
                WindowManager.LayoutParams layoutParams = ie0Var.f34688c;
                ie0Var.L = f10;
                layoutParams.x = (int) f10;
                try {
                    org.telegram.messenger.g0.T3(ie0Var.f34686b, ie0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    ie0Var.N.d();
                    return;
                }
            default:
                ie0 ie0Var2 = (ie0) obj;
                WindowManager.LayoutParams layoutParams2 = ie0Var2.f34688c;
                ie0Var2.M = f10;
                layoutParams2.y = (int) f10;
                try {
                    org.telegram.messenger.g0.T3(ie0Var2.f34686b, ie0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    ie0Var2.O.d();
                    return;
                }
        }
    }

    @Override
    public String e(int i3) {
        switch (this.f31714a) {
            case 0:
                return k2.p1.i(i3, "");
            case 1:
                switch (i3) {
                    case 0:
                        return org.telegram.messenger.bd.M0(2131749094, null);
                    case 1:
                        return org.telegram.messenger.bd.M0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.bd.M0(2131748691, null);
                    case 3:
                        return org.telegram.messenger.bd.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.bd.M0(2131748670, null);
                    case 5:
                        return org.telegram.messenger.bd.M0(2131749072, null);
                    case 6:
                        return org.telegram.messenger.bd.M0(2131749074, null);
                    case 7:
                        return org.telegram.messenger.bd.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.bd.M0(2131745575, null);
                    case 9:
                        return org.telegram.messenger.bd.M0(2131747838, null);
                    case 10:
                        return org.telegram.messenger.bd.M0(2131747843, null);
                    default:
                        return org.telegram.messenger.bd.M0(2131751606, null);
                }
            case 2:
                return String.format("%02d", Integer.valueOf(i3));
            case 3:
                return k2.p1.i(i3, "");
            case 4:
                return String.format("%02d", Integer.valueOf(i3));
            default:
                return String.format("%02d", Integer.valueOf(i3));
        }
    }

    @Override
    public void f(int i3, View view) {
        ((org.telegram.ui.ActionBar.y0) view).d(i3, i3);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        s1Var.dismiss();
    }

    @Override
    public float get(Object obj) {
        switch (this.f31714a) {
            case 17:
                return ((gb0) obj).f34036f;
            case 19:
                return ((gb0) obj).f34037n;
            case 21:
                return ((gb0) obj).f34039s;
            case 26:
                return ((ie0) obj).L;
            default:
                return ((ie0) obj).M;
        }
    }

    @Override
    public int h(View view) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) view;
        if (y0Var.getTextView() != null) {
            return y0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Bitmap bitmap = bi.u.f3857a;
        return (((int) a1.g.e(bi.d1.f3698b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public Object k(Object obj) {
        switch (this.f31714a) {
            case 13:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i3 = ey.V2;
                return 0;
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        switch (this.f31714a) {
            case 10:
                Drawable t10 = imageReceiver.t();
                if (t10 instanceof ch0) {
                    ch0 ch0Var = (ch0) t10;
                    ch0Var.P(0);
                    ch0Var.stop();
                    ch0Var.T(false, 0.0f);
                    return;
                }
                return;
            default:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    return;
                }
                return;
        }
    }

    @Override
    public void onClick() {
        int i3 = uk.G0;
    }

    private final void l(ImageReceiver imageReceiver) {
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void d(int i3, Drawable drawable) {
    }

    private final void i(int i3, Drawable drawable) {
    }
}
