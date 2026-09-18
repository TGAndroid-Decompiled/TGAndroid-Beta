package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ig1 implements org.telegram.ui.Components.al0 {
    public final lg1 f34569a;

    public ig1(lg1 lg1Var) {
        this.f34569a = lg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        lg1 lg1Var = this.f34569a;
        ArrayList arrayList = lg1Var.d;
        if (((kg1) arrayList.get(i10)).f15543a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -lg1Var.f35551c);
            bundle.putBoolean("for_select", true);
            fg1 fg1Var = new fg1(bundle);
            fg1Var.A0 = lg1Var.e;
            fg1Var.v = new gg1(this);
            lg1Var.presentFragment(fg1Var);
        }
        if (((kg1) arrayList.get(i10)).f15543a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((kg1) arrayList.get(i10)).f35282c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", lg1Var.f35551c);
            bundle2.putLong("topic_id", tL_forumTopic.f18173id);
            bundle2.putBoolean("exception", false);
            y11 y11Var = new y11(bundle2, null);
            y11Var.f39773r = new hg1(this, tL_forumTopic);
            lg1Var.presentFragment(y11Var);
        }
        if (((kg1) arrayList.get(i10)).f15543a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lg1Var.getParentActivity());
            alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
            lg1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
            }
        }
    }
}
