package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mc extends org.telegram.ui.Components.tj0 {
    public final int f49207c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final oc f49208e;

    public mc(oc ocVar, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f49208e = ocVar;
        this.f49207c = i7;
        this.d = e6Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49208e.f49897c.size();
    }

    @Override
    public final void t(v4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new org.telegram.ui.Components.b01(this.f49207c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.e1 e1Var) {
        TLRPC.WallPaper wallPaper;
        oc ocVar = this.f49208e;
        ArrayList arrayList = ocVar.f49897c;
        int b10 = e1Var.b();
        View view = e1Var.f58535a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(b10);
            org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) view;
            b01Var.g(dpVar.d, false);
            if (dpVar.f34009a.f29471b) {
                wallPaper = null;
            } else {
                wallPaper = ocVar.f49903w;
            }
            b01Var.setFallbackWallpaper(wallPaper);
        }
    }
}
