package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.LaunchActivity;
public final class lf0 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, it0, jt0, org.telegram.messenger.e9, org.telegram.messenger.ec, org.telegram.messenger.ic, ya0, org.telegram.messenger.d9 {
    public final int f35717a;

    public lf0(int i3) {
        this.f35717a = i3;
    }

    @Override
    public void c(Object obj, float f10) {
        switch (this.f35717a) {
            case 6:
                fn0 fn0Var = (fn0) obj;
                fn0Var.f33827n = f10;
                fn0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                WindowManager.LayoutParams layoutParams = s0Var.f39594c;
                s0Var.R = f10;
                layoutParams.x = (int) f10;
                org.telegram.messenger.g0.T3(s0Var.f39592b, s0Var.d, layoutParams);
                return;
            default:
                org.telegram.ui.Components.voip.s0 s0Var2 = (org.telegram.ui.Components.voip.s0) obj;
                WindowManager.LayoutParams layoutParams2 = s0Var2.f39594c;
                s0Var2.S = f10;
                layoutParams2.y = (int) f10;
                org.telegram.messenger.g0.T3(s0Var2.f39592b, s0Var2.d, layoutParams2);
                return;
        }
    }

    @Override
    public String e(int i3) {
        switch (this.f35717a) {
            case 24:
                return String.format("%02d", Integer.valueOf(i3));
            default:
                return String.format("%02d", Integer.valueOf(i3));
        }
    }

    @Override
    public void f(int i3, View view) {
        ((fm0) view).setTextColor(i3);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f35717a) {
            case 1:
                s1Var.dismiss();
                return;
            case 2:
                s1Var.dismiss();
                return;
            case 8:
                s1Var.dismiss();
                return;
            case 9:
                s1Var.dismiss();
                return;
            case 10:
                s1Var.dismiss();
                return;
            case 11:
                int i10 = xv0.f40505o2;
                return;
            case 12:
                s1Var.dismiss();
                return;
            case 14:
                s1Var.dismiss();
                return;
            case 20:
                s1Var.dismiss();
                return;
            case 21:
                return;
            case 22:
                org.telegram.messenger.hp.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            default:
                org.telegram.messenger.hp.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f35717a) {
            case 5:
                return ((fn0) obj).f33827n;
            case 16:
                return ((org.telegram.ui.Components.voip.s0) obj).R;
            default:
                return ((org.telegram.ui.Components.voip.s0) obj).S;
        }
    }

    @Override
    public int h(View view) {
        return ((fm0) view).f33820w;
    }

    @Override
    public Object k(Object obj) {
        switch (this.f35717a) {
            case 7:
                Integer num = (Integer) obj;
                int i3 = oo0.R2;
                return 0;
            case 26:
                Void r82 = (Void) obj;
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
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
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        if (!(imageReceiver.f21252k0 instanceof org.telegram.messenger.o6) && !(imageReceiver.T instanceof org.telegram.messenger.o6) && !(imageReceiver.f21231b0 instanceof org.telegram.messenger.o6) && !(imageReceiver.f21256n0 instanceof org.telegram.messenger.o6)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z13) {
            return;
        }
        imageReceiver.f21261p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    @Override
    public boolean run() {
        String str = LaunchActivity.E1;
        if (org.telegram.messenger.az.f21661s.length() > 0 && !org.telegram.messenger.az.A) {
            return true;
        }
        return false;
    }

    @Override
    public void s(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    private final void b(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
