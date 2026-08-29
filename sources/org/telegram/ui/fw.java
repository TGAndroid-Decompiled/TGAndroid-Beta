package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fw implements org.telegram.ui.Components.a00 {
    public final Context f38241a;
    public final fy f38242b;

    public fw(Context context, fy fyVar) {
        this.f38242b = fyVar;
        this.f38241a = context;
    }

    public final int a(int i10) {
        fy fyVar = this.f38242b;
        if (fyVar.N0 != 3) {
            if (i10 == fyVar.f38362v0.getDefaultTabId()) {
                return fyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = fyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return fyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f9) {
        fy fyVar = this.f38242b;
        int i10 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if (i10 != 0 || fyVar.f38256a0[1].getVisibility() == 0 || fyVar.f38285f2) {
            if (fyVar.f38274d3) {
                ey eyVar = fyVar.f38256a0[0];
                eyVar.setTranslationX((-f9) * eyVar.getMeasuredWidth());
                ey[] eyVarArr = fyVar.f38256a0;
                eyVarArr[1].setTranslationX(eyVarArr[0].getMeasuredWidth() - (f9 * fyVar.f38256a0[0].getMeasuredWidth()));
            } else {
                ey eyVar2 = fyVar.f38256a0[0];
                eyVar2.setTranslationX(eyVar2.getMeasuredWidth() * f9);
                ey[] eyVarArr2 = fyVar.f38256a0;
                eyVarArr2[1].setTranslationX((f9 * eyVarArr2[0].getMeasuredWidth()) - fyVar.f38256a0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ey[] eyVarArr3 = fyVar.f38256a0;
                ey eyVar3 = eyVarArr3[0];
                eyVarArr3[0] = eyVarArr3[1];
                eyVarArr3[1] = eyVar3;
                eyVar3.setVisibility(8);
                fy.f1(fyVar, true);
                fyVar.T4(false);
                fyVar.f38362v0.K = false;
                fyVar.r3(fyVar.f38256a0[0]);
                fyVar.f38256a0[0].d.getClass();
                fyVar.f38256a0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.c00 c00Var, boolean z10) {
        int i10;
        int i11;
        fy fyVar = this.f38242b;
        int i12 = fyVar.f38256a0[0].h;
        int i13 = c00Var.f27251a;
        if (i12 != i13) {
            if (c00Var.f27255f) {
                fyVar.f38362v0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                fyVar.showDialog(new cg.v0(3, i11, this.f38241a, fyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = fyVar.getMessagesController().getDialogFilters();
            if (!c00Var.f27254e && ((i10 = c00Var.f27251a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ey eyVar = fyVar.f38256a0[1];
            eyVar.h = c00Var.f27251a;
            eyVar.setVisibility(0);
            ey[] eyVarArr = fyVar.f38256a0;
            eyVarArr[1].setTranslationX(eyVarArr[0].getMeasuredWidth());
            fy.f1(fyVar, false);
            fyVar.R4(true);
            fyVar.f38274d3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        fy fyVar = this.f38242b;
        if (isChatlist) {
            org.telegram.ui.Components.y00.T(fyVar, dialogFilter.f19620id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity());
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr(8, this, dialogFilter));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        fyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
        }
    }
}
