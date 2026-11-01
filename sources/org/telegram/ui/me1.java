package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class me1 extends org.telegram.ui.Components.tk0 {
    public final Context f39519c;
    public final WallpapersListActivity d;

    public me1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f39519c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f35481a;
    }

    @Override
    public final int d(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f35483b && i10 != wallpapersListActivity.e) {
            if (i10 != wallpapersListActivity.f35489f && i10 != wallpapersListActivity.f35491n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p8Var;
        Context context = this.f39519c;
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
