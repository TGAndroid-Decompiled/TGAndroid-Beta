package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nc extends org.telegram.ui.Components.oj0 {
    public final int f47995c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final pc f47996e;

    public nc(pc pcVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f47996e = pcVar;
        this.f47995c = i7;
        this.d = f6Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f47996e.f48783c.size();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nc.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new org.telegram.ui.Components.yz0(this.f47995c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        pc pcVar = this.f47996e;
        ArrayList arrayList = pcVar.f48783c;
        int b10 = d1Var.b();
        View view = d1Var.f56927a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(b10);
            org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
            yz0Var.g(uoVar.d, false);
            if (uoVar.f38697a.f28456b) {
                wallPaper = null;
            } else {
                wallPaper = pcVar.f48789w;
            }
            yz0Var.setFallbackWallpaper(wallPaper);
        }
    }
}
