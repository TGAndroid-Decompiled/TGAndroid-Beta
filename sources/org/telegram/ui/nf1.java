package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nf1 implements org.telegram.ui.Components.il0 {
    public final qf1 f36618a;

    public nf1(qf1 qf1Var) {
        this.f36618a = qf1Var;
    }

    @Override
    public final void f(int i10, View view) {
        qf1 qf1Var = this.f36618a;
        ArrayList arrayList = qf1Var.d;
        if (((pf1) arrayList.get(i10)).f1808a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -qf1Var.f37749c);
            bundle.putBoolean("for_select", true);
            kf1 kf1Var = new kf1(bundle);
            kf1Var.f35709x0 = qf1Var.e;
            kf1Var.v = new lf1(this);
            qf1Var.presentFragment(kf1Var);
        }
        if (((pf1) arrayList.get(i10)).f1808a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pf1) arrayList.get(i10)).f37302c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", qf1Var.f37749c);
            bundle2.putLong("topic_id", tL_forumTopic.f19236id);
            bundle2.putBoolean("exception", false);
            e11 e11Var = new e11(bundle2, null);
            e11Var.f33856r = new mf1(this, tL_forumTopic);
            qf1Var.presentFragment(e11Var);
        }
        if (((pf1) arrayList.get(i10)).f1808a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf1Var.getParentActivity());
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            qf1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            }
        }
    }
}
