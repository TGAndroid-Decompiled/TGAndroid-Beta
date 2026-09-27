package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ky implements org.telegram.ui.Components.g00 {
    public final Context f35192a;
    public final ty f35193b;

    public ky(Context context, ty tyVar) {
        this.f35193b = tyVar;
        this.f35192a = context;
    }

    public final int a(int i10) {
        ty tyVar = this.f35193b;
        if (tyVar.R0 != 3) {
            if (i10 == tyVar.f38079z0.getDefaultTabId()) {
                return tyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = tyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return tyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        ty tyVar = this.f35193b;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || tyVar.f37976e0[1].getVisibility() == 0 || tyVar.f38004j2) {
            if (tyVar.f37995h3) {
                sy syVar = tyVar.f37976e0[0];
                syVar.setTranslationX((-f7) * syVar.getMeasuredWidth());
                sy[] syVarArr = tyVar.f37976e0;
                syVarArr[1].setTranslationX(syVarArr[0].getMeasuredWidth() - (f7 * tyVar.f37976e0[0].getMeasuredWidth()));
            } else {
                sy syVar2 = tyVar.f37976e0[0];
                syVar2.setTranslationX(syVar2.getMeasuredWidth() * f7);
                sy[] syVarArr2 = tyVar.f37976e0;
                syVarArr2[1].setTranslationX((f7 * syVarArr2[0].getMeasuredWidth()) - tyVar.f37976e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                sy[] syVarArr3 = tyVar.f37976e0;
                sy syVar3 = syVarArr3[0];
                syVarArr3[0] = syVarArr3[1];
                syVarArr3[1] = syVar3;
                syVar3.setVisibility(8);
                ty.j1(tyVar, true);
                tyVar.c5(false);
                tyVar.f38079z0.O = false;
                tyVar.A3(tyVar.f37976e0[0]);
                tyVar.f37976e0[0].d.getClass();
                tyVar.f37976e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.i00 i00Var, boolean z10) {
        int i10;
        int i11;
        ty tyVar = this.f35193b;
        int i12 = tyVar.f37976e0[0].h;
        int i13 = i00Var.f24973a;
        if (i12 != i13) {
            if (i00Var.f24976f) {
                tyVar.f38079z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                tyVar.showDialog(new rg.j0(3, i11, this.f35192a, tyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = tyVar.getMessagesController().getDialogFilters();
            if (!i00Var.e && ((i10 = i00Var.f24973a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            sy syVar = tyVar.f37976e0[1];
            syVar.h = i00Var.f24973a;
            syVar.setVisibility(0);
            sy[] syVarArr = tyVar.f37976e0;
            syVarArr[1].setTranslationX(syVarArr[0].getMeasuredWidth());
            ty.j1(tyVar, false);
            tyVar.a5(true);
            tyVar.f37995h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ty tyVar = this.f35193b;
        if (isChatlist) {
            org.telegram.ui.Components.e10.T(tyVar, dialogFilter.f15826id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jy(0, this, dialogFilter));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        tyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
        }
    }
}
