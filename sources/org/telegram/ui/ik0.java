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
public final class ik0 extends org.telegram.ui.ActionBar.j {
    public final Context f38321a;
    public final mk0 f38322b;

    public ik0(mk0 mk0Var, Context context) {
        this.f38322b = mk0Var;
        this.f38321a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        mk0 mk0Var = this.f38322b;
        org.telegram.ui.ActionBar.g6 g6Var = mk0Var.h;
        SparseArray sparseArray = mk0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) mk0Var).actionBar;
            if (kVar.s()) {
                mk0.W(mk0Var);
                return;
            } else {
                mk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mk0Var.getParentActivity(), 0, g6Var);
            alertDialog$Builder.f20679a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(10));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xt(this, 27));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, g6Var);
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f38321a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.o2) mk0Var).currentAccount;
                Uri a2 = ((kk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.o2) mk0Var).currentAccount;
                    Uri a10 = ((kk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            mk0.W(mk0Var);
            mk0Var.d0();
            mk0Var.f39609f.l();
        }
    }
}
