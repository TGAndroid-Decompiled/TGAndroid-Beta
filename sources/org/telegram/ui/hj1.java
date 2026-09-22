package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class hj1 extends org.telegram.ui.Components.xl0 {
    public final Context f34249c;
    public final WallpapersListActivity d;

    public hj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f34249c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42998f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31927a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f31929b && i10 != wallpapersListActivity.e) {
            if (i10 != wallpapersListActivity.f31935f && i10 != wallpapersListActivity.f31939n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hj1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View s8Var;
        Context context = this.f34249c;
        if (i10 != 0) {
            if (i10 != 3) {
                s8Var = new org.telegram.ui.Components.ij(this, context, 1);
                s8Var.setTag(-33024);
            } else {
                s8Var = new org.telegram.ui.Cells.f9(context);
            }
        } else {
            s8Var = new org.telegram.ui.Cells.s8(context);
        }
        return new s4.c1(s8Var);
    }
}
