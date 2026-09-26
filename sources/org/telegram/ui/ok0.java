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
public final class ok0 extends org.telegram.ui.ActionBar.j {
    public final Context f36258a;
    public final sk0 f36259b;

    public ok0(sk0 sk0Var, Context context) {
        this.f36259b = sk0Var;
        this.f36258a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        sk0 sk0Var = this.f36259b;
        org.telegram.ui.ActionBar.d6 d6Var = sk0Var.h;
        SparseArray sparseArray = sk0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) sk0Var).actionBar;
            if (kVar.s()) {
                sk0.W(sk0Var);
                return;
            } else {
                sk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sk0Var.getParentActivity(), 0, d6Var);
            alertDialog$Builder.f18661a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(13));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new du(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19298q7, d6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f36258a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.m2) sk0Var).currentAccount;
                Uri a2 = ((qk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.m2) sk0Var).currentAccount;
                    Uri a10 = ((qk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            sk0.W(sk0Var);
            sk0Var.c0();
            sk0Var.f37811f.l();
        }
    }
}
