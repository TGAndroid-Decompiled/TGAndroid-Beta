package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ba1 implements org.telegram.ui.Components.cj0 {
    public final ea1 f43946a;

    public ba1(ea1 ea1Var) {
        this.f43946a = ea1Var;
    }

    @Override
    public final void c(int i7, View view) {
        ea1 ea1Var = this.f43946a;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f54544a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ea1Var.f45349c);
            bundle.putBoolean("for_select", true);
            y91 y91Var = new y91(bundle);
            y91Var.A0 = ea1Var.f45350e;
            y91Var.f52056w = new z91(this);
            ea1Var.presentFragment(y91Var);
        }
        if (((da1) arrayList.get(i7)).f54544a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f44903c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ea1Var.f45349c);
            bundle2.putLong("topic_id", tL_forumTopic.f27008id);
            bundle2.putBoolean("exception", false);
            kx0 kx0Var = new kx0(bundle2, null);
            kx0Var.f47406s = new aa1(this, tL_forumTopic);
            ea1Var.presentFragment(kx0Var);
        }
        if (((da1) arrayList.get(i7)).f54544a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ea1Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747913, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131747914, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new z91(this));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            ea1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
            }
        }
    }
}
