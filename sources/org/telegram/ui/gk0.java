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
    public final Context f38561a;
    public final kk0 f38562b;

    public gk0(kk0 kk0Var, Context context) {
        this.f38562b = kk0Var;
        this.f38561a = context;
    }

    @Override
    public final void b(int i9) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        kk0 kk0Var = this.f38562b;
        org.telegram.ui.ActionBar.b6 b6Var = kk0Var.h;
        SparseArray sparseArray = kk0Var.F;
        if (i9 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) kk0Var).actionBar;
            if (kVar.s()) {
                kk0.V(kk0Var);
                return;
            } else {
                kk0Var.finishFragment();
                return;
            }
        }
        if (i9 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kk0Var.getParentActivity(), 0, b6Var);
            alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(0));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wt(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var));
            }
        } else if (i9 == 2) {
            int size = sparseArray.size();
            Context context = this.f38561a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i11 = ((org.telegram.ui.ActionBar.o2) kk0Var).currentAccount;
                Uri a2 = ((ik0) sparseArray.valueAt(0)).a(i11);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    i10 = ((org.telegram.ui.ActionBar.o2) kk0Var).currentAccount;
                    Uri a3 = ((ik0) sparseArray.valueAt(i12)).a(i10);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            kk0.V(kk0Var);
            kk0Var.b0();
            kk0Var.f39858f.l();
        }
    }
}
