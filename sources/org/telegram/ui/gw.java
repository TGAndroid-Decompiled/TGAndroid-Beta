package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class gw implements org.telegram.ui.Components.tz {

    public final Context f38484a;

    public final gy f38485b;

    public gw(Context context, gy gyVar) {
        this.f38485b = gyVar;
        this.f38484a = context;
    }

    public final int a(int i10) {
        gy gyVar = this.f38485b;
        if (gyVar.N0 == 3) {
            return 0;
        }
        if (i10 == gyVar.f38604v0.getDefaultTabId()) {
            return gyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = gyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return gyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f10) {
        gy gyVar = this.f38485b;
        if (f10 != 1.0f || gyVar.f38498a0[1].getVisibility() == 0 || gyVar.f38527f2) {
            if (gyVar.f38516d3) {
                fy fyVar = gyVar.f38498a0[0];
                fyVar.setTranslationX((-f10) * fyVar.getMeasuredWidth());
                fy[] fyVarArr = gyVar.f38498a0;
                fyVarArr[1].setTranslationX(fyVarArr[0].getMeasuredWidth() - (f10 * gyVar.f38498a0[0].getMeasuredWidth()));
            } else {
                fy fyVar2 = gyVar.f38498a0[0];
                fyVar2.setTranslationX(fyVar2.getMeasuredWidth() * f10);
                fy[] fyVarArr2 = gyVar.f38498a0;
                fyVarArr2[1].setTranslationX((f10 * fyVarArr2[0].getMeasuredWidth()) - gyVar.f38498a0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                fy[] fyVarArr3 = gyVar.f38498a0;
                fy fyVar3 = fyVarArr3[0];
                fyVarArr3[0] = fyVarArr3[1];
                fyVarArr3[1] = fyVar3;
                fyVar3.setVisibility(8);
                gy.f1(gyVar, true);
                gyVar.T4(false);
                gyVar.f38604v0.K = false;
                gyVar.r3(gyVar.f38498a0[0]);
                gyVar.f38498a0[0].d.getClass();
                gyVar.f38498a0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.vz vzVar, boolean z10) {
        int i10;
        gy gyVar = this.f38485b;
        int i11 = gyVar.f38498a0[0].h;
        int i12 = vzVar.f34072a;
        if (i11 == i12) {
            return;
        }
        if (vzVar.f34076f) {
            gyVar.f38604v0.i(i12);
            gyVar.showDialog(new ag.i1(3, ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, this.f38484a, gyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = gyVar.getMessagesController().getDialogFilters();
        if (vzVar.f34075e || ((i10 = vzVar.f34072a) >= 0 && i10 < dialogFilters.size())) {
            fy fyVar = gyVar.f38498a0[1];
            fyVar.h = vzVar.f34072a;
            fyVar.setVisibility(0);
            fy[] fyVarArr = gyVar.f38498a0;
            fyVarArr[1].setTranslationX(fyVarArr[0].getMeasuredWidth());
            gy.f1(gyVar, false);
            gyVar.R4(true);
            gyVar.f38516d3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean zIsChatlist = dialogFilter.isChatlist();
        gy gyVar = this.f38485b;
        if (zIsChatlist) {
            org.telegram.ui.Components.q00.T(gyVar, dialogFilter.f19622id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zr(8, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        gyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
        }
    }
}
