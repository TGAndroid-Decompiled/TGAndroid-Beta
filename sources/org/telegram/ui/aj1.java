package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class aj1 extends org.telegram.ui.Components.yl0 {
    public final Context f34837c;
    public final WallpapersListActivity d;

    public aj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f34837c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46528f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f34598a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f34600b && i10 != wallpapersListActivity.f34605e) {
            if (i10 != wallpapersListActivity.f34607f && i10 != wallpapersListActivity.f34611n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.f34837c;
        if (i10 != 0) {
            if (i10 != 3) {
                r8Var = new org.telegram.ui.Components.lj(this, context, 1);
                r8Var.setTag(-33024);
            } else {
                r8Var = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.c1(r8Var);
    }
}
