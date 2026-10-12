package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class og1 implements org.telegram.ui.Components.am0 {
    public final rg1 f38954a;

    public og1(rg1 rg1Var) {
        this.f38954a = rg1Var;
    }

    @Override
    public final void a(int i10, View view) {
        rg1 rg1Var = this.f38954a;
        ArrayList arrayList = rg1Var.d;
        if (((qg1) arrayList.get(i10)).f43203a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -rg1Var.f39797c);
            bundle.putBoolean("for_select", true);
            lg1 lg1Var = new lg1(bundle);
            lg1Var.A0 = rg1Var.e;
            lg1Var.v = new mg1(this);
            rg1Var.presentFragment(lg1Var);
        }
        if (((qg1) arrayList.get(i10)).f43203a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((qg1) arrayList.get(i10)).f39443c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", rg1Var.f39797c);
            bundle2.putLong("topic_id", tL_forumTopic.f19268id);
            bundle2.putBoolean("exception", false);
            c21 c21Var = new c21(bundle2, null);
            c21Var.f34712r = new ng1(this, tL_forumTopic);
            rg1Var.presentFragment(c21Var);
        }
        if (((qg1) arrayList.get(i10)).f43203a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg1Var.getParentActivity());
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            rg1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
            }
        }
    }
}
