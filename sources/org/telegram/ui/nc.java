package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nc extends org.telegram.ui.Components.pj0 {
    public final int f48157c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final pc f48158e;

    public nc(pc pcVar, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f48158e = pcVar;
        this.f48157c = i7;
        this.d = g6Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f48158e.f48688c.size();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nc.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new org.telegram.ui.Components.a01(this.f48157c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        pc pcVar = this.f48158e;
        ArrayList arrayList = pcVar.f48688c;
        int b10 = d1Var.b();
        View view = d1Var.f57056a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(b10);
            org.telegram.ui.Components.a01 a01Var = (org.telegram.ui.Components.a01) view;
            a01Var.g(uoVar.d, false);
            if (uoVar.f38760a.f28461b) {
                wallPaper = null;
            } else {
                wallPaper = pcVar.f48694w;
            }
            a01Var.setFallbackWallpaper(wallPaper);
        }
    }
}
