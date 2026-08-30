package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class oi1 extends org.telegram.ui.Components.rl0 {
    public final Context f36918c;
    public final WallpapersListActivity d;

    public oi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f36918c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f32402a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.f32414r && i10 != wallpapersListActivity.f32404b && i10 != wallpapersListActivity.h) {
            if (i10 != wallpapersListActivity.f32406c && i10 != wallpapersListActivity.f32410f) {
                if (i10 != wallpapersListActivity.f32413n && i10 != wallpapersListActivity.f32415s) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oi1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View o8Var;
        Context context = this.f36918c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    o8Var = new org.telegram.ui.Components.yi(this, context, 1);
                } else {
                    o8Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                o8Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            o8Var = new org.telegram.ui.Cells.o8(context);
        }
        return new f2.l1(o8Var);
    }
}
