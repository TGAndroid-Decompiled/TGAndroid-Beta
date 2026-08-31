package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pw implements org.telegram.ui.Components.g00 {
    public final Context f40167a;
    public final py f40168b;

    public pw(Context context, py pyVar) {
        this.f40168b = pyVar;
        this.f40167a = context;
    }

    public final int a(int i10) {
        py pyVar = this.f40168b;
        if (pyVar.O0 != 3) {
            if (i10 == pyVar.f40292w0.getDefaultTabId()) {
                return pyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = pyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return pyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        py pyVar = this.f40168b;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 != 0 || pyVar.f40185b0[1].getVisibility() == 0 || pyVar.f40214g2) {
            if (pyVar.f40204e3) {
                oy oyVar = pyVar.f40185b0[0];
                oyVar.setTranslationX((-f10) * oyVar.getMeasuredWidth());
                oy[] oyVarArr = pyVar.f40185b0;
                oyVarArr[1].setTranslationX(oyVarArr[0].getMeasuredWidth() - (f10 * pyVar.f40185b0[0].getMeasuredWidth()));
            } else {
                oy oyVar2 = pyVar.f40185b0[0];
                oyVar2.setTranslationX(oyVar2.getMeasuredWidth() * f10);
                oy[] oyVarArr2 = pyVar.f40185b0;
                oyVarArr2[1].setTranslationX((f10 * oyVarArr2[0].getMeasuredWidth()) - pyVar.f40185b0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                oy[] oyVarArr3 = pyVar.f40185b0;
                oy oyVar3 = oyVarArr3[0];
                oyVarArr3[0] = oyVarArr3[1];
                oyVarArr3[1] = oyVar3;
                oyVar3.setVisibility(8);
                py.f1(pyVar, true);
                pyVar.T4(false);
                pyVar.f40292w0.L = false;
                pyVar.r3(pyVar.f40185b0[0]);
                pyVar.f40185b0[0].d.getClass();
                pyVar.f40185b0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.i00 i00Var, boolean z4) {
        int i10;
        int i11;
        py pyVar = this.f40168b;
        int i12 = pyVar.f40185b0[0].h;
        int i13 = i00Var.f27634a;
        if (i12 != i13) {
            if (i00Var.f27638f) {
                pyVar.f40292w0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                pyVar.showDialog(new fg.v0(3, i11, this.f40167a, pyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = pyVar.getMessagesController().getDialogFilters();
            if (!i00Var.f27637e && ((i10 = i00Var.f27634a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            oy oyVar = pyVar.f40185b0[1];
            oyVar.h = i00Var.f27634a;
            oyVar.setVisibility(0);
            oy[] oyVarArr = pyVar.f40185b0;
            oyVarArr[1].setTranslationX(oyVarArr[0].getMeasuredWidth());
            py.f1(pyVar, false);
            pyVar.R4(true);
            pyVar.f40204e3 = z4;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        py pyVar = this.f40168b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(pyVar, dialogFilter.f18055id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rs(7, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        pyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
        }
    }
}
