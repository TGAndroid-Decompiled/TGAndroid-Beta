package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ff1 implements org.telegram.ui.Components.am0 {
    public final if1 f39352a;

    public ff1(if1 if1Var) {
        this.f39352a = if1Var;
    }

    @Override
    public final void c(int i10, View view) {
        if1 if1Var = this.f39352a;
        ArrayList arrayList = if1Var.d;
        if (((hf1) arrayList.get(i10)).f47075a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -if1Var.f40136c);
            bundle.putBoolean("for_select", true);
            cf1 cf1Var = new cf1(bundle);
            cf1Var.A0 = if1Var.e;
            cf1Var.v = new df1(this);
            if1Var.presentFragment(cf1Var);
        }
        if (((hf1) arrayList.get(i10)).f47075a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((hf1) arrayList.get(i10)).f39876c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", if1Var.f40136c);
            bundle2.putLong("topic_id", tL_forumTopic.f22080id);
            bundle2.putBoolean("exception", false);
            j11 j11Var = new j11(bundle2, null);
            j11Var.f40355s = new ef1(this, tL_forumTopic);
            if1Var.presentFragment(j11Var);
        }
        if (((hf1) arrayList.get(i10)).f47075a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(if1Var.getParentActivity());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new df1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            if1Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
            }
        }
    }
}
