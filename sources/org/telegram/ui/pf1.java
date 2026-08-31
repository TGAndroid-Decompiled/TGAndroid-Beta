package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pf1 implements org.telegram.ui.Components.jl0 {
    public final sf1 f40030a;

    public pf1(sf1 sf1Var) {
        this.f40030a = sf1Var;
    }

    @Override
    public final void f(int i10, View view) {
        sf1 sf1Var = this.f40030a;
        ArrayList arrayList = sf1Var.d;
        if (((rf1) arrayList.get(i10)).f2505a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -sf1Var.f41279c);
            bundle.putBoolean("for_select", true);
            mf1 mf1Var = new mf1(bundle);
            mf1Var.f39144x0 = sf1Var.f41280e;
            mf1Var.v = new nf1(this);
            sf1Var.presentFragment(mf1Var);
        }
        if (((rf1) arrayList.get(i10)).f2505a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((rf1) arrayList.get(i10)).f40955c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", sf1Var.f41279c);
            bundle2.putLong("topic_id", tL_forumTopic.f20895id);
            bundle2.putBoolean("exception", false);
            g11 g11Var = new g11(bundle2, null);
            g11Var.f37062r = new of1(this, tL_forumTopic);
            sf1Var.presentFragment(g11Var);
        }
        if (((rf1) arrayList.get(i10)).f2505a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sf1Var.getParentActivity());
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            sf1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            }
        }
    }
}
