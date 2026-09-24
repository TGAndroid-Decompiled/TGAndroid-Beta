package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pw implements org.telegram.ui.Components.f00 {
    public final Context f36670a;
    public final qy f36671b;

    public pw(Context context, qy qyVar) {
        this.f36671b = qyVar;
        this.f36670a = context;
    }

    public final int a(int i10) {
        qy qyVar = this.f36671b;
        if (qyVar.R0 != 3) {
            if (i10 == qyVar.f37125z0.getDefaultTabId()) {
                return qyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return qyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        qy qyVar = this.f36671b;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || qyVar.f37021e0[1].getVisibility() == 0 || qyVar.f37049j2) {
            if (qyVar.f37040h3) {
                py pyVar = qyVar.f37021e0[0];
                pyVar.setTranslationX((-f7) * pyVar.getMeasuredWidth());
                py[] pyVarArr = qyVar.f37021e0;
                pyVarArr[1].setTranslationX(pyVarArr[0].getMeasuredWidth() - (f7 * qyVar.f37021e0[0].getMeasuredWidth()));
            } else {
                py pyVar2 = qyVar.f37021e0[0];
                pyVar2.setTranslationX(pyVar2.getMeasuredWidth() * f7);
                py[] pyVarArr2 = qyVar.f37021e0;
                pyVarArr2[1].setTranslationX((f7 * pyVarArr2[0].getMeasuredWidth()) - qyVar.f37021e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                py[] pyVarArr3 = qyVar.f37021e0;
                py pyVar3 = pyVarArr3[0];
                pyVarArr3[0] = pyVarArr3[1];
                pyVarArr3[1] = pyVar3;
                pyVar3.setVisibility(8);
                qy.f1(qyVar, true);
                qyVar.T4(false);
                qyVar.f37125z0.O = false;
                qyVar.r3(qyVar.f37021e0[0]);
                qyVar.f37021e0[0].d.getClass();
                qyVar.f37021e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.h00 h00Var, boolean z10) {
        int i10;
        int i11;
        qy qyVar = this.f36671b;
        int i12 = qyVar.f37021e0[0].h;
        int i13 = h00Var.f24577a;
        if (i12 != i13) {
            if (h00Var.f24580f) {
                qyVar.f37125z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                qyVar.showDialog(new rg.j0(3, i11, this.f36670a, qyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
            if (!h00Var.e && ((i10 = h00Var.f24577a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            py pyVar = qyVar.f37021e0[1];
            pyVar.h = h00Var.f24577a;
            pyVar.setVisibility(0);
            py[] pyVarArr = qyVar.f37021e0;
            pyVarArr[1].setTranslationX(pyVarArr[0].getMeasuredWidth());
            qy.f1(qyVar, false);
            qyVar.R4(true);
            qyVar.f37040h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        qy qyVar = this.f36671b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(qyVar, dialogFilter.f15817id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ow(0, this, dialogFilter));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
        qyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19284q7));
        }
    }
}
