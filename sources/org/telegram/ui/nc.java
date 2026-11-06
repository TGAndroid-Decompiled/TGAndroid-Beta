package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nc extends org.telegram.ui.Components.oj0 {
    public final int f48020c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final pc f48021e;

    public nc(pc pcVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f48021e = pcVar;
        this.f48020c = i7;
        this.d = f6Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f48021e.f48777c.size();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nc.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new org.telegram.ui.Components.zz0(this.f48020c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        pc pcVar = this.f48021e;
        ArrayList arrayList = pcVar.f48777c;
        int b10 = d1Var.b();
        View view = d1Var.f56951a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(b10);
            org.telegram.ui.Components.zz0 zz0Var = (org.telegram.ui.Components.zz0) view;
            zz0Var.g(uoVar.d, false);
            if (uoVar.f38684a.f28457b) {
                wallPaper = null;
            } else {
                wallPaper = pcVar.f48783w;
            }
            zz0Var.setFallbackWallpaper(wallPaper);
        }
    }
}
