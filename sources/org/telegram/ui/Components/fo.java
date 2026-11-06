package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class fo implements View.OnClickListener {
    public final int f33618a;
    public final vo f33619b;

    public fo(vo voVar, int i7) {
        this.f33618a = i7;
        this.f33619b = voVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33618a;
        vo voVar = this.f33619b;
        switch (i7) {
            case 0:
                di diVar = voVar.O1;
                if (diVar.f32984s2 == diVar.f32924a2) {
                    voVar.Q1.setText(org.telegram.messenger.hd.M0(2131752138, null));
                    di diVar2 = voVar.O1;
                    if (diVar2.f32948i2 == null) {
                        Context context = diVar2.getContext();
                        org.telegram.ui.ActionBar.f6 f6Var = diVar2.I0;
                        ?? vhVar = new vh(context, f6Var, diVar2);
                        vhVar.f37303r = org.telegram.messenger.g0.L(80.0f);
                        vhVar.f37306x = 3;
                        bi.q1 q1Var = new bi.q1(vhVar, context, f6Var, 14);
                        vhVar.f37302n = q1Var;
                        la laVar = new la(vhVar, context);
                        vhVar.f37305w = laVar;
                        q1Var.setAdapter(laVar);
                        q1Var.setClipToPadding(false);
                        q1Var.setItemAnimator(null);
                        q1Var.setLayoutAnimation(null);
                        q1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.r6.m(q1Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
                        vhVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                        q1Var.setOnScrollListener(new ai.b(vhVar, 29));
                        ei.h hVar = new ei.h(vhVar, vhVar.f37303r, 2);
                        vhVar.f37304s = hVar;
                        hVar.O = new ai.l(vhVar, 6);
                        q1Var.setLayoutManager(hVar);
                        diVar2.f32948i2 = vhVar;
                        vhVar.setDelegate(new sa(diVar2, 1));
                    }
                    diVar2.F1(diVar2.f32948i2);
                    qi qiVar = voVar.O1.f32948i2;
                    boolean z9 = voVar.D1;
                    la laVar2 = qiVar.f37305w;
                    ((ArrayList) laVar2.f35605e).clear();
                    WallpapersListActivity.E0((ArrayList) laVar2.f35605e, z9);
                    laVar2.f();
                    return;
                }
                voVar.Q1.setText(org.telegram.messenger.hd.M0(2131745538, null));
                di diVar3 = voVar.O1;
                diVar3.F1(diVar3.f32924a2);
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
