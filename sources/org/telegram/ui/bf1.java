package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bf1 implements org.telegram.ui.Components.am0 {
    public final ef1 f36074a;

    public bf1(ef1 ef1Var) {
        this.f36074a = ef1Var;
    }

    @Override
    public final void d(int i10, View view) {
        ef1 ef1Var = this.f36074a;
        ArrayList arrayList = ef1Var.d;
        if (((df1) arrayList.get(i10)).f44713a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ef1Var.f36962c);
            bundle.putBoolean("for_select", true);
            ye1 ye1Var = new ye1(bundle);
            ye1Var.A0 = ef1Var.e;
            ye1Var.v = new ze1(this);
            ef1Var.presentFragment(ye1Var);
        }
        if (((df1) arrayList.get(i10)).f44713a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((df1) arrayList.get(i10)).f36616c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ef1Var.f36962c);
            bundle2.putLong("topic_id", tL_forumTopic.f20395id);
            bundle2.putBoolean("exception", false);
            d11 d11Var = new d11(bundle2, null);
            d11Var.f36476r = new af1(this, tL_forumTopic);
            ef1Var.presentFragment(d11Var);
        }
        if (((df1) arrayList.get(i10)).f44713a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ef1Var.getParentActivity());
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ze1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            ef1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        }
    }
}
