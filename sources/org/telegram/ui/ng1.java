package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ng1 implements org.telegram.ui.Components.am0 {
    public final qg1 f38393a;

    public ng1(qg1 qg1Var) {
        this.f38393a = qg1Var;
    }

    @Override
    public final void a(int i10, View view) {
        qg1 qg1Var = this.f38393a;
        ArrayList arrayList = qg1Var.d;
        if (((pg1) arrayList.get(i10)).f42904a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -qg1Var.f39160c);
            bundle.putBoolean("for_select", true);
            kg1 kg1Var = new kg1(bundle);
            kg1Var.A0 = qg1Var.e;
            kg1Var.v = new lg1(this);
            qg1Var.presentFragment(kg1Var);
        }
        if (((pg1) arrayList.get(i10)).f42904a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pg1) arrayList.get(i10)).f38922c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", qg1Var.f39160c);
            bundle2.putLong("topic_id", tL_forumTopic.f18968id);
            bundle2.putBoolean("exception", false);
            c21 c21Var = new c21(bundle2, null);
            c21Var.f34434r = new mg1(this, tL_forumTopic);
            qg1Var.presentFragment(c21Var);
        }
        if (((pg1) arrayList.get(i10)).f42904a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg1Var.getParentActivity());
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            qg1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
            }
        }
    }
}
