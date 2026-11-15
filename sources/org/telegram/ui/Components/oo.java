package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;
public final class oo implements View.OnClickListener {
    public final int f38030a;
    public final ep f38031b;

    public oo(ep epVar, int i7) {
        this.f38030a = i7;
        this.f38031b = epVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f38030a;
        ep epVar = this.f38031b;
        switch (i7) {
            case 0:
                ki kiVar = epVar.S1;
                if (kiVar.f36497w2 == kiVar.f36435e2) {
                    epVar.U1.setText(org.telegram.messenger.hd.M0(2131752138, null));
                    ki kiVar2 = epVar.S1;
                    if (kiVar2.f36459m2 == null) {
                        Context context = kiVar2.getContext();
                        org.telegram.ui.ActionBar.e6 e6Var = kiVar2.J0;
                        ?? ciVar = new ci(context, e6Var, kiVar2);
                        ciVar.f42004r = org.telegram.messenger.g0.L(80.0f);
                        ciVar.f42007x = 3;
                        di.c1 c1Var = new di.c1(ciVar, context, e6Var, 14);
                        ciVar.f42003n = c1Var;
                        ha haVar = new ha(ciVar, context);
                        ciVar.f42006w = haVar;
                        c1Var.setAdapter(haVar);
                        c1Var.setClipToPadding(false);
                        c1Var.setItemAnimator(null);
                        c1Var.setLayoutAnimation(null);
                        c1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.q6.l(c1Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
                        ciVar.addView(c1Var, c8.ja.c(-1.0f, -1));
                        c1Var.setOnScrollListener(new ri(ciVar, 1));
                        gi.g gVar = new gi.g(ciVar, ciVar.f42004r, 2);
                        ciVar.f42005s = gVar;
                        gVar.O = new bi.y1(ciVar, 9);
                        c1Var.setLayoutManager(gVar);
                        kiVar2.f36459m2 = ciVar;
                        ciVar.setDelegate(new oa(kiVar2, 1));
                    }
                    kiVar2.F1(kiVar2.f36459m2);
                    yi yiVar = epVar.S1.f36459m2;
                    boolean z10 = epVar.H1;
                    ha haVar2 = yiVar.f42006w;
                    ((ArrayList) haVar2.f35203e).clear();
                    WallpapersListActivity.E0((ArrayList) haVar2.f35203e, z10);
                    haVar2.f();
                    return;
                }
                epVar.U1.setText(org.telegram.messenger.hd.M0(2131745537, null));
                ki kiVar3 = epVar.S1;
                kiVar3.F1(kiVar3.f36435e2);
                return;
            case 1:
                if (epVar.P0()) {
                    epVar.T0(true);
                    epVar.Z0(true);
                    return;
                }
                epVar.dismiss();
                return;
            case 2:
                if (epVar.N1 == null) {
                    epVar.V0(!epVar.H1);
                    return;
                }
                return;
            default:
                epVar.K0(false);
                return;
        }
    }
}
