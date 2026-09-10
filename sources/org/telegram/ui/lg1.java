package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lg1 implements org.telegram.ui.Components.jl0 {
    public final og1 f34714a;

    public lg1(og1 og1Var) {
        this.f34714a = og1Var;
    }

    @Override
    public final void d(int i10, View view) {
        og1 og1Var = this.f34714a;
        ArrayList arrayList = og1Var.d;
        if (((ng1) arrayList.get(i10)).f14046a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -og1Var.f35494c);
            bundle.putBoolean("for_select", true);
            ig1 ig1Var = new ig1(bundle);
            ig1Var.A0 = og1Var.e;
            ig1Var.v = new jg1(this);
            og1Var.presentFragment(ig1Var);
        }
        if (((ng1) arrayList.get(i10)).f14046a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ng1) arrayList.get(i10)).f35271c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", og1Var.f35494c);
            bundle2.putLong("topic_id", tL_forumTopic.f17247id);
            bundle2.putBoolean("exception", false);
            c21 c21Var = new c21(bundle2, null);
            c21Var.f31504r = new kg1(this, tL_forumTopic);
            og1Var.presentFragment(c21Var);
        }
        if (((ng1) arrayList.get(i10)).f14046a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og1Var.getParentActivity());
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            og1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        }
    }
}
