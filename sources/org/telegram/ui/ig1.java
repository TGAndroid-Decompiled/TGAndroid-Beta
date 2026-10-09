package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ig1 implements org.telegram.ui.Components.em0 {
    public final lg1 f38634a;

    public ig1(lg1 lg1Var) {
        this.f38634a = lg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        lg1 lg1Var = this.f38634a;
        ArrayList arrayList = lg1Var.d;
        if (((kg1) arrayList.get(i10)).f17125a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -lg1Var.f39574c);
            bundle.putBoolean("for_select", true);
            fg1 fg1Var = new fg1(bundle);
            fg1Var.A0 = lg1Var.f39575e;
            fg1Var.v = new gg1(this);
            lg1Var.presentFragment(fg1Var);
        }
        if (((kg1) arrayList.get(i10)).f17125a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((kg1) arrayList.get(i10)).f39288c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", lg1Var.f39574c);
            bundle2.putLong("topic_id", tL_forumTopic.f20090id);
            bundle2.putBoolean("exception", false);
            v11 v11Var = new v11(bundle2, null);
            v11Var.f42607r = new hg1(this, tL_forumTopic);
            lg1Var.presentFragment(v11Var);
        }
        if (((kg1) arrayList.get(i10)).f17125a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lg1Var.getParentActivity());
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            lg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
            }
        }
    }
}
