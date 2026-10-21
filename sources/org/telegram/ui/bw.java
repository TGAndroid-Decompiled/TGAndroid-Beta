package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bw implements org.telegram.ui.Components.n00 {
    public final Context f35747a;
    public final cy f35748b;

    public bw(Context context, cy cyVar) {
        this.f35748b = cyVar;
        this.f35747a = context;
    }

    public final int a(int i10) {
        cy cyVar = this.f35748b;
        if (cyVar.R0 != 3) {
            if (i10 == cyVar.f36198z0.getDefaultTabId()) {
                return cyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = cyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return cyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        cy cyVar = this.f35748b;
        if (i10 != 0 || cyVar.f36092e0[1].getVisibility() == 0 || cyVar.f36120j2) {
            if (cyVar.f36116i3) {
                ay ayVar = cyVar.f36092e0[0];
                ayVar.setTranslationX((-f7) * ayVar.getMeasuredWidth());
                ay[] ayVarArr = cyVar.f36092e0;
                ayVarArr[1].setTranslationX(ayVarArr[0].getMeasuredWidth() - (f7 * cyVar.f36092e0[0].getMeasuredWidth()));
            } else {
                ay ayVar2 = cyVar.f36092e0[0];
                ayVar2.setTranslationX(ayVar2.getMeasuredWidth() * f7);
                ay[] ayVarArr2 = cyVar.f36092e0;
                ayVarArr2[1].setTranslationX((f7 * ayVarArr2[0].getMeasuredWidth()) - cyVar.f36092e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ay[] ayVarArr3 = cyVar.f36092e0;
                ay ayVar3 = ayVarArr3[0];
                ayVarArr3[0] = ayVarArr3[1];
                ayVarArr3[1] = ayVar3;
                ayVar3.setVisibility(8);
                cy.c1(cyVar, true);
                cyVar.R4(false);
                cyVar.f36198z0.O = false;
                cyVar.p3(cyVar.f36092e0[0]);
                cyVar.f36092e0[0].d.getClass();
                cyVar.f36092e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.p00 p00Var, boolean z10) {
        int i10;
        int i11;
        cy cyVar = this.f35748b;
        int i12 = cyVar.f36092e0[0].h;
        int i13 = p00Var.f29176a;
        if (i12 != i13) {
            if (p00Var.f29179f) {
                cyVar.f36198z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                cyVar.showDialog(new sg.k0(3, i11, this.f35747a, cyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = cyVar.getMessagesController().getDialogFilters();
            if (!p00Var.e && ((i10 = p00Var.f29176a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ay ayVar = cyVar.f36092e0[1];
            ayVar.h = p00Var.f29176a;
            ayVar.setVisibility(0);
            ay[] ayVarArr = cyVar.f36092e0;
            ayVarArr[1].setTranslationX(ayVarArr[0].getMeasuredWidth());
            cy.c1(cyVar, false);
            cyVar.P4(true);
            cyVar.f36116i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        cy cyVar = this.f35748b;
        if (isChatlist) {
            org.telegram.ui.Components.k10.U(cyVar, dialogFilter.f17799id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xu(4, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
        cyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21228q7));
        }
    }
}
