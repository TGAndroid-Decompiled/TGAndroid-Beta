package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ig1 implements org.telegram.ui.Components.ml0 {
    public final lg1 f34582a;

    public ig1(lg1 lg1Var) {
        this.f34582a = lg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        lg1 lg1Var = this.f34582a;
        ArrayList arrayList = lg1Var.d;
        if (((kg1) arrayList.get(i10)).f15719a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -lg1Var.f35462c);
            bundle.putBoolean("for_select", true);
            fg1 fg1Var = new fg1(bundle);
            fg1Var.A0 = lg1Var.e;
            fg1Var.v = new gg1(this);
            lg1Var.presentFragment(fg1Var);
        }
        if (((kg1) arrayList.get(i10)).f15719a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((kg1) arrayList.get(i10)).f35203c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", lg1Var.f35462c);
            bundle2.putLong("topic_id", tL_forumTopic.f18395id);
            bundle2.putBoolean("exception", false);
            w11 w11Var = new w11(bundle2, null);
            w11Var.f38672r = new hg1(this, tL_forumTopic);
            lg1Var.presentFragment(w11Var);
        }
        if (((kg1) arrayList.get(i10)).f15719a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lg1Var.getParentActivity());
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            lg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
            }
        }
    }
}
