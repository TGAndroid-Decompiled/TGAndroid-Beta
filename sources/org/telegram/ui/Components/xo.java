package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class xo implements View.OnClickListener {
    public final int f42174a;
    public final np f42175b;

    public xo(np npVar, int i7) {
        this.f42174a = i7;
        this.f42175b = npVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f42174a;
        np npVar = this.f42175b;
        switch (i7) {
            case 0:
                ui uiVar = npVar.S1;
                if (uiVar.f40440w2 == uiVar.f40378e2) {
                    npVar.U1.setText(org.telegram.messenger.hd.N0(2131752126, null));
                    ui uiVar2 = npVar.S1;
                    if (uiVar2.f40402m2 == null) {
                        Context context = uiVar2.getContext();
                        org.telegram.ui.ActionBar.h6 h6Var = uiVar2.J0;
                        ?? miVar = new mi(context, h6Var, uiVar2);
                        miVar.f35915r = org.telegram.messenger.g0.L(80.0f);
                        miVar.f35918x = 3;
                        di.b1 b1Var = new di.b1(miVar, context, h6Var, 14);
                        miVar.f35914n = b1Var;
                        qa qaVar = new qa(miVar, context);
                        miVar.f35917w = qaVar;
                        b1Var.setAdapter(qaVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.t6.l(b1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
                        miVar.addView(b1Var, c8.ma.c(-1.0f, -1));
                        b1Var.setOnScrollListener(new oa(miVar, 2));
                        gi.g gVar = new gi.g(miVar, miVar.f35915r, 2);
                        miVar.f35916s = gVar;
                        gVar.O = new bi.w2(miVar, 9);
                        b1Var.setLayoutManager(gVar);
                        uiVar2.f40402m2 = miVar;
                        miVar.setDelegate(new xa(uiVar2, 1));
                    }
                    uiVar2.G1(uiVar2.f40402m2);
                    hj hjVar = npVar.S1.f40402m2;
                    boolean z10 = npVar.H1;
                    qa qaVar2 = hjVar.f35917w;
                    ((ArrayList) qaVar2.f38849e).clear();
                    WallpapersListActivity.E0((ArrayList) qaVar2.f38849e, z10);
                    qaVar2.f();
                    return;
                }
                npVar.U1.setText(org.telegram.messenger.hd.N0(2131745341, null));
                ui uiVar3 = npVar.S1;
                uiVar3.G1(uiVar3.f40378e2);
                return;
            case 1:
                if (npVar.Q0()) {
                    npVar.U0(true);
                    npVar.a1(true);
                    return;
                }
                npVar.dismiss();
                return;
            case 2:
                if (npVar.N1 == null) {
                    npVar.W0(!npVar.H1);
                    return;
                }
                return;
            default:
                npVar.L0(false);
                return;
        }
    }
}
