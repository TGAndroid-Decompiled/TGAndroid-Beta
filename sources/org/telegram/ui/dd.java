package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dd extends org.telegram.ui.Components.lm0 {
    public final int f35232c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final fd e;

    public dd(fd fdVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = fdVar;
        this.f35232c = i10;
        this.d = c6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f35795c.size();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Components.v21(this.f35232c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.WallPaper wallPaper;
        fd fdVar = this.e;
        ArrayList arrayList = fdVar.f35795c;
        int b10 = b1Var.b();
        View view = b1Var.f44838a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(b10);
            org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) view;
            v21Var.g(ypVar.d, false);
            if (ypVar.f31668a.f19643b) {
                wallPaper = null;
            } else {
                wallPaper = fdVar.v;
            }
            v21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
