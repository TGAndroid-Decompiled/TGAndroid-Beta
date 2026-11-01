package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class no implements View.OnClickListener {
    public final int f28926a;
    public final dp f28927b;

    public no(dp dpVar, int i10) {
        this.f28926a = i10;
        this.f28927b = dpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28926a;
        dp dpVar = this.f28927b;
        switch (i10) {
            case 0:
                bi biVar = dpVar.O1;
                if (biVar.f24812s2 == biVar.a2) {
                    dpVar.Q1.setText(org.telegram.messenger.dd.L0(2131752138, null));
                    bi biVar2 = dpVar.O1;
                    if (biVar2.f24774i2 == null) {
                        Context context = biVar2.getContext();
                        org.telegram.ui.ActionBar.p6 p6Var = biVar2.I0;
                        ?? uhVar = new uh(context, p6Var, biVar2);
                        uhVar.f29734r = org.telegram.messenger.i0.L(80.0f);
                        uhVar.f29737x = 3;
                        ag.b1 b1Var = new ag.b1(uhVar, context, p6Var, 9);
                        uhVar.f29733n = b1Var;
                        fa faVar = new fa(uhVar, context);
                        uhVar.f29736w = faVar;
                        b1Var.setAdapter(faVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
                        uhVar.addView(b1Var, w7.b6.c(-1.0f, -1));
                        b1Var.setOnScrollListener(new ag.u(uhVar, 14));
                        oi oiVar = new oi(uhVar, uhVar.f29734r, 0);
                        uhVar.f29735s = oiVar;
                        oiVar.O = new jg.h1(uhVar, 2);
                        b1Var.setLayoutManager(oiVar);
                        biVar2.f24774i2 = uhVar;
                        uhVar.setDelegate(new ma(biVar2, 1));
                    }
                    biVar2.E1(biVar2.f24774i2);
                    qi qiVar = dpVar.O1.f24774i2;
                    boolean z10 = dpVar.D1;
                    fa faVar2 = qiVar.f29736w;
                    ((ArrayList) faVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) faVar2.e, z10);
                    faVar2.f();
                    return;
                }
                dpVar.Q1.setText(org.telegram.messenger.dd.L0(2131745554, null));
                bi biVar3 = dpVar.O1;
                biVar3.E1(biVar3.a2);
                return;
            case 1:
                if (dpVar.P0()) {
                    dpVar.T0(true);
                    dpVar.Z0(true);
                    return;
                }
                dpVar.dismiss();
                return;
            case 2:
                if (dpVar.J1 == null) {
                    dpVar.V0(!dpVar.D1);
                    return;
                }
                return;
            default:
                dpVar.K0(false);
                return;
        }
    }
}
