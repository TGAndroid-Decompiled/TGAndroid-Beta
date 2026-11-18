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
public final class wb0 implements tt0, org.telegram.messenger.jc, gh.d, r0.m, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, st0, org.telegram.messenger.i9, org.telegram.messenger.mc, ob0 {
    public final int f41658a;

    public wb0(int i7) {
        this.f41658a = i7;
    }

    public static BlendMode g() {
        return BlendMode.PLUS;
    }

    public static BlendMode k() {
        return BlendMode.SRC_OVER;
    }

    @Override
    public void G0(int i7, Drawable drawable) {
        int i10 = this.f41658a;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return r0.l1.f56257b;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        int i7 = this.f41658a;
    }

    @Override
    public void c(Object obj, float f10) {
        switch (this.f41658a) {
            case 0:
                xb0 xb0Var = (xb0) obj;
                xb0Var.f41969s = f10;
                xb0Var.f();
                return;
            default:
                pn0 pn0Var = (pn0) obj;
                pn0Var.f38500n = f10;
                pn0Var.invalidate();
                return;
        }
    }

    @Override
    public void d(int i7, View view) {
        ((om0) view).setTextColor(i7);
    }

    @Override
    public int f(View view) {
        return ((om0) view).f38135w;
    }

    @Override
    public float get(Object obj) {
        return ((pn0) obj).f38500n;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f41658a) {
            case 5:
                u1Var.dismiss();
                return;
            case 6:
                u1Var.dismiss();
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 15:
            case 16:
            case 19:
            case 21:
            default:
                org.telegram.messenger.mp.h1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 12:
                u1Var.dismiss();
                return;
            case 13:
                u1Var.dismiss();
                return;
            case 14:
                u1Var.dismiss();
                return;
            case 17:
                int i10 = iw0.f36232r2;
                return;
            case 18:
                u1Var.dismiss();
                return;
            case 20:
                u1Var.dismiss();
                return;
            case 22:
                u1Var.dismiss();
                return;
            case 23:
                return;
            case 24:
                org.telegram.messenger.mp.h1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public String i(int i7) {
        switch (this.f41658a) {
            case 26:
                return String.format("%02d", Integer.valueOf(i7));
            default:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public int j(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Bitmap bitmap = ci.u.f5783a;
        return (((int) a8.p0.f(ci.c1.f5615b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public Object m(Object obj) {
        switch (this.f41658a) {
            case 11:
                Integer num = (Integer) obj;
                int i7 = yo0.U2;
                return 0;
            case 28:
                Void r82 = (Void) obj;
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
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
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mh0 B;
        boolean z13;
        switch (this.f41658a) {
            case 1:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    return;
                }
                return;
            default:
                if (!(imageReceiver.f22647k0 instanceof org.telegram.messenger.o6) && !(imageReceiver.T instanceof org.telegram.messenger.o6) && !(imageReceiver.f22626b0 instanceof org.telegram.messenger.o6) && !(imageReceiver.f22652n0 instanceof org.telegram.messenger.o6)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    imageReceiver.f22656p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    return;
                }
                return;
        }
    }

    @Override
    public void q(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    private final void l(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void a(int i7, Drawable drawable) {
    }

    private final void b(int i7, Drawable drawable) {
    }

    private final void o(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
    }
}
