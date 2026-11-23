package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class uo implements View.OnClickListener {
    public final int f40425a;
    public final kp f40426b;

    public uo(kp kpVar, int i7) {
        this.f40425a = i7;
        this.f40426b = kpVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40425a;
        kp kpVar = this.f40426b;
        switch (i7) {
            case 0:
                ti tiVar = kpVar.S1;
                if (tiVar.f40029w2 == tiVar.f39967e2) {
                    kpVar.U1.setText(org.telegram.messenger.gd.N0(2131752126, null));
                    ti tiVar2 = kpVar.S1;
                    if (tiVar2.f39991m2 == null) {
                        Context context = tiVar2.getContext();
                        org.telegram.ui.ActionBar.i6 i6Var = tiVar2.J0;
                        ?? liVar = new li(context, i6Var, tiVar2);
                        liVar.f35452r = org.telegram.messenger.g0.L(80.0f);
                        liVar.f35455x = 3;
                        di.b1 b1Var = new di.b1(liVar, context, i6Var, 14);
                        liVar.f35451n = b1Var;
                        pa paVar = new pa(liVar, context);
                        liVar.f35454w = paVar;
                        b1Var.setAdapter(paVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
                        liVar.addView(b1Var, c8.na.c(-1.0f, -1));
                        b1Var.setOnScrollListener(new na(liVar, 2));
                        gi.g gVar = new gi.g(liVar, liVar.f35452r, 2);
                        liVar.f35453s = gVar;
                        gVar.O = new bi.y2(liVar, 9);
                        b1Var.setLayoutManager(gVar);
                        tiVar2.f39991m2 = liVar;
                        liVar.setDelegate(new wa(tiVar2, 1));
                    }
                    tiVar2.G1(tiVar2.f39991m2);
                    gj gjVar = kpVar.S1.f39991m2;
                    boolean z10 = kpVar.H1;
                    pa paVar2 = gjVar.f35454w;
                    ((ArrayList) paVar2.f38441e).clear();
                    WallpapersListActivity.E0((ArrayList) paVar2.f38441e, z10);
                    paVar2.f();
                    return;
                }
                kpVar.U1.setText(org.telegram.messenger.gd.N0(2131745341, null));
                ti tiVar3 = kpVar.S1;
                tiVar3.G1(tiVar3.f39967e2);
                return;
            case 1:
                if (kpVar.Q0()) {
                    kpVar.U0(true);
                    kpVar.a1(true);
                    return;
                }
                kpVar.dismiss();
                return;
            case 2:
                if (kpVar.N1 == null) {
                    kpVar.W0(!kpVar.H1);
                    return;
                }
                return;
            default:
                kpVar.L0(false);
                return;
        }
    }
}
