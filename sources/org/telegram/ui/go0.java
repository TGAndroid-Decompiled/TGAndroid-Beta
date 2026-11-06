package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
public final class go0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.w10, org.telegram.ui.Components.ut0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6 {
    public final int f46074a;

    public go0(int i7) {
        this.f46074a = i7;
    }

    @Override
    public void c(int i7, View view) {
        org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) view;
        ShapeDrawable shapeDrawable = w3Var.f43271e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            w3Var.f43271e0.invalidateSelf();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return bi.dd.a1(false, org.telegram.messenger.hd.H(',', "Stars", num.intValue()), 0.66f, null);
        }
        return org.telegram.messenger.hd.E(num.intValue(), ',');
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46074a) {
            case 0:
                u1Var.dismiss();
                return;
            case 1:
                u1Var.dismiss();
                return;
            case 3:
                RectF rectF = ProfileActivity.S6;
                u1Var.dismiss();
                return;
            case 4:
                u1Var.dismiss();
                return;
            case 10:
                u1Var.dismiss();
                return;
            case 14:
                u1Var.dismiss();
                return;
            case 15:
                u1Var.dismiss();
                return;
            case 16:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public int i(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.w3) view).f43271e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public void m(int i7) {
        org.telegram.messenger.iz.f23369b1 = i7;
        org.telegram.messenger.iz.y();
    }

    @Override
    public void n() {
    }
}
