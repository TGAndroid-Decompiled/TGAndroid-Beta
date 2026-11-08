package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class k2 implements org.telegram.ui.ActionBar.r1, db0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, t4, org.telegram.messenger.lc, org.telegram.messenger.eb, org.telegram.messenger.k9, p.a, ih.b, jt0, kt0, gh.d, r0.m {
    public final int f35163a;

    public k2(int i7) {
        this.f35163a = i7;
    }

    public static BlendMode l() {
        return BlendMode.DST_IN;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f35163a) {
            case 11:
                MediaController.B().B0(1, i7, z9, false);
                return;
            default:
                MediaController.B().B0(1, i7, z9, false);
                return;
        }
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        int i7 = this.f35163a;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return r0.k1.f54201b;
    }

    @Override
    public cc a(hc hcVar) {
        return hcVar.k(false);
    }

    @Override
    public Object b(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public void c(int i7, View view) {
        ((org.telegram.ui.ActionBar.z0) view).d(i7, i7);
    }

    @Override
    public void f(Object obj, float f10) {
        lb0 lb0Var = (lb0) obj;
        switch (this.f35163a) {
            case 21:
                lb0Var.f35632f = f10;
                if (!lb0Var.D || lb0Var.F) {
                    lb0Var.f35630c.setStrokeWidth(org.telegram.messenger.g0.T1(lb0Var.f35636w, lb0Var.f35637x, f10));
                    lb0Var.f();
                }
                lb0Var.invalidate();
                return;
            case 22:
            default:
                lb0Var.f35635s = f10;
                lb0Var.f();
                return;
            case 23:
                lb0Var.f35633n = f10;
                if (!lb0Var.D || lb0Var.F) {
                    lb0Var.f();
                }
                lb0Var.invalidate();
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        switch (this.f35163a) {
            case 13:
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof zg0) {
                    zg0 zg0Var = (zg0) t6;
                    zg0Var.P(0);
                    zg0Var.stop();
                    zg0Var.T(false, 0.0f);
                    return;
                }
                return;
            default:
                if (z9 && !z10 && (B = imageReceiver.B()) != null) {
                    B.start();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f35163a) {
            case 0:
                Pattern pattern = v4.f38848a;
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        lb0 lb0Var = (lb0) obj;
        switch (this.f35163a) {
            case 20:
                return lb0Var.f35632f;
            case 21:
            default:
                return lb0Var.f35635s;
            case 22:
                return lb0Var.f35633n;
        }
    }

    @Override
    public String h(int i7) {
        switch (this.f35163a) {
            case 1:
                return jg.g.j(i7, "");
            case 2:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.id.M0(2131749087, null);
                    case 1:
                        return org.telegram.messenger.id.M0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.id.M0(2131748684, null);
                    case 3:
                        return org.telegram.messenger.id.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.id.M0(2131748663, null);
                    case 5:
                        return org.telegram.messenger.id.M0(2131749065, null);
                    case 6:
                        return org.telegram.messenger.id.M0(2131749067, null);
                    case 7:
                        return org.telegram.messenger.id.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.id.M0(2131745568, null);
                    case 9:
                        return org.telegram.messenger.id.M0(2131747831, null);
                    case 10:
                        return org.telegram.messenger.id.M0(2131747836, null);
                    default:
                        return org.telegram.messenger.id.M0(2131751606, null);
                }
            case 3:
                return jg.g.j(i7, "");
            case 4:
                switch (i7) {
                    case 0:
                        return org.telegram.messenger.id.M0(2131749087, null);
                    case 1:
                        return org.telegram.messenger.id.M0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.id.M0(2131748684, null);
                    case 3:
                        return org.telegram.messenger.id.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.id.M0(2131748663, null);
                    case 5:
                        return org.telegram.messenger.id.M0(2131749065, null);
                    case 6:
                        return org.telegram.messenger.id.M0(2131749067, null);
                    case 7:
                        return org.telegram.messenger.id.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.id.M0(2131745568, null);
                    case 9:
                        return org.telegram.messenger.id.M0(2131747831, null);
                    case 10:
                        return org.telegram.messenger.id.M0(2131747836, null);
                    default:
                        return org.telegram.messenger.id.M0(2131751606, null);
                }
            case 5:
                return String.format("%02d", Integer.valueOf(i7));
            case 6:
                return jg.g.j(i7, "");
            case 7:
                return String.format("%02d", Integer.valueOf(i7));
            default:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public int i(View view) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) view;
        if (z0Var.getTextView() != null) {
            return z0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public Object j(Object obj) {
        switch (this.f35163a) {
            case 16:
                Void r22 = (Void) obj;
                return CheckBoxBase.I;
            default:
                Integer num = (Integer) obj;
                int i7 = hy.U2;
                return 0;
        }
    }

    @Override
    public int k(org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        Bitmap bitmap = ai.z.f1700a;
        return (((int) a8.p0.f(ai.o1.f1596b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public void onClick() {
        int i7 = wk.F0;
    }

    @Override
    public void t0(int i7, Drawable drawable) {
        int i10 = this.f35163a;
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void d(int i7, Drawable drawable) {
    }

    private final void e(int i7, Drawable drawable) {
    }
}
