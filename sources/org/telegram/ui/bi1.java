package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class bi1 extends org.telegram.ui.Components.il0 {
    public final Context f36815c;
    public final WallpapersListActivity d;

    public bi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f36815c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36366a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f36378r && i10 != wallpapersListActivity.f36368b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f36370c && i10 != wallpapersListActivity.f36375f) {
                if (i10 != wallpapersListActivity.f36377n && i10 != wallpapersListActivity.f36379s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bi1.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m8Var;
        Context context = this.f36815c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    m8Var = new org.telegram.ui.Components.aj(this, context, 1);
                } else {
                    m8Var = new org.telegram.ui.Cells.y8(context);
                }
            } else {
                m8Var = new org.telegram.ui.Cells.x6(context, (b) null);
            }
        } else {
            m8Var = new org.telegram.ui.Cells.m8(context);
        }
        return new f2.n1(m8Var);
    }
}
