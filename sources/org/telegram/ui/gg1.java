package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gg1 implements org.telegram.ui.Components.kl0 {
    public final jg1 f33843a;

    public gg1(jg1 jg1Var) {
        this.f33843a = jg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        jg1 jg1Var = this.f33843a;
        ArrayList arrayList = jg1Var.d;
        if (((ig1) arrayList.get(i10)).f15672a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -jg1Var.f34876c);
            bundle.putBoolean("for_select", true);
            dg1 dg1Var = new dg1(bundle);
            dg1Var.A0 = jg1Var.e;
            dg1Var.v = new eg1(this);
            jg1Var.presentFragment(dg1Var);
        }
        if (((ig1) arrayList.get(i10)).f15672a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ig1) arrayList.get(i10)).f34527c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", jg1Var.f34876c);
            bundle2.putLong("topic_id", tL_forumTopic.f18348id);
            bundle2.putBoolean("exception", false);
            w11 w11Var = new w11(bundle2, null);
            w11Var.f38671r = new fg1(this, tL_forumTopic);
            jg1Var.presentFragment(w11Var);
        }
        if (((ig1) arrayList.get(i10)).f15672a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jg1Var.getParentActivity());
            alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new eg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
            jg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
            }
        }
    }
}
