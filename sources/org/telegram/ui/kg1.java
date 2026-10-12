package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kg1 implements org.telegram.ui.Components.km0 {
    public final ng1 f39491a;

    public kg1(ng1 ng1Var) {
        this.f39491a = ng1Var;
    }

    @Override
    public final void d(int i10, View view) {
        ng1 ng1Var = this.f39491a;
        ArrayList arrayList = ng1Var.d;
        if (((mg1) arrayList.get(i10)).f16876a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ng1Var.f40411c);
            bundle.putBoolean("for_select", true);
            hg1 hg1Var = new hg1(bundle);
            hg1Var.A0 = ng1Var.f40412e;
            hg1Var.v = new ig1(this);
            ng1Var.presentFragment(hg1Var);
        }
        if (((mg1) arrayList.get(i10)).f16876a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((mg1) arrayList.get(i10)).f40039c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ng1Var.f40411c);
            bundle2.putLong("topic_id", tL_forumTopic.f19854id);
            bundle2.putBoolean("exception", false);
            x11 x11Var = new x11(bundle2, null);
            x11Var.f43721r = new jg1(this, tL_forumTopic);
            ng1Var.presentFragment(x11Var);
        }
        if (((mg1) arrayList.get(i10)).f16876a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng1Var.getParentActivity());
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ig1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
            ng1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
            }
        }
    }
}
