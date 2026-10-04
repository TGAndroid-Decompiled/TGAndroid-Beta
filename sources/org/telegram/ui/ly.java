package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ly implements org.telegram.ui.Components.h00 {
    public final Context f38358a;
    public final uy f38359b;

    public ly(Context context, uy uyVar) {
        this.f38359b = uyVar;
        this.f38358a = context;
    }

    public final int a(int i10) {
        uy uyVar = this.f38359b;
        if (uyVar.R0 != 3) {
            if (i10 == uyVar.f41495z0.getDefaultTabId()) {
                return uyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return uyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        uy uyVar = this.f38359b;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || uyVar.f41392e0[1].getVisibility() == 0 || uyVar.f41420j2) {
            if (uyVar.f41411h3) {
                ty tyVar = uyVar.f41392e0[0];
                tyVar.setTranslationX((-f7) * tyVar.getMeasuredWidth());
                ty[] tyVarArr = uyVar.f41392e0;
                tyVarArr[1].setTranslationX(tyVarArr[0].getMeasuredWidth() - (f7 * uyVar.f41392e0[0].getMeasuredWidth()));
            } else {
                ty tyVar2 = uyVar.f41392e0[0];
                tyVar2.setTranslationX(tyVar2.getMeasuredWidth() * f7);
                ty[] tyVarArr2 = uyVar.f41392e0;
                tyVarArr2[1].setTranslationX((f7 * tyVarArr2[0].getMeasuredWidth()) - uyVar.f41392e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ty[] tyVarArr3 = uyVar.f41392e0;
                ty tyVar3 = tyVarArr3[0];
                tyVarArr3[0] = tyVarArr3[1];
                tyVarArr3[1] = tyVar3;
                tyVar3.setVisibility(8);
                uy.j1(uyVar, true);
                uyVar.c5(false);
                uyVar.f41495z0.O = false;
                uyVar.A3(uyVar.f41392e0[0]);
                uyVar.f41392e0[0].d.getClass();
                uyVar.f41392e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.j00 j00Var, boolean z10) {
        int i10;
        int i11;
        uy uyVar = this.f38359b;
        int i12 = uyVar.f41392e0[0].h;
        int i13 = j00Var.f27543a;
        if (i12 != i13) {
            if (j00Var.f27547f) {
                uyVar.f41495z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                uyVar.showDialog(new rg.k0(3, i11, this.f38358a, uyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
            if (!j00Var.f27546e && ((i10 = j00Var.f27543a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ty tyVar = uyVar.f41392e0[1];
            tyVar.h = j00Var.f27543a;
            tyVar.setVisibility(0);
            ty[] tyVarArr = uyVar.f41392e0;
            tyVarArr[1].setTranslationX(tyVarArr[0].getMeasuredWidth());
            uy.j1(uyVar, false);
            uyVar.a5(true);
            uyVar.f41411h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        uy uyVar = this.f38359b;
        if (isChatlist) {
            org.telegram.ui.Components.f10.R(uyVar, dialogFilter.f17256id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pw(1, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21058q7));
        }
    }
}
