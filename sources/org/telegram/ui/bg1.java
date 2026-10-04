package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bg1 implements org.telegram.ui.Components.ml0 {
    public final eg1 f35090a;

    public bg1(eg1 eg1Var) {
        this.f35090a = eg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        eg1 eg1Var = this.f35090a;
        ArrayList arrayList = eg1Var.d;
        if (((dg1) arrayList.get(i10)).f17187a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -eg1Var.f36027c);
            bundle.putBoolean("for_select", true);
            yf1 yf1Var = new yf1(bundle);
            yf1Var.A0 = eg1Var.f36028e;
            yf1Var.v = new zf1(this);
            eg1Var.presentFragment(yf1Var);
        }
        if (((dg1) arrayList.get(i10)).f17187a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((dg1) arrayList.get(i10)).f35774c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", eg1Var.f36027c);
            bundle2.putLong("topic_id", tL_forumTopic.f20094id);
            bundle2.putBoolean("exception", false);
            p11 p11Var = new p11(bundle2, null);
            p11Var.f39325r = new ag1(this, tL_forumTopic);
            eg1Var.presentFragment(p11Var);
        }
        if (((dg1) arrayList.get(i10)).f17187a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eg1Var.getParentActivity());
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            eg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
            }
        }
    }
}
