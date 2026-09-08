package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hg1 implements org.telegram.ui.Components.zk0 {
    public final kg1 f37024a;

    public hg1(kg1 kg1Var) {
        this.f37024a = kg1Var;
    }

    @Override
    public final void a(int i10, View view) {
        kg1 kg1Var = this.f37024a;
        ArrayList arrayList = kg1Var.d;
        if (((jg1) arrayList.get(i10)).f44098a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -kg1Var.f38092c);
            bundle.putBoolean("for_select", true);
            eg1 eg1Var = new eg1(bundle);
            eg1Var.A0 = kg1Var.f38093e;
            eg1Var.v = new fg1(this);
            kg1Var.presentFragment(eg1Var);
        }
        if (((jg1) arrayList.get(i10)).f44098a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((jg1) arrayList.get(i10)).f37797c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", kg1Var.f38092c);
            bundle2.putLong("topic_id", tL_forumTopic.f19948id);
            bundle2.putBoolean("exception", false);
            y11 y11Var = new y11(bundle2, null);
            y11Var.f42984r = new gg1(this, tL_forumTopic);
            kg1Var.presentFragment(y11Var);
        }
        if (((jg1) arrayList.get(i10)).f44098a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kg1Var.getParentActivity());
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            kg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
            }
        }
    }
}
