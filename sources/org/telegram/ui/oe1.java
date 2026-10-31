package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class oe1 extends org.telegram.ui.Components.sk0 {
    public final Context f40251c;
    public final WallpapersListActivity d;

    public oe1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f40251c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f35474a;
    }

    @Override
    public final int d(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f35476b && i10 != wallpapersListActivity.e) {
            if (i10 != wallpapersListActivity.f35482f && i10 != wallpapersListActivity.f35484n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oe1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p8Var;
        Context context = this.f40251c;
        if (i10 != 0) {
            if (i10 != 3) {
                p8Var = new org.telegram.ui.Components.pi(this, context, 1);
                p8Var.setTag(-33024);
            } else {
                p8Var = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            p8Var = new org.telegram.ui.Cells.p8(context);
        }
        return new s4.c1(p8Var);
    }
}
