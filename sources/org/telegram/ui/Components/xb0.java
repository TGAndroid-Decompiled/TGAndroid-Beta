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
public final class xb0 implements wt0, org.telegram.messenger.jc, gh.d, r0.m, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6, vt0, org.telegram.messenger.i9, org.telegram.messenger.mc, pb0 {
    public final int f42042a;

    public xb0(int i7) {
        this.f42042a = i7;
    }

    @Override
    public void G0(int i7, Drawable drawable) {
        int i10 = this.f42042a;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return r0.l1.f56298b;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        int i7 = this.f42042a;
    }

    @Override
    public void c(Object obj, float f10) {
        switch (this.f42042a) {
            case 0:
                yb0 yb0Var = (yb0) obj;
                yb0Var.f42390s = f10;
                yb0Var.f();
                return;
            default:
                rn0 rn0Var = (rn0) obj;
                rn0Var.f39283n = f10;
                rn0Var.invalidate();
                return;
        }
    }

    @Override
    public void d(int i7, View view) {
        ((rm0) view).setTextColor(i7);
    }

    @Override
    public int f(View view) {
        return ((rm0) view).f39276w;
    }

    @Override
    public float get(Object obj) {
        return ((rn0) obj).f39283n;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f42042a) {
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
                int i10 = kw0.f37001r2;
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
    public String i(int i7) {
        switch (this.f42042a) {
            case 26:
                return String.format("%02d", Integer.valueOf(i7));
            default:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public int j(org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        Bitmap bitmap = ci.u.f5809a;
        return (((int) a8.p0.f(ci.c1.f5641b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override
    public Object m(Object obj) {
        switch (this.f42042a) {
            case 11:
                Integer num = (Integer) obj;
                int i7 = ap0.U2;
                return 0;
            case 28:
                Void r82 = (Void) obj;
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
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
        oh0 B;
        boolean z13;
        switch (this.f42042a) {
            case 1:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    return;
                }
                return;
            default:
                if (!(imageReceiver.f22672k0 instanceof org.telegram.messenger.o6) && !(imageReceiver.T instanceof org.telegram.messenger.o6) && !(imageReceiver.f22651b0 instanceof org.telegram.messenger.o6) && !(imageReceiver.f22677n0 instanceof org.telegram.messenger.o6)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    imageReceiver.f22681p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
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

    private final void o(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
