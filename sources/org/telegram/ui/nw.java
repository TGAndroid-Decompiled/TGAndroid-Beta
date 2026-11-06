package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nw implements org.telegram.ui.Components.az {
    public final Context f48149a;
    public final ww f48150b;

    public nw(Context context, ww wwVar) {
        this.f48150b = wwVar;
        this.f48149a = context;
    }

    public final int a(int i7) {
        ww wwVar = this.f48150b;
        if (wwVar.R0 != 3) {
            if (i7 == wwVar.f51654z0.getDefaultTabId()) {
                return wwVar.getMessagesStorage().K;
            }
            ArrayList T0 = wwVar.getMessagesController().T0();
            if (i7 >= 0 && i7 < T0.size()) {
                return ((org.telegram.messenger.vo) wwVar.getMessagesController().T0().get(i7)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        ww wwVar = this.f48150b;
        if (i7 != 0 || wwVar.f51549e0[1].getVisibility() == 0 || wwVar.f51577j2) {
            if (wwVar.f51573i3) {
                vw vwVar = wwVar.f51549e0[0];
                vwVar.setTranslationX((-f10) * vwVar.getMeasuredWidth());
                vw[] vwVarArr = wwVar.f51549e0;
                vwVarArr[1].setTranslationX(vwVarArr[0].getMeasuredWidth() - (f10 * wwVar.f51549e0[0].getMeasuredWidth()));
            } else {
                vw vwVar2 = wwVar.f51549e0[0];
                vwVar2.setTranslationX(vwVar2.getMeasuredWidth() * f10);
                vw[] vwVarArr2 = wwVar.f51549e0;
                vwVarArr2[1].setTranslationX((f10 * vwVarArr2[0].getMeasuredWidth()) - wwVar.f51549e0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                vw[] vwVarArr3 = wwVar.f51549e0;
                vw vwVar3 = vwVarArr3[0];
                vwVarArr3[0] = vwVarArr3[1];
                vwVarArr3[1] = vwVar3;
                vwVar3.setVisibility(8);
                ww.j1(wwVar, true);
                wwVar.f5(false);
                wwVar.f51654z0.O = false;
                wwVar.C3(wwVar.f51549e0[0]);
                wwVar.f51549e0[0].d.getClass();
                wwVar.f51549e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.bz bzVar, boolean z9) {
        int i7;
        int i10;
        ww wwVar = this.f48150b;
        int i11 = wwVar.f51549e0[0].h;
        int i12 = bzVar.f32341a;
        if (i11 != i12) {
            if (bzVar.f32345f) {
                wwVar.f51654z0.i(i12);
                i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                wwVar.showDialog(new ug.i0(3, i10, this.f48149a, wwVar, null));
                return;
            }
            ArrayList T0 = wwVar.getMessagesController().T0();
            if (!bzVar.f32344e && ((i7 = bzVar.f32341a) < 0 || i7 >= T0.size())) {
                return;
            }
            vw vwVar = wwVar.f51549e0[1];
            vwVar.h = bzVar.f32341a;
            vwVar.setVisibility(0);
            vw[] vwVarArr = wwVar.f51549e0;
            vwVarArr[1].setTranslationX(vwVarArr[0].getMeasuredWidth());
            ww.j1(wwVar, false);
            wwVar.d5(true);
            wwVar.f51573i3 = z9;
        }
    }

    public final void d(org.telegram.messenger.vo voVar) {
        boolean d = voVar.d();
        ww wwVar = this.f48150b;
        if (d) {
            org.telegram.ui.Components.vz.g1(wwVar, voVar.f26064a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wwVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131750791, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new pu(2, this, voVar));
        wwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, wwVar.getResourceProvider());
        }
    }
}
