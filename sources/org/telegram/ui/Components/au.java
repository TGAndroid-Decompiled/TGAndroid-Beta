package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.ImageReceiver;
public final class au implements p.a, org.telegram.messenger.l9, yg.b, mu0, nu0, org.telegram.messenger.mc, wg.c, r0.m, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.y6 {
    public final int f24461a;

    public au(int i10) {
        this.f24461a = i10;
    }

    public static BlendMode k() {
        return BlendMode.DST_IN;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return r0.j1.f46131b;
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
        switch (this.f24461a) {
            case 4:
                ec0 ec0Var = (ec0) obj;
                ec0Var.f25752f = f7;
                if (!ec0Var.D || ec0Var.F) {
                    ec0Var.f25751c.setStrokeWidth(org.telegram.messenger.i0.T1(ec0Var.f25756w, ec0Var.f25757x, f7));
                    ec0Var.f();
                }
                ec0Var.invalidate();
                return;
            case 6:
                ec0 ec0Var2 = (ec0) obj;
                ec0Var2.f25753n = f7;
                if (!ec0Var2.D || ec0Var2.F) {
                    ec0Var2.f();
                }
                ec0Var2.invalidate();
                return;
            case 8:
                ec0 ec0Var3 = (ec0) obj;
                ec0Var3.f25755s = f7;
                ec0Var3.f();
                return;
            case 13:
                jf0 jf0Var = (jf0) obj;
                WindowManager.LayoutParams layoutParams = jf0Var.f27350c;
                jf0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    org.telegram.messenger.i0.S3(jf0Var.f27348b, jf0Var.d, layoutParams);
                    return;
                } catch (IllegalArgumentException unused) {
                    jf0Var.M.d();
                    return;
                }
            case 15:
                jf0 jf0Var2 = (jf0) obj;
                WindowManager.LayoutParams layoutParams2 = jf0Var2.f27350c;
                jf0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    org.telegram.messenger.i0.S3(jf0Var2.f27348b, jf0Var2.d, layoutParams2);
                    return;
                } catch (IllegalArgumentException unused2) {
                    jf0Var2.N.d();
                    return;
                }
            default:
                do0 do0Var = (do0) obj;
                do0Var.f25477n = f7;
                do0Var.invalidate();
                return;
        }
    }

    @Override
    public wb c(cc ccVar) {
        return ccVar.k(false);
    }

    @Override
    public void d(int i10, View view) {
        ((dn0) view).setTextColor(i10);
    }

    @Override
    public int f(View view) {
        return ((dn0) view).f25471w;
    }

    @Override
    public int g(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        Bitmap bitmap = qh.t.f45738a;
        return (((int) a1.g.A(qh.y0.f46092b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public float get(Object obj) {
        switch (this.f24461a) {
            case 3:
                return ((ec0) obj).f25752f;
            case 5:
                return ((ec0) obj).f25753n;
            case 7:
                return ((ec0) obj).f25755s;
            case 12:
                return ((jf0) obj).K;
            case 14:
                return ((jf0) obj).L;
            default:
                return ((do0) obj).f25477n;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f24461a) {
            case 17:
                x1Var.dismiss();
                return;
            case 18:
                x1Var.dismiss();
                return;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                x1Var.dismiss();
                return;
            case 24:
                x1Var.dismiss();
                return;
            case 25:
                x1Var.dismiss();
                return;
            case 26:
                x1Var.dismiss();
                return;
            case 27:
                int i11 = cx0.f25196n2;
                return;
        }
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
        int i10 = this.f24461a;
    }

    @Override
    public Object l(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f24461a) {
            case 1:
                int i10 = vy.U2;
                break;
            default:
                int i11 = op0.Q2;
                break;
        }
        return 0;
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bi0 B;
        boolean z13;
        switch (this.f24461a) {
            case 9:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    return;
                }
                return;
            default:
                if (!(imageReceiver.f14387j0 instanceof org.telegram.messenger.p6) && !(imageReceiver.S instanceof org.telegram.messenger.p6) && !(imageReceiver.f14366a0 instanceof org.telegram.messenger.p6) && !(imageReceiver.m0 instanceof org.telegram.messenger.p6)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    imageReceiver.f14397o1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    return;
                }
                return;
        }
    }

    @Override
    public void q(int i10, Drawable drawable) {
        int i11 = this.f24461a;
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void e(int i10, Drawable drawable) {
    }

    private final void i(int i10, Drawable drawable) {
    }
}
