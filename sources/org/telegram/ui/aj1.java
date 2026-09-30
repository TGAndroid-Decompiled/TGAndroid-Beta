package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class aj1 extends org.telegram.ui.Components.yl0 {
    public final Context f32253c;
    public final WallpapersListActivity d;

    public aj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f32253c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31982a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f31997r && i10 != wallpapersListActivity.f31984b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f31986c && i10 != wallpapersListActivity.f31990f) {
                if (i10 != wallpapersListActivity.f31996n && i10 != wallpapersListActivity.f31998s) {
                    return 2;
                }
                return 3;
            }
            return 1;
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
        Context context = this.f32253c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    r8Var = new org.telegram.ui.Components.lj(this, context, 1);
                } else {
                    r8Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.c1(r8Var);
    }
}
