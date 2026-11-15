package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pw implements org.telegram.ui.Components.ez {
    public final Context f50375a;
    public final yw f50376b;

    public pw(Context context, yw ywVar) {
        this.f50376b = ywVar;
        this.f50375a = context;
    }

    public final int a(int i7) {
        yw ywVar = this.f50376b;
        if (ywVar.T0 != 3) {
            if (i7 == ywVar.A0.getDefaultTabId()) {
                return ywVar.getMessagesStorage().L;
            }
            ArrayList T0 = ywVar.getMessagesController().T0();
            if (i7 >= 0 && i7 < T0.size()) {
                return ((org.telegram.messenger.so) ywVar.getMessagesController().T0().get(i7)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        yw ywVar = this.f50376b;
        if (i7 != 0 || ywVar.f53638f0[1].getVisibility() == 0 || ywVar.f53668l2) {
            if (ywVar.f53665k3) {
                xw xwVar = ywVar.f53638f0[0];
                xwVar.setTranslationX((-f10) * xwVar.getMeasuredWidth());
                xw[] xwVarArr = ywVar.f53638f0;
                xwVarArr[1].setTranslationX(xwVarArr[0].getMeasuredWidth() - (f10 * ywVar.f53638f0[0].getMeasuredWidth()));
            } else {
                xw xwVar2 = ywVar.f53638f0[0];
                xwVar2.setTranslationX(xwVar2.getMeasuredWidth() * f10);
                xw[] xwVarArr2 = ywVar.f53638f0;
                xwVarArr2[1].setTranslationX((f10 * xwVarArr2[0].getMeasuredWidth()) - ywVar.f53638f0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                xw[] xwVarArr3 = ywVar.f53638f0;
                xw xwVar3 = xwVarArr3[0];
                xwVarArr3[0] = xwVarArr3[1];
                xwVarArr3[1] = xwVar3;
                xwVar3.setVisibility(8);
                yw.j1(ywVar, true);
                ywVar.f5(false);
                ywVar.A0.P = false;
                ywVar.C3(ywVar.f53638f0[0]);
                ywVar.f53638f0[0].d.getClass();
                ywVar.f53638f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.fz fzVar, boolean z10) {
        int i7;
        int i10;
        yw ywVar = this.f50376b;
        int i11 = ywVar.f53638f0[0].h;
        int i12 = fzVar.f34752a;
        if (i11 != i12) {
            if (fzVar.f34756f) {
                ywVar.A0.i(i12);
                i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                ywVar.showDialog(new ug.j0(3, i10, this.f50375a, ywVar, null));
                return;
            }
            ArrayList T0 = ywVar.getMessagesController().T0();
            if (!fzVar.f34755e && ((i7 = fzVar.f34752a) < 0 || i7 >= T0.size())) {
                return;
            }
            xw xwVar = ywVar.f53638f0[1];
            xwVar.h = fzVar.f34752a;
            xwVar.setVisibility(0);
            xw[] xwVarArr = ywVar.f53638f0;
            xwVarArr[1].setTranslationX(xwVarArr[0].getMeasuredWidth());
            yw.j1(ywVar, false);
            ywVar.d5(true);
            ywVar.f53665k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.so soVar) {
        boolean d = soVar.d();
        yw ywVar = this.f50376b;
        if (d) {
            org.telegram.ui.Components.zz.g1(ywVar, soVar.f26552a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131750790, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(6, this, soVar));
        ywVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, ywVar.getResourceProvider());
        }
    }
}
