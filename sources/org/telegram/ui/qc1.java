package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class qc1 extends org.telegram.ui.Components.tj0 {
    public final Context f50581c;
    public final WallpapersListActivity d;

    public qc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f50581c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f44871a;
    }

    @Override
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 != i10 && i7 != wallpapersListActivity.h && i7 != wallpapersListActivity.f44873b && i7 != wallpapersListActivity.f44878e) {
            if (i7 != wallpapersListActivity.f44880f && i7 != wallpapersListActivity.f44883n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc1.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View l8Var;
        Context context = this.f50581c;
        if (i7 != 0) {
            if (i7 != 3) {
                l8Var = new org.telegram.ui.Components.xi(this, context, 1);
                l8Var.setTag(-33024);
            } else {
                l8Var = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            l8Var = new org.telegram.ui.Cells.l8(context);
        }
        return new v4.e1(l8Var);
    }
}
