package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mc extends org.telegram.ui.Components.dk0 {
    public final int f49822c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final oc f49823e;

    public mc(oc ocVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f49823e = ocVar;
        this.f49822c = i7;
        this.d = h6Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49823e.f50531c.size();
    }

    @Override
    public final void t(v4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new org.telegram.ui.Components.k01(this.f49822c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.e1 e1Var) {
        TLRPC.WallPaper wallPaper;
        oc ocVar = this.f49823e;
        ArrayList arrayList = ocVar.f50531c;
        int b10 = e1Var.b();
        View view = e1Var.f59111a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList.get(b10);
            org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) view;
            k01Var.g(mpVar.d, false);
            if (mpVar.f37548a.f29950b) {
                wallPaper = null;
            } else {
                wallPaper = ocVar.f50537w;
            }
            k01Var.setFallbackWallpaper(wallPaper);
        }
    }
}
