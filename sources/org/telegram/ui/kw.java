package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kw implements org.telegram.ui.Components.xy {
    public final Context f47035a;
    public final uw f47036b;

    public kw(Context context, uw uwVar) {
        this.f47036b = uwVar;
        this.f47035a = context;
    }

    public final int a(int i3) {
        uw uwVar = this.f47036b;
        if (uwVar.S0 != 3) {
            if (i3 == uwVar.A0.getDefaultTabId()) {
                return uwVar.getMessagesStorage().L;
            }
            ArrayList T0 = uwVar.getMessagesController().T0();
            if (i3 >= 0 && i3 < T0.size()) {
                return ((org.telegram.messenger.mo) uwVar.getMessagesController().T0().get(i3)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        uw uwVar = this.f47036b;
        if (i3 != 0 || uwVar.f50230f0[1].getVisibility() == 0 || uwVar.f50255k2) {
            if (uwVar.f50252j3) {
                tw twVar = uwVar.f50230f0[0];
                twVar.setTranslationX((-f10) * twVar.getMeasuredWidth());
                tw[] twVarArr = uwVar.f50230f0;
                twVarArr[1].setTranslationX(twVarArr[0].getMeasuredWidth() - (f10 * uwVar.f50230f0[0].getMeasuredWidth()));
            } else {
                tw twVar2 = uwVar.f50230f0[0];
                twVar2.setTranslationX(twVar2.getMeasuredWidth() * f10);
                tw[] twVarArr2 = uwVar.f50230f0;
                twVarArr2[1].setTranslationX((f10 * twVarArr2[0].getMeasuredWidth()) - uwVar.f50230f0[0].getMeasuredWidth());
            }
            if (i3 == 0) {
                tw[] twVarArr3 = uwVar.f50230f0;
                tw twVar3 = twVarArr3[0];
                twVarArr3[0] = twVarArr3[1];
                twVarArr3[1] = twVar3;
                twVar3.setVisibility(8);
                uw.j1(uwVar, true);
                uwVar.f5(false);
                uwVar.A0.P = false;
                uwVar.C3(uwVar.f50230f0[0]);
                uwVar.f50230f0[0].d.getClass();
                uwVar.f50230f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.yy yyVar, boolean z10) {
        int i3;
        int i10;
        uw uwVar = this.f47036b;
        int i11 = uwVar.f50230f0[0].h;
        int i12 = yyVar.f40853a;
        if (i11 != i12) {
            if (yyVar.f40857f) {
                uwVar.A0.i(i12);
                i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                uwVar.showDialog(new vg.i0(3, i10, this.f47035a, uwVar, null));
                return;
            }
            ArrayList T0 = uwVar.getMessagesController().T0();
            if (!yyVar.f40856e && ((i3 = yyVar.f40853a) < 0 || i3 >= T0.size())) {
                return;
            }
            tw twVar = uwVar.f50230f0[1];
            twVar.h = yyVar.f40853a;
            twVar.setVisibility(0);
            tw[] twVarArr = uwVar.f50230f0;
            twVarArr[1].setTranslationX(twVarArr[0].getMeasuredWidth());
            uw.j1(uwVar, false);
            uwVar.d5(true);
            uwVar.f50252j3 = z10;
        }
    }

    public final void d(org.telegram.messenger.mo moVar) {
        boolean d = moVar.d();
        uw uwVar = this.f47036b;
        if (d) {
            org.telegram.ui.Components.rz.g1(uwVar, moVar.f24237a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uwVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131750791, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(12, this, moVar));
        uwVar.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, uwVar.getResourceProvider());
        }
    }
}
