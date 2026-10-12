package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bd extends org.telegram.ui.Components.vm0 {
    public final int f36137c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final dd f36138e;

    public bd(dd ddVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f36138e = ddVar;
        this.f36137c = i10;
        this.d = c6Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f36138e.f36765c.size();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new org.telegram.ui.Components.f31(this.f36137c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        dd ddVar = this.f36138e;
        ArrayList arrayList = ddVar.f36765c;
        int b10 = d1Var.b();
        View view = d1Var.f47889a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) arrayList.get(b10);
            org.telegram.ui.Components.f31 f31Var = (org.telegram.ui.Components.f31) view;
            f31Var.g(dqVar.d, false);
            if (dqVar.f25446a.f20240b) {
                wallPaper = null;
            } else {
                wallPaper = ddVar.v;
            }
            f31Var.setFallbackWallpaper(wallPaper);
        }
    }
}
