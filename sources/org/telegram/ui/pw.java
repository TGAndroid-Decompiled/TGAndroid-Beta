package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pw implements org.telegram.ui.Components.bz {
    public final Context f48820a;
    public final yw f48821b;

    public pw(Context context, yw ywVar) {
        this.f48821b = ywVar;
        this.f48820a = context;
    }

    public final int a(int i7) {
        yw ywVar = this.f48821b;
        if (ywVar.S0 != 3) {
            if (i7 == ywVar.f52337z0.getDefaultTabId()) {
                return ywVar.getMessagesStorage().K;
            }
            ArrayList T0 = ywVar.getMessagesController().T0();
            if (i7 >= 0 && i7 < T0.size()) {
                return ((org.telegram.messenger.vo) ywVar.getMessagesController().T0().get(i7)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        yw ywVar = this.f48821b;
        if (i7 != 0 || ywVar.f52231e0[1].getVisibility() == 0 || ywVar.f52263k2) {
            if (ywVar.j3) {
                xw xwVar = ywVar.f52231e0[0];
                xwVar.setTranslationX((-f10) * xwVar.getMeasuredWidth());
                xw[] xwVarArr = ywVar.f52231e0;
                xwVarArr[1].setTranslationX(xwVarArr[0].getMeasuredWidth() - (f10 * ywVar.f52231e0[0].getMeasuredWidth()));
            } else {
                xw xwVar2 = ywVar.f52231e0[0];
                xwVar2.setTranslationX(xwVar2.getMeasuredWidth() * f10);
                xw[] xwVarArr2 = ywVar.f52231e0;
                xwVarArr2[1].setTranslationX((f10 * xwVarArr2[0].getMeasuredWidth()) - ywVar.f52231e0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                xw[] xwVarArr3 = ywVar.f52231e0;
                xw xwVar3 = xwVarArr3[0];
                xwVarArr3[0] = xwVarArr3[1];
                xwVarArr3[1] = xwVar3;
                xwVar3.setVisibility(8);
                yw.j1(ywVar, true);
                ywVar.f5(false);
                ywVar.f52337z0.O = false;
                ywVar.C3(ywVar.f52231e0[0]);
                ywVar.f52231e0[0].d.getClass();
                ywVar.f52231e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.cz czVar, boolean z9) {
        int i7;
        int i10;
        yw ywVar = this.f48821b;
        int i11 = ywVar.f52231e0[0].h;
        int i12 = czVar.f32790a;
        if (i11 != i12) {
            if (czVar.f32794f) {
                ywVar.f52337z0.i(i12);
                i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                ywVar.showDialog(new ug.i0(3, i10, this.f48820a, ywVar, null));
                return;
            }
            ArrayList T0 = ywVar.getMessagesController().T0();
            if (!czVar.f32793e && ((i7 = czVar.f32790a) < 0 || i7 >= T0.size())) {
                return;
            }
            xw xwVar = ywVar.f52231e0[1];
            xwVar.h = czVar.f32790a;
            xwVar.setVisibility(0);
            xw[] xwVarArr = ywVar.f52231e0;
            xwVarArr[1].setTranslationX(xwVarArr[0].getMeasuredWidth());
            yw.j1(ywVar, false);
            ywVar.d5(true);
            ywVar.j3 = z9;
        }
    }

    public final void d(org.telegram.messenger.vo voVar) {
        boolean d = voVar.d();
        yw ywVar = this.f48821b;
        if (d) {
            org.telegram.ui.Components.wz.g1(ywVar, voVar.f26070a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131750790, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ru(2, this, voVar));
        ywVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, ywVar.getResourceProvider());
        }
    }
}
