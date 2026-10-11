package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hg1 implements org.telegram.ui.Components.fm0 {
    public final kg1 f38442a;

    public hg1(kg1 kg1Var) {
        this.f38442a = kg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        kg1 kg1Var = this.f38442a;
        ArrayList arrayList = kg1Var.d;
        if (((jg1) arrayList.get(i10)).f17211a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -kg1Var.f39370c);
            bundle.putBoolean("for_select", true);
            eg1 eg1Var = new eg1(bundle);
            eg1Var.A0 = kg1Var.f39371e;
            eg1Var.v = new fg1(this);
            kg1Var.presentFragment(eg1Var);
        }
        if (((jg1) arrayList.get(i10)).f17211a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((jg1) arrayList.get(i10)).f39086c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", kg1Var.f39370c);
            bundle2.putLong("topic_id", tL_forumTopic.f20120id);
            bundle2.putBoolean("exception", false);
            u11 u11Var = new u11(bundle2, null);
            u11Var.f42353r = new gg1(this, tL_forumTopic);
            kg1Var.presentFragment(u11Var);
        }
        if (((jg1) arrayList.get(i10)).f17211a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kg1Var.getParentActivity());
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            kg1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
            }
        }
    }
}
