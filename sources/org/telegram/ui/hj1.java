package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class hj1 extends org.telegram.ui.Components.kl0 {
    public final Context f34301c;
    public final WallpapersListActivity d;

    public hj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f34301c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31622a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f31624b && i10 != wallpapersListActivity.e) {
            if (i10 != wallpapersListActivity.f31630f && i10 != wallpapersListActivity.f31635n) {
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
        View r8Var;
        Context context = this.f34301c;
        if (i10 != 0) {
            if (i10 != 3) {
                r8Var = new org.telegram.ui.Components.ij(this, context, 1);
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
