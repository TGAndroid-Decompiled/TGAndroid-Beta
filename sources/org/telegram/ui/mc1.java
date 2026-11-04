package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class mc1 extends org.telegram.ui.Components.sj0 {
    public final Context f47651c;
    public final WallpapersListActivity d;

    public mc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f47651c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43524a;
    }

    @Override
    public final int d(int i3) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i3 != i10 && i3 != wallpapersListActivity.h && i3 != wallpapersListActivity.f43526b && i3 != wallpapersListActivity.f43531e) {
            if (i3 != wallpapersListActivity.f43533f && i3 != wallpapersListActivity.f43536n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc1.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View l8Var;
        Context context = this.f47651c;
        if (i3 != 0) {
            if (i3 != 3) {
                l8Var = new org.telegram.ui.Components.pi(this, context, 1);
                l8Var.setTag(-33024);
            } else {
                l8Var = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            l8Var = new org.telegram.ui.Cells.l8(context);
        }
        return new u4.d1(l8Var);
    }
}
