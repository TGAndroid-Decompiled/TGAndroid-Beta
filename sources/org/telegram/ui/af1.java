package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class af1 implements org.telegram.ui.Components.mk0 {
    public final df1 f36475a;

    public af1(df1 df1Var) {
        this.f36475a = df1Var;
    }

    @Override
    public final void a(int i9, View view) {
        df1 df1Var = this.f36475a;
        ArrayList arrayList = df1Var.d;
        if (((cf1) arrayList.get(i9)).f48814a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -df1Var.f37532c);
            bundle.putBoolean("for_select", true);
            we1 we1Var = new we1(bundle);
            we1Var.f43780w0 = df1Var.f37533e;
            we1Var.v = new ye1(this);
            df1Var.presentFragment(we1Var);
        }
        if (((cf1) arrayList.get(i9)).f48814a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((cf1) arrayList.get(i9)).f37197c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", df1Var.f37532c);
            bundle2.putLong("topic_id", tL_forumTopic.f22432id);
            bundle2.putBoolean("exception", false);
            s01 s01Var = new s01(bundle2, null);
            s01Var.f42525r = new ze1(this, tL_forumTopic);
            df1Var.presentFragment(s01Var);
        }
        if (((cf1) arrayList.get(i9)).f48814a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df1Var.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ye1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            df1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        }
    }
}
