package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class ub0 implements vt0, org.telegram.messenger.jc, gh.d, r0.m, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, ut0, org.telegram.messenger.i9, org.telegram.messenger.mc, mb0 {
    public final int f40344a;

    public ub0(int i7) {
        this.f40344a = i7;
    }

    @Override
    public void J(int i7, Drawable drawable) {
        int i10 = this.f40344a;
    }

    @Override
    public void d(Object obj, float f10) {
        switch (this.f40344a) {
            case 0:
                vb0 vb0Var = (vb0) obj;
                vb0Var.f40629s = f10;
                vb0Var.f();
                return;
            default:
                qn0 qn0Var = (qn0) obj;
                qn0Var.f38962n = f10;
                qn0Var.invalidate();
                return;
        }
    }

    @Override
    public String e(int i7) {
        switch (this.f40344a) {
            case 26:
                return String.format("%02d", Integer.valueOf(i7));
            default:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Bitmap bitmap = ci.u.f5775a;
        return (((int) a8.p0.f(ci.c1.f5607b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public void g(int i7, View view) {
        ((qm0) view).setTextColor(i7);
    }

    @Override
    public float get(Object obj) {
        return ((qn0) obj).f38962n;
    }

    @Override
    public Object h(Object obj) {
        switch (this.f40344a) {
            case 11:
                Integer num = (Integer) obj;
                int i7 = zo0.U2;
                return 0;
            case 28:
                Void r82 = (Void) obj;
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
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
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f40344a) {
            case 5:
                t1Var.dismiss();
                return;
            case 6:
                t1Var.dismiss();
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
                t1Var.dismiss();
                return;
            case 13:
                t1Var.dismiss();
                return;
            case 14:
                t1Var.dismiss();
                return;
            case 17:
                int i10 = jw0.f36526r2;
                return;
            case 18:
                t1Var.dismiss();
                return;
            case 20:
                t1Var.dismiss();
                return;
            case 22:
                t1Var.dismiss();
                return;
            case 23:
                return;
            case 24:
                org.telegram.messenger.mp.h1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
        }
    }

    @Override
    public int k(View view) {
        return ((qm0) view).f38907w;
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return r0.l1.f56380b;
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
        int i7 = this.f40344a;
    }

    @Override
    public void s(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nh0 C;
        boolean z13;
        switch (this.f40344a) {
            case 1:
                if (z10 && !z11 && (C = imageReceiver.C()) != null) {
                    C.start();
                    return;
                }
                return;
            default:
                if (!(imageReceiver.f22742k0 instanceof org.telegram.messenger.o6) && !(imageReceiver.T instanceof org.telegram.messenger.o6) && !(imageReceiver.f22721b0 instanceof org.telegram.messenger.o6) && !(imageReceiver.f22747n0 instanceof org.telegram.messenger.o6)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    imageReceiver.f22751p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    return;
                }
                return;
        }
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void a(int i7, Drawable drawable) {
    }

    private final void b(int i7, Drawable drawable) {
    }

    private final void o(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
