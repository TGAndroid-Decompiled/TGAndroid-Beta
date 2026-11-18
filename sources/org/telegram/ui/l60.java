package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
public final class l60 implements org.telegram.messenger.h9, org.telegram.messenger.i9, org.telegram.messenger.cb, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ob0, org.telegram.messenger.r10, org.telegram.ui.Components.du0, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6 {
    public final int f49459a;

    public l60(int i7) {
        this.f49459a = i7;
    }

    @Override
    public void d(int i7, View view) {
        org.telegram.ui.Wallet.f4 f4Var = (org.telegram.ui.Wallet.f4) view;
        ShapeDrawable shapeDrawable = f4Var.f44187f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            f4Var.f44187f0.invalidateSelf();
        }
    }

    @Override
    public int f(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f4) view).f44187f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return di.pb.b1(false, org.telegram.messenger.gd.H(',', "Stars", num.intValue()), 0.66f, null);
        }
        return org.telegram.messenger.gd.E(num.intValue(), ',');
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49459a) {
            case 4:
                u1Var.dismiss();
                return;
            case 5:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            default:
                u1Var.dismiss();
                return;
            case 6:
                Drawable[] drawableArr = PhotoViewer.Z8;
                return;
            case 7:
                u1Var.dismiss();
                return;
            case 8:
                u1Var.dismiss();
                return;
            case 10:
                RectF rectF = ProfileActivity.Z6;
                u1Var.dismiss();
                return;
            case 11:
                u1Var.dismiss();
                return;
            case 17:
                u1Var.dismiss();
                return;
            case 20:
                u1Var.dismiss();
                return;
            case 21:
                u1Var.dismiss();
                return;
            case 22:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public String i(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.gd.M0(2131753797, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(1, "Minutes", new Object[0]));
        }
        if (i7 == 2) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(5, "Minutes", new Object[0]));
        }
        if (i7 == 3) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(1, "Hours", new Object[0]));
        }
        if (i7 == 4) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public void k(int i7) {
        org.telegram.messenger.bz.f23153b1 = i7;
        org.telegram.messenger.bz.y();
    }

    @Override
    public Object m(Object obj) {
        Void r12 = (Void) obj;
        String str = LaunchActivity.C1;
        return new le0();
    }

    @Override
    public boolean run() {
        String str = LaunchActivity.C1;
        if (org.telegram.messenger.bz.f23197s.length() > 0 && !org.telegram.messenger.bz.A) {
            return true;
        }
        return false;
    }

    @Override
    public void o() {
    }

    @Override
    public void onClick() {
    }
}
