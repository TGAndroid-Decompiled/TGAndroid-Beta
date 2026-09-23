package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class aj1 extends org.telegram.ui.Components.ll0 {
    public final Context f31811c;
    public final WallpapersListActivity d;

    public aj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f31811c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31593a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f31608r && i10 != wallpapersListActivity.f31595b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f31597c && i10 != wallpapersListActivity.f31601f) {
                if (i10 != wallpapersListActivity.f31607n && i10 != wallpapersListActivity.f31609s) {
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
        View s8Var;
        Context context = this.f31811c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    s8Var = new org.telegram.ui.Components.jj(this, context, 1);
                } else {
                    s8Var = new org.telegram.ui.Cells.f9(context);
                }
            } else {
                s8Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
            }
        } else {
            s8Var = new org.telegram.ui.Cells.s8(context);
        }
        return new s4.c1(s8Var);
    }
}
