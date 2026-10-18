package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dw implements org.telegram.ui.Components.n00 {
    public final Context f36329a;
    public final ey f36330b;

    public dw(Context context, ey eyVar) {
        this.f36330b = eyVar;
        this.f36329a = context;
    }

    public final int a(int i10) {
        ey eyVar = this.f36330b;
        if (eyVar.R0 != 3) {
            if (i10 == eyVar.f36759z0.getDefaultTabId()) {
                return eyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = eyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return eyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ey eyVar = this.f36330b;
        if (i10 != 0 || eyVar.f36653e0[1].getVisibility() == 0 || eyVar.f36681j2) {
            if (eyVar.f36677i3) {
                dy dyVar = eyVar.f36653e0[0];
                dyVar.setTranslationX((-f7) * dyVar.getMeasuredWidth());
                dy[] dyVarArr = eyVar.f36653e0;
                dyVarArr[1].setTranslationX(dyVarArr[0].getMeasuredWidth() - (f7 * eyVar.f36653e0[0].getMeasuredWidth()));
            } else {
                dy dyVar2 = eyVar.f36653e0[0];
                dyVar2.setTranslationX(dyVar2.getMeasuredWidth() * f7);
                dy[] dyVarArr2 = eyVar.f36653e0;
                dyVarArr2[1].setTranslationX((f7 * dyVarArr2[0].getMeasuredWidth()) - eyVar.f36653e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                dy[] dyVarArr3 = eyVar.f36653e0;
                dy dyVar3 = dyVarArr3[0];
                dyVarArr3[0] = dyVarArr3[1];
                dyVarArr3[1] = dyVar3;
                dyVar3.setVisibility(8);
                ey.c1(eyVar, true);
                eyVar.R4(false);
                eyVar.f36759z0.O = false;
                eyVar.p3(eyVar.f36653e0[0]);
                eyVar.f36653e0[0].d.getClass();
                eyVar.f36653e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.p00 p00Var, boolean z10) {
        int i10;
        int i11;
        ey eyVar = this.f36330b;
        int i12 = eyVar.f36653e0[0].h;
        int i13 = p00Var.f29126a;
        if (i12 != i13) {
            if (p00Var.f29129f) {
                eyVar.f36759z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                eyVar.showDialog(new sg.j0(3, i11, this.f36329a, eyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = eyVar.getMessagesController().getDialogFilters();
            if (!p00Var.e && ((i10 = p00Var.f29126a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            dy dyVar = eyVar.f36653e0[1];
            dyVar.h = p00Var.f29126a;
            dyVar.setVisibility(0);
            dy[] dyVarArr = eyVar.f36653e0;
            dyVarArr[1].setTranslationX(dyVarArr[0].getMeasuredWidth());
            ey.c1(eyVar, false);
            eyVar.P4(true);
            eyVar.f36677i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ey eyVar = this.f36330b;
        if (isChatlist) {
            org.telegram.ui.Components.k10.U(eyVar, dialogFilter.f17802id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zu(4, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
        eyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21231q7));
        }
    }
}
