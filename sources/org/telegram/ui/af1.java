package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class af1 implements org.telegram.ui.Components.zl0 {
    public final df1 f35752a;

    public af1(df1 df1Var) {
        this.f35752a = df1Var;
    }

    @Override
    public final void d(int i10, View view) {
        df1 df1Var = this.f35752a;
        ArrayList arrayList = df1Var.d;
        if (((cf1) arrayList.get(i10)).f44712a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -df1Var.f36621c);
            bundle.putBoolean("for_select", true);
            xe1 xe1Var = new xe1(bundle);
            xe1Var.A0 = df1Var.e;
            xe1Var.v = new ye1(this);
            df1Var.presentFragment(xe1Var);
        }
        if (((cf1) arrayList.get(i10)).f44712a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((cf1) arrayList.get(i10)).f36326c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", df1Var.f36621c);
            bundle2.putLong("topic_id", tL_forumTopic.f20396id);
            bundle2.putBoolean("exception", false);
            c11 c11Var = new c11(bundle2, null);
            c11Var.f36181r = new ze1(this, tL_forumTopic);
            df1Var.presentFragment(c11Var);
        }
        if (((cf1) arrayList.get(i10)).f44712a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df1Var.getParentActivity());
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ye1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            df1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
            }
        }
    }
}
