package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class al0 extends org.telegram.ui.ActionBar.j {
    public final Context f33985a;
    public final el0 f33986b;

    public al0(el0 el0Var, Context context) {
        this.f33986b = el0Var;
        this.f33985a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        el0 el0Var = this.f33986b;
        org.telegram.ui.ActionBar.c6 c6Var = el0Var.h;
        SparseArray sparseArray = el0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) el0Var).actionBar;
            if (kVar.t()) {
                el0.W(el0Var);
                return;
            } else {
                el0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(el0Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.f19248a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.co0(27));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mu(this, 27));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f33985a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.m2) el0Var).currentAccount;
                Uri a2 = ((cl0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.m2) el0Var).currentAccount;
                    Uri a10 = ((cl0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            el0.W(el0Var);
            el0Var.c0();
            el0Var.f35325f.l();
        }
    }
}
