package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
public final class l60 implements org.telegram.messenger.h9, org.telegram.messenger.i9, org.telegram.messenger.cb, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.mb0, org.telegram.messenger.q10, org.telegram.ui.Components.fu0, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6 {
    public final int f49609a;

    public l60(int i7) {
        this.f49609a = i7;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return di.pb.b1(false, org.telegram.messenger.gd.H(',', "Stars", num.intValue()), 0.66f, null);
        }
        return org.telegram.messenger.gd.E(num.intValue(), ',');
    }

    @Override
    public String e(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.gd.N0(2131753796, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(1, "Minutes", new Object[0]));
        }
        if (i7 == 2) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(5, "Minutes", new Object[0]));
        }
        if (i7 == 3) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(1, "Hours", new Object[0]));
        }
        if (i7 == 4) {
            return org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753795, org.telegram.messenger.gd.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public void g(int i7, View view) {
        org.telegram.ui.Wallet.g4 g4Var = (org.telegram.ui.Wallet.g4) view;
        ShapeDrawable shapeDrawable = g4Var.f44362f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            g4Var.f44362f0.invalidateSelf();
        }
    }

    @Override
    public Object h(Object obj) {
        Void r12 = (Void) obj;
        String str = LaunchActivity.C1;
        return new le0();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49609a) {
            case 4:
                t1Var.dismiss();
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
                t1Var.dismiss();
                return;
            case 6:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                return;
            case 7:
                t1Var.dismiss();
                return;
            case 8:
                t1Var.dismiss();
                return;
            case 10:
                RectF rectF = ProfileActivity.Z6;
                t1Var.dismiss();
                return;
            case 11:
                t1Var.dismiss();
                return;
            case 17:
                t1Var.dismiss();
                return;
            case 20:
                t1Var.dismiss();
                return;
            case 21:
                t1Var.dismiss();
                return;
            case 22:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public int k(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.g4) view).f44362f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public void n(int i7) {
        org.telegram.messenger.bz.f23275b1 = i7;
        org.telegram.messenger.bz.y();
    }

    @Override
    public boolean run() {
        String str = LaunchActivity.C1;
        if (org.telegram.messenger.bz.f23319s.length() > 0 && !org.telegram.messenger.bz.A) {
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
