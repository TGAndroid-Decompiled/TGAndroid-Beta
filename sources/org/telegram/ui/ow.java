package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ow implements org.telegram.ui.Components.e00 {
    public final Context f36988a;
    public final oy f36989b;

    public ow(Context context, oy oyVar) {
        this.f36989b = oyVar;
        this.f36988a = context;
    }

    public final int a(int i10) {
        oy oyVar = this.f36989b;
        if (oyVar.O0 != 3) {
            if (i10 == oyVar.f37115w0.getDefaultTabId()) {
                return oyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = oyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return oyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        oy oyVar = this.f36989b;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 != 0 || oyVar.f37009b0[1].getVisibility() == 0 || oyVar.f37037g2) {
            if (oyVar.f37027e3) {
                ny nyVar = oyVar.f37009b0[0];
                nyVar.setTranslationX((-f10) * nyVar.getMeasuredWidth());
                ny[] nyVarArr = oyVar.f37009b0;
                nyVarArr[1].setTranslationX(nyVarArr[0].getMeasuredWidth() - (f10 * oyVar.f37009b0[0].getMeasuredWidth()));
            } else {
                ny nyVar2 = oyVar.f37009b0[0];
                nyVar2.setTranslationX(nyVar2.getMeasuredWidth() * f10);
                ny[] nyVarArr2 = oyVar.f37009b0;
                nyVarArr2[1].setTranslationX((f10 * nyVarArr2[0].getMeasuredWidth()) - oyVar.f37009b0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ny[] nyVarArr3 = oyVar.f37009b0;
                ny nyVar3 = nyVarArr3[0];
                nyVarArr3[0] = nyVarArr3[1];
                nyVarArr3[1] = nyVar3;
                nyVar3.setVisibility(8);
                oy.f1(oyVar, true);
                oyVar.T4(false);
                oyVar.f37115w0.L = false;
                oyVar.r3(oyVar.f37009b0[0]);
                oyVar.f37009b0[0].d.getClass();
                oyVar.f37009b0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.g00 g00Var, boolean z4) {
        int i10;
        int i11;
        oy oyVar = this.f36989b;
        int i12 = oyVar.f37009b0[0].h;
        int i13 = g00Var.f25005a;
        if (i12 != i13) {
            if (g00Var.f25008f) {
                oyVar.f37115w0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                oyVar.showDialog(new eg.v0(3, i11, this.f36988a, oyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = oyVar.getMessagesController().getDialogFilters();
            if (!g00Var.e && ((i10 = g00Var.f25005a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ny nyVar = oyVar.f37009b0[1];
            nyVar.h = g00Var.f25005a;
            nyVar.setVisibility(0);
            ny[] nyVarArr = oyVar.f37009b0;
            nyVarArr[1].setTranslationX(nyVarArr[0].getMeasuredWidth());
            oy.f1(oyVar, false);
            oyVar.R4(true);
            oyVar.f37027e3 = z4;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        oy oyVar = this.f36989b;
        if (isChatlist) {
            org.telegram.ui.Components.c10.T(oyVar, dialogFilter.f16669id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qs(7, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        oyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
        }
    }
}
