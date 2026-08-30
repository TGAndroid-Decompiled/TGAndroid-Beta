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
public final class kk0 extends org.telegram.ui.ActionBar.j {
    public final Context f35762a;
    public final ok0 f35763b;

    public kk0(ok0 ok0Var, Context context) {
        this.f35763b = ok0Var;
        this.f35762a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        ok0 ok0Var = this.f35763b;
        org.telegram.ui.ActionBar.f6 f6Var = ok0Var.h;
        SparseArray sparseArray = ok0Var.G;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.p2) ok0Var).actionBar;
            if (kVar.s()) {
                ok0.W(ok0Var);
                return;
            } else {
                ok0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ok0Var.getParentActivity(), 0, f6Var);
            alertDialog$Builder.f19503a.O = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.kh0(29));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fu(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20141q7, f6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f35762a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.p2) ok0Var).currentAccount;
                Uri a2 = ((mk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.p2) ok0Var).currentAccount;
                    Uri a10 = ((mk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            ok0.W(ok0Var);
            ok0Var.c0();
            ok0Var.f36927f.l();
        }
    }
}
