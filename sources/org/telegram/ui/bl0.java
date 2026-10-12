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
public final class bl0 extends org.telegram.ui.ActionBar.j {
    public final Context f34594a;
    public final fl0 f34595b;

    public bl0(fl0 fl0Var, Context context) {
        this.f34595b = fl0Var;
        this.f34594a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        fl0 fl0Var = this.f34595b;
        org.telegram.ui.ActionBar.c6 c6Var = fl0Var.h;
        SparseArray sparseArray = fl0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) fl0Var).actionBar;
            if (kVar.t()) {
                fl0.W(fl0Var);
                return;
            } else {
                fl0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fl0Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.f19548a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.zg0(29));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mu(this, 27));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, c6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f34594a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.m2) fl0Var).currentAccount;
                Uri a2 = ((dl0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.m2) fl0Var).currentAccount;
                    Uri a10 = ((dl0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            fl0.W(fl0Var);
            fl0Var.c0();
            fl0Var.f35855f.l();
        }
    }
}
