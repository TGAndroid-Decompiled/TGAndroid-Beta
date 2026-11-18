package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mc extends org.telegram.ui.Components.bk0 {
    public final int f49831c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final oc f49832e;

    public mc(oc ocVar, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f49832e = ocVar;
        this.f49831c = i7;
        this.d = i6Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49832e.f50567c.size();
    }

    @Override
    public final void t(v4.f1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new org.telegram.ui.Components.j01(this.f49831c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.f1 f1Var) {
        TLRPC.WallPaper wallPaper;
        oc ocVar = this.f49832e;
        ArrayList arrayList = ocVar.f50567c;
        int b10 = f1Var.b();
        View view = f1Var.f59122a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(b10);
            org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) view;
            j01Var.g(kpVar.d, false);
            if (kpVar.f36837a.f30000b) {
                wallPaper = null;
            } else {
                wallPaper = ocVar.f50573w;
            }
            j01Var.setFallbackWallpaper(wallPaper);
        }
    }
}
