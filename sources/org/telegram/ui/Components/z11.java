package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class z11 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.pc, mu0, nu0, wb0, org.telegram.messenger.l9, org.telegram.messenger.j9, org.telegram.messenger.k20, xu0 {
    public final int f32873a;

    public z11(int i10) {
        this.f32873a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
        switch (this.f32873a) {
            case 3:
                WindowManager.LayoutParams layoutParams = s0Var.f31649c;
                s0Var.Q = f7;
                layoutParams.x = (int) f7;
                org.telegram.messenger.i0.S3(s0Var.f31648b, s0Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = s0Var.f31649c;
                s0Var.R = f7;
                layoutParams2.y = (int) f7;
                org.telegram.messenger.i0.S3(s0Var.f31648b, s0Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return rh.h8.Z0(false, org.telegram.messenger.cd.H(',', "Stars", num.intValue()), 0.66f, null);
        }
        return org.telegram.messenger.cd.E(num.intValue(), ',');
    }

    @Override
    public String e(int i10) {
        switch (this.f32873a) {
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                if (i10 == 0) {
                    return org.telegram.messenger.cd.L0(2131753799, null);
                }
                if (i10 == 1) {
                    return org.telegram.messenger.cd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.cd.G(1, "Minutes", new Object[0]));
                }
                if (i10 == 2) {
                    return org.telegram.messenger.cd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.cd.G(5, "Minutes", new Object[0]));
                }
                if (i10 == 3) {
                    return org.telegram.messenger.cd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.cd.G(1, "Hours", new Object[0]));
                }
                if (i10 == 4) {
                    return org.telegram.messenger.cd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.cd.G(5, "Hours", new Object[0]));
                }
                return "";
        }
    }

    @Override
    public float get(Object obj) {
        org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
        switch (this.f32873a) {
            case 2:
                return s0Var.Q;
            default:
                return s0Var.R;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f32873a) {
            case 0:
                x1Var.dismiss();
                return;
            case 6:
                x1Var.dismiss();
                return;
            case 7:
                return;
            case 8:
                org.telegram.messenger.vp.e1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 9:
                org.telegram.messenger.vp.e1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 17:
                x1Var.dismiss();
                return;
            case 19:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 20:
                x1Var.dismiss();
                return;
            case 21:
                x1Var.dismiss();
                return;
            case 23:
                RectF rectF = ProfileActivity.R6;
                x1Var.dismiss();
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Void r82 = (Void) obj;
        switch (this.f32873a) {
            case 12:
                int L = org.telegram.messenger.i0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 13:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = org.telegram.messenger.i0.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f7 = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.D1;
                return new org.telegram.ui.pf0();
        }
    }

    @Override
    public void m(int i10) {
        org.telegram.messenger.tz.f18136b1 = i10;
        org.telegram.messenger.tz.y();
    }

    @Override
    public void q(Exception exc) {
        org.telegram.messenger.f8.g(exc, true);
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.D1;
        if (org.telegram.messenger.tz.f18180s.length() > 0 && !org.telegram.messenger.tz.A) {
            return true;
        }
        return false;
    }

    @Override
    public void s() {
    }

    private final void a(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
    }
}
