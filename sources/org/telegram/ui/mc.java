package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mc extends org.telegram.ui.Components.dk0 {
    public final int f49849c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final oc f49850e;

    public mc(oc ocVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f49850e = ocVar;
        this.f49849c = i7;
        this.d = h6Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f49850e.f50546c.size();
    }

    @Override
    public final void t(v4.f1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new org.telegram.ui.Components.k01(this.f49849c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(v4.f1 f1Var) {
        TLRPC.WallPaper wallPaper;
        oc ocVar = this.f49850e;
        ArrayList arrayList = ocVar.f50546c;
        int b10 = f1Var.b();
        View view = f1Var.f59165a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList.get(b10);
            org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) view;
            k01Var.g(mpVar.d, false);
            if (mpVar.f37593a.f29984b) {
                wallPaper = null;
            } else {
                wallPaper = ocVar.f50552w;
            }
            k01Var.setFallbackWallpaper(wallPaper);
        }
    }
}
