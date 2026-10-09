package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class kj1 extends org.telegram.ui.Components.pm0 {
    public final Context f39308c;
    public final WallpapersListActivity d;

    public kj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f39308c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47660f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f35763a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f35779r && i10 != wallpapersListActivity.f35765b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f35767c && i10 != wallpapersListActivity.f35772f) {
                if (i10 != wallpapersListActivity.f35778n && i10 != wallpapersListActivity.f35780s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kj1.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.f39308c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    r8Var = new org.telegram.ui.Components.mj(this, context, 1);
                } else {
                    r8Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new s4.d1(r8Var);
    }
}
