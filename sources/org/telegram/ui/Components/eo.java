package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class eo implements View.OnClickListener {
    public final int f33432a;
    public final vo f33433b;

    public eo(vo voVar, int i3) {
        this.f33432a = i3;
        this.f33433b = voVar;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f33432a;
        vo voVar = this.f33433b;
        switch (i3) {
            case 0:
                bi biVar = voVar.P1;
                if (biVar.f32275t2 == biVar.f32215b2) {
                    voVar.R1.setText(org.telegram.messenger.bd.M0(2131752138, null));
                    bi biVar2 = voVar.P1;
                    if (biVar2.f32238j2 == null) {
                        Context context = biVar2.getContext();
                        org.telegram.ui.ActionBar.e6 e6Var = biVar2.J0;
                        ?? thVar = new th(context, e6Var, biVar2);
                        thVar.f37465r = org.telegram.messenger.g0.L(80.0f);
                        thVar.f37468x = 3;
                        ci.j1 j1Var = new ci.j1(thVar, context, e6Var, 14);
                        thVar.f37464n = j1Var;
                        ka kaVar = new ka(thVar, context);
                        thVar.f37467w = kaVar;
                        j1Var.setAdapter(kaVar);
                        j1Var.setClipToPadding(false);
                        j1Var.setItemAnimator(null);
                        j1Var.setLayoutAnimation(null);
                        j1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
                        thVar.addView(j1Var, b8.mf.c(-1.0f, -1));
                        j1Var.setOnScrollListener(new ji(thVar, 1));
                        fi.g gVar = new fi.g(thVar, thVar.f37465r, 2);
                        thVar.f37466s = gVar;
                        gVar.O = new ai.g2(thVar, 9);
                        j1Var.setLayoutManager(gVar);
                        biVar2.f32238j2 = thVar;
                        thVar.setDelegate(new ra(biVar2, 1));
                    }
                    biVar2.F1(biVar2.f32238j2);
                    qi qiVar = voVar.P1.f32238j2;
                    boolean z10 = voVar.E1;
                    ka kaVar2 = qiVar.f37467w;
                    ((ArrayList) kaVar2.f35356e).clear();
                    WallpapersListActivity.E0((ArrayList) kaVar2.f35356e, z10);
                    kaVar2.f();
                    return;
                }
                voVar.R1.setText(org.telegram.messenger.bd.M0(2131745547, null));
                bi biVar3 = voVar.P1;
                biVar3.F1(biVar3.f32215b2);
                return;
            case 1:
                if (voVar.P0()) {
                    voVar.T0(true);
                    voVar.Z0(true);
                    return;
                }
                voVar.dismiss();
                return;
            case 2:
                if (voVar.K1 == null) {
                    voVar.V0(!voVar.E1);
                    return;
                }
                return;
            default:
                voVar.K0(false);
                return;
        }
    }
}
