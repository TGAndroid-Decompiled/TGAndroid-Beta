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
public final class mk0 extends org.telegram.ui.ActionBar.j {
    public final Context f38994a;
    public final qk0 f38995b;

    public mk0(qk0 qk0Var, Context context) {
        this.f38995b = qk0Var;
        this.f38994a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        qk0 qk0Var = this.f38995b;
        org.telegram.ui.ActionBar.g6 g6Var = qk0Var.h;
        SparseArray sparseArray = qk0Var.G;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.p2) qk0Var).actionBar;
            if (kVar.s()) {
                qk0.W(qk0Var);
                return;
            } else {
                qk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qk0Var.getParentActivity(), 0, g6Var);
            alertDialog$Builder.f21168a.O = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.mh0(29));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gu(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21897q7, g6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f38994a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.p2) qk0Var).currentAccount;
                Uri a2 = ((ok0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.p2) qk0Var).currentAccount;
                    Uri a10 = ((ok0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            qk0.W(qk0Var);
            qk0Var.c0();
            qk0Var.f40539f.l();
        }
    }
}
