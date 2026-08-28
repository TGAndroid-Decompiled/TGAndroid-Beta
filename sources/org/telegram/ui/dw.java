package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dw implements org.telegram.ui.Components.qz {
    public final Context f37618a;
    public final dy f37619b;

    public dw(Context context, dy dyVar) {
        this.f37619b = dyVar;
        this.f37618a = context;
    }

    public final int a(int i9) {
        dy dyVar = this.f37619b;
        if (dyVar.N0 != 3) {
            if (i9 == dyVar.f37735v0.getDefaultTabId()) {
                return dyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = dyVar.getMessagesController().getDialogFilters();
            if (i9 >= 0 && i9 < dialogFilters.size()) {
                return dyVar.getMessagesController().getDialogFilters().get(i9).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        dy dyVar = this.f37619b;
        int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i9 != 0 || dyVar.f37629a0[1].getVisibility() == 0 || dyVar.f37658f2) {
            if (dyVar.f37647d3) {
                cy cyVar = dyVar.f37629a0[0];
                cyVar.setTranslationX((-f10) * cyVar.getMeasuredWidth());
                cy[] cyVarArr = dyVar.f37629a0;
                cyVarArr[1].setTranslationX(cyVarArr[0].getMeasuredWidth() - (f10 * dyVar.f37629a0[0].getMeasuredWidth()));
            } else {
                cy cyVar2 = dyVar.f37629a0[0];
                cyVar2.setTranslationX(cyVar2.getMeasuredWidth() * f10);
                cy[] cyVarArr2 = dyVar.f37629a0;
                cyVarArr2[1].setTranslationX((f10 * cyVarArr2[0].getMeasuredWidth()) - dyVar.f37629a0[0].getMeasuredWidth());
            }
            if (i9 == 0) {
                cy[] cyVarArr3 = dyVar.f37629a0;
                cy cyVar3 = cyVarArr3[0];
                cyVarArr3[0] = cyVarArr3[1];
                cyVarArr3[1] = cyVar3;
                cyVar3.setVisibility(8);
                dy.f1(dyVar, true);
                dyVar.T4(false);
                dyVar.f37735v0.K = false;
                dyVar.r3(dyVar.f37629a0[0]);
                dyVar.f37629a0[0].d.getClass();
                dyVar.f37629a0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.sz szVar, boolean z10) {
        int i9;
        int i10;
        dy dyVar = this.f37619b;
        int i11 = dyVar.f37629a0[0].h;
        int i12 = szVar.f32572a;
        if (i11 != i12) {
            if (szVar.f32576f) {
                dyVar.f37735v0.i(i12);
                i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                dyVar.showDialog(new zf.j0(3, i10, this.f37618a, dyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = dyVar.getMessagesController().getDialogFilters();
            if (!szVar.f32575e && ((i9 = szVar.f32572a) < 0 || i9 >= dialogFilters.size())) {
                return;
            }
            cy cyVar = dyVar.f37629a0[1];
            cyVar.h = szVar.f32572a;
            cyVar.setVisibility(0);
            cy[] cyVarArr = dyVar.f37629a0;
            cyVarArr[1].setTranslationX(cyVarArr[0].getMeasuredWidth());
            dy.f1(dyVar, false);
            dyVar.R4(true);
            dyVar.f37647d3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        dy dyVar = this.f37619b;
        if (isChatlist) {
            org.telegram.ui.Components.n00.S(dyVar, dialogFilter.f19649id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new yr(8, this, dialogFilter));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        dyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
        }
    }
}
