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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class jl0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.p6, org.telegram.ui.ActionBar.q6, lt0, mt0, org.telegram.messenger.k9, org.telegram.messenger.lc, org.telegram.messenger.oc, eb0, org.telegram.messenger.j9, org.telegram.messenger.eb {
    public final int f35093a;

    public jl0(int i7) {
        this.f35093a = i7;
    }

    @Override
    public void c(int i7, View view) {
        ((dm0) view).setTextColor(i7);
    }

    @Override
    public void f(Object obj, float f10) {
        dn0 dn0Var = (dn0) obj;
        dn0Var.f33118n = f10;
        dn0Var.invalidate();
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        if (!(imageReceiver.f21200j0 instanceof org.telegram.messenger.o6) && !(imageReceiver.S instanceof org.telegram.messenger.o6) && !(imageReceiver.f21178a0 instanceof org.telegram.messenger.o6) && !(imageReceiver.m0 instanceof org.telegram.messenger.o6)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            return;
        }
        imageReceiver.f21209o1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f35093a) {
            case 0:
                u1Var.dismiss();
                return;
            case 1:
                u1Var.dismiss();
                return;
            case 7:
                u1Var.dismiss();
                return;
            case 8:
                u1Var.dismiss();
                return;
            case 9:
                u1Var.dismiss();
                return;
            case 10:
                int i10 = zv0.f41143n2;
                return;
            case 11:
                u1Var.dismiss();
                return;
            case 13:
                u1Var.dismiss();
                return;
            case 15:
                u1Var.dismiss();
                return;
            case 16:
                return;
            case 17:
                org.telegram.messenger.qp.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 18:
                org.telegram.messenger.qp.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 27:
                u1Var.dismiss();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                return;
        }
    }

    @Override
    public float get(Object obj) {
        return ((dn0) obj).f33118n;
    }

    @Override
    public String h(int i7) {
        switch (this.f35093a) {
            case 19:
                return String.format("%02d", Integer.valueOf(i7));
            case 20:
                return String.format("%02d", Integer.valueOf(i7));
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131753799, null);
                }
                if (i7 == 1) {
                    return org.telegram.messenger.id.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.id.G(1, "Minutes", new Object[0]));
                }
                if (i7 == 2) {
                    return org.telegram.messenger.id.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.id.G(5, "Minutes", new Object[0]));
                }
                if (i7 == 3) {
                    return org.telegram.messenger.id.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.id.G(1, "Hours", new Object[0]));
                }
                if (i7 == 4) {
                    return org.telegram.messenger.id.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.id.G(5, "Hours", new Object[0]));
                }
                return "";
        }
    }

    @Override
    public int i(View view) {
        return ((dm0) view).f33109w;
    }

    @Override
    public Object j(Object obj) {
        switch (this.f35093a) {
            case 6:
                Integer num = (Integer) obj;
                int i7 = no0.Q2;
                return 0;
            case 21:
                Void r82 = (Void) obj;
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 22:
                Void r83 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f10 = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
            default:
                Void r84 = (Void) obj;
                String str = LaunchActivity.B1;
                return new org.telegram.ui.le0();
        }
    }

    @Override
    public void r(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override
    public boolean run() {
        String str = LaunchActivity.B1;
        if (org.telegram.messenger.iz.f23434s.length() > 0 && !org.telegram.messenger.iz.A) {
            return true;
        }
        return false;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void onClick() {
    }

    private final void a(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
