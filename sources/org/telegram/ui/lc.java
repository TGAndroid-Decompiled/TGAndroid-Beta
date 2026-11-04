package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lc extends org.telegram.ui.Components.sj0 {
    public final int f47297c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final nc f47298e;

    public lc(nc ncVar, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f47298e = ncVar;
        this.f47297c = i3;
        this.d = e6Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f47298e.f47947c.size();
    }

    @Override
    public final void t(u4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lc.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new org.telegram.ui.Components.yz0(this.f47297c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(u4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        nc ncVar = this.f47298e;
        ArrayList arrayList = ncVar.f47947c;
        int b10 = d1Var.b();
        View view = d1Var.f55540a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(b10);
            org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
            yz0Var.g(uoVar.d, false);
            if (uoVar.f38832a.f28420b) {
                wallPaper = null;
            } else {
                wallPaper = ncVar.f47953w;
            }
            yz0Var.setFallbackWallpaper(wallPaper);
        }
    }
}
