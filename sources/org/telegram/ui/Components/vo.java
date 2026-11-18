package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class vo implements View.OnClickListener {
    public final int f40734a;
    public final lp f40735b;

    public vo(lp lpVar, int i7) {
        this.f40734a = i7;
        this.f40735b = lpVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40734a;
        lp lpVar = this.f40735b;
        switch (i7) {
            case 0:
                si siVar = lpVar.S1;
                if (siVar.f39732w2 == siVar.f39670e2) {
                    lpVar.U1.setText(org.telegram.messenger.gd.M0(2131752127, null));
                    si siVar2 = lpVar.S1;
                    if (siVar2.f39694m2 == null) {
                        Context context = siVar2.getContext();
                        org.telegram.ui.ActionBar.i6 i6Var = siVar2.J0;
                        ?? kiVar = new ki(context, i6Var, siVar2);
                        kiVar.f35115r = org.telegram.messenger.g0.L(80.0f);
                        kiVar.f35118x = 3;
                        di.b1 b1Var = new di.b1(kiVar, context, i6Var, 14);
                        kiVar.f35114n = b1Var;
                        qa qaVar = new qa(kiVar, context);
                        kiVar.f35117w = qaVar;
                        b1Var.setAdapter(qaVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
                        kiVar.addView(b1Var, c8.ma.c(-1.0f, -1));
                        b1Var.setOnScrollListener(new oa(kiVar, 2));
                        gi.g gVar = new gi.g(kiVar, kiVar.f35115r, 2);
                        kiVar.f35116s = gVar;
                        gVar.O = new bi.s2(kiVar, 9);
                        b1Var.setLayoutManager(gVar);
                        siVar2.f39694m2 = kiVar;
                        kiVar.setDelegate(new xa(siVar2, 1));
                    }
                    siVar2.G1(siVar2.f39694m2);
                    fj fjVar = lpVar.S1.f39694m2;
                    boolean z10 = lpVar.H1;
                    qa qaVar2 = fjVar.f35117w;
                    ((ArrayList) qaVar2.f38754e).clear();
                    WallpapersListActivity.E0((ArrayList) qaVar2.f38754e, z10);
                    qaVar2.f();
                    return;
                }
                lpVar.U1.setText(org.telegram.messenger.gd.M0(2131745342, null));
                si siVar3 = lpVar.S1;
                siVar3.G1(siVar3.f39670e2);
                return;
            case 1:
                if (lpVar.Q0()) {
                    lpVar.U0(true);
                    lpVar.a1(true);
                    return;
                }
                lpVar.dismiss();
                return;
            case 2:
                if (lpVar.N1 == null) {
                    lpVar.W0(!lpVar.H1);
                    return;
                }
                return;
            default:
                lpVar.L0(false);
                return;
        }
    }
}
