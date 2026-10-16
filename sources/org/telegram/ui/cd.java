package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cd extends org.telegram.ui.Components.lm0 {
    public final int f34561c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ed e;

    public cd(ed edVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = edVar;
        this.f34561c = i10;
        this.d = c6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f35258c.size();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Components.w21(this.f34561c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.WallPaper wallPaper;
        ed edVar = this.e;
        ArrayList arrayList = edVar.f35258c;
        int b10 = b1Var.b();
        View view = b1Var.f44838a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(b10);
            org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) view;
            w21Var.g(ypVar.d, false);
            if (ypVar.f31345a.f19343b) {
                wallPaper = null;
            } else {
                wallPaper = edVar.v;
            }
            w21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
