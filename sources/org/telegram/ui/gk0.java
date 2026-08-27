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

public final class gk0 extends org.telegram.ui.ActionBar.j {

    public final Context f38438a;

    public final kk0 f38439b;

    public gk0(kk0 kk0Var, Context context) {
        this.f38439b = kk0Var;
        this.f38438a = context;
    }

    @Override
    public final void b(int i10) {
        kk0 kk0Var = this.f38439b;
        org.telegram.ui.ActionBar.c6 c6Var = kk0Var.h;
        SparseArray sparseArray = kk0Var.F;
        if (i10 == -1) {
            if (((org.telegram.ui.ActionBar.n2) kk0Var).actionBar.t()) {
                kk0.W(kk0Var);
                return;
            } else {
                kk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kk0Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j70(5));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zt(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
                return;
            }
            return;
        }
        if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f38438a;
            if (size == 1) {
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                Uri uriA = ((ik0) sparseArray.valueAt(0)).a(((org.telegram.ui.ActionBar.n2) kk0Var).currentAccount);
                if (uriA != null) {
                    intent.putExtra("android.intent.extra.STREAM", uriA);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    Uri uriA2 = ((ik0) sparseArray.valueAt(i11)).a(((org.telegram.ui.ActionBar.n2) kk0Var).currentAccount);
                    if (uriA2 != null) {
                        arrayList.add(uriA2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            kk0.W(kk0Var);
            kk0Var.c0();
            kk0Var.f39795f.l();
        }
    }
}
