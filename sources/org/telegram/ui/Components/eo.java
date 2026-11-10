package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class eo implements View.OnClickListener {
    public final int f33304a;
    public final vo f33305b;

    public eo(vo voVar, int i7) {
        this.f33304a = i7;
        this.f33305b = voVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33304a;
        vo voVar = this.f33305b;
        switch (i7) {
            case 0:
                ci ciVar = voVar.R1;
                if (ciVar.f32660v2 == ciVar.d2) {
                    voVar.T1.setText(org.telegram.messenger.id.M0(2131752138, null));
                    ci ciVar2 = voVar.R1;
                    if (ciVar2.f32622l2 == null) {
                        Context context = ciVar2.getContext();
                        org.telegram.ui.ActionBar.h6 h6Var = ciVar2.I0;
                        ?? uhVar = new uh(context, h6Var, ciVar2);
                        uhVar.f36937r = org.telegram.messenger.g0.L(80.0f);
                        uhVar.f36940x = 3;
                        bi.q1 q1Var = new bi.q1(uhVar, context, h6Var, 14);
                        uhVar.f36936n = q1Var;
                        ka kaVar = new ka(uhVar, context);
                        uhVar.f36939w = kaVar;
                        q1Var.setAdapter(kaVar);
                        q1Var.setClipToPadding(false);
                        q1Var.setItemAnimator(null);
                        q1Var.setLayoutAnimation(null);
                        q1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.t6.l(q1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
                        uhVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                        q1Var.setOnScrollListener(new ai.b(uhVar, 29));
                        ei.h hVar = new ei.h(uhVar, uhVar.f36937r, 2);
                        uhVar.f36938s = hVar;
                        hVar.O = new ai.l(uhVar, 6);
                        q1Var.setLayoutManager(hVar);
                        ciVar2.f32622l2 = uhVar;
                        uhVar.setDelegate(new ra(ciVar2, 1));
                    }
                    ciVar2.F1(ciVar2.f32622l2);
                    pi piVar = voVar.R1.f32622l2;
                    boolean z9 = voVar.G1;
                    ka kaVar2 = piVar.f36939w;
                    ((ArrayList) kaVar2.f35262e).clear();
                    WallpapersListActivity.E0((ArrayList) kaVar2.f35262e, z9);
                    kaVar2.f();
                    return;
                }
                voVar.T1.setText(org.telegram.messenger.id.M0(2131745537, null));
                ci ciVar3 = voVar.R1;
                ciVar3.F1(ciVar3.d2);
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
                if (voVar.M1 == null) {
                    voVar.V0(!voVar.G1);
                    return;
                }
                return;
            default:
                voVar.K0(false);
                return;
        }
    }
}
