package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class rb0 implements org.telegram.messenger.kc, gh.d, r0.m, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6, kt0, lt0, org.telegram.messenger.j9, org.telegram.messenger.nc, eb0 {
    public final int f38944a;

    public rb0(int i7) {
        this.f38944a = i7;
    }

    public static BlendMode i() {
        return BlendMode.PLUS;
    }

    public static BlendMode k() {
        return BlendMode.SRC_OVER;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
        int i7 = this.f38944a;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        boolean z13;
        switch (this.f38944a) {
            case 0:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    return;
                }
                return;
            default:
                if (!(imageReceiver.f22281k0 instanceof org.telegram.messenger.o6) && !(imageReceiver.T instanceof org.telegram.messenger.o6) && !(imageReceiver.f22260b0 instanceof org.telegram.messenger.o6) && !(imageReceiver.f22286n0 instanceof org.telegram.messenger.o6)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    imageReceiver.f22290p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    return;
                }
                return;
        }
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.f55681b;
    }

    @Override
    public void O(int i7, Drawable drawable) {
        int i10 = this.f38944a;
    }

    @Override
    public void c(Object obj, float f10) {
        gn0 gn0Var = (gn0) obj;
        gn0Var.f35033n = f10;
        gn0Var.invalidate();
    }

    @Override
    public String e(int i7) {
        switch (this.f38944a) {
            case 25:
                return String.format("%02d", Integer.valueOf(i7));
            default:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public void f(int i7, View view) {
        ((gm0) view).setTextColor(i7);
    }

    @Override
    public int g(View view) {
        return ((gm0) view).f35026w;
    }

    @Override
    public float get(Object obj) {
        return ((gn0) obj).f35033n;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f38944a) {
            case 4:
                t1Var.dismiss();
                return;
            case 5:
                t1Var.dismiss();
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            case 18:
            case 20:
            default:
                org.telegram.messenger.np.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 11:
                t1Var.dismiss();
                return;
            case 12:
                t1Var.dismiss();
                return;
            case 13:
                t1Var.dismiss();
                return;
            case 16:
                int i10 = bw0.f33395r2;
                return;
            case 17:
                t1Var.dismiss();
                return;
            case 19:
                t1Var.dismiss();
                return;
            case 21:
                t1Var.dismiss();
                return;
            case 22:
                return;
            case 23:
                org.telegram.messenger.np.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Bitmap bitmap = ci.u.f5498a;
        return (((int) a8.p0.f(ci.c1.f5329b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public Object o(Object obj) {
        switch (this.f38944a) {
            case 10:
                Integer num = (Integer) obj;
                int i7 = po0.U2;
                return 0;
            case 27:
                Void r82 = (Void) obj;
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            default:
                Void r83 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f10 = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
        }
    }

    @Override
    public void r(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    private final void l(ImageReceiver imageReceiver) {
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void a(int i7, Drawable drawable) {
    }

    private final void b(int i7, Drawable drawable) {
    }

    private final void n(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
