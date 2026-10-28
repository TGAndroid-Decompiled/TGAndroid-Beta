package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class fi1 extends org.telegram.ui.Components.mm0 {
    public final Context f39388c;
    public final WallpapersListActivity d;

    public fi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f39388c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f37611a;
    }

    @Override
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 != i11 && i10 != wallpapersListActivity.h && i10 != wallpapersListActivity.f37613b && i10 != wallpapersListActivity.e) {
            if (i10 != wallpapersListActivity.f37619f && i10 != wallpapersListActivity.f37621n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fi1.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.f39388c;
        if (i10 != 0) {
            if (i10 != 3) {
                v8Var = new org.telegram.ui.Components.hj(this, context, 1);
                v8Var.setTag(-33024);
            } else {
                v8Var = new org.telegram.ui.Cells.i9(context);
            }
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
        }
        return new s4.e1(v8Var);
    }
}
