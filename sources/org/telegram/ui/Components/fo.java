package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class fo implements View.OnClickListener {
    public final int f33718a;
    public final vo f33719b;

    public fo(vo voVar, int i7) {
        this.f33718a = i7;
        this.f33719b = voVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33718a;
        vo voVar = this.f33719b;
        switch (i7) {
            case 0:
                di diVar = voVar.O1;
                if (diVar.f33047s2 == diVar.f32987a2) {
                    voVar.Q1.setText(org.telegram.messenger.id.M0(2131752138, null));
                    di diVar2 = voVar.O1;
                    if (diVar2.f33011i2 == null) {
                        Context context = diVar2.getContext();
                        org.telegram.ui.ActionBar.g6 g6Var = diVar2.I0;
                        ?? vhVar = new vh(context, g6Var, diVar2);
                        vhVar.f37338r = org.telegram.messenger.g0.L(80.0f);
                        vhVar.f37341x = 3;
                        bi.q1 q1Var = new bi.q1(vhVar, context, g6Var, 14);
                        vhVar.f37337n = q1Var;
                        la laVar = new la(vhVar, context);
                        vhVar.f37340w = laVar;
                        q1Var.setAdapter(laVar);
                        q1Var.setClipToPadding(false);
                        q1Var.setItemAnimator(null);
                        q1Var.setLayoutAnimation(null);
                        q1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.s6.l(q1Var, 21, org.telegram.ui.ActionBar.l6.A5, g6Var);
                        vhVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                        q1Var.setOnScrollListener(new ai.b(vhVar, 29));
                        ei.h hVar = new ei.h(vhVar, vhVar.f37338r, 2);
                        vhVar.f37339s = hVar;
                        hVar.O = new ai.l(vhVar, 6);
                        q1Var.setLayoutManager(hVar);
                        diVar2.f33011i2 = vhVar;
                        vhVar.setDelegate(new sa(diVar2, 1));
                    }
                    diVar2.F1(diVar2.f33011i2);
                    qi qiVar = voVar.O1.f33011i2;
                    boolean z9 = voVar.D1;
                    la laVar2 = qiVar.f37340w;
                    ((ArrayList) laVar2.f35660e).clear();
                    WallpapersListActivity.E0((ArrayList) laVar2.f35660e, z9);
                    laVar2.f();
                    return;
                }
                voVar.Q1.setText(org.telegram.messenger.id.M0(2131745537, null));
                di diVar3 = voVar.O1;
                diVar3.F1(diVar3.f32987a2);
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
                if (voVar.J1 == null) {
                    voVar.V0(!voVar.D1);
                    return;
                }
                return;
            default:
                voVar.K0(false);
                return;
        }
    }
}
