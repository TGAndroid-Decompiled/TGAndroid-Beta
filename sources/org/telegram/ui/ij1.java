package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ij1 extends org.telegram.ui.Components.kl0 {
    public final Context f37388c;
    public final WallpapersListActivity d;

    public ij1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f37388c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f34252a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f34268r && i10 != wallpapersListActivity.f34254b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f34256c && i10 != wallpapersListActivity.f34261f) {
                if (i10 != wallpapersListActivity.f34267n && i10 != wallpapersListActivity.f34269s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ij1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.f37388c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    r8Var = new org.telegram.ui.Components.ij(this, context, 1);
                } else {
                    r8Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                r8Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.c1(r8Var);
    }
}
